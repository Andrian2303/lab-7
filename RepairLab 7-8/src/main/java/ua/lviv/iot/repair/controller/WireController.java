package ua.lviv.iot.repair.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.repair.business.WireService;
import ua.lviv.iot.repair.model.Wire;


@RequestMapping("/wires")
@RestController
public class WireController {

  @Autowired
  private WireService wireService;


  @GetMapping
  public List<Wire> getWires(
      final @RequestParam(name = "producerName", required = false) String producerName) {
    if (producerName == null) {
      return wireService.findAll();

    }
    return wireService.getAllByProducerName(producerName);
  }

  @GetMapping(path = {"/{id}"})
  public ResponseEntity<Wire> getWire(final @PathVariable("id") Integer wireId) {

    Wire wire;
    ResponseEntity<Wire> status = (wire = wireService.getWire(wireId)) == null
        ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<>(wire, HttpStatus.OK);
    return status;

  }

  @PostMapping
  public Wire createWire(final @RequestBody Wire wire) {
    return wireService.createWire(wire);
  }

  @DeleteMapping(path = {"/{id}"})
  public ResponseEntity<Wire> deleteWire(@PathVariable("id") Integer wireId) {
    HttpStatus status = wireService.deleteWire(wireId) ? HttpStatus.OK : HttpStatus.NOT_FOUND;

    return ResponseEntity.status(status).build();
  }

  @PutMapping(path = {"/{id}"})
  public ResponseEntity<Wire> updateWire(final @PathVariable("id") Integer wireId,
                                           final @RequestBody Wire wire) {
    wire.setId(wireId);
    Wire oldWire = wireService.updateWire(wireId, wire);
    ResponseEntity<Wire> status = oldWire == null
        ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<>(oldWire, HttpStatus.OK);
    return status;
  }

}
