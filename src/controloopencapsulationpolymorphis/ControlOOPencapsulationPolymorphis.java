/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controloopencapsulationpolymorphis;

/**
 *
 * @author Marce
 */
public class ControlOOPencapsulationPolymorphis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ControlRemote c = new ControlRemote();
        
        c.ligar();
        //c.play();
        c.maisVolume();
        c.menosVolume();
        c.menosVolume(); 
        c.abrirMenu();
        
        c.fecharMenu();
        
    }
    
}
