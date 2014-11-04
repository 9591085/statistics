package cn.sosoband.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sosoband.dao.GroupDao;
import cn.sosoband.model.Group;
import cn.sosoband.service.GroupService;

@Service("groupService")
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupDao groupDao;
	
	
	public List<Group> searchAllGroups() {
		return groupDao.searchAllGroups();
	}
}
