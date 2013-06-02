package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.file.BoardFileService;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.BoardFileVO;
import org.junit.Test;

public class BoardFileServiceTest 
extends JunitSettting{

	@Resource(name = "BoardFileService")
	private BoardFileService boardFileService;
	
	private Logger log = Logger.getLogger(this.getClass());

	@Test
	public void create() throws SQLException{
		BoardFileVO boardFile = new BoardFileVO();

		// create() 할때 이전 단계에서 넘겨줘야 할 값 fileNo, BoardNum
		boardFile.setFileNo(318);
		boardFile.setBoardNum(97);
		
		boardFileService.create(boardFile);
	}

	@Test
	public void read() throws SQLException{
		//read(condition) test
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("boardFileNo", 102);
		
		log.debug("BoardDAO read Test result : " + boardFileService.read(condition));
	}
	
//	@Test
//	public void read() throws SQLException{
//		//read(key) test
//		log.debug("BoardDAO read Test result : " + boardFileService.read(103));
//	}
	
	@Test
	public void update() throws SQLException{
		BoardFileVO boardFile = new BoardFileVO();

		boardFile.setBoardFileNo(101);
		boardFile.setFileNo(98);

		boardFileService.update(boardFile);
	}
	@Test
	public void delete() throws SQLException{
		
		//delete(condition) test
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("boardFileNo", 102);
		
		boardFileService.delete(condition);
	}
	
//	@Test
//	public void delete() throws SQLException{
//		//delete(key) test
//		boardFileService.delete(103);
//	}
	
	@Test
	public void list() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("boardNum", 318242);

		log.debug("BoardFileDAO list Test result : " + boardFileService.list(condition));
	}
}
