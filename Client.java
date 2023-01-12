package FacadeDesign;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		
		Shopkeeper obj=new Shopkeeper();
		int objj;
		
		do {
			System.out.println("Mobile SHop");
			   System.out.print("            1. IPHONE.              \n");  
	            System.out.print("            2. SAMSUNG.              \n");  
	            System.out.print("            3. BLACKBERRY.            \n");  
	            System.out.print("            4. Exit.                     \n");  
	            System.out.print("Enter your choice: ");  
	            
	           objj=ob.nextInt();
	           
	           
	           switch (objj) {  
	            case 1: 
	                  obj.iphoneSale();  
	                     
	                break;  
	       case 2:    obj.samsungSale(); 
	                      
	                break;    
	       case 3:obj.blackBerrySale()   ;   
	                            
	                   break;     
	            default:  
	             
	                System.out.println("Nothing You purchased");  
	          
	                return;  
	            }  
			
		}while(objj!=4);

	}

}
