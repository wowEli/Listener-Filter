package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.JDBCUtil;

public class DabangDAO {
	Connection conn;
	PreparedStatement pstmt;
	
	final String sql_insert="INSERT INTO DABANG VALUES(?)";
	
	public boolean insert(DabangVO vo) { // 회원가입
		conn=JDBCUtil.connect();
		try {
			pstmt=conn.prepareStatement(sql_insert);
			pstmt.setString(1, vo.getPrice());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(pstmt, conn);
		}
		return true;
	}
}
