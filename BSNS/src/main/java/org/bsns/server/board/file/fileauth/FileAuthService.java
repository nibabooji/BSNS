package org.bsns.server.board.file.fileauth;

import java.sql.SQLException;
import java.util.List;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.FileAuthVO;

public interface FileAuthService {
	public void create(FileAuthVO fileAuth) throws SQLException;
	
	public FileAuthVO read(Condition condition) throws SQLException;
	
	public FileAuthVO read(Integer key) throws SQLException;
	
	public void update(FileAuthVO fileAuth) throws SQLException;
	
	public void delete(Condition condition) throws SQLException;
	
	public void delete(Integer key) throws SQLException;
	
	public List<FileAuthVO> list(Condition condition) throws SQLException;
}
