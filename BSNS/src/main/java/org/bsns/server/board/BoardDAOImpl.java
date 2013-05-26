package org.bsns.server.board;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.common.SqlMapClientConfig;
import org.bsns.server.domain.BoardVO;
import org.springframework.stereotype.Repository;

@Repository("BoardDAO")
public class BoardDAOImpl 
extends SqlMapClientConfig
implements BoardDAO
{
	private static String NAMESPACE = "Board.";
	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void create(BoardVO board) throws SQLException {	
		log.debug("===== BoardDAOImpl Class Create start =====");
		getSqlMapClient().insert(NAMESPACE + "create", board);
		log.debug("===== BoardDAOImpl Class Create end =====");
	}

	@Override
	public BoardVO read(Condition condition) throws SQLException {
		log.debug("===== BoardDAOImpl Class Read start =====");
		BoardVO board = (BoardVO)getSqlMapClient().queryForObject(NAMESPACE + "read", condition);
		log.debug("board value : " + board);
		log.debug("===== BoardDAOImpl Class Read end =====");
		return board;
	}

	@Override
	public void update(BoardVO board) throws SQLException {
		log.debug("===== BoardDAOImpl Class Update start =====");
		getSqlMapClient().update(NAMESPACE + "update", board);
		log.debug("===== BoardDAOImpl Class Update end =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== BoardDAOImpl Class Delete start =====");
		getSqlMapClient().delete(NAMESPACE + "delete", condition);
		log.debug("===== BoardDAOImpl Class Delete end =====");
	}

	@Override
	public List<BoardVO> list(Condition condition) throws SQLException {
		log.debug("===== BoardDAOImpl Class List start =====");
		List<BoardVO> list = (List<BoardVO>)getSqlMapClient().queryForList(NAMESPACE + "list", condition);
		log.debug("===== BoardDAOImpl Class List end =====");
		return list;
	}

}
