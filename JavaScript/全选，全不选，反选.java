<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        //全选
    function clickAll() {
        var hobbise = document.getElementsByName("hobby");
        for(var i = 0;i < hobbise.length;i++){
            hobbise[i].checked = true;
        }
    }
    //全不选
    function clickNo() {
        var hobbise = document.getElementsByName("hobby");
        for(var i = 0;i < hobbise.length;i++){
            hobbise[i].checked = false;
        }
    }
    //反选
    function clickReverse() {
        var hobbise = document.getElementsByName("hobby");
        for(var i = 0;i < hobbise.length;i++){
            hobbise[i].checked = !hobbise[i].checked;
        }
    }
    </script>
</head>
<body>
    兴趣爱好：
    <input type="checkbox" name="hobby" value="cpp">C++
    <input type="checkbox" name="hobby" value="java">Java
    <input type="checkbox" name="hobby" value="js">JavaScript
    <br>
    <button onclick="clickAll()">全选</button>
    <button onclick="clickNo()">全不选</button>
    <button onclick="clickReverse()">反选</button>
</body>
</html>