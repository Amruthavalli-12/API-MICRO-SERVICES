
package com.example.week3d;

import com.example.week3d.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testAutoWiringAndLogging() {

        // Triggers the method to verify bean injection and log output
        employeeService.displayEmployeeDetails();
    }
}