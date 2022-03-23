fun main(){
    var Person=Human("Mellisa", 25, 65)

    Person.eat(20)
   println( Person.weight)

    Person.speak("I am strong")

    Person.brithday()

    var me=user("June", "Issabela", "juneissabela@gmail.com", 745657789, 675845)
    println(me.Firstname)

    println(me.Email)




}
class Human(var name:String, var age:Int ,var weight:Int) {
    fun eat(foodweight: Int){

        weight += foodweight

        println("I am eating $foodweight kgs of food")


    }
fun speak(speech:String){
    println(speech)
}
fun brithday() {
    age++
    println(age)
}

}
data class user(var Firstname:String, var Lastname:String, var Email:String, var phonenumber:Int, var Password:Int)



