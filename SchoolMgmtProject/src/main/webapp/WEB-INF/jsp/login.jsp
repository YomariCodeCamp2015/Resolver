<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/login"%>

<t:template>
<jsp:body>

        <div class="login-header login-caret">

            <div class="login-content">

                <a class="logo">
                    <img src="<c:url value="/images/logo.png" />" width="120" height="50" alt="" />
                </a>

                <p class="description">Dear user, log in to access the admin area!</p>

                <!-- progress bar indicator -->
                <div class="login-progressbar-indicator">
                    <h3>43%</h3>
                    <span>logging in...</span>
                </div>
            </div>

        </div>

        <div class="login-progressbar">
            <div></div>
        </div>

        <div class="login-form">

            <div class="login-content">
				
                <div class="form-login-error">
                	<c:if test="${!empty errMsg}">
	                    <h3>Invalid login</h3>
	                    <p>username or password doesn't match.</p>
                    </c:if>
                </div>

                <form:form method="post" action="verifyLogin.html"
    				commandName="user" role="form" id="form">

                    <div class="form-group">

                        <div class="input-group">
                            <div class="input-group-addon">
                                <i class="entypo-user"></i>
                            </div>

                            <form:input path="userName" cssClass="form-control" 
                            	id="userName" placeholder="Username" autocomplete="off" />
                        </div>

                    </div>

                    <div class="form-group">

                        <div class="input-group">
                            <div class="input-group-addon">
                                <i class="entypo-key"></i>
                            </div>

                            <form:password path="userPass" cssClass="form-control" 
                            	id="userPass" placeholder="Password" autocomplete="off" />
                        </div>

                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-primary btn-block btn-login">
                            <i class="entypo-login"></i>
                            Login In
                        </button>
                    </div>

                </form:form>

            </div>

        </div>
        
        <script>
	        jQuery(function($) {

   	            var formLogin = formLogin || {};
	        	(function(e, t, n) {
	        	    "use strict";
					
	        	    e(".form-login-error").show();
					
	        	    e(document).ready(function() {
	        	        formLogin.$container = e("#form");
	        	        formLogin.$container.validate({
	        	            rules: {
	        	                userName: {
	        	                    required: true
	        	                },
	        	                userPass: {
	        	                    required: true
	        	                }
	        	            },
	        	            highlight: function(t) {
	        	                e(t).closest(".input-group").addClass("validate-has-error")
	        	            },
	        	            unhighlight: function(t) {
	        	                e(t).closest(".input-group").removeClass("validate-has-error")
	        	            },
	        	            submitHandler: function(n) {
	        	                e(".login-page").addClass("logging-in");
	        	                e(".form-login-error").slideUp("fast");
	        	                setTimeout(function() {
	        	                    var n = 25 + Math.round(Math.random() * 30);
	        	                    formLogin.setPercentage(40 + n);
	        	                    setTimeout(function() {
	        	                        setTimeout(function() {
	        	                            
	        	                            var postFormStr = "<form method='POST' action='verifyLogin.html'>\n";
	        	                            
	        	                            postFormStr += "<div class='form-group'>";

	        	                            postFormStr += "<input type='hidden' name='userName' value='" + $("#userName").val() + "'></input>";
	        	                            postFormStr += "<input type='hidden' name='userPass' value='" + $("#userPass").val() + "'></input>";

	        	                            postFormStr += "</div>";
	        	                            postFormStr += "</form>";

	        	                            var formElement = $(postFormStr);

	        	                            $('body').append(formElement);
	        	                            $(formElement).submit();
	        	                        }, 400)
	        	                    }, 1e3)
	        	                }, 650)
	        	            }
	        	        });
	        	        formLogin.$body = e(".login-page");
	        	        formLogin.$login_progressbar_indicator = e(".login-progressbar-indicator h3");
	        	        formLogin.$login_progressbar = formLogin.$body.find(".login-progressbar div");
	        	        formLogin.$login_progressbar_indicator.html("0%");
	        	        if (formLogin.$body.hasClass("login-form-fall")) {
	        	            var r = false;
	        	            setTimeout(function() {
	        	                formLogin.$body.addClass("login-form-fall-init");
	        	                setTimeout(function() {
	        	                    if (!r) {
	        	                        formLogin.$container.find("input:first").focus();
	        	                        r = true
	        	                    }
	        	                }, 550)
	        	            }, 0)
	        	        } else {
	        	            formLogin.$container.find("input:first").focus()
	        	        }
	        	        formLogin.$container.find(".form-control").each(function(t, n) {
	        	            var r = e(n),
	        	                i = r.closest(".input-group");
	        	            r.prev(".input-group-addon").click(function() {
	        	                r.focus()
	        	            });
	        	            r.on({
	        	                focus: function() {
	        	                    i.addClass("focused")
	        	                },
	        	                blur: function() {
	        	                    i.removeClass("focused")
	        	                }
	        	            })
	        	        });
	        	        e.extend(formLogin, {
	        	            setPercentage: function(e, t) {
	        	                e = parseInt(e / 100 * 100, 10) + "%";
	        	                formLogin.$login_progressbar_indicator.html(e);
	        	                formLogin.$login_progressbar.width(e);
	        	                var r = {
	        	                    pct: parseInt(formLogin.$login_progressbar.width() / formLogin.$login_progressbar.parent().width() * 100, 10)
	        	                };
	        	                TweenMax.to(r, .7, {
	        	                    pct: parseInt(e, 10),
	        	                    roundProps: ["pct"],
	        	                    ease: Sine.easeOut,
	        	                    onUpdate: function() {
	        	                        formLogin.$login_progressbar_indicator.html(r.pct + "%")
	        	                    },
	        	                    onComplete: t
	        	                })
	        	            },
	        	            resetProgressBar: function(t) {
	        	                TweenMax.set(formLogin.$container, {
	        	                    css: {
	        	                        opacity: 0
	        	                    }
	        	                });
	        	                setTimeout(function() {
	        	                    TweenMax.to(formLogin.$container, .6, {
	        	                        css: {
	        	                            opacity: 1
	        	                        },
	        	                        onComplete: function() {
	        	                            formLogin.$container.attr("style", "")
	        	                        }
	        	                    });
	        	                    formLogin.$login_progressbar_indicator.html("0%");
	        	                    formLogin.$login_progressbar.width(0);
	        	                    if (t) {
	        	                        var n = e(".form-login-error");
	        	                        n.show();
	        	                        var r = n.outerHeight();
	        	                        n.css({
	        	                            height: 0
	        	                        });
	        	                        TweenMax.to(n, .45, {
	        	                            css: {
	        	                                height: r
	        	                            },
	        	                            onComplete: function() {
	        	                                n.css({
	        	                                    height: "auto"
	        	                                })
	        	                            }
	        	                        });
	        	                        formLogin.$container.find('input[type="password"]').val("")
	        	                    }
	        	                }, 800)
	        	            }
	        	        });
	        	    })
	        	})(jQuery, window)
	        });
        </script>

</jsp:body>
</t:template>