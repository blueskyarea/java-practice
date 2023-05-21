package com.blueskyarea.entity;

import com.google.gson.annotations.SerializedName;

public class HadoopApp {
	@SerializedName("startedTime")
	public String startedTime;
	
	@SerializedName("finishedTime")
	public String finishedTime;

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
	
	@SerializedName("memorySeconds")
	public String memorySeconds;
	
	@SerializedName("vcoreSeconds")
	public String vcoreSeconds;
	
	@SerializedName("allocatedMBPerSeconds")
	public String allocatedMBPerSeconds;
	
	@SerializedName("allocatedVCoresPerSeconds")
	public String allocatedVCoresPerSeconds;

	@SerializedName("allocatedMB")
	public String allocatedMB;

	@SerializedName("allocatedVCores")
	public String allocatedVCores;

	@SerializedName("runningContainers")
	public String runningContainers;

	@SerializedName("queueUsagePercentage")
	public String queueUsagePercentage;

	@SerializedName("clusterUsagePercentage")
	public String clusterUsagePercentage;

	@SerializedName("trackingUrl")
	public String trackingUrl;
}
