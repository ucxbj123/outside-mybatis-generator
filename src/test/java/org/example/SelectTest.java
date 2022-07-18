package org.example;


import SqlServer.Dao.Computer;
import SqlServer.Dao.ComputerExample;
import SqlServer.mapper.ComputerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.example.Dao.Company;
import org.example.Mapper.SelectMapper;
import org.example.Unit.SqlSessionUnit;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class SelectTest {

//    @Test
//    public void testSelect() throws IOException {
//        SqlSession sqlSession=new SqlSessionUnit("mybatis-config.xml").getSqlSeesion();
//        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
//        List<Company> list=mapper.selectCompanyPageInterceptor(50);
//        for (Company company:list){
//            System.out.println(company);
//        }
//    }
//
    @Test
    public void testgetAll() throws IOException {
        SqlSession sqlSession=new SqlSessionUnit("mybatis-config.xml").getSqlSeesion();
        ComputerMapper mapper=sqlSession.getMapper(ComputerMapper.class);
        //QBC查询，可以通过or()拼接sql语句
        ComputerExample example=new ComputerExample();
        example.createCriteria().andComputeridLike("%BIELKJA7%");
        example.or().andComputeridLike("%BIELKJZH%");
        //分页PageHelper
        PageHelper.startPage(34,10);
        List<Computer> list=mapper.selectByExample(example);
        PageInfo pageInfo=new PageInfo<>(list,5);
        for (Computer computer:list){
            System.out.println(computer);
        }
        System.out.println(pageInfo);
    }
}
