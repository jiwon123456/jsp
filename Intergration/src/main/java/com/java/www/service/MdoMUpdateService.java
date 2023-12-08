package com.java.www.service;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.www.dao.MemberInfoDao;
import com.java.www.dto.MemberInfoDto;

public class MdoMUpdateService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("session_memberId");
		System.out.println("MdoMUpdateService : "+memberId);
		
		String mail_tail = request.getParameter("mail_tail");
		String mail_id = request.getParameter("email2");
		String email = mail_id +"@"+mail_tail;
		String zonecode = request.getParameter("zonecode");
		String addressType = request.getParameter("addressType");
		String address = zonecode + ',' + addressType;
		String birth_year = request.getParameter("birth_year");
		String birth_month = request.getParameter("birth_month");
		String birth_day = request.getParameter("birth_day");
		String dateTime = birth_year+"-"+birth_month+"-"+birth_day+" 00:00:00";
		System.out.println("MdoMUpdateService 저장이전 : "+dateTime);
		Timestamp birthday = Timestamp.valueOf(dateTime);
		System.out.println("MdoMUpdateService 저장이전 : "+birthday);
		
		MemberInfoDto mdto = new MemberInfoDto(memberId, email, address, birthday);
		
		//dao 접근
		MemberInfoDao mdao = new MemberInfoDao();
		int result = mdao.doMUpdate(mdto);
		
		//request
		request.setAttribute("result", result);

	}

}
