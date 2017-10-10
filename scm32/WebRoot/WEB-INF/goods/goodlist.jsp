<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
<%@ include file="/common/common.jspf"%>
<title>My JSP</title>
<style type="text/css">
.searchbox {
	margin:-2;
}
</style>
</head>
<script type="text/javascript">
	$(function() {
		$('#dg').datagrid({
			url : '${proPath}/datagrid_data1.json',
			//设置为true,自动适应，不会出现滚动条，如果要冻结列，需要设置为false，并设置width值
			fitColumns : true,
			//width : 800,
			/*单双数行显示不同颜色  */
			rowStyler : function(index, row) {
				if (index % 2 == 0) {
					return 'background-color:#6293BB;color:#fff;';
				}
			},
			toolbar : [ {
				iconCls : 'icon-add',
				text : '新增',
				handler : function() {
					alert('添加按钮');
				}
			}, '-', {
				iconCls : 'icon-remove',
				text : '删除',
				handler : function() {
					alert('删除按钮');
				}
			}, '-', {
				iconCls : 'icon-edit',
				text : '修改',
				handler : function() {
					alert('编辑按钮');
				}
			}, '-', {
			/*搜索框*/
				text : "<input type='text' id='ss' name='keyword'/>",
			} ],
			//设定是否换行显示数据， true为不换行
			nowrap : true,
			//指定主键字段,可以支持翻页 
			idField : 'supId',
			//加载过程显示的内容
			loadMsg : '加载中...',
			//底部分页分布工具栏，设定为true时显示
			pagination : true,

			pageList : [ 5, 10, 15 ],
			pageSize : 5,
			//设定为true，显示行号
			rownumbers : true,
			//设定为true，在 多选 框中，只能选择一行,
			singleSelect : false,
			//设置为true时选择复选框，将选择所有行
			selectOnCheck : true,

			//冻结某些列				
			frozenColumns : [ [ {
				checkbox : true
			}, {
				field : 'productid',
				width : 100,
				title : '编号',
				formatter : function(value, row, index) {
					return "<span title='"+value+"'>" + value + "</span>";
				}

			} ] ],
			//注意返回数组，才能赋值
			columns : [ [ {

				field : 'unitcost',
				title : '单价',
				align : 'right'
			}, {
				field : 'listprice',
				title : 'Price',
				align : 'right'
			}, {
				field : 'itemid',
				title : 'itemid',
				width : 100,
				align : 'right',
				formatter : function(value, row, index) {
					return "<span title='"+value+"'>" + value + "</span>";
				}

			}, {
				field : 'attr1',
				title : 'attr1',
				align : 'right',
				formatter : function(value, row, index) {
					return "<span title='"+value+"'>" + value + "</span>";
				}

			} ] ]
		});
		/*搜索框  */
		$('#ss').searchbox({
			searcher : function(value, name) {
				alert(value + "," + name);
			},
			prompt : '请输入供应商名称'
		});

	});
</script>
<body style="margin:0px;">
	<table id="dg"></table>
</body>
</html>