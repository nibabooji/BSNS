package org.bsns.server.board.approval;

import java.sql.SQLException;
import java.util.List;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.ApprovalVO;

public interface ApprovalDAO {

	public void create(ApprovalVO approval) throws SQLException;
	
	public ApprovalVO read(Condition condition) throws SQLException;
	
	public void update(ApprovalVO approval) throws SQLException;
	
	public void delete(Condition condition) throws SQLException;
	
//	public List<ApprovalVO> list(Condition condition) throws SQLException;
}
