package com.csis3275.CupOJava_Project.User;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import com.csis3275.CupOJava_Project.User.*;;

@Component
public class UserDAO {

	JdbcTemplate jdbcTemplate;
	
	private final String SQL_GET_ALL = "SELECT * FROM transitUsers";
	private final String SQL_GET_USER_BY_USERNAME = "SELECT * FROM transitUsers WHERE username = ?";
	private final String SQL_GET_USER = "SELECT * FROM transitUsers WHERE id = ?";
	private final String SQL_CREATE_USER = "INSERT INTO transitUsers (name, email) VALUES (?,?)";
	private final String SQL_DELETE_USER = "DELETE FROM transitUsers WHERE id = ?";
	private final String SQL_UPDATE_USER= "UPDATE transitUsers SET username= ?, password= ?, firstName= ?, lastName= ?, WHERE id = ?";

	@Autowired
	public UserDAO(DataSource dataSource)	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<User> getAllUsers()	{
		return jdbcTemplate.query(SQL_GET_ALL, new UserMapper());
		
	}
	
	public List<User> getUserByUsername(String username) {
		return jdbcTemplate.query(SQL_GET_USER_BY_USERNAME, new UserMapper(), username);
	}
	public List<User> getUser(int id) {
		return jdbcTemplate.query(SQL_GET_USER, new UserMapper(), id);
	}
	
	public boolean createUsert(User user) {
		return jdbcTemplate.update(SQL_CREATE_USER, user.getUsername(), user.getPassword(), user.getFirstName(), user.getLastName()) > 0;
	}
	
	public boolean deleteUser(int idToDelete) {
		return jdbcTemplate.update(SQL_DELETE_USER, idToDelete) > 0;
	}
	
	public boolean updateUser(User user) {
		return jdbcTemplate.update(SQL_UPDATE_USER, user.getUsername(), user.getPassword(), user.getFirstName(), user.getLastName(), user.getId()) > 0;
	}
}
	
	