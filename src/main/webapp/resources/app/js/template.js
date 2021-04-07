/* HEADER スクリプト */
$(function() {
	var headerHeight = $('header').outerHeight(),
	startPos = 0;
	$(window).on('load scroll', function() {
		var scrollPos = $(this).scrollTop();
		if ( scrollPos > startPos && scrollPos > headerHeight ) {
			$('header').css('top', '-' + headerHeight + 'px');
		} else {
			$('header').css('top', '0');
		}
		startPos = scrollPos;
	});
});

/* HEADER NAV スクリプト */
$(function() {
	$('.navbar-nav>li>a , .dropdown-menu>a').on('click', function(){
		if(this.id != 'navbarDropdown'){
			$('.navbar-collapse').collapse('hide');
		}
	});
});


/* SEARCH SECTION スクリプト */
(function($) {
	$(function() {
		$('.my-menu').sliderMenu();
	});
})( jQuery );

/* SHOP LIST スクリプト */
$(window).on('load',function(){
	$('.card_contents').on('click', '.open_flg', function (e) {
		$(this).addClass('close_flg').removeClass('open_flg');
		$(this).find('.i1').addClass('ani1_1').removeClass('ani2_1');
		$(this).find('.i2').addClass('ani1_2').removeClass('ani2_2');
		//$(".i2").css('z-index', '1');
	});
	$('.card_contents').on('click', '.close_flg', function (e) {
		$(this).addClass('open_flg').removeClass('close_flg');
		$(this).find('.i1').addClass('ani2_1').removeClass('ani1_1');
		$(this).find('.i2').addClass('ani2_2').removeClass('ani1_2');
	});
});

/* CONTACT SECTION スクリプト */
$(function() {
	// 入力テキストの値が変わったら、確認画面の項目に同期する
	$('#v1 table tr td .ChangeConfirm').change(function() {
		relationId = $(this).data('confirm');
		$("#" + relationId).html($(this).val().replace(/\n/g, "<br>\n"));
	});

	// 「確認へ」ボタン押下
	$("#goConfirm").click(function() {
		// Validationチェック
		checkFlag = valiCheck('contactForm');
		//チェックOKなら、確認表示へ切替
		if (checkFlag) {
			$("#v1").hide();
			$("#v2").show(100);
		}
	});

	// 「修正する」ボタンを押下
	$("#goBack").click(function() {
		$("#v2").hide();
		$("#v1").show(100);
	});

	// 「送信する」ボタンを押下
	$("#goSubmit").click(function() {
		$("#v2").hide();
		$("#v3").show(100);
	});

	/*	// 「戻る」ボタンを押下
	 $("#goFirst").click(function(){
	 $("#v3").hide();
	 $("#contact").show(100);
	 });*/
});

/*
 * Formのバリデーションチェック
 * formName string Form名前
 * return boolen true：OK false：NG
 */
function valiCheck(formName) {
	checkFlag = true;
	var msg = "";
	$('form[name=' + formName + '] .IO').each(function(i, elem) {
		//console.log(i + ': ' + $(elem).val());
		var rules = $(elem).data('rule').split(',');
		for (var j = 0; j < rules.length; j++) {
			// 必須チェックと後続処理
			if (checkFlag && rules[j] == 'required') {
				checkFlag = checkRequired(elem);
				if (!checkFlag) {
					msg = '#ITEM#は必須です。';
					break;
				}
			}
			// 電話番号チェックと後続処理
			if (checkFlag && rules[j] == 'tel') {
				checkFlag = checkTel(elem);
				if (!checkFlag) {
					msg = '#ITEM#は不正です。';
					break;
				}
			}
			// メアドチェックと後続処理
			if (checkFlag && rules[j] == 'email') {
				checkFlag = checkEmail(elem);
				if (!checkFlag) {
					//alert($(elem).attr('title') +'は不正です。');
					msg = '#ITEM#は不正です。'
					break;
				}
			}
		}

		if (checkFlag) {
			$(elem).removeClass('ErrorIo');// if has
		} else {
			$(elem).addClass('ErrorIo');
			alert(msg.replace(/#ITEM#/, $(elem).attr('title')));
			return false;
		}

	});

	return checkFlag;
}

/*
 * 必須チェック
 * elem document.element チェック対象
 * return boolen true：OK false：NG
 */
function checkRequired(elem) {
	if ($(elem).val() == '') {
		return false;
	}
	return true;

}
/*
 * 電話番号チェック
 * elem document.element チェック対象
 * return boolen true：OK false：NG
 */
function checkTel(elem) {
	if ($(elem).val() == '') {
		return true;
	}
	if (!$(elem).val().match(/^\d{2,5}\d{1,4}\d{4}$/)) {
		return false;
	}
	return true;
}

/*
 * メールアドレスチェック
 * elem document.element チェック対象
 * return boolen true：OK false：NG
 */
function checkEmail(elem) {
	if ($(elem).val() == '') {
		return true;
	}
	if (!$(elem)
			.val()
			.match(
					/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/)) {
		return false;
	}
	return true;
}

/* iOS対策 */
jQuery(function($){
	var ua = navigator.userAgent;
	if ( ua.indexOf( 'iPhone' ) > 0 || ua.indexOf( 'iPad' ) > 0) {
		// iPhoneまたはiPadの場合
		$('.topimage').css({
			// プロパティ名にハイフンが入っている場合は''で囲む
			'background-attachment': 'scroll',
		});
	}
});

/* ページネーション Bootstrap4対応 */
jQuery(function($){
	$('.pagination li').addClass('page-item');
	$('.pagination a').addClass('page-link');
	$('.pagination').addClass('justify-content-center');
});

/* モーダルウィンドウ テスト */
$(function(){
    $('.js-modal-open').on('click',function(){
        $('.js-modal').fadeIn();
        scrollPosition = $(window).scrollTop();
        $('body').addClass('fixed').css({'top': -scrollPosition});
        return false;
    });
    $('.js-modal-close').on('click',function(){
        $('.js-modal').fadeOut();
        $('body').removeClass('fixed').css({'top': 0});
        window.scrollTo( 0 , scrollPosition );
        return false;
    });
});

/* Progressive Web Apps */
window.addEventListener('load', function() {
	if ('serviceWorker' in navigator) {
		navigator.serviceWorker.register("./serviceWorker.js")
		.then(function(registration) {
			console.log("serviceWorker registed.");
		}).catch(function(error) {
			console.warn("serviceWorker error.", error);
		});
	}
});
