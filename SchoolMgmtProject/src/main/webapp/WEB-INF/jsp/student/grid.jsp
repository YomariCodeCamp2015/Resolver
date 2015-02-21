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
				<th>Grade</th>
				<th>Section</th>
				<th>Roll No.</th>
				<th>Student Name</th>
				<th>Parents Name</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${studentList}" var="student">
				<tr>
			        <td>${student.section.grade.gradeName}</td>
			        <td>${student.section.sectionName}</td>
			        <td>${student.studentRollNo}</td>
			        <td>${student.studentName}</td>
			        <td>${student.parents.parentsName}</td>
					<td>
						<a href="edit.html?studentId=${student.studentId}" class="btn btn-default btn-sm btn-icon icon-left">
							<i class="entypo-pencil"></i>Edit
						</a>
						<a href="delete.html?studentId=${student.studentId}
						&parentsId=${student.parents.parentsId}
						&userId=${student.userForStudent.userId}
						" class="btn btn-danger btn-sm btn-icon icon-left">
							<i class="entypo-cancel"></i>Delete
						</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</jsp:body>
</t:template>