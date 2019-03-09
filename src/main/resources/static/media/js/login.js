function login() {
    $.ajax({
        url:"userlogin.do",
        method:"post",
        data:$("#formLogin").serialize(),
        success:function (data) {
            if (data.code == 1){
                alert(data.msg);
                location.href = "index.html";
            } else {
                alert(data.msg);
            }
        }
    })
}
function register() {
    $.ajax({
        url:"register.do",
        method:"post",
        data:$("#regform").serialize(),
        success:function (data) {
            if (data.code == 1){
                alert(data.msg);
                location.href = "login.html";
            } else {
                alert(data.msg);
            }
        }
    })
}
