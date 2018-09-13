package com.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.entity.Member;

/**
 * @author smalldragon
 *
 */

@Component("memberDao")
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.openSession();
	}
	
	@Override
	public void add(Member member) {
		Session session = null;
		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.save(member);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

	@Override
	public void update(Member member) {
		Session session = null;
		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(member);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

	@Override
	public void delete(int id) {
		Session session = null;
		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			Member member = (Member) session.get(Member.class , id);
			session.delete(member);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

	@Override
	public Member findByName(String username, String password) {
		Session session = null;
		Member retMember = null;
		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			String hql = "from Member m where m.username = :username and m.password = :password";
			Query query = session.createQuery(hql);
			query.setParameter("username", username);
			query.setParameter("password", password);
			retMember = (Member) query.uniqueResult();
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return retMember;
	}

	@Override
	public Member findById(int id) {
		Session session=null;
        Member result = null;
        try {
			session = getSession();
            Transaction tx = session.beginTransaction();
            String hsql = " from Member m where m.id = :id";
            Query query = session.createQuery(hsql);
            query.setParameter("id",id);
            result = (Member)query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
        return result;

	}

	@Override
	public List<Member> findAll() {
		Session session = null;
		List<Member> lists = null;
		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			String hql = " from Member";
			Query query = session.createQuery(hql);
			lists = query.list();
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return lists;
	}
}
