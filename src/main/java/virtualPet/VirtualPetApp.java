package virtualPet;

import java.util.Scanner;

public class VirtualPetApp extends Virtualpet {
   
   public static void main(String[] args) {
      Virtualpet Pauly = new Virtualpet();
      Scanner input = new Scanner(System.in);
      
      System.out.println("Hello I am your new Parrot Pauly!");
      System.out.println("age: " +Pauly.getAge());
      System.out.println("Thirst: " +Pauly.getThirst());
      System.out.println("Hunger: " +Pauly.getHunger());
      System.out.println("Happiness" +Pauly.getHappy());
      System.out.println("Cleanliness" +Pauly.getClean());
      
      
      System.out.println("Pauly is ready to play");
      System.out.println("What would you like to do with Pauly?");
      System.out.println("To feed Pauly enter 1");
      System.out.println("to give Pauly something to drink enter 2");
      System.out.println("to help Pauly fall  asleep enter 3");
      System.out.println("to play with Pauly, enter 4");
      
         
         int interact = input.nextInt();
         switch (interact) {
          case 1:
           if (Pauly.isHungry()) {
               System.out.println("What would you like to feed him? crackers or Peas?");
               String food = input.next();
               if (food.toLowerCase().equals("cracker")) {
               Pauly.feed();
               Pauly.Tick();
                System.out.println("You fed Pauly free crackers from Skyline Chili!");
                System.out.println("Pauly's hunger level is now: " +Pauly.getHunger());
              } else if (food.toLowerCase().equals("peas")) {
               System.out.println("Pauly hates peas. Why would you try to feed him peas?");
              }
              } else {
              System.out.println("Pauly isn't hungry right now. Just because you went to Skyline doesn't mean he wants more crackers");
              }
               break;
            case 2:
              if (Pauly.isThirsty()) {
                  Pauly.water();
                  Pauly.Tick();
                  System.out.println("You gave Pauly Root Beer!");
                  System.out.println("Pauly's thirst level is now: " +Pauly.getThirst());
              } else {
               System.out.println("Pauly is so over Root Beer! He doesn't want anymore.");
              }
              break;
              case 3:
              if (Pauly.isSleepy()) {
                  Pauly.tired();
                  Pauly.Tick();
                  System.out.println("You rocked Pauly to sleep!");
                  System.out.println("Pauly's fatigue level is now: " + Pauly.getTired());
               } else {
                  System.out.println("Pauly isn't sleepy, he wants to shake his tailfeather!");
               }
               break;
               case 4:
               if (Pauly.isBored()) {
                        Pauly.play();
                        Pauly.Tick();
                        System.out.println("You played Monopoly with Pauly!");
                        System.out.println("Pauly's boredom level is now: "  +Pauly.getBored());
                    } else {
                        System.out.println("Pauly has had enough of Monopoly for the moment. Let him swing.");
                    }
                    break;
         }
                    Pauly.Tick();
                    System.out.println("age: " +Pauly.getAge());
                    System.out.println("Thirst: " +Pauly.getThirst());
                    System.out.println("Hunger: " +Pauly.getHunger());
                    System.out.println("Happiness" +Pauly.getHappy());
                    System.out.println("Cleanliness" +Pauly.getClean());  
   }
   
   
          
      } 
      