import Observer.*;
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // Register displays to the weather station
        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(statisticsDisplay);
        weatherStation.addObserver(forecastDisplay);

        WeatherData weatherData = new WeatherData(weatherStation);

        // Simulate weather data changes
        weatherData.changeWeatherData(25.0, 65.0, 1013.5);
        weatherData.changeWeatherData(22.0, 70.0, 1012.1);
        weatherData.changeWeatherData(28.0, 90.0, 1011.0);
    }
}