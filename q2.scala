object D3Q2 {
    def main(args: Array[String]):Unit = {
        println("Enter lenght of the list: ")
        val listLen = scala.io.StdIn.readInt()
        val arr = readArray(listLen)

        println("Array contain only characters with length of 5:")
        var fArr = filteredArray(arr)
        printArray(fArr)
    }

    def readArray(i:Int):Array[String] = {
        if (i < 1) {
            Array()
        }
        else {
            println("Enter a string: ");
            Array(scala.io.StdIn.readLine())++readArray(i - 1)
        }
    }

    def printArray(x: Array[String]):Any = {
        if (!x.isEmpty) {
            println(x.head)
            printArray(x.tail)
        }
    }

    def filteredArray(x: Array[String]):Array[String] = {
        x.filter(_.length()>5)
        //_ is used to iterate through each element in the list
        //filter is a special operation that is allowed by the List data structure
    }

}