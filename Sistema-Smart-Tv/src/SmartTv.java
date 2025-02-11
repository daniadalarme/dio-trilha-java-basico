public class SmartTv {
    boolean ligada= false;
    int canal= 1;
    int volume= 25;

    //metodos que manipulam os estagios
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++; //volume = volume = 1;
        System.out.println("Aumentando o volume para: " + volume);
        
    }
    public void diminuirVolume(){
        volume--; //volume = volume = -1;
        System.out.println("diminuindo o volume para: " + volume);
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
        System.out.println("Subindo canal para: " + canal);
    }
    public void descerCanal(){
        canal--;
        System.out.println("Descendo canal para: " + canal);
    }

}