package com.smj.controller;

import com.smj.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/save")
    public Map<String, Object> save(@RequestBody User user){
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(user);
        map.put("success",true);
        return map;
    }

    @GetMapping("/findAll")
    public List<User> findAll(String name){
        System.out.println(name);
        List<User> users = new ArrayList<>();
        users.add(new User(1,"susu",18));
        users.add(new User(2,"shushu",19));
        return users;
    }
}
