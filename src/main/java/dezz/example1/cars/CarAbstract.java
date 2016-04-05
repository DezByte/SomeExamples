package dezz.example1.cars;

abstract public class CarAbstract implements CarInterface {

    public String name = "Unnamed";

    public Double speed = 0.00D;

    public Double tripTime = 0.00D;

    public CarAbstract(String name, Double speed, Double tripTime)
    {
        this.name = name;
        this.tripTime = tripTime;
        this.speed = speed % this.maxSpeed();
    }

    public Double trip()
    {
        return this.tripTime * this.speed;
    }

    public String name()
    {
        return this.name;
    }

    @Override
    public Double tripTime()
    {
        return this.tripTime;
    }

    @Override
    public Double speed()
    {
        return this.speed;
    }
}
