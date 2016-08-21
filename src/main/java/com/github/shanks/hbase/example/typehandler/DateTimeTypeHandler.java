package com.github.shanks.hbase.example.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.joda.time.DateTime;

@MappedTypes(DateTime.class)
public class DateTimeTypeHandler extends BaseTypeHandler<DateTime> {

	@Override
	public DateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
		DateTime dateTime = null;
		Timestamp timestamp = rs.getTimestamp(columnName);
		if (timestamp != null) {
			dateTime = new DateTime(timestamp);
		}
		return dateTime;
	}

	@Override
	public DateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		DateTime dateTime = null;
		Timestamp timestamp = rs.getTimestamp(columnIndex);
		if (timestamp != null) {
			dateTime = new DateTime(timestamp);
		}
		return dateTime;
	}

	@Override
	public DateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		DateTime dateTime = null;
		Timestamp timestamp = cs.getTimestamp(columnIndex);
		if (timestamp != null) {
			dateTime = new DateTime(timestamp);
		}
		return dateTime;
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, DateTime parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setTimestamp(i, new Timestamp(parameter.getMillis()));
	}

}
