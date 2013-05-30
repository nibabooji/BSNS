package org.bsns.server.board.file.file;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.common.SqlMapClientConfig;
import org.bsns.server.domain.BoardFileVO;
import org.bsns.server.domain.FileVO;
import org.springframework.stereotype.Repository;

@Repository("fileDAO")
public class FileDAOImpl 
extends SqlMapClientConfig 
implements FileDAO{
	private static String NAMESPACE = "File."; 
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public void create(FileVO file) throws SQLException {
		log.debug("===== FileDAOImpl Class Create start =====");
		getSqlMapClient().insert(NAMESPACE + "create", file);
		log.debug("===== FileDAOImpl Class Create end =====");
	}

	@Override
	public FileVO read(Condition condition) throws SQLException {
		log.debug("===== FileDAOImpl Class Read start =====");
		FileVO file = (FileVO)getSqlMapClient().queryForObject(NAMESPACE + "read", condition);
		log.debug("file value : " + file);
		log.debug("===== FileDAOImpl Class Read end =====");
		return file;
	}

	@Override
	public void update(FileVO file) throws SQLException {
		log.debug("===== FileDAOImpl Class Update start =====");
		getSqlMapClient().update(NAMESPACE + "update", file);
		log.debug("===== FileDAOImpl Class Update end =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== FileDAOImpl Class Delete start =====");
		getSqlMapClient().delete(NAMESPACE + "delete", condition);
		log.debug("===== FileDAOImpl Class Delete end =====");
	}

}
