package com.perry.pattern.pattern.creational.singleton;

/**
 * 懒汉式双重检查
 * 线程安全
 */
public class LazyDoubleCheckSingleton {
    /**
     * volatile 避免进行重排序（该关键字，禁止重排序）
     * 线程安全的延迟初始化
     * 多线程时cpu有共享内存，添加了volatile关键字后所有的线程都能看到共享内存的最新状态，保证内存的可见性
     * volatile修饰的共享变量在进行写操作时会多一些汇编代码：
     *      1.将当前处理器缓存行的内存写回到处理器
     *      2.使其他内存的缓存无效
     *          这样使其他处理器读取数据时，又从共享内存同步数据，这样就保证了内存的可见性. <<缓存一致性协议>>
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){

    }

    /**
     * 静态方法中synchronized锁的是类的class文件
     * 而非静态方法中synchronized锁的是堆内存中生成的对象
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //  new的重排序问题
                    // 1.分配内存给这个对象
                    // 3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    // 2.初始化对象
//                    java语言规范 所有线程在执行程序时必须要遵守 intra-thread semantics 保证重排序不会改！！变单线程！！的执行结果
//                    ---------------//3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
