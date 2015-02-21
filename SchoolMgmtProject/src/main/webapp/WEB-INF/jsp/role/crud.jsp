<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/form"%>

<t:template>
<jsp:body>

<div class="row">
    <div class="col-md-12">
        <div class="panel panel-primary" data-collapsed="0">
            <div class="panel-heading">
                <div class="panel-title"></div>
                <div class="panel-options">
                    <a href="#sample-modal" data-toggle="modal" 
                    	data-target="#sample-modal-dialog-1" class="bg">
                        <i class="entypo-cog"></i>
                    </a>
                    <a href="#" data-rel="collapse">
                        <i class="entypo-down-open"></i>
                    </a>
                    <a href="#" data-rel="reload">
                        <i class="entypo-arrows-ccw"></i>
                    </a>
                    <a href="#" data-rel="close">
                        <i class="entypo-cancel"></i>
                    </a>
                </div>
            </div>

            <div class="panel-body">

				<form:form id="form" method="post"
				    action="crud.html"
				    commandName="role" role="form"
				    cssClass="form-wizard validate">
				
					<form:hidden path="roleId" />
					
				    <div class="steps-progress">
				        <div class="progress-indicator"></div>
				    </div>
				
				    <ul>
				        <li class="active">
				            <a href="#tab-1" data-toggle="tab">
				                <span>1</span>Role Info</a>
				        </li>
				        <li>
				            <a href="#tab-2" data-toggle="tab">
				                <span>2</span>Permission List</a>
				        </li>
				    </ul>
				
				    <div class="tab-content">
				        <div class="tab-pane active" id="tab-1">
				            <div class="row">
				                <div class="col-md-12">
				                    <div class="form-group">
				                        <form:label path="roleName" cssClass="control-label">
				                            Role Name
				                        </form:label>
				
			                            <form:input path="roleName"
			                                cssClass="form-control" name="name" data-validate="required"
			                                placeholder="Role name required" />
				                    </div>
				                </div>
				             </div>
				
				            <div class="row">
				                <div class="col-md-12">
				                    <div class="form-group">
										<form:label path="roleDesc" cssClass="control-label">Description</form:label>
				
										<form:textarea path="roleDesc"
											cssClass="form-control autogrow" name="name"
											data-validate="minlength[5]" rows="5" 
											placeholder="Description" />
				                    </div>
				                </div>
				            </div>
				        </div>
				
				        <div class="tab-pane" id="tab-2">
				            <div class="row">
								<c:forEach items="${menuModelList}" var="menuModel">
									<div class="col-md-6">
										<div id="form-group">
											<label class="control-label">
												<span><b>${menuModel.menuModelName}</b></span>
											</label>
											<br />
											<c:forEach items="${menuModel.menuInfoList}" var="menuInfo">
													<div class="make-switch switch-small" 
														data-on-label="Yes" data-off-label="No">
			                                            <form:checkbox path="menuInfoList" value="${menuInfo}" />
			                                        </div>
													${menuInfo.menuInfoName}
													<br />
											</c:forEach>
											<br />
										</div>
									</div>
								</c:forEach>
				            </div>
				
				            <div class="form-group">
				                <button type="submit" class="btn btn-primary">Save</button>
				            </div>
				
				        </div>
				
				        <ul class="pager wizard">
				            <li class="previous">
				                <a href="#"><i class="entypo-left-open"></i> Previous</a>
				            </li>
				
				            <li class="next">
				                <a href="#">Next <i class="entypo-right-open"></i></a>
				            </li>
				        </ul>
				    </div>
				</form:form>
			</div>
		</div>
	</div>
</div>

</jsp:body>
</t:template>