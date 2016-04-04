package dezz.example1.cars;

public class Zaz extends CarAbstract {

    public Zaz(Double speed, Double tripTime)
    {
        super("Запарожец", speed, tripTime);
    }

    @Override
    public Double maxSpeed()
    {
        return 70.0D;
    }
}