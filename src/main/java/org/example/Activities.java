package org.example;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.time.LocalDateTime;
//社团活动
@Data
public class Activities {
    @ExcelProperty("活动名称")
    String name;//活动名称
    @ExcelProperty("活动时间")
    LocalDateTime time;//活动时间
    @ExcelProperty("活动地点")
    String place;//地点

}
