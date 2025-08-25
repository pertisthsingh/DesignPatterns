package Patterns.SingletonDesign;

//public class LazySingleton {
//    private static LazySingleton instance;
//    private LazySingleton() {
//
//    }
//
//    // this works well but this is not thread safe
//    public static LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }
//}


// this is thread safe because the inner holder class doesn't get called when LazySingleton is called
// this only get called when getInstance gets called
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {}

    private static class Holder {
        public static final LazySingleton lazySingletonInstance = new LazySingleton();
    }

    public static LazySingleton getInstance(){
        return Holder.lazySingletonInstance;
    }
}
