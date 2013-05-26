package org.bsns.server.board.jobtime;

import java.sql.SQLException;
import java.util.List;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.JobTimeVO;

public interface JobTimeDAO {
	
	public void create(JobTimeVO jobTime) throws SQLException;
	
	public JobTimeVO read(Condition condition) throws SQLException;
	
	public void update(JobTimeVO jobTime) throws SQLException;
	
	public void delete(Condition condition) throws SQLException;
	
	public List<JobTimeVO> list(Condition condition) throws SQLException;
}
