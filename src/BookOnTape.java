import java.util.Scanner;

public class BookOnTape extends Thing {
    @Override
    String getDecripsion() {
        String str = "";

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        this.setDescript(str);
        return str;
    }

    private String author;
    private String publishing;
    private String type;

    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showInfo() {
        String str = "";
        str += "Serial Number: " + this.getSerialNumber() + "\n" + "Name: " + this.getName() + "\n" + "Cost: " + this.getCost() + " VND" + "\n" + "Author: " + this.getAuthor() + "\n" + "Publishing: " + this.getPublishing() + "\n" + "Type: " + this.getType() + "\n" + "Descrip: " + this.getDescript() + "\n" + "Status: ";
        if (this.isStatus() == true) {
            str += "Available";
        } else str += "Not Available";
        System.out.println(str);
    }
}
