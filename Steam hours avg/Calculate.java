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

          public static double ArraySum(double numbers[])
          {
                    double sum=0;          

                    for (int i=0; i<numbers.length; i++)
                    {
                              sum=numbers[i]+sum;          
                    }

                    return sum;
          }
}