package ElevatorV1;

public class Building {
    private final Elevator elevator;

    public Building() {
        this(1, 10);
    }

    public Building(int minFloor, int maxFloor) {
        this.elevator = new Elevator(minFloor, maxFloor);
    }

    public void requestElevator(int floor) {
        System.out.println("Request: go to floor " + floor);
        elevator.moveTo(floor);
    }

    public void showStatus() {
        System.out.println("Elevator is at floor " +
                elevator.getCurrentFloor() +
                " [" + elevator.getState() + "]");
        System.out.println(); // space after status
    }
}




