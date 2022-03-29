import java.util.Scanner;



class Main {
  public static void main(String[] args) {
    int x=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Wpisz zdanie: ");
    String str = sc.nextLine();
    char tab[]=new char[str.length()];
    for(int i=0;i<str.length();i++)
      {
        tab[i]=str.charAt(i);
        if(Character.isUpperCase(tab[i]))
        {
          tab[i]=Character.toLowerCase(tab[i]);
          x++;
          
        }
        else
        {
          tab[i]=Character.toUpperCase(tab[i]);
          x++;
          
        }
        
      }
    System.out.println("Zdanie po edytowaniu:");
    System.out.println(tab);
    System.out.println("Zliczone zmianny: "+x);
    
    
    
      
    
  }
}