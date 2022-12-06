public class PassengerPlaneFactory implements AirPlaneFactory {
    public PassengerPlaneFactory() {
    }

    public Flying createFlying() {
        FlyingFactory flyingFactory = new FlyingFactory();
        return flyingFactory.createFlying("Passenger Airplane");
    }

    public LiftOff createLiftOff() {
        LiftOffFactory liftOffFactory = new LiftOffFactory();
        return liftOffFactory.createLiftOff("Horizontally");
    }
}
