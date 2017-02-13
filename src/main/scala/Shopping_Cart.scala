
object Shopping_Cart extends App {

val a_price = 0.6
val o_price = 0.25

println("Enter each fruit seperated by comma(,)");

val fruit_str = Console.readLine();

val fruit_list = fruit_str.split(",").map(_.trim).map(_.toLowerCase);

val f_cost = new Fruit_Cost();

val tot_cost = f_cost.calc_total(fruit_list,a_price,o_price);

println("total cost: "+tot_cost);

val disc_cost = f_cost.calc_discount(fruit_list,a_price,o_price);

val net_cost = tot_cost-disc_cost;

println("net cost: "+ net_cost);

}




