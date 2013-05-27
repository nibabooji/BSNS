package org.bsns.server.member;

import java.util.List;

import javax.annotation.Resource;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl 
implements MemberService
{
	@Resource(name="MemberDAO")
	private MemberDAO memberDao;

	@Override
	public void create(MemberVO member) throws Exception {
		
	}

	@Override
	public MemberVO read(String key) throws Exception {
		return null;
	}

	@Override
	public MemberVO read(Condition condition) throws Exception {
		return null;
	}

	@Override
	public void update(MemberVO member) throws Exception {
		
	}

	@Override
	public void delete(String key) throws Exception {
		
	}

	@Override
	public void delete(Condition condition) throws Exception {
		
	}

	@Override
	public List<MemberVO> list(Condition condition) throws Exception {
		return null;
	}

	@Override
	public List<MemberVO> getFriendList(String key) throws Exception {
		return null;
	}

	@Override
	public void addFriend(String key, MemberVO friend) throws Exception {
		
	}

}
