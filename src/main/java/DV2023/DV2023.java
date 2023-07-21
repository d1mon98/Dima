package DV2023;

public class DV2023 {

    public DV2023(int issued, int ap, int _221g, int refused, int ready, int tranist) {
        this.issued = issued;
        this.ap = ap;
        this._221g = _221g;
        this.refused = refused;
        this.ready = ready;
        this.tranist = tranist;
    }

    int issued, ap, _221g, refused, ready, tranist;


    double visaEstimation() {
        double visaIssued = issued + ((ready - 5534 - 959 + tranist) * 0.88 * 0.82); //5534-real no shows, 959 - also  no-shows from corrected cases
        return 55000 - 150 - visaIssued;
    }

    public static void main(String[] args) {
        DV2023 july17 = new DV2023(41411, 468, 5850, 3798, 17896, 1680*2);//19 -40; 18 - 551; 17-332

        System.out.println("Виз останется в конце сентября : " + july17.visaEstimation());
        System.out.println("Приглашений на сентябрь : " + july17.tranist);


    }

}
