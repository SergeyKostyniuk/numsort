package com.example.Numbers.controller;


import com.example.Numbers.service.NumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@RestController
@RequestMapping(path = "/")
public class NumController {

    @Autowired
    private NumService numService;

    @RequestMapping(path = "/sort", method = RequestMethod.GET)
    public @ResponseBody
    IntStream sort(String str) {
        return numService.sort(str);
    }
}
