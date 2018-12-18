package com.example.configProject;

import com.example.configProject.config.GlobalConfiguration;
import com.example.configProject.config.MultipleConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(value = "test")
public class ConfigProjectApplicationTests {

	@Autowired
	ConfigurationNr2 configurationNr2;

	@Test
	public void contextLoads() {
	}

}

