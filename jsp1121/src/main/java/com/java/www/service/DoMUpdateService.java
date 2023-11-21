package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.MemberDao;
import com.java.www.dto.MemberDto;

public class DoMUpdateService implements Service {

	@Override
	public void execute(HttpServletRequest request,HttpServletResponse response) {
		int result = 0;
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String [] hobbys = request.getParameterValues("hobby");
		String hobby = "";
		for(int i=0;i<hobbys.length;i++) {
			if(i ==0 ) hobby = hobbys[i];
			else hobby += "," + hobbys[i];
		}//for
		MemberDto mdto = new MemberDto(id, pw, name, phone, gender, hobby);
		
		
		
		//dao접근
		MemberDao mdao = new MemberDao();
		//패스워드를 비교해서 일치하면 업데이트, 불일치하면 업데이트 중간
		MemberDto chDto = mdao.selectOne(id);
		System.out.println("DoMUpdateService pw : "+pw);
		System.out.println("DoMUpdateService chDto pw : "+chDto.getPw());
		//입력된 pw와 기존 pw가 같은지비교
		if(pw.equals(chDto.getPw())) {
			System.out.println("패스워드 일치, 업데트 진행");
			result = mdao.mUpdate(mdto);
		}else {
			System.out.println("패스워드 불일치, 업데이트 중단");
		}
		
		//request
		request.setAttribute("result", result);
		
	}

}
