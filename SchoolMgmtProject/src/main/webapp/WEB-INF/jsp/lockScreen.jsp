<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/lockscreen"%>
 
<t:template>
<jsp:body>

        <div class="login-header">

            <div class="login-content login-content-desc">

                <a href="#" class="logo">
                    <img src="<c:url value="/images/logo.png" />" width="120" height="50" alt="" />
                </a>

                <p class="description">Dear 
						<c:if test="${!empty lockScreenSession.student}">
                       		${lockScreenSession.student.studentName}
                       	</c:if>
                       	
                       	<c:if test="${!empty lockScreenSession.staff}">
                       		${lockScreenSession.staff.staffName}
                       	</c:if>
					, enter your password to unlock the screen!</p>

                <br>

                <!-- progress bar indicator -->
                <div class="login-progressbar-indicator">
                    <h3>0%</h3>
                    <span>logging in...</span>
                </div>
            </div>

        </div>

        <div class="login-form">

            <div class="login-content">

                <form:form method="post" action="verfiyLockscreen.html"
    				commandName="user" role="form" id="form_lockscreen">

                    <div class="form-group lockscreen-input">

                        <div class="lockscreen-thumb">
                            <img src="<c:url value="/images/lockscreen-user.png" />" class="img-circle" />

                            <div class="lockscreen-progress-indicator">0%</div>
                        </div>

                        <div class="lockscreen-details">
                            <h4> 
								<c:if test="${!empty lockScreenSession.student}">
		                       		${lockScreenSession.student.studentName}
		                       	</c:if>
		                       	
		                       	<c:if test="${!empty lockScreenSession.staff}">
		                       		${lockScreenSession.staff.staffName}
		                       	</c:if>
                       		</h4>
                            <span data-login-text="logging in...">logged off</span>
                        </div>

                    </div>

                    <div class="form-group">
				
                <div class="form-login-error">
                	<c:if test="${!empty errMsg}">
	                    <h3>Invalid login</h3>
	                    <p>password doesn't match.</p>
                    </c:if>
                </div>

                        <div class="input-group">
                            <div class="input-group-addon">
                                <i class="entypo-key"></i>
                            </div>

							<form:password path="userPass" cssClass="form-control" 
                            	id="userPass" placeholder="Password" autocomplete="off" />
							<form:hidden path="userName" />
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
	        	        var n = e(".login-page").hasClass("is-lockscreen");
	        	        if (n) {
	        	            formLogin.$container = e("#form_lockscreen");
	        	            formLogin.$ls_thumb = formLogin.$container.find(".lockscreen-thumb");
	        	            formLogin.$container.validate({
	        	                rules: {
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
	        	                submitHandler: function(t) {
	        	                    e(".login-page").addClass("logging-in-lockscreen");
	        	                    setTimeout(function() {
	        	                        var t = 25 + Math.round(Math.random() * 30);
	        	                        formLogin.setPercentage(t, function() {
	        	                            setTimeout(function() {
	        	                                formLogin.setPercentage(100, function() {
	        	                                	setTimeout(function(){
	        	        	                            var postFormStr = "<form method='POST' action='verfiyLockscreen.html'>\n";

	        	        	                            postFormStr += "<input type='hidden' name='userName' value='" + $("#userName").val() + "'></input>";
	        	        	                            postFormStr += "<input type='hidden' name='userPass' value='" + $("#userPass").val() + "'></input>";

	        	        	                            postFormStr += "</form>";

	        	        	                            var formElement = $(postFormStr);

	        	        	                            $('body').append(formElement);
	        	        	                            $(formElement).submit();
	        	                                	}, 600)
	        	                                }, 2)
	        	                            }, 820)
	        	                        })
	        	                    }, 650)
	        	                }
	        	            })
	        	        }
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
	        	                if (n) {
	        	                    formLogin.$lockscreen_progress_indicator.html(e);
	        	                    var r = {
	        	                        pct: l
	        	                    };
	        	                    TweenMax.to(r, .7, {
	        	                        pct: parseInt(e, 10),
	        	                        roundProps: ["pct"],
	        	                        ease: Sine.easeOut,
	        	                        onUpdate: function() {
	        	                            formLogin.$lockscreen_progress_indicator.html(r.pct + "%");
	        	                            c(parseInt(r.pct, 10) / 100)
	        	                        },
	        	                        onComplete: t
	        	                    });
	        	                    return
	        	                }
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
	        	        if (n) {
	        	            formLogin.$lockscreen_progress_canvas = e("<canvas></canvas>");
	        	            formLogin.$lockscreen_progress_indicator = formLogin.$container.find(".lockscreen-progress-indicator");
	        	            formLogin.$lockscreen_progress_canvas.appendTo(formLogin.$ls_thumb);
	        	            var i = formLogin.$ls_thumb.width();
	        	            formLogin.$lockscreen_progress_canvas.attr({
	        	                width: i,
	        	                height: i
	        	            });
	        	            formLogin.lockscreen_progress_canvas = formLogin.$lockscreen_progress_canvas.get(0);
	        	            var s = formLogin.lockscreen_progress_canvas,
	        	                o = o = s.getContext("2d"),
	        	                u = null,
	        	                a = Math.PI * 2,
	        	                f = Math.PI / 2,
	        	                l = 0;
	        	            o.beginPath();
	        	            o.strokeStyle = "#eb7067";
	        	            o.lineCap = "square";
	        	            o.closePath();
	        	            o.fill();
	        	            o.lineWidth = 3;
	        	            u = o.getImageData(0, 0, i, i);
	        	            var c = function(e) {
	        	                o.putImageData(u, 0, 0);
	        	                o.beginPath();
	        	                o.arc(i / 2, i / 2, 70, -f, a * e - f, false);
	        	                o.stroke();
	        	                l = e * 100
	        	            };
	        	            c(0 / 100);
	        	            formLogin.$lockscreen_progress_indicator.html("0%");
	        	            o.restore()
	        	        }
	        	    })
	        	})(jQuery, window)
	        });
        </script>

</jsp:body>
</t:template>