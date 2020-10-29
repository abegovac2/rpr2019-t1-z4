package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] market;
    private Integer popunjeno;

    public Supermarket(){
        market = new Artikl[1000];
        popunjeno = 0;
    }

    public Artikl[] getArtikli() {
        return market;
    }

    public Integer getPopunjeno() {
        return popunjeno;
    }

    public boolean dodajArtikl(Artikl unos) {
        if(popunjeno < 1000){
            market[popunjeno] = new Artikl(unos.getNaziv(), unos.getCijena(), unos.getKod());
            popunjeno = popunjeno + 1;
            return true;
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < popunjeno; ++i){
            if(market[i].getKod().equals(kod)){
                Artikl izbaceni = market[i];
                if (popunjeno - 1 - i >= 0) System.arraycopy(market, i + 1, market, i, popunjeno - 1 - i);
                market[popunjeno - 1] = null;
                popunjeno = popunjeno - 1;
                return izbaceni;
            }
        }
        return null;
    }
}
