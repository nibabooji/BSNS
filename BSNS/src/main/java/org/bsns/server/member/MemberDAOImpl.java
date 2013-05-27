package org.bsns.server.member;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
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
	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void create(MemberVO member) throws SQLException {
		log.debug("===== MemberDAOImpl Class Create start =====");
		getSqlMapClient().insert(NAMESPACE + "create", member);
		log.debug("===== MemberDAOImpl Class Create end =====");
	}

	@Override
	public MemberVO read(Condition condition) throws SQLException {
		log.debug("===== MemberDAOImpl Class Read start =====");
		MemberVO member = (MemberVO)getSqlMapClient().queryForObject(NAMESPACE + "read", condition);
		log.debug("member value : " + member);
		log.debug("===== MemberDAOImpl Class Read end =====");
		return member;
	}

	@Override
	public void update(MemberVO member) throws SQLException {
		log.debug("===== MemberDAOImpl Class Update start =====");
		getSqlMapClient().update(NAMESPACE + "update", member);
		log.debug("===== MemberDAOImpl Class Update end =====");
	}

	@Override
	public void delete(Condition condition) throws SQLException {
		log.debug("===== MemberDAOImpl Class Delete start =====");
		getSqlMapClient().delete(NAMESPACE + "delete", condition);
		log.debug("===== MemberDAOImpl Class Delete end =====");
	}

	@Override
	public List<MemberVO> list(Condition condition) throws SQLException {
		log.debug("===== MemberVO Class List start =====");
		List<MemberVO> list = (List<MemberVO>)getSqlMapClient().queryForList(NAMESPACE + "list", condition);
		log.debug("===== MemberVO Class List end =====");
		return list;
	}

	@Override
	public List<MemberVO> getFriendList(String key) throws SQLException {
		log.debug("===== MemberVO Class getFriendList start =====");
		List<MemberVO> list = (List<MemberVO>)getSqlMapClient().queryForList(NAMESPACE + "getFriendList", key);
		log.debug("===== MemberVO Class getFriendList end =====");
		return list;
	}

	@Override
	public void addFriend(Condition condition) throws SQLException {
		log.debug("===== MemberDAOImpl Class addFriend start =====");
		getSqlMapClient().insert(NAMESPACE + "addFriend", condition);
		log.debug("===== MemberDAOImpl Class addFriend end =====");
	}

}
