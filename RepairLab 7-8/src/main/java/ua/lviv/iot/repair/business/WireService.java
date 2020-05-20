package ua.lviv.iot.repair.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.repair.dataaccess.WireRepository;
import ua.lviv.iot.repair.model.Wire;


@Service
public class WireService {

  @Autowired
  private WireRepository wireRepository;

  public Wire getWire(Integer id) {
    if (wireRepository.existsById(id)) {
      return wireRepository.findById(id).get();
    } else {
      return null;
    }
  }

  public Wire createWire(Wire wire) {
    return wireRepository.save(wire);
  }

  public boolean deleteWire(Integer id) {
    if (wireRepository.existsById(id)) {
      wireRepository.deleteById(id);
      return true;
    } else {
      return false;
    }
  }

  public Wire updateWire(Integer id, Wire wire) {
    if (wireRepository.existsById(id)) {
      Wire previousWire = wireRepository.findById(id).get();
      wireRepository.save(wire);
      return previousWire;
    } else {
      return null;
    }
  }

  public List<Wire> findAll() {
    return wireRepository.findAll();
  }

  public List<Wire> getAllByProducerName(String producerName) {
    return wireRepository.findAllByProducerName(producerName);

  }
}
