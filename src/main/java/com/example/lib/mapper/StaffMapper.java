package com.example.lib.mapper;
import model.Staff;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StaffMapper {
    @Delete("DELETE FROM staff where staff_id = #{staff_id}")
    int deleteByPrimaryKey(Integer staff_id);


    @Select("select name,email,Phone,Address from staff")
    public List<Staff> List();


    @Insert("INSERT INTO staff(staff_id,name,email,password,Phone,Address) " +
            " VALUES (#{staff_id}, #{name}, #{email}, #{password}, #{Phone}, #{Address})")
    int insert(Staff record);


    @Select("select * from staff WHERE staff_id = #{staff_id}")
    Staff selectByPrimaryKey(Integer staff_id);

    @Update("Update staff set name=#{name}, " +
            " email=#{email}, password=#{password}, Phone=#{Phone}, Address=#{Address} where staff_id=#{staff_id}")
    int updateByPrimaryKey(Staff record);
}