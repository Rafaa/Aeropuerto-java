package hello;

import com.aero.dao.AirportParsedDao;
import com.aero.dao.AirportTMPDao;
import com.aero.models.AirportParsedEntity;
import com.aero.models.AirportTMPEntity;
import com.aero.service.AirportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private AirportsService airportsService;

    @Autowired
    private AirportParsedDao airportParsedDao;

    
    @RequestMapping("/")
    public String index() {

        airportsService.getAirportTMPList();

        return "Greetings from Spring Boot!";
    }
    
}
