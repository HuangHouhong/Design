package adapter.simple;

/**
 * 被适配对象
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("被适配对象的接口调用啦啦");
    }
}
