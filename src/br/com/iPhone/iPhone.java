package br.com.iPhone;

public class iPhone implements MusicPlayer, TelephoneDevice, InternetBrowser{
    @Override
    public void playMusic() {
        System.out.println("Tocando uma música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música pausada");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("A música " + music + "está tocando");
    }

    @Override
    public void call(int number) {
        System.out.println("Ligando para o número" + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void showPage() {
        System.out.println("Mostrando uma página web");
    }

    @Override
    public void addTab() {
        System.out.println("Adicionando um nova aba");
    }

    @Override
    public void updatePage() {
        System.out.println("Página atualizada");
    }
}
