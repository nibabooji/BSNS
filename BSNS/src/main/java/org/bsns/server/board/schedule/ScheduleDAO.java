package org.bsns.server.board.schedule;
import java.sql.SQLException;
import java.util.List;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.ScheduleVO;


public interface ScheduleDAO {

	public void create(ScheduleVO schedule) throws SQLException;
	
	public ScheduleVO read(Condition condition) throws SQLException;
	
	public void update(ScheduleVO schedule) throws SQLException;
	
	public void delete(Condition condition) throws SQLException;
	
	public List<ScheduleVO> list(Condition condition) throws SQLException;
}
 