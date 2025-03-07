object Pattern10 {
  def main(args:Array[String]):Unit={
    /* 10)
      *
     ***
    *****
   *******
  *********
     */
    val n=5
    for(i<-1 to n by 1){
      for(j<-1 to n-i by 1){
        print(" ")
      }
      for(k<-1 to 2*i-1 by 1){
        print("*")
      }
      println()

    }
  }

}
