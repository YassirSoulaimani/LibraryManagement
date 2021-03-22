package com.example.lib.controller;
import com.example.lib.mapper.PublisherMapper;
import model.Publisher;
import org.springframework.web.bind.annotation.*;
import java.util.List;


public class PublisherController {

    private PublisherMapper PublisherMapper;
    //insert user
    @RequestMapping("/publisher")
    public void insert( Publisher publisher) {
        PublisherMapper.insert(publisher);
    }

    //according to id delete
    @RequestMapping("/publisher1/{id}")
    public void delete(@PathVariable("id") Integer id) {
        PublisherMapper.deleteByPrimaryKey(id);
    }
    //modify
    @RequestMapping("/publisher2/{id}")
    public void update(Publisher publisher,@PathVariable("id") Integer id) {
        PublisherMapper.updateByPrimaryKey(publisher);
    }

    //according to id Query students
    @RequestMapping("/publisher3/{id}")
    public Publisher getById(@PathVariable("id") Integer id) {
        Publisher publisher = PublisherMapper.selectByPrimaryKey(id);
        return publisher;
    }

    //All queries
    @RequestMapping("/publishers")
    public List<Publisher> list(){
        List<Publisher> publishers = PublisherMapper.List();
        return publishers;
    }

}
