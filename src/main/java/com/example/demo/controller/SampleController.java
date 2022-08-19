package com.example.demo.controller;
import com.example.demo.dao.dto.DataDTO;
import com.example.demo.service.SampleService;
import com.example.demo.dao.dto.DataCsvDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;


@RestController
@RequestMapping("/sample")
public class SampleController {
    @Autowired
    private SampleService sampleService;

    @GetMapping("/getCsvData")
    public List<DataCsvDTO> getCsvData() throws FileNotFoundException {
        return sampleService.getDataCsv();
    }
    @GetMapping("/getJsonData")
    public List<DataDTO> getJsonData() throws FileNotFoundException {
        return sampleService.getData();
    }
}