package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private Integer cijena;
    private String kod;

    public Artikl(String naziv, Integer cijena, String kod){
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCijena(Integer cijena) {
        this.cijena = cijena;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public Integer getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}
