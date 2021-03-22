package com.example.lib.mapper;
import model.Readers;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ReadersMapper {
    @Delete("DELETE FROM readers where User_id= #{id}")
    int deleteByPrimaryKey(Integer readersId);


    @Select("select * from readers")
    public List<Readers> List();

    @Insert("INSERT INTO readers(User_id,Email,First_name,Last_name,Phone,Address) " +
            " VALUES (#{User_id}, #{Email}, #{First_name}, #{Last_name}, #{Phone}, #{Address})")
    int insert(Readers record);


    @Select("select * from readers WHERE User_id = #{id}")
    Readers selectByPrimaryKey(Integer readersId);


    @Update("Update readers set Email=#{Email}, " +
            " First_name=#{First_name} , Last_name=#{Last_name} #{Last_name}, #{Phone}, #{Address} where User_id=#{User_id}")
    int updateByPrimaryKey(Readers record);
}