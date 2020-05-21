package com.demo.typehandler;

import com.demo.enumeration.State;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StateEnumTypeHandler extends BaseTypeHandler<State> {

    @Override
    public State getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return State.get(resultSet.getInt(i));
    }

    @Override
    public State getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return State.get(callableStatement.getInt(i));
    }

    @Override
    public State getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return State.get(resultSet.getInt(s));
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, State state, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,state.getCode());
    }
}

