public abstract class Hamburguesa {
    private int medallon = 1;
    public boolean lechuga = true;
    public boolean tomate = true;
    public boolean quesoAzul = false;
    public boolean bacon = false;
    public boolean huevo = false;
    public boolean mollejas = false;
    public boolean cebollasCaramelizadas = false;
    public int precio;

    public void agregarMedallon() {
        if(this.medallon != 4){
            this.medallon += 1;
        }
    }

    public void agregarTomate() {
        this.tomate = true;
    }

    public void agregarLechuga() {
        this.lechuga = true;
    }

    public void agregarQuesoAzul() {
        this.quesoAzul = true;
    }

    public void agregarBacon() {
        this.bacon = true;
    }

    public void agregarHuevo() {
        this.huevo = true;
    }

    public void agregarMollejas() {
        this.mollejas = true;
    }

    public void agregarCebollasCaramelizadas() {
        this.cebollasCaramelizadas = true;
    }

    public void quitarMedallon() {
        if(this.medallon != 1) {
            this.medallon -= 1;
        }
    }

    public void quitarTomate() {
        this.tomate = false;
    }

    public void quitarLechuga() {
        this.lechuga = false;
    }

    public void quitarQuesoAzul() {
        this.quesoAzul = false;
    }

    public void quitarBacon() {
        this.bacon = false;
    }

    public void quitarHuevo() {
        this.huevo = false;
    }

    public void quitarMollejas() {
        this.mollejas = false;
    }

    public void quitarCebollasCaramelizadas() {
        this.cebollasCaramelizadas = false;
    }

    public int costoFinal() {
        return precio;
    }
}
