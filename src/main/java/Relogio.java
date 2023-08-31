package main.java;

public class Relogio {
	private int hora;
    private int minuto;
    private int segundo;

    public Relogio() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public String obterHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
    
    public void reiniciarParaMeiaNoite() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    
    public String obterHoraFormato24h() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public String obterHoraFormatoAMPM() {
        String periodo = (hora < 12) ? "AM" : "PM";
        int horaFormato12h = (hora == 0 || hora == 12) ? 12 : hora % 12;
        return String.format("%02d:%02d:%02d %s", horaFormato12h, minuto, segundo, periodo);
    }
    
    private int horaInicio;
    private int minutoInicio;
    private int segundoInicio;
    private boolean marcacaoIniciada;

    public void iniciarMarcacao() {
        horaInicio = hora;
        minutoInicio = minuto;
        segundoInicio = segundo;
        marcacaoIniciada = true;
    }

    public void avancarTempo(int horas, int minutos, int segundos) {
        if (marcacaoIniciada) {
            int totalSegundosInicio = horaInicio * 3600 + minutoInicio * 60 + segundoInicio;
            int totalSegundosAvanco = horas * 3600 + minutos * 60 + segundos;
            int totalSegundosDecorridos = totalSegundosInicio + totalSegundosAvanco;
            
            hora = totalSegundosDecorridos / 3600;
            minuto = (totalSegundosDecorridos % 3600) / 60;
            segundo = totalSegundosDecorridos % 60;
        }
    }

    public String obterTempoDecorrido() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
