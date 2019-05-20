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

public class ModifyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String no = request.getParameter("no");
		String contents = request.getParameter("contents");
		String name = request.getParameter("name");
		
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(Long.parseLong(no));
		vo.setContents(contents);
		vo.setName(name);
		
		GuestbookDao dao = new GuestbookDao();
		dao.modify(vo);
		
		List<GuestbookVo> list = dao.getList();
		
		request.setAttribute("list", list);
		
		WebUtil.forward(request, response, "/WEB-INF/views/guestbook/list.jsp");
	}

}
