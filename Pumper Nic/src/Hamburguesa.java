public abstract class Hamburguesa {
    public int medallon = 1;
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
            this.precio += 50;
        }
    }

    public void agregarTomate() {
        this.tomate = true;
    }

    public void agregarLechuga() {
        this.lechuga = true;
    }

    public void agregarQuesoAzul() {
        if(this.quesoAzul != true){
            this.quesoAzul = true;
            this.precio += 20;
        }
    }

    public void agregarBacon() {
        if(this.bacon != true) {
            this.bacon = true;
            this.precio += 50;
        }
    }

    public void agregarHuevo() {
        if(this.huevo != true) {
            this.huevo = true;
            this.precio += 10;
        }
    }

    public void agregarMollejas() {
        if(this.mollejas != true) {
            this.mollejas = true;
            this.precio += 80;
        }
    }

    public void agregarCebollasCaramelizadas() {
        if(this.cebollasCaramelizadas != true) {
            this.cebollasCaramelizadas = true;
            this.precio += 60;
        }
    }

    public void quitarMedallon() {
        if(this.medallon != 1) {
            this.medallon -= 1;
            this.precio -= 50;
        }
    }

    public void quitarTomate() {
        this.tomate = false;
    }

    public void quitarLechuga() {
        this.lechuga = false;
    }

    public void quitarQuesoAzul() {
        if(this.quesoAzul != false) {
            this.quesoAzul = false;
            this.precio -= 20;
        }
    }

    public void quitarBacon() {
        if(this.bacon != false) {
            this.bacon = false;
            this.precio -= 50;
        }
    }

    public void quitarHuevo() {
        if(this.huevo != false) {
            this.huevo = false;
            this.precio -= 10;
        }
    }

    public void quitarMollejas() {
        if(this.mollejas != false) {
            this.mollejas = false;
            this.precio -= 80;
        }
    }

    public void quitarCebollasCaramelizadas() {
        if(this.cebollasCaramelizadas != false) {
            this.cebollasCaramelizadas = false;
            this.precio -= 60;
        }
    }

    public int costoFinal() {
        return precio;
    }
}
