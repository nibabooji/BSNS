package org.bsns.server.board.file;

import java.sql.SQLException;
import java.util.List;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.BoardFileVO;

public interface BoardFileDAO {

	public void create(BoardFileVO file) throws SQLException;
	
	public BoardFileVO read(Condition condition) throws SQLException;
	
	public void update(BoardFileVO file) throws SQLException;
	
	public void delete(Condition condition) throws SQLException;
	
	public List<BoardFileVO> list(Condition condition) throws SQLException;
}
