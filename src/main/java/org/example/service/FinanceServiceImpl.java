package org.example.service;

import org.example.dao.FinanceDao;
import org.example.domain.Finance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FinanceServiceImpl implements FinanceService{
    @Autowired
    FinanceDao financeDao;
    @Override
    public List<Finance> selectFinance() {
        return financeDao.selectFinance();
    }

    @Override
    public Finance selectOneFinance(Integer fid) {
        return financeDao.selectOneFinance(fid);
    }

    @Override
    public int addFinnance(Finance finance) {
        return financeDao.addFinance(finance);
    }

    @Override
    public int deleteFinance(Integer fid) {
        return financeDao.deleteFinance(fid);
    }

    @Override
    public int updateFinance(Finance finance) {
        return financeDao.updateFinance(finance);
    }

    @Override
    public List<Finance> selectAppro() {
        return financeDao.selectApproval();
    }

    @Override
    public int updateStatus(Integer fid) {
        return financeDao.updateStatus(fid);
    }
}
