

object sub {
  def main(args: Array[String]){
     
    var x = new rational(1,2)
    var y = new rational(2,3)
    var z = new rational(5,7)
    println(x)
    println(y)
    println(z)
           
  }
  
  class rational(a:Int, b:Int){
    
    def num = a
    def den = b
    def neg = new rational(-this.num, this.den)
    def sub(i:rational) = this + i.neg 
    override def toString= num + "/" + den
    
    
  }
}