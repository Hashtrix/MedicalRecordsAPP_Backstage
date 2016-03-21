<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.lua.javautil.Pagination"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<link href="${ctx}/assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="${ctx}/assets/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="${ctx}/assets/css/jquery-ui-1.10.3.custom.min.css" />
<link rel="stylesheet" href="${ctx}/assets/css/jquery.gritter.css" />
<link rel="stylesheet" href="${ctx}/assets/css/select2.css" />
<link rel="stylesheet" href="${ctx}/assets/css/bootstrap-editable.css" />
<link rel="stylesheet" href="${ctx}/assets/css/ace.min.css" />
<link rel="stylesheet" href="${ctx}/assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="${ctx}/assets/css/ace-skins.min.css" />
<script src="${ctx}/assets/js/ace-extra.min.js"></script>
<script src="${ctx}/assets/js/jquery-2.0.3.min.js"></script>
<script src="${ctx}/assets/js/layer/layer.js"></script>
</head>
<body>
	<div class="profile-user-info">
		<div class="profile-info-row">
			<div class="profile-info-name">编号：</div>
			<div class="profile-info-value">
				<span>${druguse.druguse_ID }</span>
			</div>
		</div>
	</div>
	<div class="profile-user-info">
		<div class="profile-info-row">
			<div class="profile-info-name">药品编号：</div>
			<div class="profile-info-value">
				<span><a href="javascript:;" onclick="drugOnclick('${druguse.drug_ID }');">${druguse.drug_ID }</a></span>
			</div>
		</div>
	</div>
	<div class="profile-user-info">
		<div class="profile-info-row">
			<div class="profile-info-name">药量（设备次数）：</div>
			<div class="profile-info-value">
				<span>${druguse.druguse_num }克（次）
				<%-- <c:if test="${drug.drug_num==1 }">已就诊</c:if>
				<c:if test="${drug.registered_state==0 }">未就诊</c:if> --%>
				</span>
			</div>
		</div>
	</div>
	<div class="profile-user-info">
		<div class="profile-info-row">
			<div class="profile-info-name">当前时间：</div>
			<div class="profile-info-value">
				<span>${druguse.druguse_time }</span>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		window.jQuery
				|| document
						.write("<script src='${ctx}/assets/js/jquery-2.0.3.min.js'>"
								+ "<"+"/script>");
	</script>

	<!-- <![endif]-->

	<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
		<script type="text/javascript">
		function drugOnclick(e){
			layer.open({
			    type: 2,
			    title: '药品信息',
			    skin: 'layui-layer-rim', //加上边框
			    area: ['300px', '300px'], //宽高
			    content: '${ctx}/dep/ment/dialogShow!showDrugByID?drug.drug_ID='+e
			});
		}
		</script>
	<script src="${ctx}/assets/js/bootstrap.min.js"></script>
	<script src="${ctx}/assets/js/typeahead-bs2.min.js"></script>
	<script src="${ctx}/assets/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="${ctx}/assets/js/jquery.ui.touch-punch.min.js"></script>
	<script src="${ctx}/assets/js/jquery.gritter.min.js"></script>
	<script src="${ctx}/assets/js/bootbox.min.js"></script>
	<script src="${ctx}/assets/js/jquery.slimscroll.min.js"></script>
	<script src="${ctx}/assets/js/jquery.easy-pie-chart.min.js"></script>
	<script src="${ctx}/assets/js/jquery.hotkeys.min.js"></script>
	<script src="${ctx}/assets/js/bootstrap-wysiwyg.min.js"></script>
	<script src="${ctx}/assets/js/select2.min.js"></script>
	<script src="${ctx}/assets/js/date-time/bootstrap-datepicker.min.js"></script>
	<script src="${ctx}/assets/js/fuelux/fuelux.spinner.min.js"></script>
	<script src="${ctx}/assets/js/x-editable/bootstrap-editable.min.js"></script>
	<script src="${ctx}/assets/js/x-editable/ace-editable.min.js"></script>
	<script src="${ctx}/assets/js/jquery.maskedinput.min.js"></script>
	<script src="${ctx}/assets/js/ace-elements.min.js"></script>
	<script src="${ctx}/assets/js/ace.min.js"></script>
	<script src="${ctx}/assets/js/chosen.jquery.min.js"></script>
	<script src="${ctx}/assets/js/fuelux/fuelux.spinner.min.js"></script>
	<script src="${ctx}/assets/js/date-time/bootstrap-datepicker.min.js"></script>
	<script src="${ctx}/assets/js/date-time/bootstrap-timepicker.min.js"></script>
	<script src="${ctx}/assets/js/date-time/moment.min.js"></script>
	<script src="${ctx}/assets/js/date-time/daterangepicker.min.js"></script>
	<script src="${ctx}/assets/js/bootstrap-colorpicker.min.js"></script>
	<script src="${ctx}/assets/js/jquery.knob.min.js"></script>
	<script src="${ctx}/assets/js/jquery.autosize.min.js"></script>
	<script src="${ctx}/assets/js/jquery.inputlimiter.1.3.1.min.js"></script>
	<script src="${ctx}/assets/js/jquery.maskedinput.min.js"></script>
	<script src="${ctx}/assets/js/bootstrap-tag.min.js"></script>
</body>
</html>