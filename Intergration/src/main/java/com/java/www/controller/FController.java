package com.java.www.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.www.service.DoLoginService;
import com.java.www.service.DoMInsertService;
import com.java.www.service.MSelectOneService;
import com.java.www.service.MdoMUpdateService;
import com.java.www.service.Service;

@WebServlet("*.do")
public class FController extends HttpServlet {

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		
		String url = null;
		Service service = null;
		//파일이름 추출
		String uri = request.getRequestURI();
		System.out.println("uri");
		String cPath = request.getContextPath();
		System.out.println("cPath");
		String fileName = uri.substring(cPath.length()+1);
		//파일호출 이름
	    System.out.println("파일호출 이름 : "+fileName);
	    System.out.println("섹션 아이디 : "+session.getAttribute("session_memberId "));
				
		
		switch(fileName){
		case  "html/main.do":
			response.sendRedirect("main.jsp");
			break;
		case "join01_terms.do":
			response.sendRedirect("join01_terms.jsp");
			break;
		case "Insert.do":
			url ="Insert.jsp";
			break;
		case "join03_success.do":
			service =  new DoMInsertService();
			service.execute(request, response);
			url = "join03_success.jsp";
			break;
		case "regStore.do":
			response.sendRedirect("regStore.jsp");
			break;
		case "Login.do":
			response.sendRedirect("Login.jsp");
			break;
		case "doLogin.do":
			service =  new DoLoginService();
			service.execute(request, response);
			url = "doLogin.jsp";
			break;
		case "change_info.do":
			service =  new MSelectOneService();
			service.execute(request, response);
			url = "change_info.jsp";
			break;
		case "doMUpdate.do":
			service =  new MdoMUpdateService();
			service.execute(request, response);
			url = "doMUpdate.jsp";
			break;
		case "Logout.do":
			response.sendRedirect("Logout.jsp");
			break;
		}//switch
		
		if(url != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
		}
		
	}//doAction
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request,response);
	}

}
