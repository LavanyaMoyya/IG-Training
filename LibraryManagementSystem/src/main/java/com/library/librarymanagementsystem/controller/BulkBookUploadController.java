package com.library.librarymanagementsystem.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/uploadbooks")
public class BulkBookUploadController {
    private static final Logger log = LoggerFactory.getLogger(BulkBookUploadController.class);
    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    @GetMapping
    @Scheduled(cron = "0 * 04 * * ?")
    public BatchStatus load() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException{

        Map<String, JobParameter> maps = new HashMap<>();
        maps.put("time", new JobParameter(System.currentTimeMillis()));
        JobParameters parameters = new JobParameters(maps);
        JobExecution jobExecution=jobLauncher.run(job, parameters);
        log.info("JobExecution :"+jobExecution.getStatus());
        log.info("Batch job is Running.............");
        while(jobExecution.isRunning()) {
            log.info("...");
        }
        log.info("Batch job is Completed.............");
        return jobExecution.getStatus();
    }

}
