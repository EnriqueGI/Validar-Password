
import java.util.Scanner;
public class ValidarPassword
{
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String pass= teclado.next();
        int totalNumeros=0;
        int totalEspecial =0;
         
        for(int i= 0;i<pass.length();i++){
            String l =String.valueOf(pass.charAt(i));
            if(l.matches("\\d*")){
                totalNumeros++;
            }
            if(l.equals("!") || l.equals("@") ||l.equals("#")||l.equals("$")||l.equals("%") ||l.equals("&")||l.equals("*")){
                totalEspecial++;
            }
            
            
        }
          
        if(pass.length()<=6 ||totalNumeros <=1|| totalEspecial<=1){
            System.out.println("Weak");
        }
        else{
             System.out.println("Strong");
        }
        
    }
}