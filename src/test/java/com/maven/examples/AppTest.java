package com.maven.examples;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void testResources() throws IOException {
		String resourceFile = "/test.properties";
		InputStream is = getClass().getResourceAsStream(resourceFile);
		
		Properties p = new Properties();
		p.load(is);
		
		System.out.println(p.get("app.name"));
		System.out.println(p.get("app.version"));
		
	}
}
