package Arraylist.Ejemplo2;

  class Auto  {

    private String patente;
    private String color;
    private int km;

    public Auto(String patente, String color, int km){
        this.patente = patente;
        this.color = color;
        this.km = km;
    }

    public Auto(String patente, String color){

        this.patente = patente;
        this.color = color;

    }

    public int getKm(){
        return km;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", color='" + color + '\'' +
                ", km=" + km +
                '}';
    }
}
