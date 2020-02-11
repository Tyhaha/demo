package com.cy;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.pj.common.cache.DefaultCache;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CgbSboot01ApplicationTests {
	@Autowired
	private DataSource dataSource;
	@Autowired
	private ApplicationContext ctx;
	@Autowired
	private DefaultCache defauleCache;
	
	@Test
	public void TestDataSource()  throws Exception{
		System.out.println(dataSource.getConnection());
	}
	
	
	@Test
	public void TestCtx() {
		System.out.println(ctx);
	}
	@Test
	public void TestCache() {
		System.out.println(defauleCache);
	}

}
