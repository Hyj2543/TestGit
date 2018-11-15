package com.ruide.ssm01.mapper;

import com.ruide.ssm01.po.Dept;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DeptMapper {
    @Select("select *from dept")
    @Results({
            @Result(property = "deptno",column="deptno"),
            @Result(property = "dname",column = "dname"),
            @Result(property = "loc",column = "loc")
    })
    List<Dept>  findAll();
}
