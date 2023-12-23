

// Print multipication of its digits

  class Multipication{

          public static void main(String[]ang){

                  int N=765;
                  int mul=1;

                  while(N!=0){

                  int rem=N%10;
                  mul=mul*rem;

                  N=N/10;
          }

          System.out.println(N);
          System.out.println(mul);

          }
  }
