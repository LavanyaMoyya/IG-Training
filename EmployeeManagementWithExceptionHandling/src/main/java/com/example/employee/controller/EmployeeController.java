package com.example.employee.controller;

import com.example.employee.EmployeeRepository;
import com.example.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();

    }
@GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value="id") Long employeeId)
    throws ResourceNotFoundException{
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundException("Employee not found for this id: "+employeeId));
        return ResponseEntity.ok().body(employee);
}
@PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);

}
@PutMapping("/employees/{id}")
    public ResponseEntity<Employee>updateEmployee(@PathVariable(value="id") Long employeeId,
@RequestBody Employee employeeDetails) throws ResourceNotFoundException{
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundException("Employee not found for this id: "+employeeId));
employee.setEmailid(employeeDetails.getEmailid());
employee.setLastName(employeeDetails.getLastName());
employee.setFirstName(employeeDetails.getFirstName());
final Employee updatedEmployee=employeeRepository.save(employee);
return ResponseEntity.ok(updatedEmployee);
}
@DeleteMapping("/employees/{id}")
    public Map<String,Boolean> deleteEmployee(@PathVariable(value="id")Long employeeId)
    throws ResourceNotFoundException{
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundException("Employee not found for this id: "+employeeId));
employeeRepository.delete(employee);
Map<String,Boolean> response=new HashMap<>();
response.put("delete",Boolean.TRUE);
return response;
}

}
