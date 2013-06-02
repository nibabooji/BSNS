package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.file.file.FileService;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.FileVO;
import org.junit.Test;

public class FileServiceTest 
extends JunitSettting{
	
	@Resource(name="FileService")
	private FileService fileService;
	
	private Logger log = Logger.getLogger(this.getClass());

	@Test
	public void create() throws SQLException{
		FileVO file = new FileVO();

		file.setFileSize(1000);
		file.setFileType("xls2");
		file.setFileName("test55");
		file.setFilePath("/board/file/");
		
		fileService.create(file);
	}

	@Test
	public void read() throws SQLException{
		//read(condition) test
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("fileNo", 73762);
		
		log.debug("FileDAO read Test result : " + fileService.read(condition));
	}
	
//	@Test
//	public void read() throws SQLException{
//		//read(key) test
//		log.debug("FileDAO read Test result : " + fileService.read(73762));
//	}
	
	@Test
	public void update() throws SQLException{
		FileVO file = new FileVO();
		
		
		file.setFileSize(2000);
		file.setFileType("xls-edit");
		file.setFileName("test-edit");
		file.setFilePath("/board/file/edit/");
		
		file.setFileNo(73762);
		
		fileService.update(file);
	}
	
	@Test
	public void delete() throws SQLException{
		//delete(condition) test
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("fileNo", 73762);
		
		fileService.delete(condition);
	}

//	@Test
//	public void delete() throws SQLException{
//		//delete(key) test
//		fileService.delete(73763);
//	}
	

}
