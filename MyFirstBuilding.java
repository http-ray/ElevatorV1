package ElevatorV1;

public class MyFirstBuilding {
    public static void main(String[] args) {
        Building building = new Building(1, 10);

        building.showStatus();       // initial status
        building.requestElevator(5);
        building.showStatus();

        building.requestElevator(2);
        building.showStatus();
    }
}








