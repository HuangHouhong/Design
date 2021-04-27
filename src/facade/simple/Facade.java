package facade.simple;

/**
 * 外观角色。
 */
public class Facade {

    private SubSystemA mSubSystemA;
    private SubSystemB mSubSystemB;
    private SubSystemC mSubSystemC;

    public Facade() {
        mSubSystemA = new SubSystemA();
        mSubSystemB = new SubSystemB();
        mSubSystemC = new SubSystemC();
    }

    /**
     * 对外提供的接口方法。
     * 该方法内部封装了子系统的执行
     */
    public void method1() {
        mSubSystemA.operationA();
        mSubSystemB.operationB();
        mSubSystemC.operationC();
    }
}
