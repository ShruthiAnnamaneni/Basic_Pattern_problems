object SquarePattern {
  def main(args: Array[String]):Unit={
    /* 2) Program to print square pattern
    * * * *
    * * * *
    * * * *
    * * * *
     */

    for(i<-1 to 4 by 1){
      for(j<-1 to 4 by 1 ){
        print("*"+ " ")
      }
      println()
    }
  }

}
