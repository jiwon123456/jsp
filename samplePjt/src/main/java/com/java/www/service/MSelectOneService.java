package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.www.dao.MemberDao;
import com.java.www.dto.MemberDto;

public class MSelectOneService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		//id 가져오기
		String id = (String) session.getAttribute("session_id");
		
		//dao 접근 - select
		MemberDao mdao = new MemberDao();
		MemberDto mdto = mdao.selectOne(id);
		
		//request
		request.setAttribute("mdto", mdto);
		
	}

}
