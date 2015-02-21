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
				<th>Role Name</th>
				<th>Role Description</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${roleList}" var="role">
				<tr>
					<td>${role.roleName}</td>
					<td>${role.roleDesc}</td>
					<td>
						<a href="edit.html?roleId=${role.roleId}" class="btn btn-default btn-sm btn-icon icon-left">
							<i class="entypo-pencil"></i>Edit
						</a>
						<a href="delete.html?roleId=${role.roleId}" class="btn btn-danger btn-sm btn-icon icon-left">
							<i class="entypo-cancel"></i>Delete
						</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</jsp:body>
</t:template>