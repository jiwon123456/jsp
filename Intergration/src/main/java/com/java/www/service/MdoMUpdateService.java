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
		String memberId = request.getParameter("memberId");
		String nicname = request.getParameter("nicename");
		String mempw = request.getParameter("mempw");
		String mail_tail = request.getParameter("mail_tail");
		String email2 = request.getParameter("email2");
		String email = email2 +"@"+mail_tail;
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String address = address1 + ',' + address2;
		String birth_year = request.getParameter("birth_year");
		String birth_month = request.getParameter("birth_month");
		String birth_day = request.getParameter("birth_day");
		String dateTime = birth_year+'-'+birth_month+'-'+birth_day+" 00:00:00";
		Timestamp birthday = Timestamp.valueOf(dateTime);
		
		MemberInfoDto mdto = new MemberInfoDto(memberId, nicname, mempw, address, email, birthday);
		
		//dao 접근
		MemberInfoDao mdao = new MemberInfoDao();
		int result = mdao.doMUpdate(mdto);
		
		//request
		request.setAttribute("result", result);

	}

}
