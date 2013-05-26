package org.bsns.server.board.schedule;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.common.SqlMapClientConfig;
import org.bsns.server.domain.ScheduleVO;
import org.springframework.stereotype.Repository;

@Repository("ScheduleDAO")
public class ScheduleDAOImpl 
extends SqlMapClientConfig
implements ScheduleDAO
{
	private static final String NAMESPACE = "Schedule.";
	
	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void create(ScheduleVO schedule) throws SQLException {
		log.debug("===== ScheduleDAOImpl Class Create start =====");
		getSqlMapClient().insert(NAMESPACE + "create", schedule); 
		log.debug("===== ScheduleDAOImpl Class Create end =====");
	}

	@Override
	public ScheduleVO read(Condition condition) throws SQLException {
		log.debug("===== ScheduleDAOImpl Class Read start =====");
		ScheduleVO schedule = (ScheduleVO)getSqlMapClient().queryForObject(NAMESPACE + "read", condition);
		log.debug("jobTime value : " + schedule);
		log.debug("===== ScheduleDAOImpl Class Read end =====");
		return schedule;
	}

	@Override
	public void update(ScheduleVO schedule) throws SQLException {
		log.debug("===== ScheduleDAOImpl Class Update start =====");
		getSqlMapClient().update(NAMESPACE + "update", schedule);
		log.debug("===== ScheduleDAOImpl Class Update end =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== ScheduleDAOImpl Class Delete start =====");
		getSqlMapClient().delete(NAMESPACE + "delete", condition);
		log.debug("===== ScheduleDAOImpl Class Delete end =====");
	}

	@Override
	public List<ScheduleVO> list(Condition condition) throws SQLException {
		log.debug("===== ScheduleDAOImpl Class List start =====");
		List<ScheduleVO> list = (List<ScheduleVO>)getSqlMapClient().queryForList(NAMESPACE + "list", condition);
		log.debug("list value : " + list);
		log.debug("===== ScheduleDAOImpl Class List end =====");
		return list;
	}

}
