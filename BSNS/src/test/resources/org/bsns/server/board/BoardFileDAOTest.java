package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.file.BoardFileDAO;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.BoardFileVO;
import org.bsns.server.domain.BoardVO;
import org.junit.Test;

public class BoardFileDAOTest 
extends JunitSettting{
	
	@Resource(name="BoardFileDAO")
	private BoardFileDAO boardFileDao;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Test
	public void create() throws SQLException{
		BoardFileVO file = new BoardFileVO();
		
		
		// create() 할때 이전 단계에서 넘겨줘야 할 값 fileNo, BoardNum
		file.setFileNo(318);
		file.setBoardNum(97);
		
		boardFileDao.create(file);
	}

	@Test
	public void read() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("boardFileNo", 101);
		
		log.debug("BoardDAO read Test result : " + boardFileDao.read(condition));
	}
	
	@Test
	public void update() throws SQLException{
		BoardFileVO file = new BoardFileVO();

		file.setBoardFileNo(101);
		file.setFileNo(97);

		boardFileDao.update(file);
	}
	@Test
	public void delete() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("boardFileNo", 100);
		
		boardFileDao.delete(condition);
	}
	
	@Test
	public void list() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("boardNo", 318242);
//		condition.put("type", 2);
		
		//boardDao.list(condition);
//		System.out.println("BoardDAO list Test result : " + boardDao.list(condition));
		log.debug("BoardFileDAO list Test result : " + boardFileDao.list(condition));
	}

}
