package org.example.service;

import com.github.pagehelper.PageInfo;
import org.example.domain.Work;

import java.util.List;

public interface WorkService {
    int addWork(Work work);
    List<Work> selectWork();
    Work selectOneWork(Integer wid);
    int updateWork(Work work);
    int deleteWork(Integer wid);
    List<Work> selectApproval();
    int updateStatus(Integer wid);
    PageInfo splitPage(int pageNum, int pageSize);
}
