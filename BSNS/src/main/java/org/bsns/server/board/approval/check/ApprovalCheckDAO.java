package org.bsns.server.board.approval.check;

import java.sql.SQLException;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.ApprovalCheckVO;

public interface ApprovalCheckDAO {
	public void create(ApprovalCheckVO approvalCheck) throws SQLException;
	
	public ApprovalCheckVO read(Condition condition) throws SQLException;
	
	public void update(ApprovalCheckVO approvalCheck) throws SQLException;
	
	public void delete(Condition condition) throws SQLException;
}
