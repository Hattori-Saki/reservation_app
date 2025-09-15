package com.example.reservation.auth;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.example.reservation.model.AccountBeans;

/**
 * Servlet implementation class AccountRegister
 */
@WebServlet("/account")
public class AccountRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String patient_no = request.getParameter("patient_no");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String password_hash = request.getParameter("password_hash");
		String role = request.getParameter("role");

		// signup.jspから受け取った値をビーンズにセット
		// patient_no, name, phone, email, password_hash, role
		AccountBeans ab = new AccountBeans();
		ab.setPatientNo(patient_no);
		ab.setName(name);
		ab.setPhone(phone);
		ab.setEmail(email);
		ab.setPasswordHash(password_hash);
		ab.setRole(role);

		// アカウントをDBに登録
		AccountRegisterDAO ard = new AccountRegisterDAO(ab);

		// セッションにアカウント情報を保存
		HttpSession session = request.getSession();
		session.setAttribute("account", ab);

		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);

	}

}

