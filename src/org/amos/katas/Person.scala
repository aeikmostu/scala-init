class Person(val name : String, val sex : String, val age : Int)
object Person{
  def apply(name: String, sex:String, age : Int ) = {
    new Person(name, sex, age)
  }
}

object FoldApp extends App {

  val listOfPersons: List[Person] = List(Person("Christian", "male", 34),
    Person("Alex", "male", 28), Person("Sarah", "female", 17))

  val printablePersons = listOfPersons.foldLeft(List[String]()) {
    (accumulator: List[String], person: Person) => {
      val title = person.sex match {
        case "male" => "Mr"
        case "female" => "Mrs"
      }
      accumulator :+ title + " " + person.name + ", " + person.age
    }
  }

  printablePersons.filter(x => !x.isEmpty()).foreach(println(_))

}