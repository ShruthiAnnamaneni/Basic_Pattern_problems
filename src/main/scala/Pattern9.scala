object Pattern9 {
  def main(args: Array[String]):Unit={
    /* 9) pattern
      *
      **
      ***
      ****
      *****
      ****
      ***
      **
      *
     */
    val n=5
    for(i<-1 to n by 1){
      for(j<-1 to i by 1){
        print("*")
      }
      println()
    }
    for(i<-1 to n-1 by 1){
      for(j<-4 to i by -1){
        print("*")
      }
      println()
    }
  }

}
