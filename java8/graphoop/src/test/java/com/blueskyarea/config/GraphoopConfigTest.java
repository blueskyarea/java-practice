package com.blueskyarea.config;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class GraphoopConfigTest {
	private static final String MAIN_CONFIG_NAME = "main.properties";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		GraphoopConfig config = new GraphoopConfig(MAIN_CONFIG_NAME);
		assertThat(config.getInstance().getString("hadoop.api.url"), is("abc"));
	}

}
