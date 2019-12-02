package com.perry.pattern.pattern.creational.singleton;

/**
 * 懒汉式
 * 无法防御反射攻击
 * 可防御序列化与反序列化攻击但依旧无法避免反序列化时多生成了一个对象
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    // 试图防御反射攻击
    /*private static boolean flag = true;

    private LazySingleton() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }*/

    /**
     * 静态方法中synchronized锁的是类的class文件
     * 而非静态方法中synchronized锁的是堆内存中生成的对象
     *
     * @return
     */
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /*public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class objectClass = LazySingleton.class;
        Constructor c = objectClass.getDeclaredConstructor();
        c.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();

        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1,true);


        LazySingleton o2 = (LazySingleton) c.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1==o2);
    }*/

}
