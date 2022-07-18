package SqlServer.mapper;

import SqlServer.Dao.Computer;

import java.util.List;

public interface SelectSQLServerMapper {

    List<Computer> getAll();
}
