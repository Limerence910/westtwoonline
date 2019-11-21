abstract class Ingredient {
    protected int expiration_date;
    protected String name;
    protected int year; /*生产日期*/
    protected int month;
    protected int day;

    public Ingredient(String name,int year,int month,int day,int expiration_date){
        this.name=name;
        this.year=year;
        this.month=month;
        this.day=day;
        this.expiration_date=expiration_date;
    }

    @Override
    public String toString() {
        return "Ingredient{" + "expiration_date=" + expiration_date + ", name='" + name + '\'' + ", year=" + year + ", month=" + month + ", day=" + day + '}';
    }
}