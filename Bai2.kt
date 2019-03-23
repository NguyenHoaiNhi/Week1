fun main() {
    println("Hello, world!!!")
    ConvertAcr(" Chu Nghia Cong San")
}

fun ConvertAcr(s: String)
{
    var str = s.trim() // tạo ra chuỗi mới bỏ hai dấu cách ở đầu và cuối
    var l = str.length-1 
    print(str[0]) // in ra ký tự đầu tiên
    for (i in 1..l){
        if(str[i].isWhitespace()){ // kiểm tra xem có phải là dấu space ko, nếu đúng in ra ký tự tiếp theo
            //println(i)
        	print(str[i+1])
        }
    }
}