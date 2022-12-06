public class FlyingFactory {
    public FlyingFactory() {
    }

    public Flying createFlying(String string) {
        if (string.equals("Fighter Jet")) {
            return new FlyLikeFJ();
        } else if (string.equals("Model Airplane")) {
            return new NotFly();
        } else {
            return string.equals("Passenger Airplane") ? new FlyLikePP() : null;
        }
    }
}