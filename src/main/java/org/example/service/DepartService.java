package org.example.service;

import org.example.domain.Depart;

import java.util.List;

public interface DepartService {
    int addDepart(Depart depart);
    int deleteDepart(Integer depid);
    int updateDepart(Depart depart);
    List<Depart> selectDepart();
    Depart selectOneDepart(Integer depid);
}
