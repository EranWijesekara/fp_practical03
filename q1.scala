object D3Q1 {
    def main(args: Array[String]): Unit = {
        println("Enter a string: ")
        val s = scala.io.StdIn.readLine()
        println("Reverse string: ")
        reverseString(s);

    }

    def reverseString(str:String):Unit = {
        if (str.length() == 0) {
            return
        }
        else {
            reverseString(str.substring(1))
            printf(str.charAt(0).toString())
        }
    }
}