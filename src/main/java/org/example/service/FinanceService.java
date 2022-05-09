package org.example.service;

import org.apache.ibatis.annotations.Param;
import org.example.domain.Finance;

import java.util.List;

public interface FinanceService {
    List<Finance> selectFinance();
    Finance selectOneFinance( Integer fid);
    int addFinnance(Finance finance);
    int deleteFinance( Integer fid);
    int updateFinance(Finance finance);
    List<Finance> selectAppro();
    int updateStatus(Integer fid);
}
