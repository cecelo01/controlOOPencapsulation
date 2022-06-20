/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controloopencapsulationpolymorphis;

/**
 *
 * @author Marce
 */
public class ControlRemote implements Controlador{
    // Atributos 
    private int volume;
     private boolean ligado;
     private boolean tocando;
     
     public ControlRemote(){
          this.setVolume(0);
          this.setLigado(false);
          this.setTocando(false);
     }
     
     private int getVolume(){
         return this.volume;
     }
     private void setVolume(int volume){
         this.volume = volume;
     }
     
     private boolean getLigado(){
         return this.ligado;
     }
     private void setLigado(boolean ligado){
         this.ligado = ligado;
     }
     
     private boolean getTocando(){
         return this.tocando;
     }
     private void setTocando(boolean tocando){
         this.tocando = tocando;
     }
     // Metodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        this.setVolume(50);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        
        if (this.getLigado()){
            System.out.println("-----------MENU-----------");
             System.out.println("Esta ligado? "+this.getLigado());
             System.out.println("Esta tocando? "+this.getTocando());
             System.out.print("Volume: "+ this.getVolume());
             if (this.getVolume() > 0){
                 for(int c =0 ; c < this.getVolume(); c += 10){
                     System.out.print(" |");
                 }
             }
        }else{
            System.out.println("Impossivel abrir menu. Controle desligado.");
        }     
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()){
        System.out.println("\n-------Fechando menu-------");
        }else{
            System.out.println("Impossivel fechar menu. Controle desligado.");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        
        if (this.getLigado() && !(this.getTocando()) ){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){}
        this.setTocando(false);
    }
     
}
