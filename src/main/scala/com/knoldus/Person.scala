package com.knoldus

//Class that compare the object on the basis of name and age
class Person(val name : String, val age: Int) extends Ordered[Person] {
  override def compare(that: Person): Int = {
    if(this.name == that.name)
      this.age - that.age
    else
      this.name.length - that.name.length
  }
}

//Main obbject that perform the initialization and function call to class person
object MainObject{

  def main(args:Array[String]): Unit ={

    val personOne= new Person(name= "John", age=29)
    val personTwo= new Person(name= "John", age=30)
    val personThree= new Person(name= "John1", age=29)
    val personFour= new Person(name= "John", age=30)

    def objectComparison(person1: Person, person2: Person): Unit = {
      if(person1.compare(person2) > 0)
        println(false)
      else
        println(true)
    }
    //function calling
    objectComparison(personOne,personTwo)
    objectComparison(personThree,personFour)

  }

}


