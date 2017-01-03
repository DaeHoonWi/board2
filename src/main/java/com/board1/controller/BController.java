/**
 * 
 */
package com.board1.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board1.service.BService;

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
public class BController {

	@Autowired
	private SqlSession sqlSession;
	
	
	
	
	@RequestMapping(value = "list.do")
	public String listView(Model model){
		
		BService bService = sqlSession.getMapper(BService.class);
		model.addAttribute("list", bService.listDao());
		
		return "/board/list";
	}
	
	@RequestMapping(value = "writeForm.do")
	public String writeForm() {
		
		return "/board/writeForm";
	}
}
