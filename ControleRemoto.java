public class ControleRemoto {
    int canalAtual,volume;

    public ControleRemoto(){
        this.canalAtual = 1;
        this.volume = 10;
    }
    public void aumentar(){
        if (volume == 100){
            System.out.println("O volume esta no maximo");
        } else {
            volume = volume + 1;
            System.out.println("Volume: " + volume);
        }
    }
    public void diminuir(){
        if (volume == 0){
            System.out.println("O volume esta zerado");
        } else {
            volume = volume - 1;
            System.out.println("Volume: " + volume);
        }
    }
    public void trocarCanal(){
        canalAtual = canalAtual + 1;
        System.out.println("Canal: " + canalAtual);
    }
    public void inf(){
        System.out.println("Canal: " + canalAtual);
        System.out.println("Volume: " + volume);
    }
}