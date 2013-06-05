package org.bsns.server.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.bsns.server.board.BoardService;
import org.bsns.server.common.Condition;
import org.bsns.server.domain.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardControllerTest {

	
	@Resource(name="BoardService")
	private BoardService boardService;
	
	@RequestMapping(value="listTest.do", method = RequestMethod.GET)
	public String list(
			@RequestParam(defaultValue="1") Integer page, 
			@RequestParam(defaultValue="1") String type, 
			HttpServletResponse response) throws Exception 
		{
		
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("page", page);
		condition.put("type", type);
		
		List<BoardVO> list = boardService.list(condition);
		
		JSONArray jsonArr = new JSONArray();
		
		jsonArr.addAll(list);
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(jsonArr.toString());
		response.getWriter().flush();
		
		return "BoardListTest";
	}
}
