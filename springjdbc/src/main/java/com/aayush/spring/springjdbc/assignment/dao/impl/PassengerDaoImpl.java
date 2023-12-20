package com.aayush.spring.springjdbc.assignment.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.aayush.spring.springjdbc.assignment.dao.PassengerDao;
import com.aayush.spring.springjdbc.assignment.dao.rowmapper.PassengerRowMapper;
import com.aayush.spring.springjdbc.assignment.entity.Passenger;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Passenger pas) {
		String sql = "insert into passenger values(?,?,?)";
		return jdbcTemplate.update(sql, pas.getId(), pas.getFirstName(), pas.getLastName());
	}

	@Override
	public int update(Passenger pas) {
		String sql = "update passenger set firstname=?,lastname=? where id=?";
		return jdbcTemplate.update(sql, pas.getFirstName(), pas.getLastName(), pas.getId());
	}

	@Override
	public int delete(int id) {
		String sql = "delete from passenger where id=?";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public Passenger read(int id) {
		String sql = "select * from passenger where id=?";
		PassengerRowMapper pasRowMapper = new PassengerRowMapper();
		Passenger pas = jdbcTemplate.queryForObject(sql, pasRowMapper, id);
//		System.out.println(pas);
		return pas;
	}

}
