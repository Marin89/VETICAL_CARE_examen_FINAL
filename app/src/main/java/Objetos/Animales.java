package Objetos;

public class Animales {

    private int id;
    private String[] Animales = {"Animal_Domestico", "Animal_Salvaje", "Otros" };
    private int[] costo = {25000, 45000, 18000};

    public Animales()
    {}

    public Animales(int id, String[] animales, int[] costo) {
        this.id = id;
        Animales = animales;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getAnimales() {
        return Animales;
    }

    public void setAnimales(String[] animales) {
        Animales = animales;
    }

    public int[] getCosto() {
        return costo;
    }

    public void setCosto(int[] costo) {
        this.costo = costo;
    }

    //reglas de negocios
    public int CalcularAnimal_Domestico(int precios)
    {
        return costo[0] + precios;
    }

    public int CalcularAnimal_Salvaje(int precios)
    {
        return costo[1] + precios;
    }

    public int CalcularOtros(int precios) {
        return costo[2] + precios;
    }

}