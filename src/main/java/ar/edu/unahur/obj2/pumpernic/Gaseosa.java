package ar.edu.unahur.obj2.pumpernic;

public class Gaseosa implements CostoFinal {
    public int precio;

    public Gaseosa() {
        this.precio = 40;
    }

    @Override
    public int costoFinal() {
        return precio;
    }
}
