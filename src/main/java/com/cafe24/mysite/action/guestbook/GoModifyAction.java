package com.cafe24.mysite.action.guestbook;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cafe24.mysite.dao.GuestbookDao;
import com.cafe24.mysite.vo.GuestbookVo;
import com.cafe24.web.WebUtil;
import com.cafe24.web.mvc.Action;

public class GoModifyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String no = request.getParameter("no");
	
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(Long.parseLong(no));
		
		GuestbookDao dao = new GuestbookDao();
		vo = dao.getList(vo.getNo());
		
		request.setAttribute("vo", vo);
		
		WebUtil.forward(request, response, "/WEB-INF/views/guestbook/modify.jsp");

	}

}
