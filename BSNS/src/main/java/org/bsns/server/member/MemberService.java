package org.bsns.server.member;

import java.util.List;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.MemberVO;

public interface MemberService {

	public void create(MemberVO member) throws Exception;
	
	public MemberVO read(String key) throws Exception;
	
	public MemberVO read(Condition condition) throws Exception;
	
	public void update(MemberVO member) throws Exception;
	
	public void delete(String key) throws Exception;
	
	public void delete(Condition condition) throws Exception;
	
	public List<MemberVO> list(Condition condition) throws Exception;
	
	public List<MemberVO> getFriendList(String key) throws Exception;
	
	public void addFriend(String key, MemberVO friend) throws Exception;
	
	
}
