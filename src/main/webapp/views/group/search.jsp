<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分组查询</title>
<script type="text/javascript">
function editGroup(id) {
	
}

function deleteGroup(id) {
	
}
</script>
</head>
<body>
	<form action="groupAction" method="post">
		<s:if test="list != null">
			<table cellpadding="1" cellspacing="1">
				<thead>
					<tr>
						<td>编号</td>
						<td>名称</td>
						<td>描述</td>
						<td>状态</td>
						<td>操作</td>
					</tr>
				</thead>
				<s:iterator value="list" var="st">
					<tr>
						<td><s:property value="#st.id" /></td>
						<td><s:property value="#st.groupName" /></td>
						<td><s:property value="#st.description" /></td>
						<td><s:property value="#st.status" /></td>
						<td>
							<a href="javascript:editGroup(${st.id })">编辑</a>
							<a href="javascript:deleteGroup(${st.id })">删除</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
	</form>
</body>
</html>
