import java.util.Scanner;

public class Video extends Thing {


    @Override
    String getDecripsion() {
        String str = "";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        this.setDescript(str);
        return str;
    }
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public Video(String author, Integer serialNumber, Integer cost, boolean status, String name) {
        this.author = author;
        this.setSerialNumber(serialNumber);
        this.setCost(cost);
        this.setStatus(status);
        this.setName(name);
    }
    public Video(){

    }

    public void showInfo() {
        String str = "";
        str += "Serial Number: " + this.getSerialNumber() + "\n" + "Name: " + this.getName() + "\n" + "Cost: " + this.getCost() + " VND" + "\n" + "Author: " + this.getAuthor() + "\n" + "Descrip: " + this.getDescript() + "\n" + "Status: ";
        if (this.isStatus() == true) {
            str += "Available";
        } else str += "Not Available";
        System.out.println(str);
    }

}
