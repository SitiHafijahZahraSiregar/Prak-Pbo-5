package praktikum5_ara;

public class Praktikum5_Ara {

    public static void main(String[] args) {
        String firstname = "Siti";
        String lastname = "Hafijah";
        
        String fullname = "Siti" + " " + "Hafijah";
        String fullname2 = firstname + " " + lastname;
      //String fullname = firstname + lastname;
        
        int panjang = fullname.length();
        int idx = fullname.indexOf("ti");
        
        String upper = fullname.toUpperCase();
        String lower = fullname.toLowerCase();
        
        System.out.println(upper);
        System.out.println(lower);        
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(fullname2);
        System.out.println(panjang);
        System.out.println(fullname.substring(3,6));
        System.out.println(idx);
    }
    
}
