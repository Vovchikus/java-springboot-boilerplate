package kernel.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kernel.data.Vehicle;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @GetMapping(value = "/vehicles", produces = MediaType.APPLICATION_JSON_VALUE)
    public String index() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Vehicle vehicle = new Vehicle("Vehicle title", "Description");

        return mapper.writeValueAsString(vehicle);
    }
}