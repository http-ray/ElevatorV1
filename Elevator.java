package ElevatorV1;

public class Elevator {
    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;
    private String state; // "idle" or "moving"

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = minFloor;
        this.state = "idle";
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public String getState() {
        return state;
    }

    public void moveTo(int targetFloor) {
        if (targetFloor < minFloor || targetFloor > maxFloor) {
            System.out.println("Requested floor " + targetFloor +
                    " is out of range (" + minFloor + "–" + maxFloor + ").");
            return;
        }
        if (targetFloor == currentFloor) {
            return;
        }

        state = "moving";
        System.out.println("Moving from " + currentFloor + " → " + targetFloor);

        currentFloor = targetFloor;
        state = "idle";
    }
}



