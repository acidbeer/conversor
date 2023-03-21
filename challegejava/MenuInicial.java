
package challegejava;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class MenuInicial {
    
    public void Inicio(){
        int op=0;
        String menu="";
        
        menu="";
        menu+="▲▼▲▼▲▼▲▼▲▼ __MENU__ ▼▲▼▲▲▼▲▼▲▼\n\n";
        menu+="****ELIGA LA OPCION INGRESANDO EL VALOR NUMERICO****\n\n";
        menu+="1.-CONVERSOR DE MONEDA $$\n";
        menu+="2.-CONVERSOR DE MASAS ►►\n";
        menu+="3.-! SALIR ¡\n";
            
        
            
        while(op != 3){
            try {
            
                op=Integer.parseInt(JOptionPane.showInputDialog(menu)); 
                    
            } catch (Exception e){
                JOptionPane.showConfirmDialog(null, "!!Ups la opcion que ingresas no es correcta¡¡","ERROR_MESSAGE", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.ERROR_MESSAGE);
            }
            
           
            switch(op){
            case 1:
                ConversorMoneda opcion1= new ConversorMoneda();
                opcion1.conversor1();
                
                break;
            case 2:
                ConversorMasas opcion2= new ConversorMasas();
                opcion2.conversor2();
                
                break;
            
         
            }
        }
           
          JOptionPane.showMessageDialog(null,"_♦PROGRAMA FINALIZADO♦_"); 
        
            
    }

 
    
}
    
