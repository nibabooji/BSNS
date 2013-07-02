package org.bsns.server.board.approval.check;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.common.SqlMapClientConfig;
import org.bsns.server.domain.ApprovalCheckVO;
import org.springframework.stereotype.Repository;

@Repository("ApprovalCheckDAO")
public class ApprovalCheckDAOImpl 
extends SqlMapClientConfig
implements ApprovalCheckDAO{
	
	private static final String NAMESPACE = "ApprovalCheck.";
	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void create(ApprovalCheckVO approvalCheck) throws SQLException {
		log.debug("===== ApprovalCheckDAOImpl Class Create start =====");
		getSqlMapClient().insert(NAMESPACE + "create", approvalCheck); 
		log.debug("===== ApprovalCheckDAOImpl Class Create end =====");
	}

	@Override
	public ApprovalCheckVO read(Condition condition) throws SQLException {
		log.debug("===== ApprovalCheckDAOImpl Class Read start =====");
		ApprovalCheckVO approvalCheck = (ApprovalCheckVO)getSqlMapClient().queryForObject(NAMESPACE + "read", condition);
		log.debug("approvalCheck value : " + approvalCheck);
		log.debug("===== ApprovalCheckDAOImpl Class Read end =====");
		return approvalCheck;
	}

	@Override
	public void update(ApprovalCheckVO approvalCheck) throws SQLException {
		log.debug("===== ApprovalCheckDAOImpl Class Update start =====");
		getSqlMapClient().update(NAMESPACE + "update", approvalCheck);
		log.debug("===== ApprovalCheckDAOImpl Class Update end =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== ApprovalCheckDAOImpl Class Delete start =====");
		log.debug(condition);
		getSqlMapClient().delete(NAMESPACE + "delete", condition);
		log.debug("===== ApprovalCheckDAOImpl Class Delete end =====");
	}

}
