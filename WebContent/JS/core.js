function showDiv2() {
	callAjax('../test/login2.do', '', 'indexDiv', '', '', '', '');
}

function showDiv1() {
	callAjax('../test/login1.do', '', 'indexDiv', '', '', '', '');
}

function wordShow(id) {
	$(id).show();
}
function wordHide(id) {
	$(id).hide();
}

function callAjax(url, iLoading, iTarget, iPost, iTags, iCallBack,
		iCallBackParam) {
	// ----------------------------------------------------------------------
	var aPost = (iPost) ? 'POST' : 'GET';

	var xParams = '';

	$
			.ajax({
				type : aPost,
				url : url,
				data : xParams,
				contentType: "application/x-www-form-urlencoded; charset=utf-8",
				complete : function(data) {
					if (iTags.indexOf('[VALUE]') > -1) {
						document.getElementById(iTarget).value = data.responseText;
					} else {
						try {
							document.getElementById(iTarget).innerHTML = data.responseText;
						} catch (ex) {
						}
					}

					if (iCallBack) {
						if (iCallBackParam) {
							iCallBack(iCallBackParam)
						} else {
							eval(iCallBack)()
						}
					}
				}
			});
}