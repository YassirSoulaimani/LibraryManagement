package com.example.lib.mapper;

import model.Publisher;
import model.Reports;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ReportsMapper {

    @Delete("DELETE FROM reports where Report_id= #{Report_id}")
    int deleteByPrimaryKey(Integer reportsId);


    @Select("select * from reports")
    public List<Reports> List();

    @Insert("INSERT INTO reports(Report_id,reader_id,book_id,issue) " +
            " VALUES (#{Report_id}, #{reader_id}, #{book_id}, #{issue})")
    int insert(Reports record);


    @Select("select * from reports WHERE Report_id = #{Report_id}")
    Reports selectByPrimaryKey(Integer ReportId);


    @Update("Update reports set reader_id=#{reader_id}, " +
            " book_id=#{book_id} , issue=#{issue} where Report_id=#{Report_id}")
    int updateByPrimaryKey(Reports record);

}