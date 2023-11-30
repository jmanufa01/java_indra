package domain;

import java.util.List;

public class Empleado {
    private String nombre;
    private Posicion posicion;
    private double salario;
    private Horario horario;

    public Empleado(String nombre, Posicion posicion, double salario, Horario horario) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.horario = horario;
    }

    public void calcularInfraccion() {
        switch (this.posicion) {
            case CEO -> {
                if (this.horario.getIngreso() >= 7 && this.horario.getRegreso() < 18) {
                    this.salario = this.salario - (this.salario *0.01);
                }
            }
            case JEFE -> {
                if (this.horario.getIngreso() >= 8 && this.horario.getRegreso() < 18) {
                    this.salario = this.salario - (this.salario * 0.05);
                }
            }
            case INGENIERO -> {
                if (this.horario.getIngreso() >= 9 && this.horario.getRegreso() < 18) {
                    this.salario = this.salario - (this.salario * 0.15);
                }
            }
            case ANALISTA -> {
                if (this.horario.getIngreso() >= 9 && this.horario.getRegreso() < 17) {
                    this.salario = this.salario - (this.salario * 0.20);
                }
            }
            case SCRUM_MASTER -> {
                if (this.horario.getIngreso() >= 9 && this.horario.getRegreso() < 18) {
                    this.salario = this.salario - (this.salario* 0.1);
                }
            }
            case RRHH -> {
                if (this.horario.getIngreso() >= 9 && this.horario.getRegreso() < 18) {
                    this.salario = this.salario * (this.salario * 0.09);
                }
            }
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre +
                "\nPosicion=" + posicion.name() +
                "\nSalario=" + salario +
                "\nHorario=" + horario.toString() +
                '\n';
    }
}
