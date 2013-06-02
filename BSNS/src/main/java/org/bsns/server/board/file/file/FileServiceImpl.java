package org.bsns.server.board.file.file;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.domain.FileVO;
import org.springframework.stereotype.Service;

@Service(value="FileService")
public class FileServiceImpl 
implements FileService{

	@Resource(name="FileDAO")
	private FileDAO fileDao;
	
	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void create(FileVO file) throws SQLException {
		log.debug("===== FileServie Create(file) Start =====");
		
		fileDao.create(file);
		
		log.debug("===== FileServie Create(file) End =====");
		
	}

	@Override
	public FileVO read(Condition condition) throws SQLException {
		log.debug("===== FileServie read(condition) Start =====");
		
		FileVO file = fileDao.read(condition);
		
		log.debug("read(condition) Result = " + file);
		log.debug("===== FileServie read(condition) End =====");
		return file;
	}

	@Override
	public FileVO read(Integer key) throws SQLException {
		log.debug("===== FileServie read(condition) Start =====");
		
		Condition<String, Integer> condition = new Condition<String, Integer>();
		condition.put("fileNo", key);
		
		FileVO file = fileDao.read(condition);
		
		
		log.debug("read(condition) Result = " + file);
		log.debug("===== FileServie read(condition) End =====");
		return file;
	}
	
	@Override
	public void update(FileVO file) throws SQLException {
		log.debug("===== FileServie update(file) Start =====");
		
		fileDao.update(file);
		
		log.debug("===== FileServie update(file) End =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== FileServie delete(condition) Start =====");
		
		fileDao.delete(condition);
		
		log.debug("===== FileServie delete(condition) End =====");
	}

	@Override
	public void delete(Integer key) throws SQLException {
		log.debug("===== FileServie delete(key) Start =====");
		
		Condition<String, Integer> condition = new Condition<String, Integer>();
		condition.put("fileNo", key);
		
		fileDao.delete(condition);
		
		log.debug("===== FileServie delete(key) End =====");
		
	}
	

}
