package com.nareshit.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.nareshit.model.Student;

public class StudentDAOImpl extends JdbcDaoSupport implements StudentDAO
{
	
	private RowMapper<Student> rowMapper;
	private String GET_ALL="select * from student";
	private String SAVE="insert into studenT(fname,lname) values (?,?)";
	private String GET_ONE = "select * from student where id=?";
	private String DELETE="delete from student where ID=?";
	private String UPDATE="update student set fname=?, lname=? where id=?";
	public void setRowMapper(RowMapper<Student> rowMapper)
	{
		this.rowMapper = rowMapper;
	}
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return getJdbcTemplate().query(GET_ALL, rowMapper);
	}
	@Override
	public void saveStudent(Student st) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update(SAVE,st.getFirstName(),st.getLastName());
		
	}
	@Override
	public void deleteStudent(Integer stuId) 
	{
		
	    //TODO Auto-generated method stub
		getJdbcTemplate().update(DELETE,stuId);
		
	}
	@Override
	public void updateStudent(Student st) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update(UPDATE,st.getFirstName(),st.getLastName(),st.getStid());
		
	}
	@Override
	public Student getStudent(Integer stuId) {
		List<Student> students =  getJdbcTemplate().query(GET_ONE, rowMapper,stuId);
		return students.get(0);
	}

	

}
