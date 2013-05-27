package org.bsns.server.member;

import java.sql.SQLException;
import java.util.List;

import org.bsns.server.common.Condition;
import org.bsns.server.common.SqlMapClientConfig;
import org.bsns.server.domain.MemberVO;
import org.springframework.stereotype.Repository;

@Repository("MemberDAO")
public class MemberDAOImpl 
extends SqlMapClientConfig
implements MemberDAO
{
	private static final String NAMESPACE = "Member.";

	@Override
	public void create(MemberVO member) throws SQLException {
		
	}

	@Override
	public MemberVO read(Condition condition) throws SQLException {
		return null;
	}

	@Override
	public void update(MemberVO member) throws SQLException {
		
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		
	}

	@Override
	public List<MemberVO> list(Condition condition) throws SQLException {
		return null;
	}

	@Override
	public List<MemberVO> getFriendList(String Key) throws SQLException {
		return null;
	}

	@Override
	public void addFriend(String key, MemberVO friend) throws SQLException {
		
	}

}
