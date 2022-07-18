package org.example.Mapper;

import org.apache.ibatis.annotations.Param;
import org.example.Dao.Company;

import java.util.List;

public interface SelectMapper {

    /**
     * 取市值排名前n的公司
     * @return
     */
    public List<Company> selectCompanyPageInterceptor(@Param("marketcap") int n);
}
