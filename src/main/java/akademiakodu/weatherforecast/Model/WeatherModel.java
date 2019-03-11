package akademiakodu.weatherforecast;

public class WeatherModel {
    private WeatherDetails main;

    public WeatherDetails getMain() {
        return main;
    }

    public void SetMain(WeatherDetails main) {

    }

    public static class WeatherDetails {
        private double temp;

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp-273;
        }
    }
}
