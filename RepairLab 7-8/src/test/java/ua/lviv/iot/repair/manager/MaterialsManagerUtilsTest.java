package ua.lviv.iot.repair.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.repair.model.SortType;

public class MaterialsManagerUtilsTest extends BaseMaterialsManagerTest {

  @Test
  public void testSortByMaterialSize() {
    MaterialsManagerUtils.sortMaterialBySize(materials, SortType.DESCENDING);

    assertEquals(890, materials.get(0).getMaterialSize());
    assertEquals(56, materials.get(1).getMaterialSize());
    assertEquals(9, materials.get(2).getMaterialSize());
    MaterialsManagerUtils.sortMaterialBySize(materials, SortType.ASCENDING);
    for(int i = 0; i < materials.size(); i++)
      System.out.println(materials.get(i).getMaterialSize());
    assertEquals(9, materials.get(0).getMaterialSize());
    assertEquals(56, materials.get(1).getMaterialSize());
    assertEquals(890, materials.get(2).getMaterialSize());

  }

  @Test
  public  void testSortByMaterialPrice(){
    MaterialsManagerUtils.sortMaterialByPrice(materials, SortType.DESCENDING);
    assertEquals(78.4, materials.get(0).getPriceInUAH());
    assertEquals(135.2, materials.get(1).getPriceInUAH());
    assertEquals(191.9, materials.get(2).getPriceInUAH());
    MaterialsManagerUtils.sortMaterialByPrice(materials, SortType.ASCENDING);
    for(int i = 0; i < materials.size(); i++)
      assertEquals(78.4, materials.get(0).getPriceInUAH());
    assertEquals(135.2, materials.get(1).getPriceInUAH());
    assertEquals(191.9, materials.get(2).getPriceInUAH());



  }



}
