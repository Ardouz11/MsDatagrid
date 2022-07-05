package com.example.demo.Controller;
import com.example.demo.Service.SampleService;
import com.example.demo.db.models.DataCsvDTO;
import com.example.demo.db.models.DataDTO;
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

    @GetMapping("/test")
    public String testService() {
        return sampleService.testService();
    }
    @GetMapping("/getData")
    public List<DataCsvDTO> getData() throws FileNotFoundException {
        return sampleService.getDataCsv();
    }
}