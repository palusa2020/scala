package demoApp

import java.io._
class Food(val afoodname:String, val afoodtype:String,val aprice:Int) {
  var foodname       :String = afoodname
  var foodtype      :String    = afoodtype
  var price         :Int         = aprice

   def prccheck(aprice:Int) {
      println ("Donut Cost is around : " + aprice );
   }
}

class Order( val aorderid :String , val aqty : Int) {
   var orderid :String = aorderid
   var qty :Int = aqty
}

object Donut {
   def main(args: Array[String]) {
      val dnut = new Food( "Vanilla Frosted","Donut",2)
      val ordr = new Order( "1001",5)

      // Move to a new location
      dnut.prccheck(2);
   }
}
