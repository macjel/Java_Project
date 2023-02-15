import guestBook.GuestBook;
import scan.Scan;
import tenant.Tenant;


public class HotelController {
    public static void main(String[] args) {
        Scan scan = new Scan();

        System.out.println("Podaj dane wiek imie nazwisko");

        scan.valueage();
        scan.valuenaem();
//        scan.valuesurename();

        Tenant tenant = new Tenant(scan);

        GuestBook guestBook = new GuestBook();

        guestBook.addTenant(tenant);
        guestBook.print();

        System.out.println(scan.returnname());

        System.out.println(tenant.setAge());
    }
}

//        GuestBook guestBook = new GuestBook();
//
//        Scan scan = new Scan();
//
//        System.out.println("Podaj imie nazwisko i wiek");
//
//        scan.valuenaem();
//        scan.valuesurenaem();
//        scan.valueage();
//
//
//        public void register(){
//            var name = scan.returnname();
//            var surname = scan.returnsurname();
//            var age = Integer.parseInt(String.valueOf(scan.returnage()));
//
//            var tenant = new Tenant (){
//               String Name = name;
//               String Surname = surname;
//               int Age = age;
//            }
//            guestBook.signTenantIn(tenant);
//        }