package com.action;

import java.util.List;
import javax.annotation.Resource;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import com.entity.Member;
import com.opensymphony.xwork2.ActionSupport;
import com.service.MemberService;

/**
 * @author smalldragon
 *
 */
@Component
public class MemberQueryAction extends ActionSupport{
		@Resource
		public MemberService memberService;
		
		public String execute() {
			List<Member> members = memberService.findAll();
			ServletActionContext.getRequest().setAttribute("members", members);
			return SUCCESS;
		}
		
}
