/*
Mahesh is a farmer and owns 80 acres of land. His land is equally divided into 5 segments. He grows 
tomatoes in the 1st segment, potatoes in the 2nd segment, cabbage in the 3rd segment, sunflower in 
the 4th segment and sugarcane in the 5th segment. 
He is converting his land from chemical-driven farming to chemical-free farming. Mahesh starts with 
the conversion of vegetables into chemical-free produce. He spends the first 6 months doing the same.  
He then converts the sunflower land bank into chemical-free farming. This takes him another 4 
months. Finally, he converts sugarcane into chemical-free farming over the next 4 months. 
He gets a yield of the following for tomatoes. 30% of his tomato land gives him 10 tonne yield per acre. 
The remaining 70% of his tomato land gives him 12 tonnes yield per acre. The selling price of tomato 
is Rs. 7 per Kg. 
The yield of potatoes is 10 tonnes per acre. He sells each kg at Rs. 20. 
The yield of cabbage is 14 tonnes per acre. He sells each kg at Rs. 24. 
The yield of sunflowers is 0.7 tonnes per acre. He sells each kg at Rs. 200. 
The yield of sugarcane is 45 tonnes per acre. He sells each tonne at Rs. 4,000. 
All the crops are sowed at the same time. Mahesh gets the above yield at the above-mentioned rate 
in one crop cycle across his entire land of 80 acres. 
What is  
a. The overall sales achieved by Mahesh from the 80 acres of land. 
b. Sales realisation from chemical-free farming at the end of 11 months? */

public class pro_6 {
    public static void main(String args[]){
        
        //a
        double tomatoes_cost;
        tomatoes_cost = 0.3*16*10*7000 + 0.7*16*12*7000;
        System.out.printf("Cost of tomoatoes : %.2f", tomatoes_cost);
        System.out.println();
        double potatoes_cost;
        potatoes_cost = 16*10*20000;
        System.out.printf("Cost of potatoes : %.2f", potatoes_cost);
        System.out.println();
        double cabbage_cost;
        cabbage_cost = 16*14*24000;
        System.out.printf("Cost of cabbage : %.2f", cabbage_cost);
        System.out.println();
        double sunflower_cost;
        sunflower_cost = 16*0.7*200000;
        System.out.printf("Cost of sunflower : %.2f", sunflower_cost);
        System.out.println();
        double sugarcane_cost;
        sugarcane_cost = 16*45*4000;
        System.out.printf("Cost of sugarcane : %.2f", sugarcane_cost);
        System.out.println();

        double total_cost = tomatoes_cost + potatoes_cost + cabbage_cost + sunflower_cost + sugarcane_cost;

        System.out.printf("Total_cost: %.2f",total_cost);


        //b

        /*since at the end the 11 months only 4 segments will be converted 
         * so if we subtract the cost of sugarcane we will get the answer
        */

        double cost_end_of_11months = total_cost - sugarcane_cost;
        System.out.printf("\nCost at the end of 11 months: %.2f",cost_end_of_11months);
    }
}
