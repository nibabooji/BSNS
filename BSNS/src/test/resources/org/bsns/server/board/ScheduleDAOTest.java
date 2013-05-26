package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.schedule.ScheduleDAO;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.ScheduleVO;
import org.junit.Test;

public class ScheduleDAOTest 
extends JunitSettting
{

	@Resource(name="ScheduleDAO")
	private ScheduleDAO scheduleDAO;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Test
	public void create() throws SQLException{
		ScheduleVO vo = new ScheduleVO();
		
		vo.setBoardNum(655400);
		
		scheduleDAO.create(vo);
	}

	@Test
	public void read() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("scheduleKey", 472963);
		
		log.debug("ScheduleDAO read Test result : " + scheduleDAO.read(condition));
	}
	
	@Test
	public void update() throws SQLException{
		ScheduleVO vo = new ScheduleVO();
		
		vo.setScheduleKey(472963);
		
		scheduleDAO.update(vo);
	}
	@Test
	public void delete() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("scheduleKey", 472963);
		
		scheduleDAO.delete(condition);
	}
	
	@Test
	public void list() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("page", 1);
		
		log.debug("ScheduleDAO list Test result : " + scheduleDAO.list(condition));
	}
}
