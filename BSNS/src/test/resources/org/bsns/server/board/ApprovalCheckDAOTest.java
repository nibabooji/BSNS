package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.approval.check.ApprovalCheckDAO;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.ApprovalCheckVO;
import org.bsns.server.domain.ApprovalCheckVO;
import org.junit.Test;

public class ApprovalCheckDAOTest extends JunitSettting{
	
	@Resource(name="ApprovalCheckDAO")
	private ApprovalCheckDAO ApprovalCheckDao;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Test
	public void create() throws SQLException{
		ApprovalCheckVO approvalCheck = new ApprovalCheckVO();

		approvalCheck.setApprovalCheck(3);
		approvalCheck.setApprovalKey(740);
		approvalCheck.setEmail("test9");
		
		ApprovalCheckDao.create(approvalCheck);
	}

	@Test
	public void read() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("email", "test7");
		condition.put("approvalKey", 833);
		
		log.debug("ApprovalDAO read Test result : " + ApprovalCheckDao.read(condition));
	}

	
	@Test
	public void update() throws SQLException{
		ApprovalCheckVO approvalCheck = new ApprovalCheckVO();

		approvalCheck.setApprovalKey(833);
		approvalCheck.setApprovalCheck(1);
		approvalCheck.setEmail("test7");

		ApprovalCheckDao.update(approvalCheck);
	}
	@Test
	public void delete() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("approvalKey", 2);
		
		ApprovalCheckDao.delete(condition);
	}
	
//	@Test
//	public void list() throws SQLException{
//		Condition<String, Object> condition = new Condition<String, Object>();
//		
//		condition.put("approvalNo", 101);
//
//		log.debug("ApprovalDAO list Test result : " + ApprovalDao.list(condition));
//	}

}
