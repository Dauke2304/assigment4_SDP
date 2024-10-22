package Observer;

public class WeatherData {
    private WeatherStation weatherStation;

    public WeatherData(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void changeWeatherData(double temperature, double humidity, double pressure) {
        weatherStation.setWeatherData(temperature, humidity, pressure);
    }
}
