package com.example.lib.mapper;
import model.Publisher;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface PublisherMapper {

    @Delete("DELETE FROM publisher where Report_id= #{id}")
    int deleteByPrimaryKey(Integer publisherId);


    @Select("select * from publisher")
    public List<Publisher> List();

    @Insert("INSERT INTO publisher(publisher_id,yearOfPublication,Name) " +
            " VALUES (#{publisher_id}, #{yearOfPublication}, #{Name})")
    int insert(Publisher record);


    @Select("select * from publisher WHERE Report_id = #{id}")
    Publisher selectByPrimaryKey(Integer publisherId);


    @Update("Update publisher set yearOfPublication=#{yearOfPublication}, " +
            " Name=#{Name} where Report_id=#{id}")
    int updateByPrimaryKey(Publisher record);

}