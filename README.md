# JavaDesignPatterns
24 Java design pattern examples.
# Singleton
5 ways to get single instance.
> 饿汉式
```
public class HungryInstance {

    private static final HungryInstance INSTANCE = new HungryInstance();

    private HungryInstance() {
    }

    public static HungryInstance getInstance() {
        return INSTANCE;
    }
}
```
> 懒汉式
```
public class LazyInstance {

    private static LazyInstance instance;

    private LazyInstance() {
    }

    public static synchronized LazyInstance getInstance() {
        if (instance == null) {
            instance = new LazyInstance();
        }
        return instance;
    }
}
```
> 内部类
```
public class InnerClassInstance {

    private InnerClassInstance() {
    }

    public static InnerClassInstance getInstance() {
        return SingleHolder.INSTANCE;
    }

    private static class SingleHolder {
        private static final InnerClassInstance INSTANCE = new InnerClassInstance();
    }
}
```
> 双重加锁
```
public class DoubleCheckInstance {

    private static volatile DoubleCheckInstance instance;

    private DoubleCheckInstance() {
    }

    public static DoubleCheckInstance getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckInstance.class) {
                if (instance == null) {
                    instance = new DoubleCheckInstance();
                }
            }
        }
        return instance;
    }
}
```
> 枚举
```
public enum EnumInstance {

    INSTANCE
}
```
# Sample source code
[https://github.com/kuangxiaoguo0123/JavaDesignPatterns](https://github.com/kuangxiaoguo0123/JavaDesignPatterns)
# Link
[https://gof.quanke.name](https://gof.quanke.name)
