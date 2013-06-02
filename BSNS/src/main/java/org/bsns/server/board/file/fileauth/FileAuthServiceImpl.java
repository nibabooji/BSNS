package org.bsns.server.board.file.fileauth;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.domain.FileAuthVO;
import org.springframework.stereotype.Service;

@Service(value="FileAuthService")
public class FileAuthServiceImpl 
implements FileAuthService{

	@Resource(name="FileAuthDAO")
	private FileAuthDAO fileAuthDao;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public void create(FileAuthVO fileAuth) throws SQLException {
		log.debug("===== FilaAuthService create() Start =====");
		
		fileAuthDao.create(fileAuth);
		
		log.debug("===== FilaAuthService create() End =====");
	}

	@Override
	public FileAuthVO read(Condition condition) throws SQLException {
		log.debug("===== FilaAuthService read(condition) Start =====");
		
		FileAuthVO fileAuth = fileAuthDao.read(condition);
		
		log.debug("read(condition) Result = " + fileAuth);
		return fileAuth;
	}

	@Override
	public FileAuthVO read(Integer key) throws SQLException {
		log.debug("===== FilaAuthService read(condition) Start =====");
		
		Condition<String, Integer> condition = new Condition<String, Integer>();
		condition.put("fileAuthKey", key);
		FileAuthVO fileAuth = fileAuthDao.read(condition);
		
		log.debug("read(condition) Result = " + fileAuth);
		return fileAuth;
	}

	@Override
	public void update(FileAuthVO fileAuth) throws SQLException {
		log.debug("===== FilaAuthService update(fileAuth) Start =====");

		fileAuthDao.update(fileAuth);
		
		log.debug("===== FilaAuthService update(fileAuth) End =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== FilaAuthService delete(condition) Start =====");
		
		fileAuthDao.delete(condition);
		
		log.debug("===== FilaAuthService delete(condition) End =====");
	}

	@Override
	public void delete(Integer key) throws SQLException {
		log.debug("===== FilaAuthService delete(condition) Start =====");
		Condition<String, Integer> condition = new Condition<String, Integer>();
		condition.put("fileAuthKey", key);
		fileAuthDao.delete(condition);
		
		log.debug("===== FilaAuthService delete(condition) End =====");		
	}

	@Override
	public List<FileAuthVO> list(Condition condition) throws SQLException {
		log.debug("===== FilaAuthService list(condition) Start =====");
		
		List<FileAuthVO> fileAuthList = fileAuthDao.list(condition);
		
		log.debug("list(condtion) Result = " + fileAuthList);
		return fileAuthList;
	}

}
