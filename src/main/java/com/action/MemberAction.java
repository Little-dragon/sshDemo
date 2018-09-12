package com.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.entity.Member;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author smalldragon
 *
 */
@Component
public class MemberAction extends ActionSupport{
		@Autowired
		private SessionFactory sessionFactory;
		private Member member;
		
		public Member getMember() {
			return member;
		}

		public void setMember(Member member) {
			this.member = member;
		}

		public String execute() {
			Session session = null;
			try {
				session = sessionFactory.openSession();
				Transaction tx = session.beginTransaction();
				session.save(member);
				tx.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
			return SUCCESS;
		}
		
}
