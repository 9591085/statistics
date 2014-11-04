package cn.sosoband.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.sosoband.model.Group;
import cn.sosoband.service.GroupService;

@Controller("groupAction")
public class GroupAction {
	
	private Logger logger = Logger.getLogger(GroupAction.class);

	@Autowired
	private GroupService groupService;
	private List<Group> list;
	private Group group;
	
	
	public String getGroups() {
		list = groupService.searchAllGroups();
		
		logger.info("=============================>" + (list == null));
		if (list != null) {
			logger.info("=============================>" + list.size());
		}

		return "success";
	}
	
	
	public List<Group> getList() {
		return list;
	}
	public void setList(List<Group> list) {
		this.list = list;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
}
