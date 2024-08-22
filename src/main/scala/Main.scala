import java.time.*

@main
def greet(): Unit =
  println("Hello world!")

object Leitner:
  opaque type Date = LocalDate
  opaque type Label = String

  val today: ZoneId => ZonedDateTime = ???

  opaque type Tag = Map[Label, Option[String]]
  case class Card(front: String, back: String, tags: Option[Set[Tag]] = None)
  case class Box(creationDate: Date, level: Int, cards: List[Card])

  enum ExamResult:
    case FAIL, PASS

  opaque type Repository = List[Box]

  val agenda: (Repository, Date) => List[Box] => List[Card] = ???
  val exam: Card => ExamResult = ???
  val move: Policy => (Card, ExamResult, Box) => Box = ???
  val addCard: (Date, Card) => Box = ???

  enum OnFailPolicy:
    case SameBox, InitialBox

trait Policy:
  var numberOfBoxes: Int
  var boxesLevels: Map[String, Int]
  var onFailPolicy: Leitner.OnFailPolicy
