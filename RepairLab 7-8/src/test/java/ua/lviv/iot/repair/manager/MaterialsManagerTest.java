package ua.lviv.iot.repair.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.repair.model.AbstractMaterials;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class  MaterialsManagerTest extends BaseMaterialsManagerTest{
  protected MaterialsManager materialsManager;
  @BeforeEach
  public void setUp(){
  }
  @Test
  public void findMaterialsByPrice(){
    materialsManager = new MaterialsManager();
    List<AbstractMaterials> abstractMaterials = materialsManager.findMaterialsByPrice(78.4);
    assertEquals(78.4,materials.get(0).getPriceInUAH());
    assertEquals(135.2,materials.get(1).getPriceInUAH());
    assertEquals(191.9,materials.get(2).getPriceInUAH());

  }


}