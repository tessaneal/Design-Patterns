package decorator;

/**
 * A type of container (cone) that the ice cream can be put in
 * @author Tessa Neal
 */
public class Cone extends IceCream {
    private ConeType coneType;

    /**
     * Creates a new cone of the indicated cone type
     * @param coneType The type of cone the ice cream will be put in
     */
    public Cone(ConeType coneType) {
        this.coneType = coneType;
        if(coneType == ConeType.SUGAR_CONE) {
            this.description = "Sugar cone";
        } else if (coneType == ConeType.WAFFLE_CONE) {
            this.description = "Waffle cone";
        } else if (coneType == ConeType.PRETZEL_CONE) {
            this.description = "Pretzel cone";
        } else {
            this.description = "Chocolate dipped cone";
        }
    }

    /**
     * Describes how much the ice cream costs in the chosen cone
     * @return A double representation of the cost of the chosen cone
     */
    public double getCost() {
        if(coneType == ConeType.SUGAR_CONE) {
            return 0.75;
        } else if (coneType == ConeType.WAFFLE_CONE) {
            return 1.2;
        } else if (coneType == ConeType.PRETZEL_CONE) {
            return 1.8;
        } else {
            return 1.5;
        }
    }
}
