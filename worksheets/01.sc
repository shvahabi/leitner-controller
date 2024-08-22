// Is None required as default value for optional parameters
// YES

case class Person(name: String, surname: Option[String] = None, age: Int)

val person = Person(name = "Shahed", age = 43)