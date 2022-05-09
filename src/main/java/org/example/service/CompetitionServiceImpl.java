package org.example.service;

import org.example.dao.CompetitionDao;
import org.example.domain.Competition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompetitionServiceImpl implements CompetitionService{
    @Autowired
    private CompetitionDao competitionDao;
    @Override
    public List<Competition> select() {
        return competitionDao.select();
    }

    @Override
    public Competition selectOneCompetition(Integer cid) {
        return competitionDao.selectOneCompetition(cid);
    }

    @Override
    public int addCompetition(Competition competition) {
        return competitionDao.addCompetition(competition);
    }

    @Override
    public int deleteCompetition(Integer cid) {
        return competitionDao.deleteCompetition(cid);
    }

    @Override
    public int updateCompetition(Competition competition) {
        return competitionDao.updateCompetition(competition);
    }

    @Override
    public Competition selectOneByName(String sname) {
        return competitionDao.selectOneByName(sname);
    }
}
