package edu.utils;

import java.util.UUID;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/9 16:33
 * @email p2hemia@nyist.edu.cn
 **/
@SuppressWarnings("all")    //抑制警告
public class IDutils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
