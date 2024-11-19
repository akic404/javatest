package org.example;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.time.LocalDate;
@Data
public class Teachers {
    @ExcelProperty("姓名")
    String name;//姓名
    @ExcelProperty("出生日期")
    LocalDate born;//出生日期
    @ExcelProperty("专业")
    String major;//专业

}
