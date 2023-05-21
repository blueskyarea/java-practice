package com.blueskyarea.entity.hadoop;

import com.google.gson.annotations.SerializedName;

public class HadoopApp {
	@SerializedName("startedTime")
	public String startedTime;
	
	@SerializedName("id")
	public String id;
	
	@SerializedName("queue")
	public String queue;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("state")
	public String state;
	
	@SerializedName("finalStatus")
	public String finalStatus;
	
	@SerializedName("elapsedTime")
	public String elapsedTime;
}
