package com.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.service.MemberService;

/**
 * @author smalldragon
 *
 */
public class MemberDeleteAction extends ActionSupport{
			@Resource
			public MemberService memberService;
			
			private int id;
			
			public MemberService getMemberService() {
				return memberService;
			}

			public void setMemberService(MemberService memberService) {
				this.memberService = memberService;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String execute() {
				memberService.delete(getId());
				return SUCCESS;
			}
			
}
