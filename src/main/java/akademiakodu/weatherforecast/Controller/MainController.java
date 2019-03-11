package akademiakodu.weatherforecast;

import akademiakodu.weatherforecast.Model.Weather;
import akademiakodu.weatherforecast.Model.WeatherModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/weathers/search")
    public String search(@RequestParam(required = false) String city, ModelMap modelMap){
        Weather weather = new Weather(city);
        modelMap.put("weather",weather.temp());
        return "search";
    }
}
