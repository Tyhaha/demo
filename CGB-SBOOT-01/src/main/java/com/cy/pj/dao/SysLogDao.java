package com.cy.pj.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysLogDao {
	@Delete("delete from sys_logs where id=#{id}")
	int deleteObject(Integer id);
	
	
	int deleteObjects(@Param("ids")Integer... ids);
}
