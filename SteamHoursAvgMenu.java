import java.io.*;
import java.util.ArrayList;
public class SteamHoursAvgMenu
{
          private static void pressEnter(BufferedReader input) throws IOException
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
                    
                    double avg;
                    double sum;
                    double min;
                    double max;
                    int menu;
                    boolean failCheck=false;
                          
                    System.out.println("Program to calculate average playtime in a given number of games.");
                    System.out.println("---------------");

                    do
                    {         
                              do
                              {        
                                        System.out.println("1. Enter a game");
                                        System.out.println("2. Display results");
                                        System.out.println("3. Exit");
                                                                     
                                        System.out.println();
                                        
                                        System.out.print("Choose: ");
                                        buffer=input.readLine();
                                        menu=Integer.parseInt(buffer);

                                        if (menu==1 || menu==3)
                                        {
                                                  failCheck=true;
                                        }

                                        if (failCheck==false)
                                        {
                                                  Screen.clear();
                                                  System.out.println("Enter atleast 1 game.");      
                                                  pressEnter(input);
                                                  Screen.clear();
                                        }
                              } while (failCheck==false);  

                              Screen.clear();
                              
                              if (menu==1)
                              {
                                        System.out.print("Type in name of game: ");
                                        gameNameEnter=input.readLine();

                                        gameName.add(gameNameEnter);

                                        do
                                        {
                                                  System.out.print("Type in playtime of game: ");
                                                  buffer=input.readLine();
                                                  gameHoursEnter=Double.parseDouble(buffer);

                                                  if (gameHoursEnter<0)
                                                  {
                                                            System.out.println("Hours played cannot be negative.");
                                                            pressEnter(input);
                                                            Screen.clear();
                                                  }
                                        } while(gameHoursEnter<0);

                                        gameHours.add(gameHoursEnter);
                              }

                              Screen.clear();
                              
                              if (menu==2)
                              {
                                        
                                        avg=Calculate.ArrayListAvg(gameHours);
                                        sum=Calculate.ArrayListSum(gameHours);
                                        min=Calculate.ArrayListMin(gameHours);
                                        max=Calculate.ArrayListMax(gameHours);

                                        System.out.println("Results: ");
                                        System.out.println("-----------");

                                        System.out.println("Average Playtime: "+avg);
                                        System.out.println("Sum of all hours played: "+sum);
                                        System.out.println("Least played game: "+min);
                                        System.out.println("Most played game: "+max);

                                        System.out.println();
                                        
                                        pressEnter(input);
                              }
                              
                              Screen.clear();                                        

                    } while(menu!=3);                                       
          }
} 