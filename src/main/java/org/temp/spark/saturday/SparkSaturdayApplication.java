package org.temp.spark.saturday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class SparkSaturdayApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SparkSaturdayApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SparkSaturdayApplication.class, args);
	}
}
