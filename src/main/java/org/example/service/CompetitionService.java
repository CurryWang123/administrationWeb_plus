package org.example.service;

import org.example.domain.Competition;

import java.util.List;

public interface CompetitionService {
    List<Competition> select();
    Competition selectOneCompetition(Integer cid);
    int addCompetition(Competition competition);
    int deleteCompetition(Integer cid);
    int updateCompetition(Competition competition);
    Competition selectOneByName(String sname);
}
