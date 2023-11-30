package domain;

public class Horario {
    private int ingreso;
    private int regreso;

    public Horario(int ingreso, int regreso) {
        this.ingreso = ingreso;
        this.regreso = regreso;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getRegreso() {
        return regreso;
    }

    public void setRegreso(int regreso) {
        this.regreso = regreso;
    }

    @Override
    public String toString() {
        return "Ingreso=" + ingreso +
                "\nRegreso=" + regreso +
                '\n';
    }
}
