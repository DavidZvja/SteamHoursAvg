import java.util.ArrayList;
public class Calculate
{
          public static double ArrayListAvg(ArrayList<Double> numbers)
          {
                    double avg=0;

                    for (int i=0; i<numbers.size(); i++)
                              {
                                        avg=numbers.get(i)+avg;
                              }
                     
                    avg=avg/numbers.size();
      
                    return avg;                    
          }

          public static double ArrayListSum(ArrayList<Double> numbers)
          {
                    double sum=0;          

                    for (int i=0; i<numbers.size(); i++)
                    {
                              sum=numbers.get(i)+sum;          
                    }

                    return sum;
          }

          public static double ArrayListMin(ArrayList<Double> numbers)
          {
                    double min=numbers.get(0);
                    
                    for (int i=0; i<numbers.size(); i++)
                    {

                              if (numbers.get(i)<min)
                              {
                                        min=numbers.get(i);
                              }                        
                    }
          
                    return min;
          }

          public static double ArrayListMax(ArrayList<Double> numbers)
          {
                    double max=numbers.get(0);
                    
                    for (int i=0; i<numbers.size(); i++)
                    {
                              if (numbers.get(i)>max)
                              {
                                        max=numbers.get(i);
                              }
                    }
                    return max;
          }
}