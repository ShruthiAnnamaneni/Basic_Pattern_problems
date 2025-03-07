object pattern7 {
  def main(args: Array[String]):Unit= {
    /* 7)
    *******
     *****
      ***
       *
       *
      ***
     *****
    *******
 */
    val n = 4
    val m = 4
    for (i <- n to 1 by -1) {
      for (j <- 1 to n - i by 1) {
        print(" ")
      }
      for (k <- 1 until 2 * i  by 1) {
        print("*")
      }
      println()

    }
  for(i<-1 to  m by 1){
    for(j<-1 to m-i by 1){
      print(" ")
    }
    for(k<-1 until 2*i by 1){
      print("*")
    }
    println()
   }
  }
}
