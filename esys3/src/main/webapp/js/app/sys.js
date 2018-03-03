var Sys = {};
Sys.MenuGrid = function(options) {
	var tableId = 'woTable_' + options.woNodeId;
	// 在tabs上增加一个tabpanel
	$('#' + options.woTabId).tabs('add', {
		title : options.woNodeText,
		content : '<table id="' + tableId + '"></table>',
		closable : true
	});
	$('#' + tableId).wogrid({
		// table id
		woId : tableId,
		// 标题
		woTitle : options.woNodeText,
		// 类型：Tree,Standard,RowDetail
		woGridType : 'Tree',
		woDeleteUrl : 'sys/menu/delete',
		woCreateUrl : 'sys/menu/create',
		woUpdateUrl : 'sys/menu/update',
		// 上级ID字段
		parentField : 'parentId',
		// http://www.jeasyui.com/documentation/index.php# treegrid
		url : 'sys/menu/list',
		idField : 'id',
		treeField : 'name',
		textField : 'name',
		// pagination : true,
		singleSelect : true,
		columns : [ [ {
			field : 'id',
			title : 'ID',
			width : 50,
			hidden : true,
			// 该字段会在修改表单中出现
			woUpdate : {
				readonly : true
			}
		}, {
			field : 'name',
			title : '名称',
			width : 150,
			// 该字段会在创建表单中出现
			woCreate : {},
			// 该字段会在修改表单中出现
			woUpdate : {}
		}, {
			field : 'no',
			title : '编号',
			width : 50,
			hidden : true
		}, {
			field : 'icon',
			title : '图标',
			width : 50,
			woCreate : {},
			woUpdate : {}
		}, {
			field : 'resource',
			title : '资源',
			width : 150,
			woCreate : {},
			woUpdate : {}
		}, {
			field : 'resourceType',
			title : '资源类型',
			width : 150,
			woCreate : {},
			woUpdate : {}
		}, {
			field : 'parentId',
			title : '上级ID',
			width : 50,
			hidden : true,
			woCreate : {},
			woUpdate : {}
		}, {
			field : 'parentName',
			title : '上级名称',
			width : 100
		} ] ],
		// 创建表单字段和按钮配置
		woCreateForm : {
			// 字段
			woFields : [ {
				woType : 'combotree',
				woName : 'parentId',
				label : '上级',
				idField : 'id',
				textField : 'name',
				treeField : 'name',
				parentField : 'parentId',
				width : 200,
				panelWidth : 300,
				url : 'sys/menu/getChildren',
				woColSpan : 1,
				columns : [ [ {
					field : 'id',
					title : 'ID',
					width : 50
				}, {
					field : 'name',
					title : '名称',
					width : 100
				}, {
					field : 'parentId',
					title : '上级ID',
					width : 50
				} ] ]
			} ],
			// 按钮配置
			woButtons : [ {
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			} ]
		},
		woUpdateForm : {
			woFields : [ {
				woType : 'combotree',
				woName : 'parentId',
				label : '上级',
				idField : 'id',
				textField : 'name',
				treeField : 'name',
				parentField : 'parentId',
				width : 200,
				panelWidth : 300,
				url : 'sys/menu/getChildren',
				woColSpan : 1,
				columns : [ [ {
					field : 'id',
					title : 'ID',
					width : 50
				}, {
					field : 'name',
					title : '名称',
					width : 100
				}, {
					field : 'parentId',
					title : '上级ID',
					width : 50
				} ] ]
			} ],
			woButtons : [ {
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			} ]
		},
		// 列表按钮配置
		toolbar : [ {
			woButtonType : 'woCreate'
		}, {
			woButtonType : 'woEdit'
		}, {
			woButtonType : 'woDelete'
		}, {
			woButtonType : 'woClear'
		} ]
	});
};
// 第一 框架
Sys.DictionaryGrid = function(options) {
	var tableId = 'woTable_' + options.woNodeId;
	// 在tabs上增加一个tabpanel
	$('#' + options.woTabId).tabs('add', {
		title : options.woNodeText,
		content : '<table id="' + tableId + '"></table>',
		closable : true
	});
	// 第二 配置wogrid的参数对象 options
	$('#' + tableId).wogrid({
		// table id
		woId : tableId,
		// 标题
		woTitle : options.woNodeText,

		url : 'sys/dictionary/list',
		woDeleteUrl : 'sys/dictionary/delete',
		woCreateUrl : 'sys/dictionary/create',
		woUpdateUrl : 'sys/dictionary/update',
		// 上级ID字段
		woGridType : 'Standard',
		idField : 'id',
		// 第三 配置列
		columns : [ [ {
			field : 'id',
			title : 'ID',
			width : 50,
			hidden : true,
			// 该字段会在修改表单中出现
			woUpdate : {
				readonly : true
			}
		}, {
			field : 'val',
			title : '值',
			width : 50,

			// 该字段会在修改表单和创建表单中出现
			woUpdate : {
				
			},
			woCreate : {
				
			}
		}, {
			field : 'name',
			title : '名称',
			width : 50,

			// 该字段会在修改表单中出现
			woUpdate : {
				
			},
			woCreate : {
				
			}
		}, {
			field : 'dicType',
			title : '类型',
			width : 50,

			// 该字段会在修改表单中出现
			woUpdate : {
				
			},
			woCreate : {
				
			}
		}, {
			field : 'description',
			title : '描述',
			width : 100,

			// 该字段会在修改表单中出现
			woUpdate : {
				
			},
			woCreate : {
				
			}
		} ] ],
		// 第四 配置表单
		woUpdateForm : {
			woButtons : [ {
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			} ]
		},
		woCreateForm : {
			woButtons : [ {
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			} ]
		},
		// 第五部 配置 toolbar
		toolbar : [ {
			woButtonType : 'woCreate'
		}, {
			woButtonType : 'woEdit'
		}, {
			woButtonType : 'woDelete'
		}, {
			woButtonType : 'woClear'
		} ]
	});

};
//第一 框架
Sys.RoleGrid = function(options) {
	var tableId = 'woTable_' + options.woNodeId;
	// 在tabs上增加一个tabpanel
	$('#' + options.woTabId).tabs('add', {
		title : options.woNodeText,
		content : '<table id="' + tableId + '"></table>',
		closable : true
	});
	// 第二 配置wogrid的参数对象 options
	$('#' + tableId).wogrid({
		// table id
		woId : tableId,
		// 标题
		woTitle : options.woNodeText,

		url : 'sys/role/list',
		woDeleteUrl : 'sys/role/delete',
		woCreateUrl : 'sys/role/create',
		woUpdateUrl : 'sys/role/update',
		// 上级ID字段
		woGridType : 'Standard',
		idField : 'id',
		// 第三 配置列
		columns : [ [ {
			field : 'id',
			title : 'ID',
			width : 50,
			hidden : true,
			// 该字段会在修改表单中出现
			woUpdate : {
				readonly : true
			}
		}, {
			field : 'description',
			title : '描述',
			width : 50,

			// 该字段会在修改表单和创建表单中出现
			woUpdate : {
				
			},
			woCreate : {
				
			}
		}, {
			field : 'name',
			title : '名称',
			width : 50,

			// 该字段会在修改表单中出现
			woUpdate : {
				
			},
			woCreate : {
				
			}
		}, {
			field : 'type',
			title : '类型',
			width : 50,

			// 该字段会在修改表单中出现
			woUpdate : {
				
			},
			woCreate : {
				
			}
		} ] ],
		// 第四 配置表单
		woUpdateForm : {
			woButtons : [ {
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			} ]
		},
		woCreateForm : {
			woButtons : [ {
				woButtonType : 'woSave'
			}, {
				woButtonType : 'woCancel'
			} ]
		},
		// 第五部 配置 toolbar
		toolbar : [ {
			woButtonType : 'woCreate'
		}, {
			woButtonType : 'woEdit'
		}, {
			woButtonType : 'woDelete'
		}, {
			woButtonType : 'woClear'
		} ]
	});

};