package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.domain.Depart;

import java.util.List;

public interface DepartDao {
    int addDepart(Depart depart);
    int deleteDepart(@Param("depid") Integer depid);
    int updateDepart(Depart depart);
    List<Depart> selectDepart();
    Depart selectOneDepart(@Param("depid") Integer depid);
}
