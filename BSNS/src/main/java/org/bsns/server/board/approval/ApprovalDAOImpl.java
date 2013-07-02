package org.bsns.server.board.approval;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.common.SqlMapClientConfig;
import org.bsns.server.domain.ApprovalVO;
import org.springframework.stereotype.Repository;

@Repository("ApprovalDAO")
public class ApprovalDAOImpl 
extends SqlMapClientConfig
implements ApprovalDAO{

	private static final String NAMESPACE = "Approval.";
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public void create(ApprovalVO approval) throws SQLException {
		log.debug("===== ApprovalDAOImpl Class Create start =====");
		getSqlMapClient().insert(NAMESPACE + "create", approval);
		log.debug("===== ApprovalDAOImpl Class Create end =====");
	}

	@Override
	public ApprovalVO read(Condition condition) throws SQLException {
		log.debug("===== ApprovalDAOImpl Class Read start =====");
		ApprovalVO approval = (ApprovalVO)getSqlMapClient().queryForObject(NAMESPACE + "read", condition);
		log.debug("approval value : " + approval);
		log.debug("===== ApprovalDAOImpl Class Read end =====");
		return approval;
	}

	@Override
	public void update(ApprovalVO approval) throws SQLException {
		log.debug("===== ApprovalDAOImpl Class Update start =====");
		getSqlMapClient().update(NAMESPACE + "update", approval);
		log.debug("===== ApprovalDAOImpl Class Update end =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== ApprovalDAOImpl Class Delete start =====");
		log.debug(condition);
		getSqlMapClient().delete(NAMESPACE + "delete", condition);
		log.debug("===== ApprovalDAOImpl Class Delete end =====");
	}

//	@Override
//	public List<ApprovalVO> list(Condition condition) throws SQLException {
//		log.debug("===== ApprovalDAOImpl Class List start =====");
//		List<ApprovalVO> list = (List<ApprovalVO>)getSqlMapClient().queryForList(NAMESPACE + "list", condition);
//		log.debug("list value : " + list);
//		log.debug("===== ApprovalDAOImpl Class List end =====");
//		return list;
//	}

}
