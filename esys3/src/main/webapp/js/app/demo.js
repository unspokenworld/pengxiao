var Demo = {};
Demo.woRowDetailGrid = function (options) {
	var tableId = 'woTable_' + options.woNodeId;
	// 在tabs上增加一个tabpanel
	$('#' + options.woTabId).tabs('add', {
	    title : options.woNodeText,
	    content : '<table id="' + tableId + '"></table>',
	    closable : true
	});
	$('#' + tableId).wogrid ({
		woId : tableId,
		woTitle : options.woNodeText,
		url:'json/datagrid.json',
		idField : 'itemid',
		pagination : true,
		woDeleteUrl:'json/success.json',
		woCreateUrl:'json/success.json',
		woUpdateUrl:'json/success.json',
	    columns:[/*[{
	    	title : '<div style="float:left"><input type="text" style="width:200px;height:10px"/></div>',
	    	colspan : 4,
	    	align : 'left',
	    	height : 20
	    }], */[
	        {field:'itemid',title:'ID', width : 50},
	        {field:'name',title:'名称', width : 100},
	        {field:'attr1',title:'属性', width : 200},
	        {field:'price',title:'价格',align:'right', width : 50},
	        {field:'productid', title:'产品ID', align:'right', hidden : true}
	    ]],
	    woCreateForm : {
	    	woFields : [{
				woType : 'textbox',
				woName : 'itemid',
			    width : 150,
			    label : '名称'
			},{
				woType : 'textbox',
				woName : 'name',
			    width : 150,
			    label : '产品名称'
			},{
				woType : 'textbox',
				woName : 'attr1',
			    width : 150,
			    label : '产品属性'
			},{
				woType : 'textbox',
				woName : 'price',
			    width : 150,
			    label : '价格'
			},{
			    woType : 'wocombogrid',
			    woName : 'productid',
			    label : '产品',
				panelWidth : 450,
				panelHeight : 400,
				width : 300,
				woColSpan : 2,
				pagination : true,
			    idField : 'productid',
			    textField : 'name',
			    // mode : 'remote',
			    editable : true,
			    url : 'json/datagrid_product.json',
			    columns : [[
			        {field : 'productid' , title : '产品ID' , width : 60},
			        {field : 'name' , title : '产品名称' , width : 100},
			        {field : 'unitcost' , title : '成本' , width : 100}
			    ]],
			    woSearchFields : [{
					woType : 'textbox',
					woName : 'woSearchContent1',
					woText : '查询内容',
				    iconAlign:'right',
				    buttonText : '搜',
				    onClickButton : function () {
				    	$(this).next('span').find('input').focus();
				    },
				    width : 150
				}]
			}],
			woButtons : [{
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			}]
	    },
	    woUpdateForm : {
	    	woFields : [{
				woType : 'textbox',
				woName : 'itemid',
			    width : 150,
			    label : '名称'
			},{
				woType : 'textbox',
				woName : 'name',
			    width : 150,
			    label : '产品名称'
			},{
				woType : 'textbox',
				woName : 'attr1',
			    width : 150,
			    label : '产品属性'
			},{
				woType : 'textbox',
				woName : 'price',
			    width : 150,
			    label : '价格'
			},{
			    woType : 'combogrid',
			    woName : 'productid',
			    label : '产品',
				panelWidth : 450,
				width : 300,
				woColSpan : 2,
				pagination : true,
			    idField : 'productid',
			    textField : 'name',
			    url : 'json/datagrid_product.json',
			    columns : [[
			        {field : 'productid' , title : '产品ID' , width : 60},
			        {field : 'name' , title : '产品名称' , width : 100},
			        {field : 'unitcost' , title : '成本' , width : 100}
			    ]]
			}],
			woButtons : [{
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			}]
	    },
	    toolbar:[{
	        woButtonType : 'woCreate'
	    }, {
	        woButtonType : 'woDelete'
		    }]
	});
};

Demo.woStandardGrid = function (options) {
	var tableId = 'woTable_' + options.woNodeId;
	// 在tabs上增加一个tabpanel
	$('#' + options.woTabId).tabs('add', {
	    title : options.woNodeText,
	    content : '<table id="' + tableId + '"></table>',
	    closable : true
	});
	$('#' + tableId).wogrid ({
		woId : tableId,
		woTitle : options.woNodeText,
		woGridType : 'Standard',
		idField : 'itemid',
		url : 'json/datagrid.json',
		woDeleteUrl:'json/success.json',
		woCreateUrl:'json/success.json',
		woUpdateUrl:'json/success.json',
		columns:[/*[{
	    	title : '<div style="float:left"><input type="text" style="width:200px;height:10px"/></div>',
	    	colspan : 4,
	    	align : 'left',
	    	height : 20
	    }], */[
	        {field:'itemid',title:'ID', width : 50},
	        {field:'name',title:'名称', width : 100},
	        {field:'attr1',title:'属性', width : 200},
	        {field:'price',title:'价格',align:'right', width : 50},
	        {field:'productid', title:'产品ID', align:'right', hidden : true}
	    ]],
	    woCreateForm : {
	    	woFields : [{
				woType : 'textbox',
				woName : 'itemid',
			    width : 150,
			    label : '名称'
			},{
				woType : 'textbox',
				woName : 'name',
			    width : 150,
			    label : '产品名称'
			},{
				woType : 'textbox',
				woName : 'attr1',
			    width : 150,
			    label : '产品属性'
			},{
				woType : 'textbox',
				woName : 'price',
			    width : 150,
			    label : '价格'
			},{
			    woType : 'wocombogrid',
			    woName : 'productid',
			    label : '产品',
				panelWidth : 450,
				panelHeight : 400,
				width : 300,
				woColSpan : 2,
				pagination : true,
			    idField : 'productid',
			    textField : 'name',
			    editable : false,
			    url : 'json/datagrid_product.json',
			    columns : [[
			        {field : 'productid' , title : '产品ID' , width : 60},
			        {field : 'name' , title : '产品名称' , width : 100},
			        {field : 'unitcost' , title : '成本' , width : 100}
			    ]]
			}],
			woButtons : [{
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			}]
	    },
	    woUpdateForm : {
	    	woFields : [{
				woType : 'textbox',
				woName : 'itemid',
			    width : 150,
			    label : '名称'
			},{
				woType : 'textbox',
				woName : 'name',
			    width : 150,
			    label : '产品名称'
			},{
				woType : 'textbox',
				woName : 'attr1',
			    width : 150,
			    label : '产品属性'
			},{
				woType : 'textbox',
				woName : 'price',
			    width : 150,
			    label : '价格'
			},{
			    woType : 'combogrid',
			    woName : 'productid',
			    label : '产品',
				panelWidth : 450,
				width : 300,
				woColSpan : 2,
			    idField : 'productid',
			    textField : 'name',
			    url : 'json/datagrid_product.json',
			    columns : [[
			        {field : 'productid' , title : '产品ID' , width : 60},
			        {field : 'name' , title : '产品名称' , width : 100},
			        {field : 'unitcost' , title : '成本' , width : 100}
			    ]]
			}],
			woButtons : [{
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			}]
	    },
	    toolbar:[{
	        woButtonType : 'woCreate'
	    }, {
	        woButtonType : 'woEdit'
	    }, {
	        woButtonType : 'woDelete'
	    }, {
	        woButtonType : 'woClear'
	    }]
	});
};

Demo.woTreeGrid = function (options, param) {
	var tableId = 'woTable_' + options.woNodeId;
	// 在tabs上增加一个tabpanel
	$('#' + options.woTabId).tabs('add', {
	    title : options.woNodeText,
	    content : '<table id="' + tableId + '"></table>',
	    closable : true
	});
	$('#' + tableId).wogrid ($.extend ({
		woId : tableId,
		woTitle : options.woNodeText,
		woGridType : 'Tree',
		idField : 'id2',
		treeField : 'name',
		parentField : 'parent',
		url : 'json/treegrid.json',
		woDeleteUrl:'json/success.json',
		woCreateUrl:'json/success.json',
		woUpdateUrl:'json/success.json',
	    columns:[[
	    	{field:'id2', title:'ID'},
	        {field:'name', title:'名称'},
	        {field:'size', title:'大小'},
	        {field:'date', title:'时间', align:'right'},
	        {field:'parent', title:'上级ID', align:'right'}
	    ]],
	    woCreateForm : {
	    	woFields : [{
				woType : 'textbox',
				woName : 'id2',
			    width : 150,
			    label : 'ID'
			},{
				woType : 'textbox',
				woName : 'name',
			    width : 150,
			    label : '名称'
			},{
				woType : 'textbox',
				woName : 'size',
			    width : 150,
			    label : '大小'
			},{
				woType : 'textbox',
				woName : 'date',
			    width : 150,
			    label : '时间'
			},{
				woType : 'combotreegrid',
				woName : 'parent',
				idField : 'id2',
			    textField : 'name',
			    treeField : 'name',
			    parentField : 'parent',
			    url : 'json/treegrid.json',
			    woColSpan : 2,
			    width : 300,
			    panelWidth : 450,
			    label : '上级',
			    columns:[[
			    	{field:'id2', title:'ID'},
			        {field:'name', title:'名称'},
			        {field:'size', title:'大小'},
			        {field:'date', title:'时间', align:'right'},
			        {field:'parent', title:'上级ID', align:'right'}
			    ]]
			}],
			woButtons : [{
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			}]
	    },
	    woUpdateForm : {
	    	woFields : [{
				woType : 'textbox',
				woName : 'id2',
			    width : 150,
			    label : 'ID'
			},{
				woType : 'textbox',
				woName : 'name',
			    width : 150,
			    label : '名称'
			},{
				woType : 'textbox',
				woName : 'size',
			    width : 150,
			    label : '大小'
			},{
				woType : 'textbox',
				woName : 'date',
			    width : 150,
			    label : '时间'
			},{
				woType : 'combotreegrid',
				woName : 'parent',
				idField : 'id2',
			    textField : 'name',
			    parentField : 'parent',
			    url : 'json/treegrid.json',
			    woColSpan : 2,
			    width : 300,
			    label : '上级',
			    columns:[[
			    	{field:'id2', title:'ID'},
			        {field:'name', title:'名称'},
			        {field:'size', title:'大小'},
			        {field:'date', title:'时间', align:'right'},
			        {field:'parent', title:'上级ID', align:'right'}
			    ]]
			}],
			woButtons : [{
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			}]
	    },
	    toolbar:[{
	        woButtonType : 'woCreate'
	    }, {
	        woButtonType : 'woEdit'
	    }, {
	        woButtonType : 'woDelete'
	    }, {
	        woButtonType : 'woClear'
	    }]
	}, options));
};