function keypress2(){
    var text1=document.getElementById("myArea").value;
    var maxLen=document.getElementById("myArea").cols*document.getElementById("myArea").rows;
    var len;//记录剩余字符串的长度
    if(text1.length>=maxLen)
    {
        document.getElementById("myArea").value=text1.substr(0,maxLen);//只显示起始位-末尾；substr（起始位，末尾)
        len=0;
    }else{
        len=maxLen-text1.length;
    }
    document.getElementById("pinglun").innerText=len;
}
