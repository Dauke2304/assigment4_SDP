package Observer;
public class StatisticsDisplay implements WeatherDisplay {
    private double maxTemp = Double.MIN_VALUE;
    private double minTemp = Double.MAX_VALUE;
    private double totalTemp;
    private int numReadings;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        totalTemp += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (temperature < minTemp) {
            minTemp = temperature;
        }
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (totalTemp / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}

