package ar.edu.unahur.obj2.pumpernic;

public abstract class PapasFritas implements CostoFinal {
    public int tamanio;
    public boolean cheddar;
    public boolean bacon;
    public boolean salsaBarbacoa;
    public int precio;

    public PapasFritas() {
        this.cheddar = false;
        this.bacon = false;
        this.salsaBarbacoa = false;
    }

    public int tamanio() {
        return tamanio;
    }

    public boolean tieneCheddar() {
        return cheddar;
    }

    public boolean tieneBacon() {
        return bacon;
    }

    public boolean tieneSalsaBarbacoa() {
        return salsaBarbacoa;
    }

    @Override
    public int costoFinal() {
        if(this.tieneCheddar()) {
            precio += 30;
        }
        if(this.tieneBacon()) {
            precio += 45;
        }
        if(this.tieneSalsaBarbacoa()) {
            precio += 20;
        }
        return precio;
    }
}
