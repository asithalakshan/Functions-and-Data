

object neg {
  
  def main(args: Array[String]){
     
    var x = new rational(1,2)
    println(x.neg)
           
  }
  
  class rational(a:Int, b:Int){
    
    def num = a
    def den = b
    def neg = new rational(-this.num, this.den)
    override def toString= num + "/" + den
    
    
  }
  
  
}