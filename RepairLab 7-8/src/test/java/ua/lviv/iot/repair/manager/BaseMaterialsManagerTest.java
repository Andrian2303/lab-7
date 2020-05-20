package ua.lviv.iot.repair.manager;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.repair.model.*;

import java.util.LinkedList;
import java.util.List;

public abstract class BaseMaterialsManagerTest {

  protected List<AbstractMaterials> materials;
  @BeforeEach
  public void createMaterialsForRepair(){
    materials = new LinkedList<AbstractMaterials>();
    materials.add(new Socket("America", "white",78.4, 9, "Virus",true, TypeOfConnector.TYPE_A_AMERICAN, 8, 10 ,"Andrian"));
    materials.add(new Beton("Germany", "gray",135.2, 56,"Strong",false, "Dream","Andrian" ));
    materials.add(new Wire("Kannada","bronze", 191.9, 890, "Quality", false, TypeOfWire.ALUMINIUM_WIRE,"Andrian"));
  }
}