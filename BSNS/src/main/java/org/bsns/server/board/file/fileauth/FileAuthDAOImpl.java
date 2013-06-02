package org.bsns.server.board.file.fileauth;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.common.SqlMapClientConfig;
import org.bsns.server.domain.FileAuthVO;
import org.springframework.stereotype.Repository;

@Repository("FileAuthDAO")
public class FileAuthDAOImpl extends SqlMapClientConfig implements FileAuthDAO{

	private static String NAMESPACE = "FileAuth.";
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public void create(FileAuthVO fileAuth) throws SQLException {
		log.debug("===== FileAuthDAOImpl Class Create start =====");
		getSqlMapClient().insert(NAMESPACE + "create", fileAuth);
		log.debug("===== FileAuthDAOImpl Class Create end =====");
	}

	@Override
	public FileAuthVO read(Condition condition) throws SQLException {
		log.debug("===== FileAuthDAOImpl Class Read start =====");
		FileAuthVO fileAuth = (FileAuthVO)getSqlMapClient().queryForObject(NAMESPACE + "read", condition);
		log.debug("fileAuth value : " + fileAuth);
		log.debug("===== FileAuthDAOImpl Class Read end =====");
		return fileAuth;
	}

	@Override
	public void update(FileAuthVO fileAuth) throws SQLException {
		log.debug("===== FileAuthDAOImpl Class Update start =====");
		getSqlMapClient().update(NAMESPACE + "update", fileAuth);
		log.debug("===== FileAuthDAOImpl Class Update end =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== FileAuthDAOImpl Class Delete start =====");
		getSqlMapClient().delete(NAMESPACE + "delete", condition);
		log.debug("===== FileAuthDAOImpl Class Delete end =====");
	}

	@Override
	public List<FileAuthVO> list(Condition condition) throws SQLException {
		log.debug("===== FileAuthDAOImpl Class List start =====");
		List<FileAuthVO> list = (List<FileAuthVO>)getSqlMapClient().queryForList(NAMESPACE + "list", condition);
		log.debug("list value : " + list);
		log.debug("===== FileAuthDAOImpl Class List end =====");
		return list;
	}

}
