<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>点表配置-后台管理系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="static/css/font.css">
    <link rel="stylesheet" href="static/css/weadmin.css">
    <link rel="stylesheet" href="static/css/view.css"/>
    <link rel="stylesheet" href="static/css/layui.css">
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="layui-view-body">
<div class="layui-content">
    <div class="layui-row layui-col-space20">

        <div class="layui-col-sm12 layui-col-md12">
            <div class="layui-card">

                <div class="layui-card-body chart-card">

                    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 10px;">
                        <legend>点表配置</legend>
                    </fieldset>
                    <div class="layui-row">
                        <form class="layui-form layui-col-md12 we-search">
                            按设备过滤：：
                            <div class="layui-inline">
                                <input class="layui-input" placeholder="设备名称" name="start" id="start">
                            </div>
                            <div class="layui-inline">
                                <input type="text" name="username" placeholder="PT1" autocomplete="off"
                                       class="layui-input">
                            </div>
                            <button class="layui-btn" lay-submit="" lay-filter="sreach"><i
                                    class="layui-icon">&#xe615;</i></button>
                        </form>
                    </div>
                    <div class="weadmin-block">
                        <button class="layui-btn" onclick="WeAdminShow('添加点表配置','./pointsConfig/add',500,600)"><i
                                class="layui-icon"></i>添加
                        </button>
                        <!--<span class="fr" style="line-height:40px">共有数据：88 条</span>-->
                    </div>
                    <table class="layui-table" id="points"></table>
                </div>
            </div>
        </div>
        <script type="text/html" id="operateTpl">
            <a title="编辑" onclick="WeAdminEdit('编辑','./pointsConfig/edit', 2, 500, 600)" href="javascript:;">
                <i class="layui-icon">&#xe642;</i>
            </a>
            <a title="删除" onclick="pointsConfig_del(this,'要删除的id')" href="javascript:;">
                <i class="layui-icon">&#xe640;</i>
            </a>
        </script>
    </div>
</div>
</body>
<script src="lib/layui/layui.js" charset="utf-8"></script>
<script>
    layui.extend({
        admin: '{/}static/js/admin'
    });

    layui.use(['table', 'jquery', 'form', 'admin'], function () {
        var table = layui.table,
            $ = layui.jquery,
            form = layui.form,
            admin = layui.admin;

        form.verify({
            ip: [
                /^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/
                , 'IP地址不符合规则'
            ]
        });

        //展示IP配置数据
        table.render({
            elem: '#points',
            cellMinWidth: 80,
            cols: [[ //标题栏
                {field: 'name', title: '点名'}
                , {field: 'c_dev', title: '采集设备名'}
                , {field: 'c_devid', title: '采集设备IP'}
                , {field: 'c_inaddr', title: '采集地址'}
                , {field: 'c_intype', title: '采集点类型'}
                , {field: 'f_dev', title: '转发设备名'}
                , {field: 'f_devid', title: '转发设备ID'}
                , {field: 'f_inaddr', title: '转发地址'}
                , {field: 'f_intype', title: '转发点类型'}
                , {field: 'desc', title: '点描述'}
                , {
                    field: 'operate', title: '操作', toolbar: '#operateTpl', unresize: true
                }
            ]],
            data: [{
                "name": "PT0001"
                , "c_dev": "DEV1"
                , "c_devid": "1"
                , "c_inaddr": "DO.1"
                , "c_intype": "int16    "
                , "f_dev": "F1"
                , "f_devid": "1"
                , "f_inaddr": "DO.1"
                , "f_intype": "int16"
                , "desc": "首站进站压力"
            },{
                "name": "PT0002"
                , "c_dev": "DEV1"
                , "c_devid": "1"
                , "c_inaddr": "AO.1"
                , "c_intype": "int16    "
                , "f_dev": "F1"
                , "f_devid": "1"
                , "f_inaddr": "AO.1"
                , "f_intype": "int16"
                , "desc": "首站出站压力"
            }]
            , skin: 'line' //表格风格
            , even: true
            , page: true //是否显示分页
            , limits: [5, 7, 10]
            , limit: 5 //每页默认显示的数量
        });


        /*
         *数据表格中form表单元素是动态插入,所以需要更新渲染下
         * http://www.layui.com/doc/modules/form.html#render
         * */
        $(function () {
            form.render();
        });

        /*ABCIP-删除*/
        window.pointsConfig_del = function (obj, id) {
            layer.confirm('确认要删除吗？', function (index) {
                //发异步删除数据
                $(obj).parents("tr").remove();
                layer.msg('已删除!', {
                    icon: 1,
                    time: 1000
                });
            });
        }
    });

</script>
</html>