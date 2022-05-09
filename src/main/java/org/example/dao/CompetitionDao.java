package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.domain.Competition;

import java.util.List;

public interface CompetitionDao {
    List<Competition> select();
    Competition selectOneCompetition(@Param("cid") Integer cid);
    int addCompetition(Competition competition);
    int deleteCompetition(@Param("cid") Integer cid);
    int updateCompetition(Competition competition);
    Competition selectOneByName(@Param("sname") String sname);
}
