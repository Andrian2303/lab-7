package ua.lviv.iot.repair.model;

import org.springframework.jmx.export.naming.IdentityNamingStrategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public abstract class AbstractMaterials {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  protected String materialsBrand;
  protected String materialsColor;
  protected double priceInUAH;
  protected int materialSize;
  protected String companyOfManufactures;
  protected boolean neededForSockets;
  protected String producerName;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getMaterialsBrand(){
    return materialsBrand;
  }

  public void setMaterialsBrand(String materialsBrand) {
    this.materialsBrand = materialsBrand;
  }


  public String getMaterialsColor(){
    return materialsColor;
  }

  public void setMaterialsColor(String materialsColor ) {
    this.materialsColor = materialsColor;
  }

  public double getPriceInUAH() {
    return priceInUAH;
  }

  public void setPriceInUAH(double priceInUAH) {
    this.priceInUAH = priceInUAH;
  }

  public int getMaterialSize() {
    return materialSize;
  }

  public void setMaterialSize(int materialSize) {
    this.materialSize = materialSize;
  }

  public String getCompanyOfManufactures(){
    return companyOfManufactures;
  }
  public void setCompanyOfManufactures(String companyOfManufactures) {
    this.companyOfManufactures = companyOfManufactures;
  }
  public Boolean getNeededForSockets() {
    return neededForSockets;
  }

  public void setNeededForSockets(boolean neededForSockets) {
    this.neededForSockets = neededForSockets;
  }

  public  AbstractMaterials(String materialsBrand,String materialsColor,double priceInUAH,int materialSize,String companyOfManufactures,boolean neededForSockets,
                            String producerName){
    super();

    this.materialsBrand=materialsBrand;
    this.materialsColor=materialsColor;
    this.priceInUAH=priceInUAH;
    this.materialSize=materialSize;
    this.companyOfManufactures=companyOfManufactures;
    this.neededForSockets=neededForSockets;
    this.producerName = producerName;
  }

  public  int compareTo(AbstractMaterials secondMaterial){
    return 0;
  }

  public String getHeaders() {
    return "materialsBrand, materialsColor, priceInUAH, materialSize, companyOfManufactures, neededForSockets";
  }

  public String toCSV() {
    return getMaterialsBrand() + ", "  + getMaterialsColor() + ", "
        + getPriceInUAH() + ", "  + getMaterialSize() + ", "
        + getCompanyOfManufactures() + ","
        + getNeededForSockets();
  }
}
