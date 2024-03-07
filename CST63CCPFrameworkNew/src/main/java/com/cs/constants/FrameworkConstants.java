package com.cs.constants;

import java.time.Duration;

public final class FrameworkConstants {
	
	private FrameworkConstants() {}
	
	public static String getResourcepath() {
		return RESOURCEPATH;
	}
	public static String getConfigpath() {
		return CONFIGPATH;
	}
	

	public static Duration getExplicitwait() {
		return EXPLICITWAIT;
	}


	private static final String RESOURCEPATH =System.getProperty("user.dir")+"/src/test/resources";
     private static final String CONFIGPATH= RESOURCEPATH+"/config/config.properties";
	private static final  Duration EXPLICITWAIT=Duration.ofSeconds(5);
     
     
}
