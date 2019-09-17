package ar.edu.unahur.obj2;

public class Menu implements CostoFinal {
    Hamburguesa hamburguesa;
    PapasFritas papas;
    Gaseosa cola;

    public Menu(Hamburguesa hamburguesa, PapasFritas papas, Gaseosa cola) {
        this.hamburguesa = hamburguesa;
        this.papas = papas;
        this.cola = cola;
    }

    public int descuento() {
        int descuento = hamburguesa.costoFinal() + papas.costoFinal();
        descuento = descuento * 20 / 100;
        return descuento;
    }

    @Override
    public int costoFinal() {
        return hamburguesa.costoFinal() + papas.costoFinal() + cola.costoFinal() - this.descuento();
    }
}
