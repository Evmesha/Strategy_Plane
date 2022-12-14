public class ModelAirplaneFactory implements AirPlaneFactory {
    public ModelAirplaneFactory() {
    }

    public Flying createFlying() {
        FlyingFactory flyingFactory = new FlyingFactory();
        return flyingFactory.createFlying("Model Airplane");
    }

    public LiftOff createLiftOff() {
        LiftOffFactory liftOffFactory = new LiftOffFactory();
        return liftOffFactory.createLiftOff("don't");
    }
}