package com.example.jsr352.job.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.batch.api.AbstractBatchlet;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Named
public class DbBatchlet extends AbstractBatchlet {
	@Inject
	NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public String process() throws Exception {

		jdbcTemplate.query("select name from testdata",
				new RowCallbackHandler() {
					@Override
					public void processRow(ResultSet rs) throws SQLException {
						System.out.println(rs.getString(1));
					}
				});
		return null;
	}

}
