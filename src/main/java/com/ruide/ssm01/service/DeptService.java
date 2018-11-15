package com.ruide.ssm01.service;

import com.ruide.ssm01.mapper.DeptMapper;
import com.ruide.ssm01.po.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptService {
    @Resource
    private DeptMapper deptMapper;

    public List<Dept> findAll(){
        return deptMapper.findAll();
    }
}
