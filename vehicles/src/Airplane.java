public class Airplane {
    private Flying hIF;
    private LiftOff hILO;


    public Airplane(LiftOff hILO, Flying hIF) {
        super();
        this.hIF = hIF;
        this.hILO = hILO;
    }


    public String howDoYouFly() {
        return hIF.howIFly();
    }

    public String howDoYouLiftOff() {
        return hILO.howILiftOff();
    }

}
