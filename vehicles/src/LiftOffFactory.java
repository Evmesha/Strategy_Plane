public class LiftOffFactory {
    public LiftOffFactory() {
    }

    public LiftOff createLiftOff(String string) {
        if (string.equals("Horizontally")) {
            return new HorizontalLiftOff();
        } else if (string.equals("don't")) {
            return new NotLiftOff();
        } else {
            return string.equals("Vertically") ? new VerticalLiftOff() : null;
        }
    }
}