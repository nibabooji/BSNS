package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.file.fileauth.FileAuthDAO;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.FileAuthVO;
import org.junit.Test;

public class FileAuthDAOTest 
extends JunitSettting{
	@Resource(name="fileAuthDAO")
	private FileAuthDAO fileAuthDao;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Test
	public void create() throws SQLException{
		FileAuthVO fileAuth = new FileAuthVO();
		
		fileAuth.setBoardFileNo(5);
		fileAuth.setEmail("test5");
		
		fileAuthDao.create(fileAuth);
	}

	@Test
	public void read() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("fileAuthKey", 5);
		
		log.debug("FileAuthDAO read Test result : " + fileAuthDao.read(condition));
	}
	
	@Test
	public void update() throws SQLException{
		FileAuthVO fileAuth = new FileAuthVO();
		
		fileAuth.setFileAuthKey(2);
		fileAuth.setBoardFileNo(4);
		fileAuth.setEmail("test6");
		
		fileAuthDao.update(fileAuth);
	}
	@Test
	public void delete() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("fileAuthKey", 2);
		
		fileAuthDao.delete(condition);
	}
	
	@Test
	public void list() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("boardFileNo", 5);
		log.debug("FileAuthDAO list Test result : " + fileAuthDao.list(condition));
	}
}
