package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.domain.Finance;

import java.util.List;

public interface FinanceDao {
    List<Finance> selectFinance();
    Finance selectOneFinance(@Param("fid") Integer fid);
    int addFinance(Finance finance);
    int deleteFinance(@Param("fid") Integer fid);
    int updateFinance(Finance finance);
    List<Finance> selectApproval();
    int updateStatus(@Param("fid") Integer fid);
}
