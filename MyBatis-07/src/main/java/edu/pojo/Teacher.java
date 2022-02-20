package edu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/8 17:01
 * @email p2hemia@nyist.edu.cn
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int id;
    private String name;

//    一个老师有多个学生
    private List<Student> students;
}
