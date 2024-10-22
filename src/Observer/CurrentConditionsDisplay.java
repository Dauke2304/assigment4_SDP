package Observer;

public class CurrentConditionsDisplay implements WeatherDisplay {
    private double temperature;
    private double humidity;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "°C and " + humidity + "% humidity.");
    }
}
