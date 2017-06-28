<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC Demo 首页</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<form action="message" method="get">
    <table border=2 bordercolor="00ffff" width=500 cellpadding=10 cellspacing=0>
        <tr>
            <th colspan=2>注册表单</th>
            <!--colspan是行合并-->
            <!--rowspan是列合并-->
        </tr>
        <tr>
            <td>账号</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="age"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="repsw"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="radio" name="sex" value="nan" checked="checked">男&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="nv">女</td>
        </tr>
        <tr>
            <td>选择技能</td>
            <td>
                <input type="checkbox" name="java" checked="checked">JAVA&nbsp;&nbsp;
                <input type="checkbox" name="html">HTML&nbsp;&nbsp;
                <input type="checkbox" name="css">CSS
            </td>
        </tr>
        <tr>
            <td>国家</td>
            <td>
                <select name="country">
                    <option value="none" selected="selected">--选择国家--</option>
                    <option value="cn">中国</option>
                    <option value="usa">美国</option>
                    <option value="en">英国</option>
                </select>
            </td>
        </tr>
        <tr>
            <th colspan=2><input type="reset" value="重设">&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" value="注册"></th>
        </tr>
    </table>
</form>
</body>
</html>