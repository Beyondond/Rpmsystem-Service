package cn.com.dhc.rpmsystem.system.dao;

import cn.com.dhc.rpmsystem.system.entity.RpmRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kemeiyi
 * @description 角色配置管理
 * @date 2019/8/7
 */
@Repository
@Mapper
public interface RoleManagerDao {

    /**
     * 增加角色
     * @param rpmRole
     * @return
     */
    Integer addRpmRole(RpmRole rpmRole) throws Exception;


    /**
     *删除角色(根据工号)
     * @param id
     * @return
     */
    Integer deleteRpmRole(int id) throws Exception;


    /**
     *修改角色
     * @param rpmRole
     * @return
     */
    Boolean updateRpmRole(RpmRole rpmRole) throws Exception;

    /**
     * 查询单个角色（根据角色名称查询）
     * @param roleName
     * @return
     */

    RpmRole findOneRpmRole(String roleName) throws Exception;


    /**
     * 查询所有角色
     * @return
     */
    List<RpmRole> findAllRpmRole() throws Exception;

}
