+function(e){"use strict";var t=window.navigator.appName=="Microsoft Internet Explorer";var n=function(t,n){this.$element=e(t);this.$input=this.$element.find(":file");if(this.$input.length===0)return;this.name=this.$input.attr("name")||n.name;this.$hidden=this.$element.find('input[type=hidden][name="'+this.name+'"]');if(this.$hidden.length===0){this.$hidden=e('<input type="hidden" />');this.$element.prepend(this.$hidden)}this.$preview=this.$element.find(".fileinput-preview");var r=this.$preview.css("height");if(this.$preview.css("display")!="inline"&&r!="0px"&&r!="none")this.$preview.css("line-height",r);this.original={exists:this.$element.hasClass("fileinput-exists"),preview:this.$preview.html(),hiddenVal:this.$hidden.val()};this.listen()};n.prototype.listen=function(){this.$input.on("change.bs.fileinput",e.proxy(this.change,this));e(this.$input[0].form).on("reset.bs.fileinput",e.proxy(this.reset,this));this.$element.find('[data-trigger="fileinput"]').on("click.bs.fileinput",e.proxy(this.trigger,this));this.$element.find('[data-dismiss="fileinput"]').on("click.bs.fileinput",e.proxy(this.clear,this))},n.prototype.change=function(t){if(t.target.files===undefined)t.target.files=t.target&&t.target.value?[{name:t.target.value.replace(/^.+\\/,"")}]:[];if(t.target.files.length===0)return;this.$hidden.val("");this.$hidden.attr("name","");this.$input.attr("name",this.name);var n=t.target.files[0];if(this.$preview.length>0&&(typeof n.type!=="undefined"?n.type.match("image.*"):n.name.match(/\.(gif|png|jpe?g)$/i))&&typeof FileReader!=="undefined"){var r=new FileReader;var i=this.$preview;var s=this.$element;r.onload=function(r){var o=e("<img>").attr("src",r.target.result);t.target.files[0].result=r.target.result;s.find(".fileinput-filename").text(n.name);if(i.css("max-height")!="none")o.css("max-height",parseInt(i.css("max-height"),10)-parseInt(i.css("padding-top"),10)-parseInt(i.css("padding-bottom"),10)-parseInt(i.css("border-top"),10)-parseInt(i.css("border-bottom"),10));i.html(o);s.addClass("fileinput-exists").removeClass("fileinput-new");s.trigger("change.bs.fileinput",t.target.files)};r.readAsDataURL(n)}else{this.$element.find(".fileinput-filename").text(n.name);this.$preview.text(n.name);this.$element.addClass("fileinput-exists").removeClass("fileinput-new");this.$element.trigger("change.bs.fileinput")}},n.prototype.clear=function(e){if(e)e.preventDefault();this.$hidden.val("");this.$hidden.attr("name",this.name);this.$input.attr("name","");if(t){var n=this.$input.clone(true);this.$input.after(n);this.$input.remove();this.$input=n}else{this.$input.val("")}this.$preview.html("");this.$element.find(".fileinput-filename").text("");this.$element.addClass("fileinput-new").removeClass("fileinput-exists");if(e!==false){this.$input.trigger("change");this.$element.trigger("clear.bs.fileinput")}},n.prototype.reset=function(){this.clear(false);this.$hidden.val(this.original.hiddenVal);this.$preview.html(this.original.preview);this.$element.find(".fileinput-filename").text("");if(this.original.exists)this.$element.addClass("fileinput-exists").removeClass("fileinput-new");else this.$element.addClass("fileinput-new").removeClass("fileinput-exists");this.$element.trigger("reset.bs.fileinput")},n.prototype.trigger=function(e){this.$input.trigger("click");e.preventDefault()};e.fn.fileinput=function(t){return this.each(function(){var r=e(this),i=r.data("fileinput");if(!i)r.data("fileinput",i=new n(this,t));if(typeof t=="string")i[t]()})};e.fn.fileinput.Constructor=n;e(document).on("click.fileinput.data-api",'[data-provides="fileinput"]',function(t){var n=e(this);if(n.data("fileinput"))return;n.fileinput(n.data());var r=e(t.target).closest('[data-dismiss="fileinput"],[data-trigger="fileinput"]');if(r.length>0){t.preventDefault();r.trigger("click.bs.fileinput")}})}(window.jQuery)