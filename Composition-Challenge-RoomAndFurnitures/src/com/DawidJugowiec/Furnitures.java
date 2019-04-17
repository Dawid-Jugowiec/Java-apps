package com.DawidJugowiec;

public class Furnitures {

    private boolean bed;
    private boolean carpet;
    private boolean wardrobe;
    private boolean sofa;
    private boolean roller;

    public Furnitures(boolean bed, boolean carpet, boolean wardrobe, boolean sofa, boolean roller) {
        this.bed = bed;
        this.carpet = carpet;
        this.wardrobe = wardrobe;
        this.sofa = sofa;
        this.roller = roller;
    }

    public boolean isBed() {

        return bed;
    }

    public boolean isCarpet() {
        return carpet;
    }

    public boolean isWardrobe() {
        return wardrobe;
    }

    public boolean isSofa() {
        return sofa;
    }

    public boolean isRoller() {
        return roller;
    }

public void BringXTakeFurnitures (boolean a, boolean b, boolean c, boolean d, boolean e)
{
    bed = a;
    carpet = b;
    wardrobe = c;
    sofa = d;
    roller = e;

}
}
