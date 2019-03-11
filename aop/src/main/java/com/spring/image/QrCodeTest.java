package com.spring.image;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class QrCodeTest {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
        config.setMargin(3);
        Color foreColor = new Color(238, 110, 115);
        Color bgColor = new Color(252, 228, 236);
        int foreColorRGB = foreColor.getRGB();
        int bgColorRGB = bgColor.getRGB();
        //设置前景色
        config.setForeColor(foreColorRGB);
        // 设置背景色
        config.setBackColor(bgColorRGB);
        // 生成二维码到文件，也可以到流
        QrCodeUtil.generate("https://www.jianshu.com/u/822585e5c69a", config, FileUtil.file("d:/my_code.jpg"));
    }
}
