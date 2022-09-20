
fun main (args: Array<String>) {
    //Задание 1
    var a: Any?=null
    var b: Any = a?:3
    var c= 3/2.5
    //Задание 2
    var hello_string = "hello"
    var aplana_string = "aplana"
    println(hello_string + aplana_string)
    //Задание 3
    var five:Char='5'
    var five_string: String=five.toString()
    var five_byte: Byte=five_string.toByte()
    var five_short:Short=five_string.toShort()
    var five_int:Int=five_string.toInt()
    var five_double:Double=five_string.toDouble()
    var five_float:Float=five_string.toFloat()
    var five_long:Long=five_string.toLong()
    //Задание 4
    println("Enter user name")
    var enter_user_name: String?= readLine()
    println("Hello $enter_user_name")
    //Задание 5
    var eng_abc = "z".."a"
    //Задание 6
    println("Enter two numbers")
    var a1: String? = readLine()
    var a2:String?= readLine()
    var a_to: String=a1.toString()
    var b_to: String = a2.toString()
    var result=a_to>b_to
    println(result)





}