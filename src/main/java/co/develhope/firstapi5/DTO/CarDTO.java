package co.develhope.firstapi5.DTO;

public class CarDTO {

    private String id;
    private String modelName;
    private double price;

    public CarDTO(String id, String modelName,double price){
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public CarDTO(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
