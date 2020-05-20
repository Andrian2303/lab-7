package ua.lviv.iot.repair.dataaccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.repair.model.Wire;


@Repository
public interface WireRepository extends JpaRepository<Wire, Integer> {

  List<Wire> findAllByProducerName(String producerName);

}
