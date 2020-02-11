package com.cy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.pj.dao.SysLogDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSysLogs {    
    @Autowired
    private SysLogDao sysLogDao;
	@Test
	public void testSysLogDao() {
		int rows=sysLogDao.deleteObject(10);
		System.out.println("rows="+rows);
	}
	
	@Test
	public void testDeleteObjects() {
			int rows=
			sysLogDao.deleteObjects(17,18);
			System.out.println(rows);
	}
}
