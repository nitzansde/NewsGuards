package newsGuardServer;

import data.transfer.object.location.LocationDTO;
import logic.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {
    private final Engine engine;

    @Autowired
    public LocationController(Engine engine) {
        this.engine = engine;
    }

    @PostMapping("/save-location")
    public ResponseEntity<String> receiveLocation(@RequestBody LocationDTO locationDTO) {
        engine.saveUserLocation(locationDTO);
        return ResponseEntity.ok("Location received");
    }
}

