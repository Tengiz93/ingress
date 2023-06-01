package controller;


import lombok.AllArgsConstructor;
import model.EmployeeResponse;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@AllArgsConstructor
@RequestMapping("v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/{id}")
    public EmployeeResponse getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployee(id);

    }
    @GetMapping()
    public List<EmployeeResponse> getEmployees() {
        return employeeService.getUsers();
    }

}
