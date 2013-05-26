package org.bsns.server.board;

import java.sql.SQLException;
import java.util.List;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.BoardVO;

public interface BoardDAO {
	
	public void create(BoardVO board) throws SQLException;
	
	public BoardVO read(Condition condition) throws SQLException;
	
	public void update(BoardVO board) throws SQLException;
	
	public void delete(Condition condition) throws SQLException;
	
	public List<BoardVO> list(Condition condition) throws SQLException;
	
}
