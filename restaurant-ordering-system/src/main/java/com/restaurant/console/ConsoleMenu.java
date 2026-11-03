package com.restaurant.console;
import com.restaurant.factory.MealFactory;
import com.restaurant.model.Meal;
import com.restaurant.model.MealType;
import com.restaurant.model.Order;
import java.util.Scanner;
public class ConsoleMenu {
    private final MealFactory factory=new MealFactory();
    private final Scanner scanner=new Scanner(System.in);
    public void run(){
        Order order=new Order(1);
        MealType[] types=MealType.values();
        while(true){
            printMenu(types);
            int choice=readChoice(types.length);
            if(choice==0){
                break;
            }
            Meal meal=factory.createMeal(types[choice-1]);
            order.addMeal(meal);
            System.out.println("Added: "+meal.getDescription());
        }
        System.out.println();
        System.out.print(OrderPrinter.format(order));
    }
    private void printMenu(MealType[] types){
        System.out.println();
        for(int i=0;i<types.length;i++){
            Meal meal=factory.createMeal(types[i]);
            System.out.printf("%d. %s - %.0f%n",i+1,meal.getDescription(),meal.getPrice());
        }
        System.out.println("0. Finish order");
    }
    private int readChoice(int max){
        while(true){
            System.out.print("Your choice: ");
            String line=scanner.nextLine().trim();
            if(line.matches("\\d{1,2}")){
                int choice=Integer.parseInt(line);
                if(choice<=max){
                    return choice;
                }
            }
            System.out.println("Please enter a number from 0 to "+max);
        }
    }
}
