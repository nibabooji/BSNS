package org.bsns.server.board.file;

import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.domain.BoardFileVO;
import org.bsns.server.domain.BoardVO;
import org.springframework.stereotype.Service;

@Service("BoardFileService")
public class BoardFileServiceImpl 
implements BoardFileService{

	@Resource(name="BoardFileDAO")
	private BoardFileDAO boardFileDao;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	
	@Override
	public void create(BoardFileVO boardFile) throws SQLException {
		log.debug("====== BoardFileService create(file) Start ======");
		boardFileDao.create(boardFile);
		log.debug("====== BoardFileService create() End ======");
	}

	@Override
	public BoardFileVO read(Condition condition) throws SQLException {
		log.debug("====== BoardFileService read(condition) Start ======");
		BoardFileVO boardFile = boardFileDao.read(condition);
		log.debug("read(condition) Result : " + boardFile);
		return boardFile;
	}
	
	@Override
	public BoardFileVO read(Integer key) throws SQLException {
		log.debug("====== BoardFileService read(key) Start ======");
		
		Condition<String, Integer> condition = new Condition<String, Integer>();
		condition.put("boardFileNo", key);
		BoardFileVO boardFile = boardFileDao.read(condition);
		
		log.debug("read(condition) Result : " + boardFile);
		log.debug("====== BoardFileService read(key) End ======");
		return boardFile;
	}

	@Override
	public void update(BoardFileVO boardFile) throws SQLException {
		log.debug("====== BoardFileService update(file) Start ======");
		boardFileDao.update(boardFile);
		log.debug("====== BoardFileService update(file) End ======");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("====== BoardFileService delete(condition) Start ======");
		boardFileDao.delete(condition);
		log.debug("====== BoardFileService delete(condition) End ======");
	}

	@Override
	public void delete(Integer key) throws SQLException {
		log.debug("====== BoardFileService delete(key) Start ======");
		
		Condition<String, Integer> condition = new Condition<String, Integer>();
		condition.put("boardFileNo", key);
		boardFileDao.delete(condition);
		
		log.debug("====== BoardFileService delete(key) End ======");
		
	}
	@Override
	public List<BoardFileVO> list(Condition condition) throws SQLException {
		log.debug("====== BoardFileService list(condition) Start ======");
		List<BoardFileVO> boardFileList = boardFileDao.list(condition);
		log.debug("list(condition) Result : " + boardFileList);
		return boardFileList;
	}



}
