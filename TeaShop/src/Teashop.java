import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
interface Shop{
    void imports(Ingredient ingredient);
    void sale(String name,String string);
}
class Teashop implements Shop {
    List<Bubble> bubble = new ArrayList<>();
    List<Coconut> coconut = new ArrayList<>();
    public void imports(Ingredient ingredient){
        if(ingredient instanceof Bubble){
            addin((Bubble) ingredient);
        }
        if(ingredient instanceof Coconut){
            addin((Coconut) ingredient);
        }
    }
    private void addin(Bubble bubble1){
        bubble.add(bubble1);
    }
    private void addin(Coconut coconut1){
        coconut.add(coconut1);
    }

    public void sale(String name,String string){
        int year1;
        int month1;
        int day1;
        try{
            Calendar calendar=Calendar.getInstance();

            if(string == "Bubble"){
                if (!bubble.isEmpty()) {
                    for (int i=0;i<bubble.size();i++) {
                        year1=calendar.get(Calendar.YEAR);
                        month1=1+calendar.get(Calendar.MONTH);
                        day1=calendar.get(Calendar.DAY_OF_MONTH);
                        year1 -= bubble.get(i).year;
                        month1 -= bubble.get(i).month;
                        day1 -= bubble.get(i).day;
                        if (month1 < 0 && year1 > 0) {
                            month1 += 12;
                            year1 -= 1;
                        }
                        while(month1 > 0) {
                            day1 += 30;       /*假设每个月都是30天*/
                            month1 -= 1;
                        }
                        if (day1 > bubble.get(i).expiration_date) {
                            bubble.remove(i);
                        }
                    }
                }
                if(!bubble.isEmpty()) {
                    bubble.remove(0);
                    System.out.println("珍珠奶茶，谢谢惠顾。");
                }
                else
                    throw new SoldOutException();
            }
            if(string == "Coconut"){
                if (!coconut.isEmpty()) {
                    for (int i=0;i<coconut.size();i++) {
                        year1=calendar.get(Calendar.YEAR);
                        month1=1+calendar.get(Calendar.MONTH);
                        day1=calendar.get(Calendar.DAY_OF_MONTH);
                        year1 -= coconut.get(i).year;
                        month1 -= coconut.get(i).month;
                        day1 -= coconut.get(i).day;
                        if (month1 < 0 && year1 > 0) {
                            month1 += 12;
                            year1 -= 1;
                        }
                        while(month1 > 0) {
                            day1 += 30;       /*假设每个月都是30天*/
                            month1 -= 1;
                        }
                        if (day1 > coconut.get(i).expiration_date) {
                            coconut.remove(i);
                        }
                    }
                }
                if(!coconut.isEmpty()) {
                    coconut.remove(0);
                    System.out.println("椰果奶茶，谢谢惠顾。");
                }
                else
                    throw new SoldOutException();
            }

        }catch (SoldOutException s){
            System.out.println("已售罄,缺货中。");
        }
    }
}
