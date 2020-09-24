package nl.novi.javaprogrammeren.overerving;

public class SpaceXRocket extends Rocket {

    // We roepen hier de constructor aan van Rocket
    public SpaceXRocket(int maximumFuel) {
        super(maximumFuel);
    }

   /* @Override
    public void fly(int fuel) {
        int metersFlown = 0;
        if(hasEnoughFuel(fuel)) {
            metersFlown = calculateMetersFlown(fuel);
            decreaseFuel(fuel);
        }
        this.height = height + metersFlown;
    }*/
    @Override
    public int calculateMetersFlown(int fuel) {
        return fuel * 150;
    }
}
