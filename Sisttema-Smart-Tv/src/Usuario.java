public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar ();

        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar ();

        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume(); //24 volume
        smartTv.diminuirVolume(); //23 volume
        smartTv.diminuirVolume(); //22 volume
        smartTv.aumentarVolume(); //23 volume

        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal (13);
        System.out.println("Canal Atual " + smartTv.canal);

        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.descerCanal();

        System.out.println("Canal Atual " + smartTv.canal);



    }
}
