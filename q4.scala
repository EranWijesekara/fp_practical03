object D3Q4 {
    def main(args: Array[String]): Unit = {        
        var integers = List(1, 2, 3, 4, 5)
        printf(f"The list of integers : ${integers}\n")
        printf(f"The sum of even numbers : ${sum(integers)}")

        def sum(integers :List[Int]):Int = {
                integers.filter(_%2==0).sum
            }
    }
}