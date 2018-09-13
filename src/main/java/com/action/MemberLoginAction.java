package com.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.entity.Member;
import com.opensymphony.xwork2.ActionSupport;
import com.service.MemberService;

/**
 * @author smalldragon
 *
 */
@Component
public class MemberLoginAction extends ActionSupport{
		@Resource
		public MemberService memberService;
		
		private Member member;
		
		public Member getMember() {
			return member;
		}

		public void setMember(Member member) {
			this.member = member;
		}

		public String execute() {
			if(memberService.findByName(member.getUsername(), member.getPassword()) != null) 
				return SUCCESS;
			else
				return ERROR;
		}
		
}
