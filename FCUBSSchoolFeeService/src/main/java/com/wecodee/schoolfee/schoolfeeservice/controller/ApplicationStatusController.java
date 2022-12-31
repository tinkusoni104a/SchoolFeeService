package com.wecodee.schoolfee.schoolfeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class ApplicationStatusController {

    @GetMapping("/status")
    public String testing() {
        return "FCUBS School Fee Service is running";
    }

}
