package state.simple;

/**
 * 具体状态。
 * 一般具体状态需要持有Context对象.在子类方法中可能需要调用Context方法去改变状态
 */
public class ConcreteStataB extends State {

    Context mContext;

    public ConcreteStataB(Context context) {
        mContext = context;
    }

    @Override
    public void handleA() {
        System.out.println("当前状态为B,禁止使用A方法");
    }

    @Override
    public void handleB() {
        System.out.println("当前状态是B");
        // 执行完成后，改变状态
        mContext.setCurrentState(mContext.getStateA());
    }
}
