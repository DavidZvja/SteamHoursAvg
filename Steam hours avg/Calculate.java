public class Calculate
{
          public static double ArrayAvg(double numbers[])
          {
                    double avg=0;

                    for (int i=0; i<numbers.length; i++)
                              {
                                        avg=numbers[i]+avg;
                              }
                     
                    avg=avg/numbers.length;
      
                    return avg;                    
          }
}