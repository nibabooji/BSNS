package org.bsns.server.member;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.common.JunitSettting;
import org.bsns.server.domain.MemberVO;
import org.junit.Test;

public class MemberServiceTest 
extends JunitSettting
{
	@Resource(name="MemberService")
	private MemberService service;

	private Logger log = Logger.getLogger(this.getClass());
	
	
	@Test
	public void create() throws Exception{
		MemberVO member = new MemberVO();
		
		member.setEmail("MemberServiceTest");
		member.setName("MemberServiceTest");
		member.setPassword("MemberServiceTest");
		member.setDept("MemberServiceTest");
		member.setPosition("MemberServiceTest");
		
		service.create(member);
	}
}
