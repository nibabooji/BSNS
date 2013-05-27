package org.bsns.server.member;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bsns.server.common.Condition;
import org.bsns.server.domain.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl 
implements MemberService
{
	@Resource(name="MemberDAO")
	private MemberDAO memberDao;
	
	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void create(MemberVO member) throws Exception {
		log.debug("===== MemberService Class Create start =====");
		memberDao.create(member);
		log.debug("===== MemberService Class Create end =====");
	}

	@Override
	public MemberVO read(String key) throws Exception {
		log.debug("===== MemberService Class Read(String) start =====");
		Condition<String, Object> condition = new Condition<String, Object>();

		condition.put("email", key);

		MemberVO member = memberDao.read(condition);
		
		log.debug("Read(String) Result : " + member);
		
		return member;
	}

	@Override
	public MemberVO read(Condition condition) throws Exception {
		log.debug("===== MemberService Class Read(condition) start =====");
		
		MemberVO member = memberDao.read(condition);
		
		log.debug("Read(condition) Result : " + member);
		
		return member;
	}

	@Override
	public void update(MemberVO member) throws Exception {
		log.debug("===== MemberService Class Update start =====");
		memberDao.update(member);
		log.debug("===== MemberService Class Update end =====");
	}

	@Override
	public void delete(String key) throws Exception {
		log.debug("===== MemberService Class Delete(String) start =====");
		Condition<String, Object> condition = new Condition<String, Object>();

		condition.put("email", key);

		memberDao.delete(condition);
		log.debug("===== MemberService Class Delete(String) end =====");
	}

	@Override
	public void delete(Condition condition) throws Exception {
		log.debug("===== MemberService Class Delete(Condition) start =====");
		memberDao.delete(condition);
		log.debug("===== MemberService Class Delete(Condition) end =====");
		
	}

	@Override
	public List<MemberVO> list(Condition condition) throws Exception {
		log.debug("===== MemberService Class List start =====");
		List<MemberVO> memberList = memberDao.list(condition);
		
		log.debug("list(condition) Result : " + memberList);
		return memberList;
	}

	@Override
	public List<MemberVO> getFriendList(String key) throws Exception {
		log.debug("===== MemberService Class getFriendList start =====");
		List<MemberVO> FriendList = memberDao.getFriendList(key);
		
		log.debug("list(condition) Result : " + FriendList);
		return FriendList;
	}

	@Override
	public void addFriend(String key, MemberVO friend) throws Exception {
		log.debug("===== MemberService Class addFriend start =====");
		Condition<String, Object> condition = new Condition<String, Object>();

		condition.put("mail", key);
		condition.put("friendMail", friend.getEmail());

		memberDao.addFriend(condition);
		log.debug("===== MemberService Class addFriend end =====");
	}

}
