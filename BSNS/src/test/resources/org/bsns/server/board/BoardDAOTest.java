package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.BoardVO;
import org.junit.Test;


public class BoardDAOTest 
extends JunitSettting
{

	@Resource(name="BoardDAO")
	private BoardDAO boardDao;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Test
	public void create() throws SQLException{
		BoardVO board = new BoardVO();
		
		board.setType(1);
		board.setContent("DAO TEST CONTENT");
		board.setEmail("test5");
		
		boardDao.create(board);
	}

	@Test
	public void read() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("number", 101);
		
		log.debug("BoardDAO read Test result : " + boardDao.read(condition));
	}
	
	@Test
	public void update() throws SQLException{
		BoardVO board = new BoardVO();
		
		board.setNumber(101);
		board.setType(1);
		board.setContent("DAO TEST UPDATE CONTENT");
		board.setEmail("test5");
		
		boardDao.update(board);
	}
	@Test
	public void delete() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("number", 100);
		
		boardDao.delete(condition);
	}
	
	@Test
	public void list() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("page", 1);
//		condition.put("type", 2);
		
		//boardDao.list(condition);
//		System.out.println("BoardDAO list Test result : " + boardDao.list(condition));
		log.debug("BoardDAO list Test result : " + boardDao.list(condition));
	}
}
