import TP1._

class TP1Test extends org.scalatest.FunSuite {
  test("giveMeHelloString function"){
    assert(giveMeHelloString == "Hello")
  }

  test("lastA function") {
    assert(TP1.lastA(List(1, 1, 2, 3, 5, 8)).get == 8)
    assert(TP1.lastA(Nil).isEmpty)
  }

  test("lastB function") {
    assert(TP1.lastB(List(1, 1, 2, 3, 5, 8)).get == 8)
    assert(TP1.lastB(Nil).isEmpty)
  }

  test("nthA function") {
    assert(TP1.nthA(2, List(1, 1, 2, 3, 5, 8)).get == 2)
    assert(TP1.nthA(6, List(1, 1, 2, 3, 5, 8)).isEmpty)
    assert(TP1.nthA(-4, List(1, 1, 2, 3, 5, 8)).isEmpty)
    assert(TP1.nthA(0, List()).isEmpty)
    assert(TP1.nthA(0, Nil).isEmpty)
  }

  test("nthB function") {
    assert(TP1.nthB(2, List(1, 1, 2, 3, 5, 8)).get == 2)
    assert(TP1.nthB(6, List(1, 1, 2, 3, 5, 8)).isEmpty)
    assert(TP1.nthB(-4, List(1, 1, 2, 3, 5, 8)).isEmpty)
    assert(TP1.nthB(0, List()).isEmpty)
    assert(TP1.nthB(0, Nil).isEmpty)
  }

  test("reverseA function") {
    assert(TP1.reverseA(List(1, 2, 3, 4, 5)) == List(5, 4, 3, 2, 1))
    assert(TP1.reverseA(Nil) == Nil)
  }

  test("reverseB function") {
    assert(TP1.reverseB(List(1, 2, 3, 4, 5)) == List(5, 4, 3, 2, 1))
    assert(TP1.reverseB(Nil) == Nil)
  }

  test("salarySum function") {
    assert(salarySum(List(
      Employee("Jon",2000),
      Employee("Jane",3500),
      Employee("James",4123)
    )) == 9623.0)
    assert(salarySum(Nil) == 0)
  }

  test("addressOf function") {
    assert(addressOf(List(
      User("Jon", "5 Av. des Champs-Élysées, Paris"),
      User("James","17 Boulevard Poissonnière, Paris"),
      User("Jane", "52 Rue de Saintonge, Paris")
    )) == List(
      "5 Av. des Champs-Élysées, Paris",
      "17 Boulevard Poissonnière, Paris",
      "52 Rue de Saintonge, Paris"
    ))
    assert(addressOf(Nil) == Nil)
  }

  test("average function") {
    assert(average(Iterator(1, 2, 3, 4, 5, 6, 7, 8)).get == 4.5)
    assert(average(Iterator.empty).isEmpty)
  }

  test("monoid") {
    assert((skiRatingAverage*100).round/100.0 == 4.41)
  }

}
