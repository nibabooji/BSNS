package org.bsns.server.board.approval;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.domain.ApprovalVO;
import org.springframework.stereotype.Service;

@Service("ApprovalService")
public class ApprovalServiceImpl 
implements ApprovalService{
	@Resource(name="ApprovalDAO")
	private ApprovalDAO approvalDao;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public void create(ApprovalVO approval) throws SQLException {
		log.debug("===== ApprovalService create() Start =====");
		approvalDao.create(approval);
		log.debug("===== ApprovalService create() End =====");
	}

	@Override
	public ApprovalVO read(Condition condition) throws SQLException {
		log.debug("===== ApprovalService read(condition) Start =====");
		ApprovalVO approval = approvalDao.read(condition);
		log.debug("read(condition) Result = " + approval);
		return approval;
	}

	@Override
	public void update(ApprovalVO approval) throws SQLException {
		log.debug("===== ApprovalService update(fileAuth) Start =====");
		approvalDao.update(approval);
		log.debug("===== ApprovalService update(fileAuth) End =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== FilaAuthService delete(condition) Start =====");
		approvalDao.delete(condition);
		log.debug("===== FilaAuthService delete(condition) End =====");
	}

//	@Override
//	public List<ApprovalVO> list(Condition condition) throws SQLException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
