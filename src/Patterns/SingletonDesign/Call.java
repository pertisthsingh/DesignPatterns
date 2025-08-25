package Patterns.SingletonDesign;

public class Call {

    // calling eagerly
    public final static EagerSingleton eagerSingletonInstance = EagerSingleton.getInstance();

    // calling lazy -- which mean when need then only create the instance of the class

}
