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
				<th>Staff Name</th>
				<th>Staff Type</th>
				<th>Mobile No.</th>
				<th>Email</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${staffList}" var="staff">
				<tr>
			        <td>${staff.staffName}</td>
			        <td>${staff.staffType}</td>
			        <td>${staff.staffMobileNo}</td>
			        <td>${staff.staffEmail}</td>
					<td>
						<a href="edit.html?staffId=${staff.staffId}" class="btn btn-default btn-sm btn-icon icon-left">
							<i class="entypo-pencil"></i>Edit
						</a>
						<a href="delete.html?staffId=${staff.staffId}
							&userId=${staff.userForStaff.userId}
							&staffEduId=${staff.staffEducation.staffEduId}
							&staffWorkExpId=${staff.staffWorkExp.staffWorkExpId}" 
								class="btn btn-danger btn-sm btn-icon icon-left">
							<i class="entypo-cancel"></i>Delete
						</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</jsp:body>
</t:template>