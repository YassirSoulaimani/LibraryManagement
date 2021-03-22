package com.example.lib.controller;
import model.Books;
import com.example.lib.mapper.BooksMapper;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BooksController {


 private BooksMapper BooksMapper;

    //insert book
    @RequestMapping("/book")
 public void insert( Books book) {
         BooksMapper.insert(book);
            }

         //according to id delete
       @RequestMapping("/book1/{id}")
   public void delete(@PathVariable("id") Integer id) {
           BooksMapper.deleteByPrimaryKey(id);
           }
      //modify
          @RequestMapping("/book2/{id}")
  public void update(Books book,@PathVariable("id") Integer id) {
              BooksMapper.updateByPrimaryKey(book);
           }

           //according to id Query books
           @RequestMapping("/book3/{id}")
    public Books getById(@PathVariable("id") Integer id) {
               Books book = BooksMapper.selectByPrimaryKey(id);
              return book;
           }

        //All queries
           @RequestMapping("/books")
            public List<Books> list(){
               List<Books> book = BooksMapper.List();

              return book;
          }

}
