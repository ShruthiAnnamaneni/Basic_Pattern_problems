object Pattern6 {
  def main(args: Array[String]):Unit={
    /* 6)
          *
         ***
        *****
       *******
      *********
       *******
        *****
         ***
          *
     */
    val n=5
    val m=4
    for(i<-1 to n by 1){
      for(j<-1 to n-i by 1){
        print(" ")
      }
      for(k<-1 until 2*i by 1 ){
        print("*")
      }
      println()
    }
    for(i<-m to 1 by -1){
      for(j<-m-i+1 to 1 by -1){
        print(" ")
      }
      for(k<-2*i-1 to 1 by -1 ){
        print("*")
      }
      println()
    }

  }

}
