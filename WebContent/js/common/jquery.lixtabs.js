(function($){
$.fn.Xtabs = function(options){
	var defaults ={
		hdcn:'hdcn',
		hdtagcur:'',
		bdcn:'bdcn',
		bdtagcur:'',
		event:'mouseover',
		how:'fadeIn',
		auto:null,
		delay:300
	}
	var Bind = function(object, fun) {
		var args = Array.prototype.slice.call(arguments).slice(2);
		return function() {
			return fun.apply(object, args.concat(Array.prototype.slice.call(arguments)));
		}
	}
	return this.each(function(){
		var opts = $.extend(defaults,options),
			root = $(this);
		//console.log(root);	
		root.hdcn = root.find('.'+opts.hdcn);
		root.bdcn = root.find('.'+opts.bdcn);
		var tabtag = root.hdcn.children();
		var	bdtag = root.bdcn.children();
		root.auto = opts.auto;
		root.length = tabtag.length;
		//console.log(bdtag[0]);
		root.numb = 0;
		/**/
		root.Go = function(n){
			clearTimeout(root.timer);
			if(n != undefined) { root.numb = n	}
			else { root.numb+=1; }
			root.numb >= root.length && (root.numb = 0) || (root.numb < 0 && (root.numb = root.length-1));
			//console.log(n +'-'+root.numb);
			tabtag.removeClass(opts.hdtagcur).eq(root.numb).addClass(opts.hdtagcur);
			bdtag.hide().eq(root.numb).addClass(opts.bdtagcur)[opts.how]();
			root.auto && (root.timer = setTimeout(Bind(this,root.Go,++root.numb),root.auto));
		}
		root.run = null;
		tabtag.each(function(){
			$(this).bind(
				opts.event,
				function(){
					clearTimeout(root.timer);
					root.auto = 0;
					var i = tabtag.index($(this));
					root.run = setTimeout(Bind(root,root.Go,i),opts.delay);
				}
			);
			$(this).bind(
				'mouseout',
				function(){
					clearTimeout(root.run);
					root.auto = opts.auto;
					var i = tabtag.index($(this));
					root.auto && (root.timer = setTimeout(Bind(root,root.Go,++i),root.auto));
				}
			)
		});
		root.auto && (root.timer = setTimeout(Bind(this,root.Go,1),root.auto));
	});
	
}

})(jQuery);	
	
	
	
	
	