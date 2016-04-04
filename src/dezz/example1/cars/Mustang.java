package dezz.example1.cars;

public class Mustang extends CarAbstract {

    public Mustang(Double speed, Double tripTime)
    {
        super("Mustang", speed, tripTime);
    }

    @Override
    public Double maxSpeed()
    {
        return 250.0D;
    }
}
