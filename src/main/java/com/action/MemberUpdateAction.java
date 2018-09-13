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
public class MemberUpdateAction extends ActionSupport{
		@Resource
		private MemberService memberService;
		
		private Member member;
		private int id;
		
		public Member getMember() {
			return member;
		}
		public void setMember(Member member) {
			this.member = member;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String showMember() {
			Member updateMember = memberService.findById(getId());
			setMember(updateMember);
			return SUCCESS;
		}
		
		public String execute() {
			memberService.update(member);
			return SUCCESS;
		}
		
}
