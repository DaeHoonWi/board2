package com.board2.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board2.service.BService;

/************************************************
 * <pre>
 *
 * </pre>
 * @Company : (주)한국이디에스
 * @Author  : 위대훈
 * @Date    : 2017. 1. 2. 오후 5:18:07
 * @Version : 1.0
 * @MovieTeamProject 게시판
 *************************************************/
@Controller
public class BController {

	private static final Logger logger = LoggerFactory.getLogger(BController.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@RequestMapping(value = "list.do")
	public String listView(Model model){
		
		logger.debug("================List================");
		
		BService bService = sqlSession.getMapper(BService.class);
		model.addAttribute("list", bService.listDao());
		
		return "board/list";
	}
	
	@RequestMapping(value = "writeForm.do")
	public String writeForm() {
		
		logger.debug("================writeForm================");
		
		return "board/writeForm";
	}
	
	@RequestMapping(value = "write.do")
	public String write(HttpServletRequest request, Model model) {
		
		logger.debug("================write================");
		
		BService bService = sqlSession.getMapper(BService.class);
		bService.writeDao(request.getParameter("mWriter"), request.getParameter("mContent"));
		
		return "redirect:list.do";
	}
}
