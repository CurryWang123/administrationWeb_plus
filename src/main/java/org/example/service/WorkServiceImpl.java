package org.example.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.WorkDao;
import org.example.domain.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkServiceImpl implements WorkService{
    @Autowired
    WorkDao workDao;
    @Override
    public int addWork(Work work) {
        return workDao.addWork(work);
    }

    @Override
    public List<Work> selectWork()
    {
        return workDao.selectWork();
    }

    @Override
    public Work selectOneWork(Integer wid) {
        return workDao.selectOneWork(wid);
    }

    @Override
    public int updateWork(Work work) {
        return workDao.updateWork(work);
    }

    @Override
    public int deleteWork(Integer wid) {
        return workDao.deleteWork(wid);
    }

    @Override
    public List<Work> selectApproval() {
        return workDao.selectApproval();
    }

    @Override
    public int updateStatus(Integer wid) {
        return workDao.updateStatus(wid);
    }

    @Override
    public PageInfo splitPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Work> list=workDao.selectWork();
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }
}
