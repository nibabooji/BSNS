package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.file.fileauth.FileAuthService;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.FileAuthVO;
import org.junit.Test;

public class FileAuthServiceTest 
extends JunitSettting{

	@Resource(name="FileAuthService")
	private FileAuthService fileAuthService;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Test
	public void create() throws SQLException{
		FileAuthVO fileAuth = new FileAuthVO();
		
		fileAuth.setBoardFileNo(5);
		fileAuth.setEmail("test5");
		
		fileAuthService.create(fileAuth);
	}

//	@Test
//	public void read() throws SQLException{
//		//read(condition test
//		Condition<String, Object> condition = new Condition<String, Object>();
//		
//		condition.put("fileAuthKey", 5);
//		
//		log.debug("FileAuthDAO read Test result : " + fileAuthService.read(condition));
//	}
	
	@Test
	public void read() throws SQLException{
		//read(key) test
		log.debug("FileAuthDAO read Test result : " + fileAuthService.read(5));
	}
	@Test
	public void update() throws SQLException{
		FileAuthVO fileAuth = new FileAuthVO();
		
		fileAuth.setFileAuthKey(5);
		fileAuth.setBoardFileNo(4);
		fileAuth.setEmail("test7");
		
		fileAuthService.update(fileAuth);
	}
	
//	@Test
//	public void delete() throws SQLException{
//		//delete(condition) test
//		Condition<String, Object> condition = new Condition<String, Object>();
//		
//		condition.put("fileAuthKey", 5);
//		
//		fileAuthService.delete(condition);
//	}
	
//	@Test
//	public void delete() throws SQLException{
//		//delete(key) test
//		fileAuthService.delete(6);
//	}
	
	@Test
	public void list() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("boardFileNo", 5);
		log.debug("FileAuthDAO list Test result : " + fileAuthService.list(condition));
	}
	

}
