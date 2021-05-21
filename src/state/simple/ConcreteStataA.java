package state.simple;

/**
 * 具体状态。
 * 一般具体状态需要持有Context对象.在子类方法中可能需要调用Context方法去改变状态
 */
public class ConcreteStataA extends State {

    Context mContext;

    public ConcreteStataA(Context context) {
        mContext = context;
    }

    @Override
    public void handleA() {
        System.out.println("当前是状态A");
        // 执行完成方法后，改变状态
        mContext.setCurrentState(mContext.getStateB());
    }

    @Override
    public void handleB() {
        System.out.println("当前是状态A,禁止使用B方法");
    }
}
