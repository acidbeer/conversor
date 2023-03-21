
package challegejava;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author usuario
 */
public class ConversorMoneda  extends MenuInicial{
   
    
    public void conversor1(){
        DecimalFormat df=new DecimalFormat("#.000");
        DecimalFormat Yn=new DecimalFormat("#.00");
        
        
         Object [] conversor={"De Dolar a Pesos Colombianos","De Euros a Pesos Colombianos","De Libras Esterlinas a Pesos Colombianos",
         "De yen Japones a Pesos Colombianos","De Won sul-coreano a Pesos Colombianos","De Pesos Colombianos a Dolar",
         "De Pesos Colombianos a Euro","De Pesos Colombianos a Libras Esterlinas","De Pesos Colombianos a Yen Japones",
         "De Pesos Colombianos a Won sul-coreano"};    
        
         Object opciones= JOptionPane.showInputDialog(null,"Elige una Opcion","$ CONVERSOR DE MODEDA $",
         JOptionPane.QUESTION_MESSAGE,null,conversor,conversor[0]);
        
        try {
            if(opciones==conversor[0]){
            
            double dolar=Double.parseDouble(JOptionPane.showInputDialog("DOLAR US$  a PESOS COL$ \n"+
                    "Ingresa el valor en dolares con un punto decimal: $"));
            double valorPcolActual=4.72343;
            double conversionPesos=dolar*valorPcolActual;
            JOptionPane.showMessageDialog(null,"US$"+dolar+" DOLARES Son: COL$"+df.format(conversionPesos)+" PESOS COLOMBIANOS");
            
           //menu retorno
            MenuRetorno();      
           
         }
         if(opciones==conversor[1]){
      
            double euro=Double.parseDouble(JOptionPane.showInputDialog("EUROS € a PESOS COL$\n"+
                    "Ingresa el valor del Euro con punto decimal: €"));
            double valorEuroActual= 5.00379;
            double conversionPesos=euro*valorEuroActual;
            JOptionPane.showMessageDialog(null,"€"+euro+" EUROS  Son: $"+df.format(conversionPesos)+" PESOS COLOMBIANOS");
            
            //Menu Retorno
            MenuRetorno();
        }
        if(opciones==conversor[2]){
           double LibraEs=Double.parseDouble(JOptionPane.showInputDialog("LIBRA ESTERLINA £ a PESOS COL$\n"+
                   "Ingresa el valor de Libra Esterlina: £"));
           double valorLeActual=5.74863;
           double conversionPesos=LibraEs*valorLeActual;
           JOptionPane.showMessageDialog(null,"£"+LibraEs+" Libra Esterlina  Son: $"+df.format(conversionPesos)+" PESOS COLOMBIANOS");
           
           //Menu Retorno
            MenuRetorno();
        }
        if(opciones==conversor[3]){
            double YenJapones=Double.parseDouble(JOptionPane.showInputDialog("YEN JAPONES ¥ a PESOS COL$\n"+
                    "Ingresa el valor de Yen Japones: ¥"));
            double ValorYenJActual=00035.24;
            double conversionPesos=YenJapones*ValorYenJActual;
            JOptionPane.showMessageDialog(null,"¥"+YenJapones+" Yen Japones  Son: $"+Yn.format(conversionPesos)+" PESOS COLOMBIANOS");
            
            //Menu Retorno
            MenuRetorno();
        }
        if(opciones==conversor[4]){
           double WonsCoreano=Double.parseDouble(JOptionPane.showInputDialog("WON SUL-COREANO ₩ a PESOS COL$\n"+
                   "Ingresa el valor de Won sul-coreano: ₩"));
           double valorWcActual=0003.61;
           double conversionPesos=WonsCoreano*valorWcActual;
           JOptionPane.showMessageDialog(null,"₩"+WonsCoreano+" won sul-coreano  Son: $"+Yn.format(conversionPesos)+" PESOS COLOMBIANOS");
           
           //Menu Retorno
           MenuRetorno();
        }
        if(opciones==conversor[5]){
            double PesosC=Double.parseDouble(JOptionPane.showInputDialog("PESOS COL$ a DOLAR US$\n"+
                    "Ingresa el valor en Pesos Colombianos sin punto decimal: $"));
            double valorActualD=0.00021;
            double conversionDolares=PesosC*valorActualD;
            JOptionPane.showMessageDialog(null,"$"+PesosC+" Pesos Colombianos son: US $"+Yn.format(conversionDolares)+" DOLARES");
            
            //Menu Retorno
           MenuRetorno();
        }
        if(opciones==conversor[6]){
           double PesosC=Double.parseDouble(JOptionPane.showInputDialog("PESOS COL$ a EUROS €\n"+
                   "Ingresa el valor en Pesos Colombianos sin punto decimal: $"));
           double valorActualE=0.00020;
           double conversionEuros=PesosC*valorActualE;
           JOptionPane.showMessageDialog(null,"$"+PesosC+" Pesos Colombianos son: US $"+Yn.format(conversionEuros)+" Euros");
           MenuRetorno();
        }
        
        if(opciones==conversor[7]){
           double PesosC=Double.parseDouble(JOptionPane.showInputDialog("PESOS COL$ a LIBRA ESTERLINA £\n"+
                   "Ingresa el valor en Pesos Colombianos Sin punto decimal: $"));
           double valorActualL=0.00017;
           double conversionLibrasE=PesosC*valorActualL; 
           JOptionPane.showMessageDialog(null,"$"+PesosC+" Pesos Colombianos son: US $"+Yn.format(conversionLibrasE)+" LIBRAS ESTERLINAS"); 
           
           MenuRetorno();
        }
        
        if(opciones==conversor[8]){
           double PesosC=Double.parseDouble(JOptionPane.showInputDialog("PESOS COL$ a YEN JAPONES ¥\n"+
                   "Ingresa el valor en Pesos Colombianos sin punto decimal: $"));
           double valorActualY=0.028;
           double conversionYenJ=PesosC*valorActualY;
           JOptionPane.showMessageDialog(null,"$"+PesosC+" Pesos Colombianos son: US $"+Yn.format(conversionYenJ)+" YEN JAPONES");
           MenuRetorno();
        }
        
        if(opciones==conversor[9]){
           double PesosC=Double.parseDouble(JOptionPane.showInputDialog("PESOS COL$ a WON SUL-COREANO ₩\n"+
                   "Ingresa el valor en Pesos Colombianos sin punto decimal: $"));
           double valorActualW=0.27;
           double conversionWc=PesosC*valorActualW;
           JOptionPane.showMessageDialog(null,"$"+PesosC+" Pesos Colombianos son: US $"+Yn.format(conversionWc)+" WON SUL-COREANO");
           MenuRetorno();
        }
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "!!Ups la opcion que ingresas no es Numerica ¡¡","ERROR_MESSAGE", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.ERROR_MESSAGE);
        }
              
       
                
        
    }
    public void MenuRetorno(){
       int respuesta=JOptionPane.showConfirmDialog(null, "DESEA CONTINUAR CON EL CONVERSOR","YES_NO_OPTION", JOptionPane.YES_NO_OPTION,
           JOptionPane.INFORMATION_MESSAGE);
           if(respuesta==0){
               conversor1();
           }
           else if(respuesta == 1){
               JOptionPane.showMessageDialog(null,"___FIN DEL MENU___");
               
           }   
    }
    
    
    
}

