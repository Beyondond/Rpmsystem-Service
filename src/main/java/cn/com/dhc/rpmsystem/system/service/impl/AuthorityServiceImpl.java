package cn.com.dhc.rpmsystem.system.service.impl;

import cn.com.dhc.rpmsystem.employefilter.service.impl.EmployeFilterServiceImpl;
import cn.com.dhc.rpmsystem.exception.BusinessException;
import cn.com.dhc.rpmsystem.system.dao.AuthorityDao;
import cn.com.dhc.rpmsystem.system.dto.MemberRole;
import cn.com.dhc.rpmsystem.system.entity.RpmMemberRole;
import cn.com.dhc.rpmsystem.system.entity.RpmRole;
import cn.com.dhc.rpmsystem.system.entity.RpmSkillInfo;
import cn.com.dhc.rpmsystem.system.service.AuthorityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kemeiyi
 * @description
 * @date 2019/8/5
 */
@Service
public class AuthorityServiceImpl implements AuthorityService{

    // 日志记录器
    private final Logger LOGGER = LoggerFactory.getLogger(EmployeFilterServiceImpl.class);
    @Autowired
    private AuthorityDao authorityDao;

    @Override
    public Integer addAuthority(RpmMemberRole rpmMemberRole) throws BusinessException {
        Integer result = null;
        try {
            result = authorityDao.addAuthority(rpmMemberRole);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != 0){
            LOGGER.debug("新增权限成功");
        }else{
            LOGGER.debug("新增权限失败");
        }
        return result;
    }

    @Override
    public Integer deleteAuthority(Integer numUid) throws BusinessException{
        Integer count = null;
        try {
            count = authorityDao.deleteAuthority(numUid);
            if (count != 0){
                LOGGER.debug("删除权限成功");
            }else{
                LOGGER.debug("删除权限失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public Boolean updateAuthority(RpmMemberRole rpmMemberRole) throws BusinessException{
        Boolean flag = false;
        try {
            flag = authorityDao.updateAuthority(rpmMemberRole);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag != false){
            LOGGER.debug("更新权限成功");
        }else{
            LOGGER.debug("更新权限失败");
        }
        return flag;
    }

    @Override
    public MemberRole findOneAuthority(String memName) throws BusinessException {
        MemberRole memberRole = null;
        try {
            memberRole = authorityDao.findOneAuthority(memName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (memberRole != null){
            LOGGER.debug("已查到任何权限信息");
        }else{
            LOGGER.debug("未查到任何权限信息");
        }
        return memberRole;
    }

    @Override
    public List<MemberRole> findAllAuthoritys() throws BusinessException {
        List<MemberRole>  memberRoleList  = null;
        try {
            memberRoleList = authorityDao.findAllAuthoritys();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!memberRoleList.isEmpty()){
            LOGGER.debug("已查到所有权限信息");
        }else{
            LOGGER.debug("未查到任何权限信息");
        }
        return memberRoleList;
    }
}
