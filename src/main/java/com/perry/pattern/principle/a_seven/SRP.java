package com.perry.pattern.principle.a_seven;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * SRP：Single responsibility principle
 * 单一职责原则
 *   不要存在多于一个导致类变更的原因
 *
 * 每个类、每个方法、每个接口、每个框架都只负责一件事。
 *
 *  比如：
 *      Math.round() 只负责完成四舍五入的功能，其他不管！（方法）
 *      Reader类，只负责读取文本文件（类）
 *      SpringMVC，只负责简化MVC的开发（框架）
 *          1.代码重用性高
 *          2.代码可读性提高，此时的代码，就像一个大纲。
 *
 * 优点：降低类的复杂度、提高类的可读性，提高系统的可维护性、降低变更引起的风险
 *
 * 案例：文件内容读取----->>> 读取行数、单词数、字母数
 */
public class SRP {

    public static String loadFile(String path) throws IOException {
        Reader in = new FileReader(path);
        BufferedReader br = new BufferedReader(in);
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append(" ");
        }
        br.close();
        return sb.toString();
    }

    public static String[] getWords(String str) {
        return str.split("[^a-zA-Z]+");
    }

    public static String[] getLines(String str) {
        return str.split("[.!?。，\n]+");
    }

    public static List<String> getLetter(String str) {
        Pattern pattern = Pattern.compile("[a-zA-Z]*");
        char[] chars = str.toCharArray();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < chars.length; i++) {
            if (pattern.matcher("" + chars[i]).matches()) {
                list.add(chars[i] + "");
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
//        String txt = loadFile("/Users/perry/IdeaProjects/Pattern/src/srp.txt");
        String txt = loadFile(System.getProperty("user.dir") + File.separator + "src" + File.separator + "srp.txt");
        String[] words = getWords(txt);
        String[] lines = getLines(txt);
        List<String> letters = getLetter(txt);
        System.out.println("letters : " + letters.size());
        System.out.println("lines : " + lines.length);
        System.out.println("length : " + words.length);
    }
}
