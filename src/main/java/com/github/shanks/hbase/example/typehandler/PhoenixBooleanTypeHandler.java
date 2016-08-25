package com.github.shanks.hbase.example.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BooleanTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes(Boolean.class)
public class PhoenixBooleanTypeHandler extends BooleanTypeHandler {

	 @Override
	  public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType)
	      throws SQLException {
		 ps.setInt(i, transform(parameter));
	  }

	  @Override
	  public Boolean getNullableResult(ResultSet rs, String columnName)
	      throws SQLException {
	    return transform(rs.getInt(columnName));
	  }

	  @Override
	  public Boolean getNullableResult(ResultSet rs, int columnIndex)
	      throws SQLException {
	    return transform(rs.getInt(columnIndex));
	  }

	  @Override
	  public Boolean getNullableResult(CallableStatement cs, int columnIndex)
	      throws SQLException {
	    	return transform(cs.getInt(columnIndex));
	  }
	
	  private Integer transform(Boolean parameter) {
		  if (parameter != null) {
			  return parameter ? 1 : 0; 
		  }
		  return null;
	  }
	  
	  private Boolean transform(Integer parameter) {
		  if (parameter != null) {
			  return parameter == 0 ? false : true; 
		  }
		  return null;
	  }
}
