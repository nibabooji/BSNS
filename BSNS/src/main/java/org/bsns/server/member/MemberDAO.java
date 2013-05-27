package org.bsns.server.member;

import java.sql.SQLException;
import java.util.List;

import org.bsns.server.common.Condition;
import org.bsns.server.domain.MemberVO;

public interface MemberDAO {

	public void create(MemberVO member) throws SQLException;
	
	public MemberVO read(Condition condition) throws SQLException;
	
	public void update(MemberVO member) throws SQLException;
	
	public void delete(Condition condition) throws SQLException;
	
	public List<MemberVO> list(Condition condition) throws SQLException;
	
	public List<MemberVO> getFriendList(String Key) throws SQLException;
	
	public void addFriend(String key, MemberVO friend) throws SQLException;
}
