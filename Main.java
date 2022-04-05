import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    char znak;
    //System.out.println(znak);
  //  char[] slowo={'A','d','a','m'};
    String zdanie;
    
    System.out.println("Podaj jakieś zdanie");
    zdanie=myObj.nextLine();
       
    int rozmiar=zdanie.length();
    char slowo[]=new char[rozmiar];
    for(int i=0;i<rozmiar;i++)
      slowo[i]=zdanie.charAt(i);
    int zmiana=0;
    int liczbowo;
   for (int i=0;i<rozmiar;i++)
      {
        liczbowo=slowo[i];
        if(liczbowo>64&& liczbowo<91)
        {
          liczbowo=liczbowo+32;
          znak=(char)liczbowo;
          slowo[i]=znak;
          zmiana++;
        }else if(liczbowo==32)
        {
          liczbowo=95;
          znak=(char)liczbowo;
          slowo[i]=znak;
          zmiana++;
        }else
        {
          liczbowo=liczbowo-32;
          znak=(char)liczbowo;
          slowo[i]=znak;
          zmiana++;
        }
      }
    for (int i=0;i<rozmiar;i++)
      {
        System.out.print(slowo[i]);
      }
    
    System.out.println();
    System.out.print("Liczba zastosowanych zmian: "+zmiana);
    System.out.println();
    System.out.println("Liczba znaków w tablicy: "+rozmiar);
  }
}