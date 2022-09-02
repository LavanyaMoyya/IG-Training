package com.batchdb.springbatchdbtocsv.config;

import com.batchdb.springbatchdbtocsv.model.Customer;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
    @Autowired
    private StepBuilderFactory stepBuilderFactory;
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private DataSource dataSource;

    @Bean
    public JdbcCursorItemReader<Customer> reader(){
        JdbcCursorItemReader<Customer> reader=new JdbcCursorItemReader<>();
        reader.setDataSource(dataSource);
        reader.setSql("select customer_id as id,first_name as firstName,last_name as lastName,email,gender,contact_no as contactNo,country,dob from customer_data.customer_info");
        reader.setRowMapper(new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                Customer c=new Customer();
                c.setId(rs.getInt("id"));
                c.setFirstName(rs.getString("firstName"));
                c.setLastName(rs.getString("lastName"));
                c.setEmail(rs.getString("email"));
                c.setGender(rs.getString("gender"));
                c.setContactNo(rs.getString("contactNo"));
                c.setCountry(rs.getString("country"));
                c.setDob(rs.getString("dob"));
                return c;
            }
        });
        return reader;
    }
    @Bean
    public FlatFileItemWriter<Customer> writer(){
        FlatFileItemWriter<Customer> writer=new FlatFileItemWriter<>();
        writer.setResource(new FileSystemResource("E://WORKSPACE/data/csv_output.csv"));
        DelimitedLineAggregator<Customer> aggregator=new DelimitedLineAggregator<>();
        BeanWrapperFieldExtractor<Customer>fieldExtractor=new BeanWrapperFieldExtractor<>();
        fieldExtractor.setNames(new String[]{"id","firstName","lastName","email","gender","contactNo","country","dob"});
        aggregator.setFieldExtractor(fieldExtractor);
        writer.setLineAggregator(aggregator);
        return writer;
    }
    @Bean
    public Step executeStep(){
       return  stepBuilderFactory.get("executeStep").<Customer,Customer>chunk(10)
                .reader(reader())
                .writer(writer())
                .build();
    }
    @Bean
    public Job processJob(){
       return jobBuilderFactory.get("processJob").incrementer(new RunIdIncrementer()).flow(executeStep())
                .end().build();
    }
}


