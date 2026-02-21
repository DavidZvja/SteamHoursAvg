import java.io.*;
public class SteamHoursAvg
{
          public static void main(String argv[])throws IOException
          {
                    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
                    String buffer;


                    String gamename[];
                    double hours[];
                    
                    int gameamnt;
                    double avgcalc=0;
                    double avg;
                    String again;


                    do
                    {

                              System.out.println("Program to calculate average Playtime in a given number of games.");
                              System.out.println("---------------");

                              //Enter the amount of games to be calculated with

                              do
                              {
                                        System.out.print("How many games would you like to Enter? : ");
                                        buffer=input.readLine();
                                        gameamnt=Integer.parseInt(buffer);

                                        if (gameamnt<=0)
                                        {
                                                  System.out.println("Amount of games has to be atleast 1!");
                                        }
                              } while(gameamnt<=0);

                              Screen.clear();

                              hours=new double[gameamnt];
                              gamename=new String[gameamnt];

                              //Enter the names of the games aswell as the hours played

                              for (int i=0; i<gameamnt; i++)
                              {
                                        System.out.print("Name of "+(i+1)+". Game: ");
                                        gamename[i]=input.readLine();                                       
                                        do
                                        {
                                                  System.out.print("Amount of hours in "+(i+1)+". Game: ");
                                                  buffer=input.readLine();
                                                  hours[i]=Double.parseDouble(buffer);

                                                  Screen.clear();
          
                                                  if(hours[i]<0)
                                                  {
                                                            System.out.println("How could you have negative hours?!");
                                                  }
                                        } while (hours[i]<0);          
                              }
                              
                              //calculation of average
                                        
                              avg=Calculate.ArrayAvg(hours);
                              
                              Screen.clear();

                              //displaying the results

                              System.out.println("Your average hours of the games: ");
                              System.out.println();
                    
                              for (int i=0; i<gameamnt; i++)
                              {
                                        System.out.println((i+1)+". "+gamename[i]+ "| Hours played: "+ hours[i]);
                                        System.out.println();
                              }

                              System.out.println("is: "+avg+ " Hours.");

                              avgcalc=0;

                              System.out.println();

                              //restart?
                              
                              System.out.println("Enter y to restart program.");
                              System.out.println();
                              again=input.readLine();

                              Screen.clear();                              
 
                    } while (again.equals("y") || again.equals("Y"));                                                      
          }
} 