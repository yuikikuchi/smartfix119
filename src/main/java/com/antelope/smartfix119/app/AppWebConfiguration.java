package com.antelope.smartfix119.app;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

public class AppWebConfiguration {

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		registry.addResourceHandler("/**").addResourceLocations("/resources/app/js/serviceWorker.js");
	}

}
