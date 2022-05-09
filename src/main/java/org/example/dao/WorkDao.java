package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.domain.Work;

import java.util.List;

public interface WorkDao {
    int addWork(Work work);
    List<Work> selectWork();
    Work selectOneWork(@Param("wid") Integer wid);
    int updateWork(Work work);
    int deleteWork(@Param("wid") Integer wid);
    List<Work> selectApproval();
    int updateStatus(@Param("wid") Integer wid);

}
