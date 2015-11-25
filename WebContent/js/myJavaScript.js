$(document).ready(function(){
		$('.date').each(function(){
			$(this).text(humanized_time_span($(this).text()));
		})
		$('#search-indicator').click(function(){
			$('.advanced-search').slideToggle();
		});
		
		$('.search-input').attr('placeholder', 'TÃ¬m kiáº¿m lá»›p, mÃ´n há»�c');
		$('.tieudeInput').attr('title', "TiÃªu Ä‘á»� nÃªn bao gá»“m lá»›p vÃ  mÃ´n! vd: ToÃ¡n 12");
		$('.thoigiandayInput').attr("title", "vd: T2-T4-T6 7pm-9pm, Cáº£ tuáº§n 5am-8am, LuÃ´n ráº£nh ...");
	});

