package org.bsns.server.board.approval.check;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.ApprovalCheckVO;
import org.springframework.stereotype.Service;

@Service("ApprovalCheckService")
public class ApprovalCheckServiceImpl 
implements ApprovalCheckService{
	
	@Resource(name="ApprovalCheckDAO")
	private ApprovalCheckDAO approvalCheckDao;

	
	@Override
	public void create(ApprovalCheckVO approvalCheck) throws SQLException {
		approvalCheckDao.create(approvalCheck);
	}

	@Override
	public ApprovalCheckVO read(Condition condition) throws SQLException {
		ApprovalCheckVO approvalCheck =  approvalCheckDao.read(condition);
		return approvalCheck;
	}

	@Override
	public void update(ApprovalCheckVO approvalCheck) throws SQLException {
		approvalCheckDao.update(approvalCheck);
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		approvalCheckDao.delete(condition);
	}

}
