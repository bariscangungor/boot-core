package com.turknet.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.turknet.boot.config.BootConfig;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootConfig.class)
@WebAppConfiguration
public class BootCoreApplicationTests {

	@Test
	public void contextLoads() {
	}

}
