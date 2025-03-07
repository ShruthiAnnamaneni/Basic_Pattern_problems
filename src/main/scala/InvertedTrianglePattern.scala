object InvertedTrianglePattern {
  def main(args: Array[String]):Unit={
    /* 3) Inverted Triangle Pattern
    * * * * *
    * * * *
    * * *
    * *
    *
     */
    for(i<-1 to 5 by 1){
      for(j<-5 to i by -1){
        print("*"+" ")
      }
      println()
    }
  }

}
