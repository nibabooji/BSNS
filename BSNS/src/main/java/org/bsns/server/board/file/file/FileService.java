package org.bsns.server.board.file.file;

import java.sql.SQLException;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.FileVO;

public interface FileService {

	public void create(FileVO file) throws SQLException;
	
	public FileVO read(Condition condition) throws SQLException;
	
	public FileVO read(Integer key) throws SQLException;
	
	public void update(FileVO file) throws SQLException;
	
	public void delete(Condition condition) throws SQLException;
	
	public void delete(Integer key) throws SQLException;
}
