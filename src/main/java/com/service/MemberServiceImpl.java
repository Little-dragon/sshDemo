package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.MemberDao;
import com.entity.Member;

/**
 * @author smalldragon
 *
 */
@Component("memberService")
public class MemberServiceImpl implements MemberService{
	@Resource
	private MemberDao memberDao;
	
	@Override
	public void add(Member member) {
		 if(memberDao.findById(member.getId())==null)
	            memberDao.add(member);
	}

	@Override
	public void update(Member member) {
		if(memberDao.findById(member.getId()) != null)
			memberDao.update(member);
	}

	@Override
	public void delete(int id) {
		if(memberDao.findById(id) != null)
			memberDao.delete(id);
	}

	@Override
	public Member findByName(String username, String password) {
		return memberDao.findByName(username, password);
	}

	@Override
	public Member findById(int id) {
		return memberDao.findById(id);
	}

	@Override
	public List<Member> findAll() {
		return memberDao.findAll();
	}

}
