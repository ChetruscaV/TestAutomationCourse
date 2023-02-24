package topic3;



public class Operations {

      static void printAritmeticOperations() {
         int num1=84;
         double num2= 24.2;

         System.out.println("Suma numerelor va fi egala cu  " + (num1+num2) );
         System.out.println("Diferenta numerelor va fi egala cu " + (num1-num2));
         System.out.println("Produsul numerelor va fi egal cu " + (num1*num2));
         System.out.println("Citul numerelor va fi egal cu " + (num1/num2));
         System.out.println("Restul impartirii numerelor va fi egal cu " + (num1%num2));
         System.out.println("Daca incrementam primul numar vom obtine " + (++num1));
         System.out.println("Daca decrementam al doilea numar vom obtine " + (--num2));

      };
      static void printLogicOperations(){
          int pretMere=17;
          int pretMango=73;
          int pretZemos=68;

          System.out.println("Merele sunt mai scumpe decit mango si zemos? " + ((pretMere>pretMango)&&(pretMere>pretZemos)));
          System.out.println("Cu 50 de lei pot sa procur vreun tip de fructe ? " + ((50>pretMere)||(50>pretMango)||(50>pretZemos)));
          System.out.println("Preturile dunt diferite ? " + !(pretMango==pretMere));

      }
      static void printRelationarOperations(){
          double inaltime=25.6;
          double latime=33.4;
          double lungime=12;

          System.out.println("Lungimea este egala cu latimea ? :" + (lungime==latime));
          System.out.println("Inaltimea nu este egala cu lungimea ? :" + (inaltime!=lungime));
          System.out.println("Lungimea este mai mica decit latimea ? :" + (lungime<latime));
          System.out.println("Inaltimea este mai mare decit lungimea ? : " + (inaltime>lungime));
          System.out.println("Este latimea mai mica sau egala decit inaltimea ? :" + (latime<=inaltime));
          System.out.println("Este latimea mai mare sau egala decit inaltimea ? :"  + (latime>=inaltime));
      }

      static void useForAndWhile(){
          for(int i=1;i<5;i++){
              System.out.println( i + " . O brad frumos!!!");
          }

          int x=6;
          while (x<10){
              x++;
              System.out.println( "Numarul este " + x);
          }
      }

}
