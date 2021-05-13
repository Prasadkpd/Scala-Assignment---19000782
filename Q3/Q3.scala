//19000782
object Total extends App{
    
  def sum(x:Double,y:Double)=y*(x-(x*40.0/100.0))+(50*3)+(0.75*(y-50));

    println(sum(24.95,60));
}
