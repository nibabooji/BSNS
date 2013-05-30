package org.bsns.server.board.file;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.common.SqlMapClientConfig;
import org.bsns.server.domain.BoardFileVO;
import org.springframework.stereotype.Repository;

@Repository("BoardFileDAO")
public class BoardFileDAOImpl 
extends SqlMapClientConfig 
implements BoardFileDAO{

	private static String NAMESPACE = "BoardFile."; 
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public void create(BoardFileVO file) throws SQLException {
		log.debug("===== BoardFileDAOImpl Class Create start =====");
		getSqlMapClient().insert(NAMESPACE + "create", file);
		log.debug("===== BoardFileDAOImpl Class Create end =====");
	}

	@Override
	public BoardFileVO read(Condition condition) throws SQLException {
		log.debug("===== BoardFileDAOImpl Class Read start =====");
		BoardFileVO file = (BoardFileVO)getSqlMapClient().queryForObject(NAMESPACE + "read", condition);
		log.debug("file value : " + file);
		log.debug("===== BoardFileDAOImpl Class Read end =====");
		return file;
	}

	@Override
	public void update(BoardFileVO file) throws SQLException {
		log.debug("===== BoardFileDAOImpl Class Update start =====");
		getSqlMapClient().update(NAMESPACE + "update", file);
		log.debug("===== BoardFileDAOImpl Class Update end =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== BoardFileDAOImpl Class Delete start =====");
		log.debug(condition);
		getSqlMapClient().delete(NAMESPACE + "delete", condition);
		log.debug("===== BoardFileDAOImpl Class Delete end =====");
	}

	@Override
	public List<BoardFileVO> list(Condition condition) throws SQLException {
		log.debug("===== BoardFileDAOImpl Class List start =====");
		List<BoardFileVO> list = (List<BoardFileVO>)getSqlMapClient().queryForList(NAMESPACE + "list", condition);
		log.debug("list value : " + list);
		log.debug("===== BoardFileDAOImpl Class List end =====");
		return null;
	}

}
