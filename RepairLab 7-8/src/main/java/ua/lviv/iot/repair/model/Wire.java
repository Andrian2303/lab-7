package ua.lviv.iot.repair.model;

import javax.persistence.Entity;

@Entity
public class Wire extends AbstractMaterials {
  protected TypeOfWire typeOfWire;

  public TypeOfWire getTypeOfWire() {
    return typeOfWire;
  }

  public Wire(String materialsBrand,String materialsColor,double priceInUAH,int materialSize,String companyOfManufactures,boolean neededForSockets, TypeOfWire typeOfWire, String producerName){
    super(materialsBrand,materialsColor,priceInUAH,materialSize,companyOfManufactures,neededForSockets, producerName);
    this.typeOfWire=typeOfWire;
  }

  public String getHeaders() {
    return super.getHeaders() + ", typeOfWire";
  }

  public String toCSV() {
    return super.toCSV() + ", " +  getTypeOfWire();
  }


}
