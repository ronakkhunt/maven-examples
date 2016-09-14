package com.maven.examples;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Main class for this Demo Application
 * @author ronakkhunt
 *
 */
public class App {
	public void getResources() throws IOException {
		
		String resource = "/META-INF/app.properties";
		Properties p = new Properties();
		p.load(getClass().getResourceAsStream(resource));
		
		/**
		 * NOTE:
		 * To understand the difference between getClass().getResource() and getClass().getClassLoader().getResource() visit.
		 * 	http://stackoverflow.com/questions/14739550/difference-between-getclass-getclassloader-getresource-and-getclass-getres
		 */
		
		
		System.out.println(p.get("app.name"));
		System.out.println(p.get("app.filter.alt"));
	}
	public static void main(String[] args) throws IOException {
		new App().getResources();
	}
}
