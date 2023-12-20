package com.aayush.spring.springjdbc.assignment.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.aayush.spring.springjdbc.assignment.entity.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger pas = new Passenger();
		pas.setId(rs.getInt(1));
		pas.setFirstName(rs.getString(2));
		pas.setLastName(rs.getString(3));
		return pas;
	}

}
