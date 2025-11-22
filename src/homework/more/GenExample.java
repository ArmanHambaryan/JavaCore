package homework.more;

public class GenExample<T> {

    T ob;

    T getOb() {
        return ob;
    }
    GenExample (T ob){
        this.ob = ob;
    }

    void setOb(T ob) {
        this.ob = ob;
    }
     void showType(){
        System.out.println("Type ob = " + ob.getClass().getName());

    }

}
