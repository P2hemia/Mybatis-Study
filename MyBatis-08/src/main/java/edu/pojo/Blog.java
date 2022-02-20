package edu.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/9 16:29
 * @email p2hemia@nyist.edu.cn
 **/
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;     //属性名和字段名不一致
    private int views;
}
