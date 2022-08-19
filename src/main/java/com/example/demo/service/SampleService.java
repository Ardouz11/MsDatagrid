
package com.example.demo.service;
import java.io.*;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import com.opencsv.bean.CsvToBean;
import  com.example.demo.dao.dto.*;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.util.ResourceUtils;

@Service
public class SampleService {

    public List<DataDTO> getData() throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        DataDTO[] data = new DataDTO[0];
        try {
             data = mapper.readValue(ResourceUtils.getFile("classpath:Insurance-Data.json"), DataDTO[].class);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return Arrays.asList(data);
    }

    public List<DataCsvDTO> getDataCsv() throws FileNotFoundException {

        File file = ResourceUtils.getFile("classpath:DataSet-InsuranceClient.csv");
        InputStream inputStream  = new FileInputStream(file);
        Reader reader = new BufferedReader(new InputStreamReader(inputStream));
        @SuppressWarnings("unchecked")
        CsvToBean<DataCsvDTO> csvToBean = new CsvToBeanBuilder(reader)
                .withType(DataCsvDTO.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        List<DataCsvDTO> data = csvToBean.parse();
        return data;
    }
}