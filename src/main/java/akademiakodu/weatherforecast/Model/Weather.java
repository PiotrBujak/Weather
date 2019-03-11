package akademiakodu.weatherforecast.Model;

import org.springframework.web.client.RestTemplate;
import java.text.DecimalFormat;

public class Weather {
    DecimalFormat df = new DecimalFormat("0.00");
    private String city;

    public Weather(String city) {
        this.city = city;
    }

    public String temp() {
        String result = "";
        if (city != null) {
            String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=ef2028e98b54649bf1f4c4582631f350";

            RestTemplate restTemplate = new RestTemplate(); //Klasa ze Springa bierze nam Jsona i zamienia na Obkiet, tylko trzeba mu powiedzieć jak!
            WeatherModel weatherModel = restTemplate.getForObject(url, WeatherModel.class);
            result = df.format(weatherModel.getMain().getTemp()) + "℃";
        }
        return result;
    }
}
