package com.TW.Spring_TW;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeesController {
    @RequestMapping(value = "/employees",method = RequestMethod.GET)
    public void GetEmployees(HttpServletResponse response) throws IOException {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(0 ,"小明",18,"男"));
        employees.add(new Employee(0 ,"小明",18,"男"));
        employees.add(new Employee(0 ,"小明",18,"男"));
        employees.add(new Employee(0 ,"小明",18,"男"));
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(employees);

        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().print(json);
    }
}
