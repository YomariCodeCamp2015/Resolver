<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>

<!DOCTYPE html>
<html lang="en">

<head>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="SMS Admin Panel" />
    <meta name="author" content="Ashim" />

    <title>SMS</title>

    <link rel="stylesheet" href="<c:url value="/css/font-icons/entypo/css/entypo.css" />" id="style-resource-1">
    <link rel="stylesheet" href="<c:url value="/css/b-min.css" />" id="style-resource-2">
    <link rel="stylesheet" href="<c:url value="/css/core-min.css" />" id="style-resource-3">
    <link rel="stylesheet" href="<c:url value="/css/theme-min.css" />" id="style-resource-4">
    <link rel="stylesheet" href="<c:url value="/css/black-skin-min.css" />" id="style-resource-5">

    <link rel="stylesheet" href="<c:url value="/css/forms-min.css" />" id="style-resource-6">
    <link rel="stylesheet" href="<c:url value="/css/b-select-min.css" />" id="style-resource-7">
    <link rel="stylesheet" href="<c:url value="/css/select-min.css" />" id="style-resource-8">

    <script src="<c:url value="/js/jquery-1.11.0.min.js" />"></script>
    <script>$.noConflict();</script>
</head>

<body class="page-body page-left-in skin-black">
    <div class="page-container">
        <div class="sidebar-menu">
            <!-- Your Logo -->
            <header class="logo-env">
                <!-- Logo -->
                <div class="logo">
                    <a href="#">
                        <img src="<c:url value="/images/logo.png" />" width="120" height="50" alt="" />
                    </a>
                </div>

                <!-- Logo collapse icon -->
                <div class="sidebar-collapse">
                    <a href="#" class="sidebar-collapse-icon with-animation">
                        <i class="entypo-menu"></i>
                    </a>
                </div>

                <!-- open/close menu icon (do not remove if you want to enable menu on mobile devices) -->
                <div class="sidebar-mobile-menu visible-xs">
                    <a href="#" class="with-animation">
                        <i class="entypo-menu"></i>
                    </a>
                </div>
            </header>

            <!-- User Info -->
            <div class="sidebar-user-info">
                <div class="sui-normal">
                    <a href="#" class="user-link">
                        <img src="<c:url value="/images/lockscreen-user.png" />" width="55px" height="55px" alt="" class="img-circle" />
                        <span>Welcome,</span>
                        <strong>
                        	<c:if test="${!empty userSession.student}">
                        		${userSession.student.studentName}
                        	</c:if>
                        	
                        	<c:if test="${!empty userSession.staff}">
                        		${userSession.staff.staffName}
                        	</c:if>
						</strong>
                    </a>
                </div>
                <div class="sui-hover inline-links animate-in">
                    <a href="${pageContext.request.contextPath}/user/list.html">
                        <i class="entypo-pencil"></i> Edit Profile
                    </a>
                    <a href="${pageContext.request.contextPath}/lockScreen.html">
                        <i class="entypo-lock"></i> Log Off
                    </a>
                    <span class="close-sui-popup">&times;</span>
                </div>
            </div>

            <!-- Menu List -->
            <ul id="main-menu" class="">
            	<c:forEach items="${menuModelSession}" var="menuModel">
            		<li <c:if test="${sServletName == menuModel.menuModelName}">${"class='opened active'"}</c:if>>
	            		<a href="#">
	                        <i class="${menuModel.menuModelIcon}"></i>
	                        <span>${menuModel.menuModelName}</span>
	                    </a>
		
						<c:forEach items="${menuModel.menuInfoList}" var="menuInfo">
								<ul>
									<li <c:if test="${sServletPath == menuInfo.menuInfoUrl}">${"class='active'"}</c:if>>
										<a href="<c:url value="${menuInfo.menuInfoUrl}" />">
											<span>${menuInfo.menuInfoName}</span>
										</a>
									</li>
								</ul>
						</c:forEach>
					</li>
				</c:forEach>
            </ul>
        </div>
        
        <div class="main-content">
            <div class="row">
                <!-- Breadcrumb -->
                <div class="col-md-6 col-sm-8 clearfix">
                    <ol class="breadcrumb bc-3">
                        <li>
                             <a href="${pageContext.request.contextPath}/first.html">
                                <i class="entypo-home"></i>Home
                            </a>
                        </li>
                    </ol>
                </div>

                <!-- Logout -->
                <div class="col-md-6 col-sm-4 clearfix hidden-xs">
                    <ul class="list-inline links-list pull-right">
                        <li>
                            <a href="${pageContext.request.contextPath}/login.html">
                                Log Out <i class="entypo-logout right"></i>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>

            <hr />
            
            <jsp:doBody />
        </div>
    </div>
        
	<script>
		jQuery(function($) {

			var referrerPage =  document.referrer;
			var currentPage = $(location).attr("href");
			
			//var referrerPage = "http://localhost:8080/SchoolMgmtProject/staff/list.html";
			//var currentPage = "http://localhost:8080/SchoolMgmtProject/staff/add.html";
			
			var prevPageName = "";
			var prevPageLink = "";
			var curPageName = "";
			
			var breadCrumbElement = "";
			var panelTitle = "";
			
			// For Previous Page
				// Store this value - /SchoolMgmtProject/staff/list.html
				prevPageLink = referrerPage.replace(referrerPage.substring(0, 21), "");
				
				// Store this value - /staff/list.html
				referrerPage = referrerPage.replace(referrerPage.substring(0, 39), "");
			
				// Store this value - staff
				prevPageName = referrerPage.substring(1, referrerPage.lastIndexOf("/"));
				
				//alert(referrerPage + "-" + prevPageName + "-" + prevPageLink);
			
			// For Current Page
				// Store this value - /staff/add.html or /staff/edit.html
				currentPage = currentPage.replace(currentPage.substring(0, 39), "");
			
				// Store this value - staff
				panelTitle = currentPage.substring(1, currentPage.lastIndexOf("/"));
				
				// Store this value - add.html or edit.html
				currentPage = currentPage.replace(currentPage.substring(0, currentPage.lastIndexOf("/") + 1), "");
				
				// Remove querystring
				if (currentPage.search("edit.html") >= 0) {
					
					currentPage = currentPage.substring(0, currentPage.lastIndexOf("?"));
					
				}
				
				// Store this value - add or edit
				curPageName = currentPage.replace(".html", "");
				
				// Store this value - add staff or edit staff
				panelTitle = curPageName + " " + panelTitle;
				
				//alert(currentPage + "-" + curPageName + "-" + panelTitle);
			
			breadCrumbElement = "<li><a href=" + prevPageLink + ">" +
									"<span style='text-transform: capitalize'>" + prevPageName + "</span></a></li>";
			breadCrumbElement += "<li class='active'><strong style='text-transform: capitalize'>"+ curPageName +"</strong></li>";
			
			panelTitle = "<span style='text-transform: capitalize'>"+ panelTitle +"</span>";

			$('.breadcrumb.bc-3').append(breadCrumbElement);
			$('.panel-title').append(panelTitle);
		});
	</script>

    <script src="<c:url value="/js/main-min.js" />" id="script-resource-1"></script>
    <script src="<c:url value="/js/joinable-min.js" />" id="script-resource-2"></script>
    <script src="<c:url value="/js/resizeable-min.js" />" id="script-resource-3"></script>
    <script src="<c:url value="/js/api-min.js" />" id="script-resource-4"></script>
    <script src="<c:url value="/js/custom-min.js" />" id="script-resource-5"></script>

    <script src="<c:url value="/js/main-gsap.js" />" id="script-resource-6"></script>
    <script src="<c:url value="/js/select-min.js" />" id="script-resource-7"></script>
    <script src="<c:url value="/js/datepicker-min.js" />" id="script-resource-8"></script>
    <script src="<c:url value="/js/inputmask-min.js" />" id="script-resource-9"></script>
    <script src="<c:url value="/js/fileinput-min.js" />" id="script-resource-10"></script>
    <script src="<c:url value="/js/validate-min.js" />" id="script-resource-11"></script>
    <script src="<c:url value="/js/bootstrap.min.js" />" id="script-resource-12"></script>
    <script src="<c:url value="/js/jquery.bootstrap.wizard.min.js" />" id="script-resource-13"></script>
    <script src="<c:url value="/js/jquery.inputmask.bundle.min.js" />" id="script-resource-14"></script>
    <script src="<c:url value="/js/jquery.multi-select.js" />" id="script-resource-15"></script>
    <script src="<c:url value="/js/bootstrap-switch.min.js" />" id="script-resource-16"></script>

</body>
</html>