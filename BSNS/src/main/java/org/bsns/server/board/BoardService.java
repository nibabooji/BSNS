package org.bsns.server.board;

import java.util.List;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.BoardVO;

public interface BoardService {

	public void create(BoardVO board) throws Exception;
	
	public BoardVO read(Integer key) throws Exception;
	
	public BoardVO read(Condition condition) throws Exception;
	
	public void update(BoardVO board) throws Exception;
	
	public void delete(Integer key) throws Exception;
	
	public void delete(Condition condition) throws Exception;
	
	public List<BoardVO> list(Condition condition) throws Exception;
	
	
}
