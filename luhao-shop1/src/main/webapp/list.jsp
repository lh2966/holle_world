<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	function deletes(){
		var str="";
		$(":checkbox:checked").each(function(){
			str+=this.value+",";
		})
		str=str.substring(0,str.length-1);
		alert(str);
		window.location.href="deletes?ids="+str;
	}
</script>
</head>
<body>
	<center>
		<a href="quertyShangpin"><input type="button" value="添加"></a>
		<form action="querty" method="post">
			<input type="button" value="批量删除" onclick="deletes()">
			店铺名称:<input type="text" name="dname" value="${dianpu.dname }">&nbsp;
			<input type="submit" value="查询">
			<table border="1" cellspacing="0">
			
				<tr>
					<td>选择</td>
					<td>编号</td>
					<td>店铺名称</td>
					<td>创建日期</td>
					<td>销售商品</td>
					<td>操作</td>
				</tr>
				
				<c:forEach items="${Dp.list }" var="d">
					<tr>
						<td><input type="checkbox" value="${d.did }"></td>
						<td>${d.did }</td>
						<td>${d.dname }</td>
						<td>${d.dtime }</td>
						<td>
							<c:forEach items="${d.shops }" var="s">
								${s.sname },
							</c:forEach>
						</td>
						<td>
							<a href="look?id=${d.did }"><input type="button" value="详情"></a>
						</td>
					</tr>
				</c:forEach>
			</table>
			<a href="querty?page=1&rows=${Dp.pageSize}&dname=${dianpu.dname}">首页</a>
			<a href="querty?page=${Dp.prePage}&rows=${Dp.pageSize}&dname=${dianpu.dname}">上一页</a>
			<a href="querty?page=${Dp.nextPage }&rows=${Dp.pageSize}&dname=${dianpu.dname}">下一页</a>
			<a href="querty?page=${Dp.pages }&rows=${Dp.pageSize}&dname=${dianpu.dname}">末页</a>
		</form>
	</center>
</body>
</html>