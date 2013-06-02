package org.bsns.server.board;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.domain.BoardVO;
import org.springframework.stereotype.Service;

@Service("BoardService")
public class BoardServiceImpl 
implements BoardService
{
	@Resource(name="BoardDAO")
	private BoardDAO boardDao;
	
	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void create(BoardVO board) throws Exception {
		log.debug("===== BoardServie Class Create start =====");
		boardDao.create(board);
		log.debug("===== BoardServie Class Create end =====");
	}

	@Override
	public BoardVO read(Integer key) throws Exception {
		log.debug("===== BoardServie Class read(Integer) start =====");
		Condition<String, Integer> condition = new Condition<String, Integer>();
		
		condition.put("number", key);
		
		BoardVO board = boardDao.read(condition);
		
		log.debug("Read(Integer) Result : " + board);
		
		return board;
	}

	@Override
	public BoardVO read(Condition condition) throws Exception {
		log.debug("===== BoardServie Class Read(condition) start =====");
		
		BoardVO board = boardDao.read(condition);
		
		log.debug("Read(condition) Result : " + board);
		return board;
	}

	@Override
	public void update(BoardVO board) throws Exception {
		log.debug("===== BoardServie Class Update start =====");
		boardDao.update(board);
		log.debug("===== BoardServie Class Update end =====");
	}

	@Override
	public void delete(Integer key) throws Exception {
		log.debug("===== BoardServie Class Delete(Integer) start =====");
		Condition<String, Integer> condition = new Condition<String, Integer>();
		
		condition.put("number", key);
		
		boardDao.delete(condition);
		log.debug("===== BoardServie Class Delete(Integer) end =====");
	}

	@Override
	public void delete(Condition condition) throws Exception {
		log.debug("===== BoardServie Class Delete(condition) start =====");
		boardDao.delete(condition);
		log.debug("===== BoardServie Class Delete(condition) end =====");
	}

	@Override
	public List<BoardVO> list(Condition condition) throws Exception {
		log.debug("===== BoardServie Class List start =====");
		
		List<BoardVO> boardList = boardDao.list(condition);
		
		log.debug("list(condition) Result : " + boardList);
		
		return boardList;
	}

}
