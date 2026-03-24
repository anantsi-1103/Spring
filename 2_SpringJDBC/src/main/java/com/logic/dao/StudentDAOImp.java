package com.logic.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.logic.Student;

public class StudentDAOImp implements StudentDAO {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		String query = "insert into student values(?,?,?) ";

		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
