import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Test extends AnyFlatSpec with should.Matchers {

  "The test" should "succeed" in {
    1 shouldBe 1
  }

}
