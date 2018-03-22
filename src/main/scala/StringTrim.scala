/**
  * Created by mirela on 22/03/2018.
  *
  *
  * "aaa", 2 -> "aa"
  * “aaabbbcc”, 2 -> “aabbcc”,
  * “aaabbbccaaaaaaa”, 1 -> “abca”
  * “abbbccc”, 2 -> “abbcc”
  * “abcd, 0 -> “”
  */
case class StringTrim() {

  def trimByGroup(inputString: String, quota: Int): String = {
    var stringOutput: String = ""
    var currentCount: Int = 0
    var previousItem: Option[Char] = None

    if (quota == 0) return ""

    for (item <- inputString) {
      previousItem match {
        // First case, when there is no item in the new string
        // add the element to the start of the string and
        // increase count
        case None =>
          stringOutput += item
          currentCount += 1

        // Second case: if there is a different character
        // than the previous one, add the char to the string
        // and reset the counter to 1, since we already added
        // the element in the output string
        case Some(x) if x != item =>
          stringOutput += item
          currentCount = 1

        // Third case: add the item to the string if the char
        // is the same as the previous one but we still have quota
        // to add it to the output string.
        case Some(x) if x == item && currentCount < quota =>
          stringOutput += x
          currentCount += 1

        // Skip the item if no condition is satisfied
        case _ =>
      }

      // Always update the previous item, even if
      // for some might not be necessary.
      previousItem = Some(item)
    }

    stringOutput
  }
}
