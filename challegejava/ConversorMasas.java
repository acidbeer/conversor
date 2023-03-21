
package challegejava;

import javax.swing.JOptionPane;


public class ConversorMasas extends MenuInicial{
    
    
    public void conversor2(){
        
       
         Object [] conversor={"De Libra a Kilogramo","De Gramo a Kilogramo","De KiloNewton a Tonelada","De Hectogramo a Decagram",
               "De Gramo a Quilate","De Kilogramo a Libra","De Kilogramo a Gramo","De Tonelada a KiloNewton","De Decagram a Hectogramo",
               "De Quilate a Gramo"};
         
         Object opciones= JOptionPane.showInputDialog(null,"Elige una Opcion","◄♦♦♦►CONVERSOR DE MASAS◄♦♦♦►",
         JOptionPane.QUESTION_MESSAGE,null,conversor,conversor[0]);
         
         try {
             if(opciones==conversor[0]){
           double libra=Double.parseDouble(JOptionPane.showInputDialog("Libras (lb) a Kilogramos (kg)\n"+
                   "Ingresa el valor en libras (lb): "));
           double valor=0.45;
           double ConversorL=libra*valor;
           JOptionPane.showMessageDialog(null,libra+" (lb) Libras son: "+ConversorL+"(kg) Kilogramos");
           
           MenuRetorno();
         }
         
         if(opciones==conversor[1]){
            double gramo=Double.parseDouble(JOptionPane.showInputDialog("Gramao (g) a Kilogramos (kg)\n"+
                   "Ingresa el valor en Gramos (g): "));
           double valor=0.001;
           double ConversorG=gramo*valor;
           JOptionPane.showMessageDialog(null,gramo+" (g) Gramos son: "+ConversorG+" (kg) Kilogramos");
           
           MenuRetorno();
         }
         
         if(opciones==conversor[2]){
            double kiloN=Double.parseDouble(JOptionPane.showInputDialog("KiloNewton (kN) a Tonelada (t)\n"+
                   "Ingresa el valor en KiloNewton (kN): "));
            double valor=0.1;
            double ConversorKn=kiloN*valor;
            JOptionPane.showMessageDialog(null,kiloN+" (kN) KiloNewton son: "+ConversorKn+" (t) Kilogramos");
           
            MenuRetorno();
         }
         
         if(opciones==conversor[3]){
            int hectoG=Integer.parseInt(JOptionPane.showInputDialog("HectoGramo (hg) a DecaGram (dag)\n"+
                   "Ingresa el valor en HectoGramo (hg): "));
            int valor=10;
            int ConversorHg=hectoG*valor;
            JOptionPane.showMessageDialog(null,hectoG+" (hg) HectoGramo son: "+ConversorHg+" (dag) DecaGram");
           
            MenuRetorno();
         }
         
         if(opciones==conversor[4]){
             int gramo=Integer.parseInt(JOptionPane.showInputDialog("Gramo (g) a Quilate (karat)\n"+
                   "Ingresa el valor en Gramo (g): "));
             int valor=5;
             int ConversorQ=gramo*valor;
             JOptionPane.showMessageDialog(null,gramo+" (g) Gramo son: "+ConversorQ+" (karat) Quilates");
           
             MenuRetorno();
         }
         
         if(opciones==conversor[5]){
             int kilogramo=Integer.parseInt(JOptionPane.showInputDialog("Kilogramo (kg) a Libra (lb)\n"+
                   "Ingresa el valor en Kilogramo (kg): "));
             int valor=2;
             int ConversorK=kilogramo*valor;
             JOptionPane.showMessageDialog(null,kilogramo+" (kg) Kilogramo son: "+ConversorK+" (lb) Libras");
           
             MenuRetorno();
         }
         
         if(opciones==conversor[6]){
             int kilogramo=Integer.parseInt(JOptionPane.showInputDialog("Kilogramo (kg) a Gramo (g)\n"+
                   "Ingresa el valor en Kilogramo (kg): "));
             int valor=1000;
             int ConversorG=kilogramo*valor;
             JOptionPane.showMessageDialog(null,kilogramo+" (kg) Kilogramo son: "+ConversorG+" (g) Gramos");
           
             MenuRetorno();
             
         }
         
         if(opciones==conversor[7]){
             int tonelada=Integer.parseInt(JOptionPane.showInputDialog("Tonelada (t) a KiloNewton (kN)\n"+
                   "Ingresa el valor en Toneladas (t): "));
             int valor=10;
             int ConversorKN=tonelada*valor;
             JOptionPane.showMessageDialog(null,tonelada+" (t) Tonelada son: "+ConversorKN+" (kN) KiloNewton");
           
             MenuRetorno();
         }
         
         if(opciones==conversor[8]){
             int decagram=Integer.parseInt(JOptionPane.showInputDialog("Decagram (dag) a Hectogramo (hg)\n"+
                   "Ingrersa el valor en Decagram (dag): "));
             double valor=0.1;
             double ConversorH=decagram*valor;
             JOptionPane.showMessageDialog(null,decagram+" (dag) Decagram son: "+ConversorH+" (hg) HectoGramos");
           
             MenuRetorno();
         }
         
         if(opciones==conversor[9]){
              int quilate=Integer.parseInt(JOptionPane.showInputDialog("Quilate (karat) a Gramo (g)\n"+
                     "Ingresa el valor en Quilates (karat): "));
             double valor=0.2;
             double ConversorQ=quilate*valor;
             JOptionPane.showMessageDialog(null,quilate+" (karat) Quilates son: "+ConversorQ+" (g) Gramos");
           
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
               conversor2();
           }
           else if(respuesta == 1){
               
               JOptionPane.showMessageDialog(null,"___FIN DEL MENU___");
                 
           }   
    }
    
}
