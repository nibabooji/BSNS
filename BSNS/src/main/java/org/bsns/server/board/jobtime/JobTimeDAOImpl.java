package org.bsns.server.board.jobtime;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.common.SqlMapClientConfig;
import org.bsns.server.domain.JobTimeVO;
import org.springframework.stereotype.Repository;

@Repository("JobTimeDAO")
public class JobTimeDAOImpl 
extends SqlMapClientConfig
implements JobTimeDAO
{

	private static String NAMESPACE = "JobTime.";
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public void create(JobTimeVO jobTime) throws SQLException {
		log.debug("===== JobTimeDAOImpl Class Create start =====");
		getSqlMapClient().insert(NAMESPACE + "create", jobTime);
		log.debug("===== JobTimeDAOImpl Class Create end =====");
	}

	@Override
	public JobTimeVO read(Condition condition) throws SQLException {
		log.debug("===== JobTimeDAOImpl Class Read start =====");
		JobTimeVO jobTime = (JobTimeVO)getSqlMapClient().queryForObject(NAMESPACE + "read", condition);
		log.debug("jobTime value : " + jobTime);
		log.debug("===== JobTimeDAOImpl Class Read end =====");
		return jobTime;
	}

	@Override
	public void update(JobTimeVO jobTime) throws SQLException {
		log.debug("===== JobTimeDAOImpl Class Update start =====");
		getSqlMapClient().update(NAMESPACE + "update", jobTime);
		log.debug("===== JobTimeDAOImpl Class Update end =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== JobTimeDAOImpl Class Delete start =====");
		getSqlMapClient().delete(NAMESPACE + "delete", condition);
		log.debug("===== JobTimeDAOImpl Class Delete end =====");
	}

	@Override
	public List<JobTimeVO> list(Condition condition) throws SQLException {
		log.debug("===== JobTimeDAOImpl Class List start =====");
		List<JobTimeVO> list = (List<JobTimeVO>)getSqlMapClient().queryForList(NAMESPACE + "list", condition);
		log.debug("list value : " + list);
		log.debug("===== JobTimeDAOImpl Class List end =====");
		return list;
	}

}
