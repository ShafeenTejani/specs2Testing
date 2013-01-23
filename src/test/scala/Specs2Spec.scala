import org.specs2.Specification
import org.specs2.specification.{Then, Given, When}

class Specs2Spec extends Specification { 
  def is =
    "Given 1"      ^ one     ^
    "When I add 1" ^ plusOne ^
    "Then I get 2" ^ isTwo   ^
  end ^
    "Given 1"      ^ one     ^
    "When I add 1" ^ plusOne ^
    "Then I get 2" ^ isTwo   ^
  end

  object one extends Given[Int] {
    def extract(text: String) = {
      1
    }
  }

  object plusOne extends When[Int, Int] {
    def extract(values: Int, text: String) = {
      values + 1
    }
  }

  object isTwo extends Then[Int] {
    def extract(values: Int, text: String) = {
      values must_== 2
    }
  }
}
