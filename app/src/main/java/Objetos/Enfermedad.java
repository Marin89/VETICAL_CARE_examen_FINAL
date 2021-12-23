package Objetos;

public class Enfermedad {

    private int id;
    private String[] Enfermedad = {"Brucelosis", "Fiebre Aftosa", "Salmonella", "Rabia"};
    private int[] precios ={75000, 22500, 35000, 54000};

    public Enfermedad()
    {

    }

    public Enfermedad(int id, String[] enfermedad, int[] precios) {
        this.id = id;
        Enfermedad = enfermedad;
        this.precios = precios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getEnfermedad() {
        return Enfermedad;
    }

    public void setEnfermedad(String[] enfermedad) {
        Enfermedad = enfermedad;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }
}
