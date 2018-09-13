package com.action;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.entity.Member;
import com.opensymphony.xwork2.ActionSupport;
import com.service.MemberService;

/**
 * @author smalldragon
 *
 */
@Component
public class MemberRegisterAction extends ActionSupport{
		@Resource
		private MemberService memberService;
		
		private Member member;
		
		public Member getMember() {
			return member;
		}

		public void setMember(Member member) {
			this.member = member;
		}

		public String execute() {
			memberService.add(member);
			return SUCCESS;
		}
		
}
