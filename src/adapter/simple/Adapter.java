package adapter.simple;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        // 在目标接口的方法中，调用被适配对象的特殊方法以完成接口的转换
        this.specificRequest();
    }
}
