package ar.edu.unahur.obj2.pumpernic;

public class PapasFritas implements CostoFinal {
    public int tamanio;
    public boolean cheddar;
    public boolean bacon;
    public boolean salsaBarbacoa;
    public int precio;

    public PapasFritas() {
        this.tamanio = 1;
        this.cheddar = false;
        this.bacon = false;
        this.salsaBarbacoa = false;
        this.precio = 10;
    }

    public int tamanio() {
        return tamanio;
    }

    public void agrandarPapas() {
        if(tamanio != 3) {
            tamanio += 1;
        }
    }

    public void reducirPapas() {
        if(tamanio != 1) {
            tamanio -= 1;
        }
    }

    public void agregarCheddar() {
        cheddar = true;
    }

    public void agregarBacon() {
        bacon = true;
    }

    public void agregarSalsaBarbacoa() {
        salsaBarbacoa = true;
    }

    public void quitarCheddar() {
        cheddar = false;
    }

    public void quitarBacon() {
        bacon = false;
    }

    public void quitarSalsaBarbacoa() {
        salsaBarbacoa = false;
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
        if(this.tamanio() != 1) {
            precio += 5*(this.tamanio()-1);
        }
        return precio;
    }
}
