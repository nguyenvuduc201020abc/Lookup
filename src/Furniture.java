import java.util.Scanner;

public class Furniture extends Thing {
    @Override
    String getDecripsion() {
        String str = "";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        this.setDescript(str);
        return str;
    }


    private float length;
    private float width;
    private float height;

    private String factory;

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void showInfo() {
        String str = "";
        str += "Serial Number: " + this.getSerialNumber() + "\n" + "Name: " + this.getName() + "\n" + "Cost: " + this.getCost() + " VND" + "\n" + "Length: " + this.getLength() + "\n" + "Height: " + this.getHeight() + "\n" + "Width: " + this.getWidth() + "\n" + "Factory: " + this.getFactory() + "\n" + "Descrip: " + this.getDescript() + "\n" + "Status: ";
        if (this.isStatus() == true) {
            str += "Available";
        } else str += "Not Available";
        System.out.println(str);
    }
}
