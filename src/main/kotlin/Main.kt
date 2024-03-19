fun main(){
  firstString("akirachix")
    myName("Caren",21)
    stringlength("Caren")
    myFullName("Caren")
    studentRecords("Caren",21,"072784376378",49.5F,"Kenyan")
    isEven(2)
    extractWord("extravaganza")
    temperature()

}

fun firstString(word:String) {
    var a = word[0]
    var b = word[3]
    var c = word[4]

    var add = "$a$b$c"
    println(add)
}
fun myName(name:String, age:Int){

    var name = "Caren"
    var age = 21
    var statement="Hi, my name is $name and I am $age years old"
    println(statement)
}
fun stringlength(name:String):Int{
    var name = "Caren"
    var result = name.length
    println(result)
    return(result)
}
fun myFullName(name:String) {
    var name = "Caren"

    if (name == "Caren") {
        println("Thats me!")
    } else {
        println("I dont know who that is")
    }
}
fun studentRecords (name:String,age:Int,phoneNumber:String,weight:Float,citizen:String) {
        println(name)
        println(age)
        println(phoneNumber)
        println(weight)
        println(citizen)
    }
    fun isEven(num:Int){
        var result= num%2 ==0
        println(result)
    }
fun extractWord(name: String):String{
   var name= name.slice(2..5)
    return(name)
}
fun temperature(){
var temperature:Double=49.5
    var message = "The temperature is $temperature degrees Celcius."
    println(message)
}
