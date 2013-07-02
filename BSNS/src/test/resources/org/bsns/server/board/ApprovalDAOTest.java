package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.approval.ApprovalDAO;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.ApprovalVO;
import org.bsns.server.domain.BoardFileVO;
import org.junit.Test;

public class ApprovalDAOTest
extends JunitSettting{
	
	@Resource(name="ApprovalDAO")
	private ApprovalDAO ApprovalDao;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Test
	public void create() throws SQLException{
		ApprovalVO approval = new ApprovalVO();

		approval.setBoardNum(110);
		
		ApprovalDao.create(approval);
	}

	@Test
	public void read() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("approvalKey", 110);
		
		log.debug("ApprovalDAO read Test result : " + ApprovalDao.read(condition));
	}

	
	@Test
	public void update() throws SQLException{
		ApprovalVO approval = new ApprovalVO();

		approval.setApprovalKey(110);
		approval.setBoardNum(99);

		ApprovalDao.update(approval);
	}
	@Test
	public void delete() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("approvalKey", 100);
		
		ApprovalDao.delete(condition);
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
