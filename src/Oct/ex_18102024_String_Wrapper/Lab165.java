package Oct.ex_18102024_String_Wrapper;

public class Lab165 {
}
class Super {

    private int a;

    protected Super(int a) {
        this.a = a;
    }
    Super(){

    }

}

class Sub extends Super {

    public Sub(int a) {
        super(a);
    }

    public Sub() {
        super();
    }

}