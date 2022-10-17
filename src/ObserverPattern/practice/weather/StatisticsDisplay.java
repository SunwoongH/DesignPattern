package ObserverPattern.practice.weather;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemperature = 0.0f;
    private float minTemperature = 200;
    private float temperatureSum = 0.0f;
    private int numReadings;
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();
        temperatureSum += temperature;
        numReadings++;
        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        } else if (temperature < minTemperature) {
            minTemperature = temperature;
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (temperatureSum / numReadings)
                + "/" + maxTemperature + "/" + minTemperature);
    }
}
