package com.dao;

import java.util.List;

import com.entity.Member;

/**
 * @author smalldragon
 *
 */
public interface MemberDao {
	public void add(Member member);
    public void update(Member member);
    public void delete(int id);
    public Member findByName(String username,String password);
    public Member findById(int id);
    public List<Member> findAll();
}
