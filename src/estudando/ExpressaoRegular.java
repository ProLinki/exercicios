package estudando;

public class ExpressaoRegular {

    public static void main(String[] args) {
      
        Boolean b = "Java".matches("java");
        System.out.println(b);
    
        b = "Java".matches("(?im)java");
        System.out.println(b);
    
        b = "@".matches(".");
        System.out.println(b);
        
        b = "5".matches("\\d");
        System.out.println(b);
    
        b = "f".matches("\\w");
        System.out.println(b);
        
        b = " ".matches("\\s");
        System.out.println(b);
        
        
        
    }

}
