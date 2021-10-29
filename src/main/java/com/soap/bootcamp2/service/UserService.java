package com.soap.bootcamp2.service;

import com.soap.bootcamp2.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class
UserService {

    private static final Map<Integer, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {
        User peter = new User();
        peter.setName("Peter");
        peter.setEmpId(1);
        peter.setSalary(1000);

        User lucas = new User();
        lucas.setName("Lucas");
        lucas.setEmpId(2);
        lucas.setSalary(1500);

        User maria = new User();
        maria.setName("Maria");
        maria.setEmpId(3);
        maria.setSalary(1800);

        users.put(peter.getEmpId(), peter);
        users.put(lucas.getEmpId(), lucas);
        users.put(maria.getEmpId(), maria);
    }

    public User getUsers(int id) {
        System.out.println(id);
        return users.get(id);
    }
}
