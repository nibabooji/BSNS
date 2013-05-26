package org.bsns.server.board;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.board.jobtime.JobTimeDAO;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.JobTimeVO;
import org.junit.Test;


public class JobTimeDAOTest 
extends JunitSettting
{

	@Resource(name="JobTimeDAO")
	private JobTimeDAO jobTimeDao;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Test
	public void create() throws SQLException{
		JobTimeVO vo = new JobTimeVO();
		
		vo.setJobTimeType(1);
		vo.setBoardNum(655400);
		
		jobTimeDao.create(vo);
	}

	@Test
	public void read() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("jobTimeKey", 63104);
		
		log.debug("jobTimeDao read Test result : " + jobTimeDao.read(condition));
	}
	
	@Test
	public void update() throws SQLException{
		JobTimeVO vo = new JobTimeVO();
		
		vo.setJobTimeType(1);
		vo.setJobTimeKey(63104);
		
		jobTimeDao.update(vo);
	}
	@Test
	public void delete() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("jobTimeKey", 63104);
		
		jobTimeDao.delete(condition);
	}
	
	@Test
	public void list() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("page", 1);
		
		log.debug("jobTimeDao list Test result : " + jobTimeDao.list(condition));
	}
}
