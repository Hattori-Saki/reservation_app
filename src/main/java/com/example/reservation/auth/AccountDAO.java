package com.example.reservation.auth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.reservation.model.AccountBeans;

public class AccountDAO {
	// データベース接続に使用する情報
	final String jdbcId = "root";
	final String jdbcPass = "password";
	final String jdbcUrl = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=JST";

	// ログインアカウントを探す
	public AccountBeans findAccount(AccountBeans ab) {

		// 戻り値の用意
		AccountBeans returnAb = new AccountBeans();

		// データベースへ接続
		try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {

			String sql = "SELECT patient_no, name, phone, email, password_hash, role FROM users WHERE patient_no = ? AND password_hash = ?";
			PreparedStatement ps= con.prepareStatement(sql);

			ps.setString(1, ab.getPatientNo());
			ps.setString(2, ab.getPasswordHash());

			ResultSet rs = ps.executeQuery();


			if (rs.next()) {
				// 見つかったアカウント情報を戻り値にセット
				returnAb.setPatientNo(rs.getString("patient_no"));
				returnAb.setName(rs.getString("name"));
				returnAb.setPhone(rs.getString("phone"));
				returnAb.setEmail(rs.getString("email"));
				returnAb.setPasswordHash(rs.getString("password_hash"));
				returnAb.setRole(rs.getString("role"));
			} else {
				// アカウントがなければnullを返す
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return returnAb;
	}
}
