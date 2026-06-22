package pkNuevaEspecie;

public class Mamifero implements IMamifero {
    private Integer nroPatas;

    public Integer getNroPatas() {
        return nroPatas;
    }

    public void setNroPatas(Integer nroPatas) {
        this.nroPatas = nroPatas;
    }

    @Override
    public boolean amamantar() {
        System.out.println("Amamantando como tu madre...");
    }

}
