object Pattern5 {
  def main(args: Array[String]):Unit={
    /* 5)
    *
    *_*
    *_*_*
    *_*_*_*
    *_*_*_*_*
  */
    for(i<-1 to 5 by 1){
      for(j<-1 to 2*i-1 by 1){
        if(j%2==1){
          print("*")
        }
        else{
          print("_")
        }
      }
      println()
    }
  }

}
