



/*
abstract class a{
    //yani ben şunu anladım kodda kulnacğım fonksiyonlar veya constructerlar veya dahasını burda tanımlıyorum ve gelistiriciler bunları alıp proojede üstüne  bişeyler ekleyip kullanıyorlar


    abstract void method1();

    int method(){
        return 0;
    }

}
class b extends a{
    //soyut metodlar  override edilmeli
    //kalıtım aldığı classı nconstructerını burdada superclass ile alabiliriz
    public void method1() {

    }
}
*/
abstract  class person{
    private String id;
    private String address;
    person(String id,String address){
        this.setAddress(address);
        this.setId(id);

    }
    abstract String write();
    abstract String writeAddress();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


class employee extends person{
    public String write(){
        return getId();

    }
    public String writeAddress(){
        return getAddress();

    }
    int workhour,workprice;
    employee(int workhour,int workprice,String id,String address){
        super(id,address);
        this.workhour=workhour;
        this.workprice=workprice;
    }
    public int calculateSalary(){
        return workprice*workhour;

    }


}
class student extends person{
    public String write(){
        return getId();


    }
    public String writeAddress(){
        return getAddress();

    }
    String school;
    int term;
    student(String school,int term,String id,String address){
        super(id,address);
        this.school=school;
        this.term=term;
    }
    public void writeInfo(){
        System.out.println("okuladı="+school);
        System.out.println("donem:"+term);
        System.out.println("ogrenci id:"+getId());
        System.out.println("ogrenci address:"+getAddress());

    }

}




public class Main {
    public static void main(String[] args) {
        //abstract classlar javada bu class artık soyut classlarda.yani abstract classı kalıtım ile alan klaslar nu implemente etmeli
        /*a yeni;//abstract class olduğu  için olmuyor
        yeni = new a;*/


        student st=new student("etuğrul gazi",1,"34534565654654","ucpınar");
        System.out.println("ogrenci okuladı:"+st.school);
        System.out.println("ogrenci donemi:"+st.term);
        System.out.println("ogrenci id:"+st.getId());
        System.out.println("ogrenciaddress:"+st.getAddress());
        //veya şu fonksiyon ile yaz
        System.out.println("\n\n");
        st.writeInfo();


        employee emp=new employee(12,500,"845734574356435","kavaklı");
        System.out.println("\n\ncalısan toplam calısama saati:"+emp.workhour);
        System.out.println("calısan saatlik ücret:"+emp.workprice);
        System.out.println("calısan id:"+emp.getId());
        System.out.println("calısan address:"+emp.getAddress());
        System.out.println("calısana odenecek ucret:"+emp.calculateSalary());
    }
}