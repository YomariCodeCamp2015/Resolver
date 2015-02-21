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
				<th>ID</th>
				<th>Name</th>
				<th>Description</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${gradeList}" var="grade">
				<tr>
					<td>${grade.gradeId}</td>
					<td>${grade.gradeName}</td>
					<td>${grade.gradeDesc}</td>
					<td>
						<a href="edit.html?gradeId=${grade.gradeId}" class="btn btn-default btn-sm btn-icon icon-left">
							<i class="entypo-pencil"></i>Edit
						</a>
						<a href="delete.html?gradeId=${grade.gradeId}" class="btn btn-danger btn-sm btn-icon icon-left">
							<i class="entypo-cancel"></i>Delete
						</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</jsp:body>
</t:template>