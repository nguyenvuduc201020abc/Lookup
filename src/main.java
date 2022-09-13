import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static ArrayList<Video> arrVideo= new ArrayList<>();
    public static ArrayList<Furniture> arrFurniture= new ArrayList<>();
    public static ArrayList<BookOnTape> arrBookOnTape= new ArrayList<>();
    public static  Scanner sc = new Scanner(System.in);
    public static void mainPage(){
        System.out.println("Select one option: ");
        System.out.println();
        System.out.println("1. Add thing");
        System.out.println("2. Get Information");
        System.out.println("3. Find by serialNumber");
    }
    public static void addVideo(){
        Video vd = new Video();
        System.out.print("Serial Number: ");
        vd.setSerialNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Name: ");
        vd.setName(sc.nextLine());
        System.out.print("Cost: ");
        vd.setCost(sc.nextInt());
        sc.nextLine();
        System.out.print("Author: ");
        vd.setAuthor(sc.nextLine());
        System.out.print("Descrip: ");
        vd.getDecripsion();
        System.out.print("Status: ");
        sc.nextBoolean();
        arrVideo.add(vd);
    }
    public static void main(String[] args) {
        mainPage();
        addVideo();
        arrVideo.get(0).showInfo();




    }
}
