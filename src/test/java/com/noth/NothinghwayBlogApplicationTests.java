package com.noth;

import com.noth.system.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NothinghwayBlogApplicationTests {


	@Autowired
	private BlogProperties properties;

	@Test
	public void contextLoads() {
		Assert.assertEquals(properties.getName(),"nothinghway_blog");
		Assert.assertEquals(properties.getTitle(),"nothinghway_blog_system");
	}

}
