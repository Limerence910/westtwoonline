import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.*;

public class Main {
    public static void main(String[] args){

        System.out.println("输入测试用生产日期：");
        Bubble bubble=new Bubble(2019,11,15);
        Bubble bubble1=new Bubble(2019,11,1);
        Bubble bubble2=new Bubble(2019,10,9);
        Coconut coconut=new Coconut(2019,11,15);
        Coconut coconut1=new Coconut(2019,10,11);
        Coconut coconut2=new Coconut(2019,11,1);

        Milktea milktea=new Milktea(bubble,"Milktea");

        System.out.println("输入测试用原料：");
        Teashop teashop=new Teashop();
        teashop.imports(bubble);
        teashop.imports(bubble1);
        teashop.imports(coconut);
        teashop.imports(coconut1);
        teashop.imports(bubble2);
        teashop.imports(coconut2);

        System.out.println("输入顾客需求");
        teashop.sale("Milktea","Bubble");
        teashop.sale("Milktea","Coconut");
        teashop.sale("Milktea","Bubble");
        teashop.sale("Milktea","Coconut");
        teashop.sale("Milktea","Bubble");
        teashop.sale("Milktea","Bubble");
        teashop.sale("Milktea","Bubble");
    }
}
