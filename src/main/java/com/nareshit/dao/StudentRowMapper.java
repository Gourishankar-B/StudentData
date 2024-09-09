package com.nareshit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nareshit.model.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st = new Student();
		st.setStid(rs.getInt(1));
		st.setFirstName(rs.getString(2));
		st.setLastName(rs.getString(3));
		return st;
	}

}
