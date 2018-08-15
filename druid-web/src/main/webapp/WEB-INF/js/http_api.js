function http_api() {
    var xhr;
    xhr = new XMLHttpRequest();
    return xhr;
};

function error(type,msg) {
    alert('请求出错：[' + type + '] ' + msg);
};

function execute(param, func) {
    var request = http_api();
    var method = param.method;
    var dataType = param.dataType;
    var url = param.url;
    request.open(method, url, true);
    if (method == 'GET') {
        request.send(null);
    } else if (method == 'POST') {
        request.setRequestHeader('content-type', 'application/x-www-form-urlencoded');
        request.send(data);
    }
    request.onreadystatechange=function (ev) {
        if (request.readyState == 4 && request.status == 200) {
            if (func != null) {
                //只处理json格式
                if (dataType != 'JSON') {
                    error('参数', '类型错误，不是JSON类型');
                }
                var str = eval("(" + request.responseText + ")");
                func(str);
            }
        } else if (request.readyState == 4 && request.status != 200) {
            alert('请求失败');
        }
    }
};

function getElementById(id) {
    return document.getElementById(id);
}