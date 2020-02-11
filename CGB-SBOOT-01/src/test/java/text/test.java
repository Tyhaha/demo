package text;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test {
	@Test
	public  void qweq() throws JsonProcessingException {
		List<Object> a = new ArrayList<>();
		user u1 = new user();
		u1.setName("zhangsan1");
		u1.setAge(1122);
		u1.setSex("鸟安12");
		
		a.add(u1);
		
		user1 u = new user1();
		u.setName("zhangsan");
		u.setAge(12);
		u.setSex("鸟安");
		u.setParant("1231");
		a.add(u);
		ObjectMapper mapper = new ObjectMapper();
		String res = mapper.writeValueAsString(a);
		
		System.out.println(res);
		
	}
}
