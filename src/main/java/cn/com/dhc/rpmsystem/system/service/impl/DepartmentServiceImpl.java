package cn.com.dhc.rpmsystem.system.service.impl;

import cn.com.dhc.rpmsystem.system.dao.DepartmentDao;
import cn.com.dhc.rpmsystem.system.entity.Department;
import cn.com.dhc.rpmsystem.system.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouyongzhou
 * @description 部门管理
 * @date 2019/8/6
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentDao departmentDao;

    @Override
    public int addDepartment(Department department) {
        return departmentDao.addDepartment( department );
    }

    @Override
    public List<Department> findDepartments(String searchStr) {
        return departmentDao.findDepartments( searchStr );
    }

    @Override
    public int getTotalCount(String searchStr) {
        return departmentDao.getTotalCount( searchStr );
    }


    @Override
    public int deleteDepartment(int id) {
        return departmentDao.deleteDepartment( id );
    }

    @Override
    public int updateDepartment(Department department) {
        return departmentDao.updateDepartment( department );
    }


}
