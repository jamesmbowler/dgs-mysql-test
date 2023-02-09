package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.demo.repository")
@ComponentScan({"com.demo"})
@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * Below is an example of using a PreparsedDocumentProvider.
	 * Uncomment to enable
	 */
//	@Configuration
//	static class PreparsedDocumentProviderConfig {
//
//		private final Cache<String, PreparsedDocumentEntry> cache = Caffeine.newBuilder().maximumSize(250)
//				.expireAfterAccess(5, TimeUnit.MINUTES).recordStats().build();
//
//
//		@Bean
//		public PreparsedDocumentProvider preparsedDocumentProvider() {
//			return (executionInput, parseAndValidateFunction) -> {
//				Function<String, PreparsedDocumentEntry> mapCompute = key -> parseAndValidateFunction.apply(executionInput);
//				return cache.get(executionInput.getQuery(), mapCompute);
//			};
//		}
//	}
}
