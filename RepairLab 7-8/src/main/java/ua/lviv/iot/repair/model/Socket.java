package ua.lviv.iot.repair.model;

public class Socket extends AbstractMaterials{
  protected TypeOfConnector typeOfSocket;
  protected int lenght;
  protected int wenght;

  public TypeOfConnector getTypeOfSocket (){
    return typeOfSocket;
  }

  public int getLenght() {
    return lenght;
  }

  public int getWenght() {
    return wenght;
  }

  public Socket(String materialsBrand,String materialsColor,double priceInUAH,int materialSize,String companyOfManufactures,boolean neededForSockets,TypeOfConnector typeOfSocket,int lenght,int wenght, String producerName){
    super(materialsBrand,materialsColor,priceInUAH,materialSize,companyOfManufactures,neededForSockets, producerName);
    this.typeOfSocket=typeOfSocket;
    this.lenght=lenght;
    this.wenght=wenght;
  }


  public String getHeaders() {
    return super.getHeaders() + ", lenght" + ", wenght";
  }

  public String toCSV() {
    return super.toCSV() + ", " +   getLenght() + ", " + getWenght();



  }}
