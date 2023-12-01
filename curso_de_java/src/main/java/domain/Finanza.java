package domain;

public class Finanza {
    private String tituloPelicula;
    private int cantidadEspectadores;
    private int cantidadSalas;
    private int gananciaBruta;
    private double gananciaNeta;

    public Finanza(String tituloPelicula, int cantidadEspectadores, int cantidadSalas) {
        this.tituloPelicula = tituloPelicula;
        this.cantidadEspectadores = cantidadEspectadores;
        this.cantidadSalas = cantidadSalas;
        this.calcularGananciaBruta();
        this.calcularGananciaNeta();
    }

    public void calcularGananciaBruta() {
        this.gananciaBruta = this.cantidadEspectadores * this.cantidadSalas;
    }

    public void calcularGananciaNeta() {
        this.gananciaNeta = this.gananciaBruta * 0.8;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public int getCantidadEspectadores() {
        return cantidadEspectadores;
    }

    public void setCantidadEspectadores(int cantidadEspectadores) {
        this.cantidadEspectadores = cantidadEspectadores;
    }

    public int getCantidadSalas() {
        return cantidadSalas;
    }

    public void setCantidadSalas(int cantidadSalas) {
        this.cantidadSalas = cantidadSalas;
    }

    public int getGananciaBruta() {
        return gananciaBruta;
    }

    public void setGananciaBruta(int gananciaBruta) {
        this.gananciaBruta = gananciaBruta;
    }

    public double getGananciaNeta() {
        return gananciaNeta;
    }

    public void setGananciaNeta(double gananciaNeta) {
        this.gananciaNeta = gananciaNeta;
    }

    @Override
    public String toString() {
        return  "TituloPelicula=" + tituloPelicula + '\\' +
                "\nCantidadEspectadores=" + cantidadEspectadores + '\\' +
                "\nCantidadSalas=" + cantidadSalas + '\\' +
                "\nGananciaBruta=" + gananciaBruta + '\\' +
                "\nGananciaNeta=" + gananciaNeta;
    }
}
