Liidesed

Liidesed on klassitaolised kontruktsioonid. Liides võimaldab määrata mida klass peab tegema. 
Liides sisaldab ainult konstante ja meetodeid, seda saab realiseerides paljudes klassides.
võimalik realiseerida paljudes klassides, seda näitab sõna implements.
Näide liidese kasutamise kohta (liideste nimed on tavaliselt omadussõnad või nimisõnad, klasside nimed on tavaliselt nimisõnad):


interface Helistav {
  void helista(int nr);
}

class Klient implements Helistav {

  public void helista(int nr) {
       System.out.println("Helistatud numbril " + nr);
  }

  void helistaVeel() {
    System.out.println("Klassid, mis kasutavad liideseid" +
                    ", võivad sisaldada teisi meetodeid.");
  }
}

Liidese kõik meetodid on vaikimisi avalikud (public), nende realiseerimisel tuleb aga vastavat piiritlejat (public) ilmutatult kasutada. 
 
 
class TestiLiidest {

    public static void main(String[] args) {
        Helistav c = new Klient();
        c.helista(4646);
    }
}


Automaattestid rakenduse kavandamise juures

automaattestid väljastavad inimvea ehk nende kasutamine on palju kindlam, kui seda teeks inimene.
Mida varem testida, seda varem saab jaole vigadele.

Millal kasutatakse?

Kui tegemist on suure infosüsteemiga, 
mille käsitsitestimine võtab nii palju aega, et see muutub pudelikaelaks arendusprotsessis.
Kui osa süsteemist on juba valmis, 
kuid arendamine veel käib. Sellisel juhul on regressioonitestide*(leida ootamatuid vigu juba töötavas koodis pärast uue koodi kirjutamist)
tegemine väga oluline. 
Enamasti automatiseeritakse just regressiooniteste.
