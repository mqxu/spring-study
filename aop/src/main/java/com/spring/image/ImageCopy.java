package com.spring.image;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * 业务类，实现图片拷贝
 */
public class ImageCopy {
    private static final Logger logger = LoggerFactory.getLogger(ImageCopy.class);

    public void copyImage() throws IOException {
        logger.info("开始将图片从D盘复制到E盘...");
        File srcFile = new File("D:/bg1.jpg");
        File destFile = new File("E:/bg1.jpg");
        InputStream in = new FileInputStream(srcFile);
        OutputStream out = new FileOutputStream(destFile);
        byte[] bytes = new byte[(int) srcFile.length()];
        int len;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }
        in.close();
        out.close();
    }
}
