package com.example.lib.controller;
import com.example.lib.mapper.PublisherMapper;
import com.example.lib.mapper.ReportsMapper;
import model.Reports;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class ReportsController {


    private ReportsMapper ReportsMapper;
    //insert user
    @RequestMapping("/reports")
    public void insert( Reports reports) {
        ReportsMapper.insert(reports);
    }

    //according to id delete
    @RequestMapping("/reports1/{id}")
    public void delete(@PathVariable("id") Integer id) {
        ReportsMapper.deleteByPrimaryKey(id);
    }
    //modify
    @RequestMapping("/reports2/{id}")
    public void update(Reports reports,@PathVariable("id") Integer id) {
        ReportsMapper.updateByPrimaryKey(reports);
    }

    //according to id Query students
    @RequestMapping("/reports3/{id}")
    public Reports getById(@PathVariable("id") Integer id) {
        Reports reports = ReportsMapper.selectByPrimaryKey(id);
        return reports;
    }

    //All queries
    @RequestMapping("/reports")
    public List<Reports> list(){
        List<Reports> reports = ReportsMapper.List();
        return reports;
    }

}
