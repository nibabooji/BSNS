package org.bsns.server.member;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.MemberVO;
import org.junit.Test;

public class MemberDAOTest 
extends JunitSettting
{

	@Resource(name="MemberDAO")
	private MemberDAO memberDao;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Test
	public void create() throws SQLException{
		MemberVO member = new MemberVO();
		
		member.setEmail("test_dao");
		member.setName("test_name");
		member.setPassword("test");
		member.setPosition(String.valueOf(4));
		member.setDept(String.valueOf(1));
		
		memberDao.create(member);
	}

	@Test
	public void read() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("email", "test_dao");
		
		log.debug("BoardDAO read Test result : " + memberDao.read(condition));
	}
	
	@Test
	public void update() throws SQLException{
		MemberVO member = new MemberVO();
		
		member.setEmail("test_dao");
		member.setName("test_update");
		member.setPassword("test1");
		member.setPosition(String.valueOf(3));
		member.setDept(String.valueOf(2));
		
		memberDao.update(member);
	}
	@Test
	public void delete() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("email", "test_dao");
		
		memberDao.delete(condition);
	}
	
	@Test
	public void list() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("email", "test_dao");
		
		log.debug("MemberDAO list Test result : " + memberDao.list(condition));
	}
	
	@Test
	public void getFriendList() throws SQLException{
		memberDao.getFriendList("test_dao");
	}
	
	@Test
	public void addFriend() throws SQLException{
		Condition<String, Object> condition = new Condition<String, Object>();
		
		condition.put("email", "test_dao");
		condition.put("friendMail", "friendMail");
		
		memberDao.addFriend(condition);
	}

}
