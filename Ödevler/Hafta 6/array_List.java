package hafta_6_odev;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class array_List {
    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++) list.add(r.nextInt(10));
        System.out.println(list); //Sıfır ile on arasında rastgele 10 sayı oluşturuyor.

        list.forEach(p-> System.out.println(p.intValue()+5)); //Her sayıya 5 ekliyor.

        List<Integer> l = list.stream().filter(p->p>2 && p<8).collect(Collectors.toList());
        System.out.println(l); //2 ile 8 arasındaki sayıları filtreliyor.

        Optional<Integer> minus = list.stream().reduce((p1,p2)->p1-p2);
        System.out.println(minus.get()); //Tüm ikili sayıları birbirinden çıkartıyor.

        List<Integer> l2 = list.stream().map(p->p%2==0?p+1:p-1).collect(Collectors.toList());
        System.out.println(l2); //Sayı çift ise 1 ekliyor, tek ise 1 çıkartıyor.

        List<Integer> l3 = list.stream().map(p->p%2==0?p/2:p).collect(Collectors.toList());
        System.out.println(l3); //Çift olan sayıları 2'ye bölerek filtreliyor.

        Optional<Integer> condition = list.stream().reduce((p1,p2)->p1<p2?p1:p2);
        System.out.println(condition); //Listedeki en küçük sayıyı buluyor ve yazdırıyor.


    }
}
