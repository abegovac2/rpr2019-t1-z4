package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] korpa;
    private Integer popunjeno;

    public Korpa(){
        korpa = new Artikl[50];
        popunjeno = 0;
    }

    public Artikl[] getArtikli() {
        return korpa;
    }

    public boolean dodajArtikl(Artikl dodaj) {
        if(popunjeno < 50){
            korpa[popunjeno] = new Artikl(dodaj.getNaziv(), dodaj.getCijena(), dodaj.getKod());
            popunjeno = popunjeno + 1;
            return true;
        }
        return false;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < popunjeno; ++i){
            if(korpa[i].getKod().equals(kod)){
                Artikl izbaceni = korpa[i];
                if (popunjeno - 1 - i >= 0) System.arraycopy(korpa, i + 1, korpa, i, popunjeno - 1 - i);
                korpa[popunjeno-1] = null;
                popunjeno = popunjeno - 1;
                return izbaceni;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i = 0; i < popunjeno; ++i){
            suma = suma + korpa[i].getCijena();
        }
        return suma;
    }
}
