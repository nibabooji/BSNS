package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.approval.ApprovalService;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.ApprovalVO;
import org.junit.Test;

public class ApprovalServiceTest 
extends JunitSettting{

	@Resource(name = "ApprovalService")
	private ApprovalService approvalService;
	
	private Logger log = Logger.getLogger(this.getClass());

	@Test
	public void create() throws SQLException{
		ApprovalVO approval = new ApprovalVO();

		approval.setBoardNum(110);
		
		approvalService.create(approval);
	}

	@Test
	public void read() throws SQLException{
		//read(condition) test
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("approvalKey", 110);
		
		log.debug("ApprovalService read Test result : " + approvalService.read(condition));
	}
	
	@Test
	public void update() throws SQLException{
		ApprovalVO approval = new ApprovalVO();

		approval.setBoardNum(98);
		approval.setApprovalKey(110);

		approvalService.update(approval);
	}
	@Test
	public void delete() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("approvalKey", 102);
		
		approvalService.delete(condition);
	}
	
//	@Test
//	public void list() throws SQLException{
//		Condition<String, Object> condition = new Condition<String, Object>();
//		
//		condition.put("boardNum", 318242);
//
//		log.debug("ApprovalService list Test result : " + approvalService.list(condition));
//	}
}
