package org.example;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.Dao.Company;
import org.example.Mapper.SelectMapper;
import org.example.Unit.SqlSessionUnit;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;

public class SelectTest {

    @Test
    public void testSelect() throws IOException {
        SqlSession sqlSession=new SqlSessionUnit("mybatis-config.xml").getSqlSeesion();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        List<Company> list=mapper.selectCompanyPageInterceptor(50);
        for (Company company:list){
            System.out.println(company);
        }
    }
}