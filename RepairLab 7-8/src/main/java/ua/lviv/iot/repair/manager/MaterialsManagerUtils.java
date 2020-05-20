package ua.lviv.iot.repair.manager;

import ua.lviv.iot.repair.model.AbstractMaterials;
import ua.lviv.iot.repair.model.SortType;
import java.util.Comparator;
import java.util.List;

public class MaterialsManagerUtils {
  private static final  SorterMaterialBySize  SORTER_BY_MATERIALS_SIZE = new  SorterMaterialBySize();

  private static class SorterMaterialBySize implements Comparator<AbstractMaterials> {

    @Override
    public int compare(AbstractMaterials firstMaterial, AbstractMaterials secondMaterial) {
      return firstMaterial.getMaterialSize() - secondMaterial.getMaterialSize();
    }
  }

  private class SorterByPrice implements Comparator<AbstractMaterials> {

    @Override
    public int compare(AbstractMaterials firstMaterial,AbstractMaterials secondMaterial) {
      return firstMaterial.compareTo(secondMaterial);
    }
  }

  public static void sortMaterialBySize(List<AbstractMaterials> materials,SortType sortType) {
    materials.sort(sortType == SortType.ASCENDING ? SORTER_BY_MATERIALS_SIZE
        : SORTER_BY_MATERIALS_SIZE.reversed());
  }

  public static void sortMaterialByPrice(List<AbstractMaterials> materials, SortType sortType) {
    materials.sort(sortType == SortType.ASCENDING ? new MaterialsManagerUtils().new SorterByPrice()
        : new MaterialsManagerUtils().new SorterByPrice().reversed());
  }
  //anon
  public static void sortByMaterialsColor(List<AbstractMaterials> materials, SortType sortType) {
    Comparator<AbstractMaterials> materialSorterByMaterialsColor = new Comparator<AbstractMaterials>() {
      @Override
      public int compare(AbstractMaterials firstMaterial, AbstractMaterials secondMaterial) {
        return firstMaterial.getMaterialsColor().compareTo(secondMaterial.getMaterialsColor());
      }
    };
    materials.sort(sortType == SortType.ASCENDING ? materialSorterByMaterialsColor : materialSorterByMaterialsColor.reversed());
  }

}