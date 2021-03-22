package com.example.lib;

import com.example.lib.mapper.BooksMapper;
import model.Books;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan(value = "com.example.lib.mapper")
@SpringBootApplication
public class LibApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BooksMapper BooksMapper;


    @Override
    public void run(String... args) throws Exception {


        logger.info("All Books -> {}", BooksMapper.List()   );






    }

    public static void main(String[] args) {
        SpringApplication.run(LibApplication.class, args);


    }
}
