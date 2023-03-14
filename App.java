import java.util.Scanner;
import static java.lang.System.out;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        int coffeeCups = 0;
        int sellRate = 1;
        int level = 1;
        int exp = 0;
        int money = 0;
        Scanner choice1 = new Scanner(System.in);
        Scanner shopSelect = new Scanner(System.in);
        Random  BrewCupslvl1 = new Random();
        Random BrewCupslvl2 = new Random();
        Random BrewCupslvl3 = new Random();
        Random BrewCupslvl4 = new Random();
        Random BrewCupslvl5 = new Random();
        String chosen = choice1.next();
        
        if (chosen.indexOf("&") == 0) {
            if (chosen.equals("&bal")) {
                out.println("You have brewed " + coffeeCups);
                out.print(" cups of coffee, and you have " + money +" money." );
            }
            if (chosen.equalsIgnoreCase("&brew")) {
                if (level == 1) {
                    int brewCupslvl1 = BrewCupslvl1.nextInt(2);
                    out.print(brewCupslvl1+" cups of coffee brewed.");
                    coffeeCups += brewCupslvl1;
                    exp += brewCupslvl1;
                    if (exp == 20) {
                        out.println("Congratulations! You are now level 2!");
                        level ++;
                    }
            }
                if (level == 2) {
                    int brewCupslvl2 = BrewCupslvl2.nextInt(4);
                    out.print(brewCupslvl2+" cups of coffee brewed");
                    coffeeCups += brewCupslvl2;
                    exp += brewCupslvl2;
                    if (exp == 40) {
                        out.println("Congratulations! You are now level 3!");
                        level++;
                    }
                }
                if (level == 3) {
                    int brewCupslvl3 = BrewCupslvl3.nextInt(6);
                    out.print(brewCupslvl3+ " cups of coffee brewed.");
                    coffeeCups += brewCupslvl3;
                    exp += brewCupslvl3;
                    if (exp == 60) {
                        out.println("Congratulations! You are now level 4!");
                        level++;
                    }
                }
                if (level == 4) {
                    int brewCupslvl4 = BrewCupslvl4.nextInt(8);
                    out.print(brewCupslvl4+" cups of coffee brewed.");
                    coffeeCups += brewCupslvl4;
                    exp += brewCupslvl4;
                    if (exp == 80) {
                        out.println("Congratulations! You are now level 5!");
                        level++;
                    }
                }
                if (level == 5) {
                    int brewCupslvl5 = BrewCupslvl5.nextInt(10);
                    out.print(brewCupslvl5+" cups of coffee brewed.");
                    coffeeCups += brewCupslvl5;
                    exp += brewCupslvl5;
                    if (exp == 100) {
                        out.println("Congratulations! You are now the maximum level, level 5!");
                        level++;
                    }
                }
        }
            if (chosen.equalsIgnoreCase("&sell")) {
                if (coffeeCups != 0) {
                    out.print(coffeeCups + " cups of coffee sold.");
                    coffeeCups *= sellRate;
                    money += coffeeCups;
                    coffeeCups -= coffeeCups;
                    out.println("You now have " + money + " money.");
                } if (coffeeCups == 0) {
                    out.println("You do not have enough coffee to sell.");
                }
        }
            if (chosen.equalsIgnoreCase("&store")) {
                out.println("Level 1 Items: \n");
                out.println("Sugar: $25  Raises the value of your coffee by $1. Type 'sugar' to buy.");
                out.println("Better coffee maker: $30  Raises the value of your coffee by $2. Type 'bcm' to buy.");
                out.println("Handmade Coffee Mugs: $45  Raises the value of your coffee by $5. Type 'hcm' to buy.");
                out.println("Level 2 items: \n");
                out.println("Even Better Coffee Maker: $60  Raises the value of your coffee by $15. Type 'ebcm' to buy.");
                out.println("Coffeeeeee beans: $70  A rare kind of coffee bean that gives 100x the caffiene. Brings value up by $20. Type 'ceb' to buy.");
                String buyItem = shopSelect.next();
                if (buyItem.equalsIgnoreCase("sugar")) {
                    if (money >= 25) {
                        out.println("Sugar bought! Value of coffee brought up by $1.");
                        sellRate ++;
                        money -= 25;
                }   
                    if (money >= 25) {
                    out.println("You don't have enough money for this.");
                }
                }
                if (buyItem.equalsIgnoreCase("bcm")) {
                    if (money >= 30) {
                        out.println("Coffee maker bought! Value of coffee brought up by $2!");
                        sellRate += 2;
                        money -= 30;
                    }
                    if (money <= 30) {
                        out.println("Not enough money for this.");
                    }
                }
                if (buyItem.equalsIgnoreCase("hcm")) {
                    if (money >= 45) {
                        out.println("Coffee Mugs bought! Value of coffee raised by $5!");
                        sellRate += 5;
                        money -= 45;
                    }
                    if (money <= 45) {
                        out.println("Not enough money to buy this item.");
                    }
                }
                if (buyItem.equalsIgnoreCase("ebcm")) {
                    if (level >= 1) {
                        if (money >= 60) {
                            out.println("Even Better Coffee Maker bought! Value of coffee raised by $15");
                            sellRate += 15;
                            money -= 60;
                        }
                        if (money <= 60) {
                            out.println("Not enough money to buy this.");
                        }
                    }
                    if (level <= 2) {
                        out.println("Not a high enough level to buy this.");
                    }
                }
                if (buyItem.equalsIgnoreCase("ceb")) {
                    if (level >= 1) {
                        if (money  >= 70) {
                            out.println("Coffeeeeeee Beans bought! Value of coffee raised by $20");
                            sellRate += 20;
                            money -= 70;
                    }
                        if (money <= 70) {
                            out.println("Not enough money to buy this.");
                        }
                }
                    if (level <= 2) {
                        out.println("Not a high enough level to buy this.");
                    }
                }
            } 
            choice1.close();
            shopSelect.close();
               
}
}
}

