package dezz.example1.cars;

public class Lada extends CarAbstract {

    public Lada(Double speed, Double tripTime)
    {
        super("Lada Корыто - седан, цвета баклажан", speed, tripTime);
    }

    @Override
    public Double maxSpeed()
    {
        return 90.0D;
    }
}