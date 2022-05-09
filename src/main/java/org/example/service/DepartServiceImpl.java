package org.example.service;

import org.example.dao.DepartDao;
import org.example.domain.Depart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartServiceImpl implements DepartService{
    @Autowired
    DepartDao departDao;
    @Override
    public int addDepart(Depart depart) {
        int i=departDao.addDepart(depart);
        return i;
    }

    @Override
    public int deleteDepart(Integer depid) {
        return departDao.deleteDepart(depid);

    }

    @Override
    public int updateDepart(Depart depart) {
        return departDao.updateDepart(depart);
    }

    @Override
    public List<Depart> selectDepart() {
        return departDao.selectDepart();
    }

    @Override
    public Depart selectOneDepart(Integer depid) {
        return departDao.selectOneDepart(depid);
    }
}
