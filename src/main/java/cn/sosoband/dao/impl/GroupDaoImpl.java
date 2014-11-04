package cn.sosoband.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.sosoband.dao.GroupDao;
import cn.sosoband.model.Group;

@Repository("groupDao")
public class GroupDaoImpl implements GroupDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	@SuppressWarnings("unchecked")
	public List<Group> searchAllGroups() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Group");
		List<Group> list = query.list();
		
		return list;
	}

}
