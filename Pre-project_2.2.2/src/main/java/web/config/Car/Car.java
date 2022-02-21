package web.config.Car;

public class Car {
    //Создайте модель Car с тремя произвольными полями.
    private String model;
    private String number;
    private int series;

    public Car(String model, String number, int series) {
        this.model = model;
        this.number = number;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
