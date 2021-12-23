package Objetos;

public class Usuarios {

    private String [] name ={"Mauricio"};
    private String [] pass = {"123"};

    public Usuarios() {
    }

    public Usuarios(String[] name, String[] pass) {
        this.name = name;
        this.pass = pass;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getPass() {
        return pass;
    }

    public void setPass(String[] pass) {
        this.pass = pass;
    }
}
