// DBにINSERT

package com.example.reservation.auth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.reservation.model.AccountBeans;

public class AccountRegisterDAO {
	// データベース接続に使用する情報
		final String jdbcId = "root";
		final String jdbcPass = "password";
		final String jdbcUrl = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=JST";

	public  AccountRegisterDAO(AccountBeans ab) {

		try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {

			String sql = "INSERT INTO users (patient_no, name, phone, email, password_hash, role) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps= con.prepareStatement(sql);

			ps.setString(1, ab.getPatientNo());
			ps.setString(2, ab.getPasswordHash());
			ps.setString(3, ab.getPhone());
			ps.setString(4, ab.getEmail());
			ps.setString(5, ab.getPasswordHash());
			ps.setString(6, ab.getRole());

			int r = ps.executeUpdate();

			if(r != 0) {
				System.out.println("新規登録成功！");
			} else {
				System.out.println("新規登録失敗");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
