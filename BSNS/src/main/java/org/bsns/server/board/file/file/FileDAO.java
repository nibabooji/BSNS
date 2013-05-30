package org.bsns.server.board.file.file;

import java.sql.SQLException;
import java.util.List;
import org.bsns.server.common.Condition;
import org.bsns.server.domain.FileVO;

public interface FileDAO {
	public void create(FileVO file) throws SQLException;
	
	public FileVO read(Condition condition) throws SQLException;
	
	public void update(FileVO file) throws SQLException;
	
	public void delete(Condition condition) throws SQLException;
}
