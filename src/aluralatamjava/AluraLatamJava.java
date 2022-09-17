
package aluralatamjava;

import javax.swing.JOptionPane;

public class AluraLatamJava {

   
    public static void main(String[] args) {
       Divisas obj= new Divisas();
        int menu;
        double user=0;
        double total=0;
        int select=0;
        
        do{
            menu=Integer.parseInt(JOptionPane.showInputDialog("Menu del convertidor de divisas\n"
            +"1: Convertir Colones a Dolares\n"
            +"2: Convertir Colones a Euros\n"
            +"3: Convertir Colones a Libras esterlinas\n"
            +"4: Convertir Colones a Yen Japonés\n"
            +"5: Convertir Colones a Won sul'coreano\n"
            +"6: Salir"));
            
            switch(menu){
                case 1:
                    user=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los colones"));
                    total= user*obj.ColaDol;
                   JOptionPane.showMessageDialog(null,+user+" Colones"+ " Equivalen a: "+total+ " En Dolares");
                   select=Integer.parseInt(JOptionPane.showInputDialog("Desea realizar la conversión en Dolares a Colones?\n"
                           + "1-Si\n"
                           + "2-No"));
                   if(select==1){
                  user=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los Dolares"));

                       total= user*obj.DolaCol;
                                  JOptionPane.showMessageDialog(null,+user+" Dolares"+ " Equivalen a: "+total+ " En Colones");

                   }if(select==2){
                       break;
                   }
                   break;
                   
                   case 2:
            user=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los colones"));
                    total= user*obj.ColaEur;
                   JOptionPane.showMessageDialog(null,+user+" Colones"+ " Equivalen a: "+total+ " En Euros");
                   select=Integer.parseInt(JOptionPane.showInputDialog("Desea realizar la conversión en Euros a Colones?\n"
                           + "1-Si\n"
                           + "2-No"));
                   if(select==1){
                    user=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los Euros"));

                       total= user*obj.EuraCol;
                                  JOptionPane.showMessageDialog(null,+user+" Euros"+ " Equivalen a: "+total+ " En Colones");
                   }if(select==2){
                       break;
                   }
            break;
            case 3:
            user=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los colones"));
                    total= user*obj.ColaLib;
                   JOptionPane.showMessageDialog(null,+user+" Colones"+ " Equivalen a: "+total+ " En Libras esterlinas");
                   select=Integer.parseInt(JOptionPane.showInputDialog("Desea realizar la conversión en Libras Esterlinas a Colones?\n"
                           + "1-Si\n"
                           + "2-No"));
                   if(select==1){
                    user=Double.parseDouble(JOptionPane.showInputDialog("Ingrese las Libras Esterlinas"));

                       total= user*obj.LibaCol;
                                  JOptionPane.showMessageDialog(null,+user+" Libras Esterlinas"+ " Equivalen a: "+total+ " En Colones");
                   }if(select==2){
                       break;
                   }
            break;
            case 4:
            user=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los colones"));
                    total= user*obj.ColaYen;
                   JOptionPane.showMessageDialog(null,+user+" Colones"+ " Equivalen a: "+total+ " En Yen Japonés");
                   select=Integer.parseInt(JOptionPane.showInputDialog("Desea realizar la conversión en Yen a Colones?\n"
                           + "1-Si\n"
                           + "2-No"));
                   if(select==1){
                    user=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los Yenes"));

                       total= user*obj.YenaCol;
                                  JOptionPane.showMessageDialog(null,+user+" Yenes"+ " Equivalen a: "+total+ " En Colones");
                   }if(select==2){
                       break;
                   }
            break;
            case 5:
                user=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los colones"));
                    total= user*obj.ColaWonsul;
                   JOptionPane.showMessageDialog(null,+user+" Colones"+ " Equivalen a: "+total+ " En Won sul coreano");
                   select=Integer.parseInt(JOptionPane.showInputDialog("Desea realizar la conversión en Won a Colones?\n"
                           + "1-Si\n"
                           + "2-No"));
                   if(select==1){
                    user=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los Wons"));

                       total= user*obj.WonsulaCol;
                                  JOptionPane.showMessageDialog(null,+user+" Wons"+ " Equivalen a: "+total+ " En Colones");
                   }if(select==2){
                       break;
                   }
            
            break;
        }       
        }while(menu!=6);
        
    }
        
        
    }
    
