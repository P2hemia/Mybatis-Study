package edu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/8 17:00
 * @email p2hemia@nyist.edu.cn
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;

    //学生需要关联一个老师
    private Teacher teacher;

}
