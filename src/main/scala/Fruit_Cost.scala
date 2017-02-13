class Fruit_Cost{

def calc_total(fruit_list:Array[String],a_price:Double,o_price:Double):Double = { 

val fruit_map = fruit_list.groupBy(identity).mapValues(_.size); 

var tot_cost:Double=0.0;

if(fruit_map.contains("apple") && fruit_map.contains("orange")) tot_cost = fruit_map("apple")*a_price+fruit_map("orange")*o_price;

if(fruit_map.contains("apple") && !fruit_map.contains("orange")) tot_cost = fruit_map("apple")*a_price;

if(!fruit_map.contains("apple") && fruit_map.contains("orange")) tot_cost = fruit_map("orange")*o_price; 

return tot_cost;
}}
