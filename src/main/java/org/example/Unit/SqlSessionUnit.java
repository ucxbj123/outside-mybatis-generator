package org.example.Unit;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUnit {

    private String resources;

    public SqlSessionUnit(String resources) {
        this.resources = resources;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public SqlSession getSqlSeesion() throws IOException {
        InputStream is = Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        return sqlSession;
    }
}
