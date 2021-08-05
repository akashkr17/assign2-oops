package com.knoldus


class Person(val name : String, val age: Int) extends Ordered[Person] {
  override def compare(that: Person): Int = {
    if(this.name == that.name)
      this.age - that.age
    else
      this.name.length - that.name.length
  }
}

object MainObject{
  def main(args:Array[String]): Unit ={
    val person1= new Person(name= "Test", age=24)
    val person2= new Person(name= "Test", age=25)
    val person3= new Person(name= "John1", age=24)
    val person4= new Person(name= "John", age=25)

    def compareObject(personOne: Person, personTwo: Person): Unit = {
      if(personOne.compare(personTwo) > 0)
        println(false)
      else
        println(true)
    }
    compareObject(person1,person2)
    compareObject(person3,person4)

  }

}


