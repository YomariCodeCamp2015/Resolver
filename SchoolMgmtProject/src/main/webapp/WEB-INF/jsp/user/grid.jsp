<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/table"%>

<t:template>
<jsp:body >

	<div class="row">
		<div class="col-sm-6">
			<h2 class="table_heading"></h2>
		</div>

		<div class="col-sm-6">
			<div class="text-right">
				<a href="add.html" class="btn btn-success btn-icon icon-left">
					<i class="entypo-plus"></i>Add
				</a>
			</div>
		</div>
	</div>

	<table class="table table-bordered table-hover datatable" id="table-1">
		<thead>
			<tr>
				<th>User Name</th>
				<th>User Password</th>
				<th>Role Name</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.userName}</td>
					<td>${user.userPass}</td>
					<td>${user.role.roleName}</td>
					<td>
						<a href="edit.html?userId=${user.userId}" class="btn btn-default btn-sm btn-icon icon-left">
							<i class="entypo-pencil"></i>Edit
						</a>
						<a href="delete.html?userId=${user.userId}" class="btn btn-danger btn-sm btn-icon icon-left">
							<i class="entypo-cancel"></i>Delete
						</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</jsp:body>
</t:template>