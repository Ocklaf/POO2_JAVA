package usoastros;

public class Satelite extends Astros {

    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    private Planeta suPlaneta;

    public Satelite(String nombre, double distanciaAlPlaneta, double orbitaPlanetaria, double radioEcuatorial, double periodoRotacion, double masa, double temperaturaMedia, double gravedad, Planeta suPlaneta) {
        super(nombre, radioEcuatorial, periodoRotacion, masa, temperaturaMedia, gravedad);

        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.suPlaneta = suPlaneta;
    }

    @Override
    public void muestra() {
        System.out.println("");
        System.out.println("Nombre del satélite: " + super.getNombre());
        System.out.println("Distancia al Planeta: " + this.distanciaAlPlaneta + " km");
        System.out.println("Orbita planetaria: " + this.orbitaPlanetaria + " días");
        System.out.println("Pertenece al planeta: " + this.suPlaneta.getNombre());
        System.out.println("Radio ecuatorial: " + super.getRadio() + " km");
        System.out.println("Período de rotación: " + super.getPeriodo() + " horas");
        System.out.println("Masa del planeta: " + super.getMasa() + " Gigatoneladas");
        System.out.println("Temperatura media del planeta: " + super.getTemperatura() + " Grados Celsius");
        System.out.println("Gravedad: " + super.getGravedad() + " m/s");
    }
}
