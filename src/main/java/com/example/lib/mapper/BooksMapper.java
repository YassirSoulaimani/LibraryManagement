package com.example.lib.mapper;

import model.Books;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BooksMapper {

    @Delete("DELETE FROM books where books_id = #{id}")
    int deleteByPrimaryKey(Integer bookId);

    @Select("select Title,Category,Edition,Price from books")
    public List<Books> List();

    @Insert("INSERT INTO books(book_id,Title,Category,Edition,Price) " +
            " VALUES (#{book_id}, #{Title}, #{Category}, #{Edition}, #{Price})")
    int insert(Books record);

    @Select("select * from books WHERE book_id = #{book_id}")
    Books selectByPrimaryKey(Integer bookId);

    @Update("Update books set Title=#{Title}, " +
            " Category=#{Category}, Edition=#{Edition}, Price=#{Price} where id=#{id}")
    int updateByPrimaryKey(Books record);

}