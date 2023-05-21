package com.blueskyarea.config;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class GraphoopConfig {
	private Configuration instance;
	
	public GraphoopConfig(String fileName) {
		try	{
			Parameters params = new Parameters();
			FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
			    new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
			    .configure(params.properties()
			        .setFileName(fileName));
			instance = builder.getConfiguration();
		} catch(ConfigurationException ce){
		    // loading of the configuration file failed
		}
	}
	
	public Configuration getInstance() {
		return instance;
	}
}
