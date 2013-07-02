package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.approval.check.ApprovalCheckService;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.ApprovalCheckVO;
import org.junit.Test;

public class ApprovalCheckServiceTest extends JunitSettting{

	@Resource(name = "ApprovalCheckService")
	private ApprovalCheckService approvalCheckService;
	
	private Logger log = Logger.getLogger(this.getClass());

	@Test
	public void create() throws SQLException{
		ApprovalCheckVO approvalCheck = new ApprovalCheckVO();

		approvalCheck.setApprovalCheck(2);
		approvalCheck.setApprovalKey(2);
		approvalCheck.setEmail("test7");
		
		approvalCheckService.create(approvalCheck);
	}

	@Test
	public void read() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("approvalKey", 2);
		condition.put("email", "test7");
		
		log.debug("ApprovalCheckService read Test result : " + approvalCheckService.read(condition));
	}
	
	@Test
	public void update() throws SQLException{
		ApprovalCheckVO approvalCheck = new ApprovalCheckVO();

		approvalCheck.setApprovalCheck(1);
		approvalCheck.setApprovalKey(2);
		approvalCheck.setEmail("test7");
		

		approvalCheckService.update(approvalCheck);
	}
	@Test
	public void delete() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("approvalKey", 2);
		
		approvalCheckService.delete(condition);
	}
	
}
