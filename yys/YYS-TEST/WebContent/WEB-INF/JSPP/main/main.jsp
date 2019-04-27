<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User main page</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js">
</script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js">
</script>
<script type="text/javascript">
	$(function(){
		//selectallMaster
		$("#masterSelectAll").click(function(){
			
			$.ajax({url:"/YYS-TEST/main/getAllMaster.do",
				type:'post',
				success:function(result){
					 $('#allMasteSelectTable').datagrid('loadData', { total: 0, rows: [] });// 重新载入当前页面数据
					 var json = JSON.stringify(result);//格式化Json数据
					 var map = eval('('+json+')');
					 $.map(map,function(values,key){  
						 
						  var id =values.id;
						  var masterName =values.masterName;
						  var societyName =values.yYS_Society.societyName;
						  var yys_Id =values.yys_Id; 
						  /* alert('id = ' + id + 
			             			';阴阳师账户名 = ' + masterName +
			             			';阴阳师阴阳寮 = ' + societyName + 
			             			';阴阳师唯一ID = ' + yys_Id);  */
						  
						  $('#allMasteSelectTable').datagrid('appendRow',{
			                    id:values.id,
			                    masterName:values.masterName,
			                   	societyName:values.yYS_Society.societyName,
			                   	yys_Id:values.yys_Id
			                });
					}); 
					 
				}
				
			});
			
		});
		//selectALL
		
		$("#submitSelect").click(function(){
			var mid = $('#yys_IdFragment').val();
			$.ajax({url:"${pageContext.request.contextPath }/main/getAllFragment.do",
				type:'post',
				data:{
					yys_Id:mid
				},
				success:function(result){
					 $('#allFragmentSelectTable').datagrid('loadData', { total: 0, rows: [] });// 重新载入当前页面数据
					 var json = JSON.stringify(result);//格式化Json数据
					 var map = eval(json);
					 $.map(map,function(values,key){  
						 /*  var id =values.id;
						  var hellspawnName =values.hellspawn.hellspawnName;
						  var type =values.hellspawn.type;
						  var piece =values.piece;  */
						  
						 /*  alert('id = ' + id + 
			             			';阴阳师账户名 = ' + hellspawnName +
			             			';阴阳师阴阳寮 = ' + type + 
			             			';阴阳师唯一ID = ' + piece);   */
						  $('#allFragmentSelectTable').datagrid('appendRow',{
							   id:values.id,
							   fragmentName:values.hellspawn.hellspawnName,
							   type:values.hellspawn.type,
							   piece:values.piece
			                });
					}); 
					 
				}
				
			});
		});
		
	})

</script>
</head>
<body class="easyui-layout">   
    <div data-options="region:'north',title:'用户操作'" style="height:55px;">
    	main页面
		<a href="${pageContext.request.contextPath }/test/logout.do" >退出登录</a><br>
    </div>   
    <div data-options="region:'south',title:'底部信息'" style="height:100px;">
    	<p align="center">制作:lwkangpy</p>
    </div>   
    
    <div data-options="region:'west',title:'菜单'" style="width:200px;">
    	<a href="javascript:void(0)" id="master" class="easyui-menubutton"     
        data-options="menu:'#mastermm'">阴阳师master</a>   
			<div id="mastermm" style="width:200px;">       
			    <div data-options="iconCls:'icon-search'"><a id="masterSelectAll"  >获取所有阴阳师master</a>
			    </div>  
			</div> 
		<div>
	    	<form>
		    	<table>
			    	<tr>
			    		<td>阴阳师唯一ID</td>
			    	</tr>
			    	<tr>
			    		<td><input id="yys_IdFragment" type="text" name="yys_Id"/></td>
			    	</tr>
			    	<tr>
			    		<td colspan="2" align="right">
					   				<a id="submitSelect"  class="easyui-linkbutton" data-options="iconCls:'icon-ok'" >搜索碎片</a> 
					   	</td>
			    	</tr>
			    	
			    </table>
			</form>  
	    </div> 
    </div>
    
     
    
    <div id="select" data-options="region:'center',title:'展示'" style="padding:5px;background:#eee;">
	    <span id="allMasteSelect">
	    	<table id="allMasteSelectTable" class="easyui-datagrid" style="width:500px;height:150px"   
			        data-options="fitColumns:true,singleSelect:true">   
			    <thead>   
			        <tr>   
			            <th data-options="field:'id',align:'center',sortable:true,order:'asc',editor:'numberbox'">id</th>   
			            <th data-options="field:'masterName',align:'center'">阴阳师账户名</th>   
			            <th data-options="field:'societyName',align:'center'">阴阳师阴阳寮</th>   
			            <th data-options="field:'yys_Id',sortable:true,align:'center'">阴阳师唯一ID</th>   
			        </tr>   
			    </thead>   
			</table>
	    </span>
	    获得一个阴阳师master的所有碎片<br>
		<span id="allFragmentSelect">
	    	<table id="allFragmentSelectTable" class="easyui-datagrid" style="width:500px;height:150px"
			        data-options="fitColumns:true,singleSelect:true">   
			    <thead>   
			        <tr>   
			            <th data-options="field:'id',align:'center',sortable:true,order:'asc'">id</th>   
			            <th data-options="field:'fragmentName',align:'center'" width="100px">碎片名</th>   
			            <th data-options="field:'type',align:'center'" width="100px">类型</th>   
			            <th data-options="field:'piece',align:'center'" width="100px">个数</th>   
			        </tr>   
			    </thead>   
			</table>
	    </span>
	
		<br>
		<a href="${pageContext.request.contextPath }/main/getAllMaster.do">获取所有阴阳师master</a><br>
		
		添加一个阴阳师master<br>
		<form action="${pageContext.request.contextPath }/main/addMaster.do" method="POST">
			阴阳师账户名:<input type="text" name="masterName"/><br>
			阴阳寮账户名:<input type="text" name="societyName"/><br>
			阴阳师唯一ID:<input type="text" name="yys_Id"/><br>
			<input type="submit" value="提交"><br>
		</form>
		删除一个阴阳师master<br>
		<form action="${pageContext.request.contextPath }/main/delMaster.do" method="POST">
			阴阳师唯一ID:<input type="text" name="yys_Id"/><br>
			<input type="submit" value="提交"><br>
		</form>
		
		添加一个阴阳师master的一种碎片<br>
		<form action="${pageContext.request.contextPath }/main/addFragment.do" method="POST">
			式神名字:<input type="text" name="hellspawnName"/><br>
			碎片个数:<input type="text" name="piece"/>
			阴阳师唯一ID:<input type="text" name="yys_Id"/><br>
			<input type="submit" value="提交"><br>
		</form>
		修改一个阴阳师master的一个碎片个数<br>
		<form action="${pageContext.request.contextPath }/main/updateFragment.do" method="POST">
			碎片记录ID:<input type="text" name="id"/><br>
			修改之后参数:<input type="text" name="piece"/><br>
			<input type="submit" value="提交"><br>
		</form>
    
    
    </div>   
    
</body> 
</html>