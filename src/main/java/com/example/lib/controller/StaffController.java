package com.example.lib.controller;

import com.example.lib.mapper.StaffMapper;
import model.Staff;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class StaffController {


    private StaffMapper StaffMapper;
    //insert user
    @RequestMapping("/staff")
    public void insert( Staff staff) {
        StaffMapper.insert(staff);
    }

    //according to id delete
    @RequestMapping("/staff1/{id}")
    public void delete(@PathVariable("id") Integer id) {
        StaffMapper.deleteByPrimaryKey(id);
    }
    //modify
    @RequestMapping("/staff2/{id}")
    public void update(Staff staff,@PathVariable("id") Integer id) {
        StaffMapper.updateByPrimaryKey(staff);
    }

    //according to id Query students
    @RequestMapping("/staff3/{id}")
    public Staff getById(@PathVariable("id") Integer id) {
        Staff staff = StaffMapper.selectByPrimaryKey(id);
        return staff;
    }

    //All queries
    @RequestMapping("/staff")
    public List<Staff> list(){
        List<Staff> staff = StaffMapper.List();
        return staff;
    }

}
