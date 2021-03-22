package com.example.lib.controller;

import com.example.lib.mapper.ReadersMapper;
import model.Readers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class ReadersController {

    private ReadersMapper ReadersMapper;
    //insert user
    @RequestMapping("/readers")
    public void insert( Readers readers) {
        ReadersMapper.insert(readers);
    }

    //according to id delete
    @RequestMapping("/readers1/{id}")
    public void delete(@PathVariable("id") Integer id) {
        ReadersMapper.deleteByPrimaryKey(id);
    }
    //modify
    @RequestMapping("/readers2/{id}")
    public void update(Readers reports,@PathVariable("id") Integer id) {
        ReadersMapper.updateByPrimaryKey(reports);
    }

    //according to id Query students
    @RequestMapping("/readers3/{id}")
    public Readers getById(@PathVariable("id") Integer id) {
        Readers reports = ReadersMapper.selectByPrimaryKey(id);
        return reports;
    }

    //All queries
    @RequestMapping("/readers")
    public List<Readers> list(){
        List<Readers> reports = ReadersMapper.List();
        return reports;
    }
}
