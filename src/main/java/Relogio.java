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
}
