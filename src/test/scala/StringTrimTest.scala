import org.scalatest.{FunSuite, Matchers}

/**
  * Created by mirela on 22/03/2018.
  */
class StringTrimTest extends FunSuite with Matchers {

  val stringTrimmer: StringTrim = StringTrim()

  test("should not parse when count is zero") {
    val result = stringTrimmer.trimByGroup("aaabbb", 0)

    result should be ("")
  }

  test("should not parse when the string is empty") {
    val result = stringTrimmer.trimByGroup("", 10)

    result should be ("")
  }

  test("should trim when the string is formed from the same character") {
    val result = stringTrimmer.trimByGroup("aaaaaaa", 1)

    result should be ("a")
  }

  test("should parse when quota is greater than 0") {
    val result = stringTrimmer.trimByGroup("aaabbb", 1)

    result should be ("ab")
  }

  test("should trim by only 1 count") {
    val result = stringTrimmer.trimByGroup("aacabbb", 2)

    result should be ("aacabb")
  }

  test("should trim by only 1 count and more then 4 chars in the group") {
    val result = stringTrimmer.trimByGroup("aaabbbccaaaaaaa", 1)

    result should be ("abca")
  }

}