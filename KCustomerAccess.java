package classAndConstructor;

public class KCustomerAccess {
    public static void main(String[] args) {
        //코틀린 클래서의 컴패니언 객체를 접근
        System.out.println(KCustomer.LEVEL);
        KCustomer.login(); //어노테이션을 사용할 때 접근 방법
        KCustomer.Companion.login(); //위와 동일한 결과로 어노테이션을 사용하지 않을 때 접근 방법
    }
}
