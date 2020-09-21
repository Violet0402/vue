package com.smj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/city")
public class CityController {
    @GetMapping("/find")
    public Map<String, String> findWeatherByCity(String name){
        HashMap<String, String> map = new HashMap<>();
        String weather = getWeather(name);
        map.put("message",weather);
        return map;
    }
    public String getWeather(String city){
        HashMap<String, String> map = new HashMap<>();
        map.put("北京","北京天气号");
        map.put("上海","上海天气不好");
        map.put("成都","成都天气好");
        return map.get(city);
    }
}
