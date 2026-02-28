import java.io.*;
import java.util.ArrayList;
public class SteamHoursAvgMenu
{
          public static void pressEnter(BufferedReader input) throws IOException
          {                   
                    System.out.println("Press enter to continue...");
                    
                    input.readLine();
          }

          public static void main(String argv[])throws IOException
          {
                    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
                    String buffer;


                    ArrayList<String> gameName = new ArrayList<String>();
                    ArrayList<Double> gameHours = new ArrayList<Double>();

                    String gameNameEnter;
                    double gameHoursEnter;
                    String gameNameMax="x";
                    String gameNameMin="x";
                    int gameRemove;
                    
                    double avg;
                    double sum;
                    double min;
                    double max;
                    int menu;

                          
                    System.out.println("Program to calculate average playtime in a given number of games.");
                    System.out.println("---------------");

                    do
                    { 
        
                              //menu
                    
                              System.out.println("1. Enter a game");
                              System.out.println("2. Remove a game");
                              System.out.println("3. Display results");
                              System.out.println("4. Exit");
                                                           
                              System.out.println();
                              
                              System.out.print("Choose: ");
                              buffer=input.readLine();
                              menu=Integer.parseInt(buffer);
                              
                                                                             
                              Screen.clear();
                              
                              if (menu==1)
                              {
                                        // enter name of game
                                        gameName = GameManager.getName(input);
                                        // enter game hours
                                        gameHours = GameManager.getHours(input);
                              }

                              Screen.clear();
                              
                              if (menu==2)
                              {
                                        if (gameHours.size()>0)
                                        {
                                                  
                                                  System.out.println("Which game would you like to remove? (Number)");

                                                  System.out.println();

                                                  for (int i=0; i<gameName.size(); i++)
                                                  {
                                                            System.out.println((i+1)+". game: "+gameName.get(i)+ " with "+gameHours.get(i)+" hours");
                                                  }

                                                  System.out.println();

                                                  System.out.print("Game number: ");
                                                  
                                                  buffer=input.readLine();
                                                  gameRemove=Integer.parseInt(buffer);

                                                  gameHours.remove(gameRemove-1);
                                                  gameName.remove(gameRemove-1);
                                        }
                                        else
                                        {
                                                  System.out.println("Enter 1 game!");
                                                  pressEnter(input);
                                        }
                              }
                              
                              if (menu==3)
                              {
                                        if (gameHours.size()>0)
                                        {
                                                  //calculation of results
                                                  avg=Calculate.ArrayListAvg(gameHours);
                                                  sum=Calculate.ArrayListSum(gameHours);
                                                  min=Calculate.ArrayListMin(gameHours);
                                                  max=Calculate.ArrayListMax(gameHours);

                                                  //finding names of min and max played games
                                                  for (int i=0; i<gameHours.size(); i++)
                                                  {
                                                            if (gameHours.get(i)==max)
                                                            {
                                                                      gameNameMax=gameName.get(i);
                                                            }

                                                            if (gameHours.get(i)==min)
                                                            {
                                                                      gameNameMin=gameName.get(i);
                                                            }
                                                  }


                                                  //results
                                                  System.out.println("Games you have entered: ");
                                                  System.out.println();
                                                  
                                                  for (int i=0; i<gameName.size(); i++)
                                                  {
                                                            System.out.println((i+1)+". game: "+gameName.get(i)+ " with "+gameHours.get(i)+" hours");
                                                  }

                                                  System.out.println();
                                                  System.out.println("Results:");
                                                  System.out.println();

                                                  System.out.println("Average Playtime: "+avg);
                                                  System.out.println("Sum of all hours played: "+sum);
                                                  System.out.println("Least played game is "+gameNameMin+" with "+ min+" hours");
                                                  System.out.println("Most played game is "+gameNameMax+" with "+ max+" hours");

                                                  System.out.println();
                                        }
                                        else
                                        {
                                                  System.out.println("Enter 1 game!");
                                        }
                                        
                                        pressEnter(input);
                              }
                              
                              Screen.clear();                                        

                    } while(menu!=4);                                       
          }
} 