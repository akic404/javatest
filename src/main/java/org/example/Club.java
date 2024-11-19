package org.example;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;


import java.time.LocalDate;

@Data
public class Club {
    @ExcelProperty("社团名称")
    String name;//社团名称
    @ExcelProperty("创办时间")
    LocalDate Setup_time;//创办时间
    @ExcelProperty("责任老师")
    String Mgr_Tch;//责任老师
    @ExcelProperty("责任学生")
    String Mgr_Stu;//责任学生

    int Nmb_Stu;//学生总人数
    //学生列表
    int Nmb_SpecMeb;//特殊学生书数量（有职位）
    //特殊学生列表

    int Nmb_act;//活动数量
    //活动列表
}