package ua.lviv.iot.repair.manager;

import ua.lviv.iot.repair.model.AbstractMaterials;

import java.util.LinkedList;
import java.util.List;


public class MaterialsManager {
  private List<AbstractMaterials> materials = new LinkedList<>();

  public MaterialsManager(List<AbstractMaterials> materials) {
    this.materials = materials;
  }

  public MaterialsManager() {

  }

  public void addMaterialsManager(List<AbstractMaterials> materials) {
    this.materials.addAll(materials);
  }

  public void addMaterialsManager(AbstractMaterials material) {
    this.materials.add(material);
  }

  public List<AbstractMaterials> findMaterialsByPrice(double priceInUAH) {
    List<AbstractMaterials> result = new LinkedList<>();
    for (AbstractMaterials material : materials) {
      if (material.getPriceInUAH() == priceInUAH) {
        result.add(material);
      }
    }
    return result;
  }

}
