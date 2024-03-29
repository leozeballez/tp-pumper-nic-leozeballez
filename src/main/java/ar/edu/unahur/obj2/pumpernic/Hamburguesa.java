package ar.edu.unahur.obj2.pumpernic;

public abstract class Hamburguesa implements CostoFinal {
    public int medallon = 1;
    public boolean lechuga = true;
    public boolean tomate = true;
    public boolean quesoAzul = false;
    public boolean bacon = false;
    public boolean huevo = false;
    public boolean mollejas = false;
    public boolean cebollasCaramelizadas = false;
    public int precio;

    public boolean tieneQuesoAzul() {
        return quesoAzul;
    }

    public boolean tieneBacon() {
        return bacon;
    }

    public boolean tieneHuevo() {
        return huevo;
    }

    public boolean tieneMollejas() {
        return mollejas;
    }

    public boolean tieneCebollasCaramelizadas() {
        return cebollasCaramelizadas;
    }

    public int medallon() {
        return medallon;
    }

    public void agregarMedallon() {
        if(medallon != 4){
            medallon += 1;
        }
    }

    public void quitarMedallon() {
        if(medallon != 1) {
            medallon -= 1;
        }
    }

    @Override
    public int costoFinal() {
        if(this.tieneQuesoAzul()){
            precio += 20;
        }
        if(this.tieneBacon()) {
            precio += 50;
        }
        if(this.tieneHuevo()) {
            precio += 10;
        }
        if(this.tieneMollejas()) {
            precio += 80;
        }
        if(this.tieneCebollasCaramelizadas()) {
            precio += 60;
        }
        if(this.medallon() > 1) {
            precio += 50*(this.medallon()-1);
        }
        return precio;
    }
}
