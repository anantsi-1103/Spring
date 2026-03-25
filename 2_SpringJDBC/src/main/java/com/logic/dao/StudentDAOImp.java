package com.logic.dao;

import java.nio.channels.SelectableChannel;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.logic.Student;


@Component("sDAO")
public class StudentDAOImp implements StudentDAO {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// query ko likhne wale kaam ko hibernate
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

	@Override
	public int change(Student student) {
		String query = "update student set name = ? , city = ? where id = ? ";

		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());

		return r;
	}

	@Override
	public int delete(int id) {
		String query = "delete from student where id = ?";

		int r = this.jdbcTemplate.update(query, id);
		return r;
	}

	public Student getStudent(int id) {
		String query = "select * from student where id = ?";
		
		
		RowMapper<Student> rowMapper = new RowMapperImp();

		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, id);

		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		String query = "select * from student";
		
//		RowMapper<Student> rowMapper = 
		
		List<Student> students = this.jdbcTemplate.query(query,new RowMapperImp());
		
		return students;
	}

}
