package guestBook;

//import jdk.internal.icu.impl.NormalizerImpl;
//import jdk.internal.icu.text.UnicodeSet;
import jdk.internal.org.objectweb.asm.tree.InsnList;
import tenant.Tenant;

import java.util.ArrayList;
import java.util.List;

public class GuestBook {
    private List<Tenant> tenant;

    public GuestBook() {
        this.tenant = new ArrayList<>();
    }

    public List<Tenant> getTenant() {
        return tenant;
    }

    public void addTenant(Tenant tenant) {
        this.tenant.add(tenant);
    }

    public void removeTenant(Tenant tenant) {
        this.tenant.remove(tenant);
    }

    public void print() {
        System.out.println("Tenants list: ");
        this.tenant.forEach(tenant -> System.out.println(tenant.toString()));
    }
}



//    List <Tenant> tenant = new ArrayList<Tenant>();
//
//    Void signTenantIn(Tenant tenant){
//        InsnList TanentList = null;
//        TanentList.add(tenant);
//        return null;
//    }
//    Void signTenantOut(Tenant tenant){
//        jdk.internal.org.objectweb.asm.tree.InsnList TanentList = null;
//        TanentList.remove(tenant);
//        return null;
//    }
