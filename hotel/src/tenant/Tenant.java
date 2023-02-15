package tenant;

//import jdk.internal.org.objectweb.asm.MethodVisitor;
//import jdk.internal.org.objectweb.asm.tree.AbstractInsnNode;
//import jdk.internal.org.objectweb.asm.tree.LabelNode;
//
//import java.util.Map;

import scan.Scan;

public class Tenant {
    Scan scan;
    String Name;
    String Surname;
    int Age;

    public Tenant(Scan scan) {
        this.scan = scan;
    }

    public  int setAge() {
        Age = Integer.valueOf(scan.returnage());
        return Age;
    }
    public String setName() {
        Name = scan.returnname();
        return Name;
    }

//    public String setSurname() {
//        Surname =scan.returnsurname();
//        return Surname;
//    }
    @Override
    public String toString() {
        return "Person{" +
                " age='" + Age + '\'' +
                ", name='" + Name + '\'' +
//                ", surname='" + Surname + '\'' +
                '}';
    }




}
//    @Override
//    public int getType() {
//        return 0;
//    }
//
//    @Override
//    public void accept(MethodVisitor methodVisitor) {
//
//    }
//
//    @Override
//    public AbstractInsnNode clone(Map<LabelNode, LabelNode> clonedLabels) {
//        return null;
//    }
//}
