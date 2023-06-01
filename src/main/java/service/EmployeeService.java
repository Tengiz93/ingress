package service;

import model.EmployeeResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;


@Service
public class EmployeeService {

    public EmployeeResponse getEmployee(Integer id) {
        return  new EmployeeResponse(id, "Farzullasoy","Tengiz",29);

    }
    @GetMapping()
    public List<EmployeeResponse> getUsers() {
        return List.of(new EmployeeResponse());

}}
