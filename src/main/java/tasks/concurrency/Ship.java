package tasks.concurrency;

public class Ship {

    private Cargo cargo;
    private int cargoWeight;

    public Ship() {
    }

    public Ship(Cargo cargo, int cargoWeight) {
        this.cargo = cargo;
        this.cargoWeight = cargoWeight;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public String toString() {
        return cargo.name() + " " + cargoWeight;
    }
}
