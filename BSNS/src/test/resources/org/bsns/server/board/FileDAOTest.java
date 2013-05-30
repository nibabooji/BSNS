package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.file.file.FileDAO;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.FileAuthVO;
import org.bsns.server.domain.FileVO;
import org.junit.Test;

public class FileDAOTest 
extends JunitSettting{
	@Resource(name="fileDAO")
	private FileDAO fileDao;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Test
	public void create() throws SQLException{
		FileVO file = new FileVO();
		
		file.setFileSize(1000);
		file.setFileType("xls");
		file.setFileName("test");
		file.setFilePath("/board/file/");
		
		fileDao.create(file);
	}

	@Test
	public void read() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("fileNo", 73741);
		
		log.debug("FileDAO read Test result : " + fileDao.read(condition));
	}
	
	@Test
	public void update() throws SQLException{
		FileVO file = new FileVO();
		
		
		file.setFileSize(2000);
		file.setFileType("xls-edit");
		file.setFileName("test-edit");
		file.setFilePath("/board/file/edit/");
		
		file.setFileNo(73741);
		
		fileDao.update(file);
	}
	@Test
	public void delete() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("fileNo", 73741);
		
		fileDao.delete(condition);
	}
}
