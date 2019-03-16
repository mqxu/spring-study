package com.spring.web.util;

import java.util.Random;

/**
 * 生成随机班课码
 */
public class RandomCode {
    public static String getRandomCode() {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(10);
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }
}
