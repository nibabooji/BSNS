package org.bsns.server.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.log4j.Logger;
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
	
	private final Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="/listTest.do", method = RequestMethod.GET)
	public void list(
			@RequestParam(defaultValue="1") Integer page, 
			String type, HttpServletResponse response,
			HttpServletRequest request
			) throws Exception 
		{
		
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("page", page);
		condition.put("type", type);
		
		List<BoardVO> list = boardService.list(condition);
		
		JSONArray jsonArr = new JSONArray();
		
		jsonArr.addAll(list);
		
		log.debug("Test Controller : " + jsonArr);
		
		response.setContentType("text/html; charset=UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		response.getWriter().write(jsonArr.toString());
		
		response.getWriter().flush();
	}
}
