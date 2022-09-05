import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Test extends AnyFlatSpec with should.Matchers {

  "The test" should "do something" in {
    1 shouldBe 1
  }

}
