public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual canal está agora? " + smartTv.canal);
        System.out.println("Qaul o volume atual? " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status -> Tv ligada? "+ smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println(smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println(smartTv.canal);
        smartTv.mudarCanal(25);
        System.out.println(smartTv.canal);
    }
}
