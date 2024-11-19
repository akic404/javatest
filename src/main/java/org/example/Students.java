package org.example;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.time.LocalDate;
@Data
public class Students {
    //@ExcelProperty(index = 0)
    private String name;//姓名
    //@ExcelProperty(index = 1)
    private String id;//学号
    //@ExcelProperty(index = 2)
    private LocalDate born;//出生日期
    //@ExcelProperty(index = 3)
    private String major;//专业
    //@ExcelProperty(index = 4)
    private String year;//入学学年
    //@ExcelProperty(index = 5)
    private String position;//职位
}
