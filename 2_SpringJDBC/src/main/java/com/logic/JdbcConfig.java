package com.logic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// xml
@Configuration 
@ComponentScan(basePackages = "com.logic.dao")
public class JdbcConfig {

//	<bean>
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring4_30");
		ds.setUsername("root");
		ds.setPassword("Anant@1234");

		return ds;
	}

	@Bean("jdbcTemp")
	public JdbcTemplate getTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		jdbcTemplate.setDataSource(getDataSource());

		return jdbcTemplate;
	}

//	@Bean("sDAO")
//	public StudentDAO getStudentDAO() {
//		
//		StudentDAOImp studentDAO = new StudentDAOImp();
//		studentDAO.setJdbcTemplate(getTemplate());
//		
//		return studentDAO;
//		
//			
//	}
}
