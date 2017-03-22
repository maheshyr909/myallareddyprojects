

object HelloWorldScala {
  def main(args: Array[String]){
    println("Hello World!");
    var age=19
    if (age>18){      
      println("He can vote!!")
    }else{
      println("Not eligible")
    }
    age=17
    if (age>18){      
      println("He can vote!!")
    }else{
      println("Not eligible")
    }

  }
}