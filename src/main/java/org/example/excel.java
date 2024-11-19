package org.example;


import java.io.File;
import java.util.List;
import java.util.Map;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.converters.DefaultConverterLoader;
import com.alibaba.excel.enums.CellExtraTypeEnum;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.read.metadata.holder.csv.CsvReadWorkbookHolder;
import com.alibaba.excel.util.ListUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class excel {

    public void simpleRead0() {

        EasyExcel.read("/home/akic/Documents/test2.xlsx",
                Club.class, new PageReadListener<Club>((club)-> {
                    //log.info("解析到一条数据:{}", club);
                    System.out.println("hi");
                    System.out.println(club);
            })).sheet().doRead();
    }
    public void simpleRead1() {
        EasyExcel.read("/home/akic/Documents/test2.xlsx",
                Teachers.class, new PageReadListener<Teachers>((teacher)-> {
                    System.out.println(teacher);
                })).sheet().doRead();
    }
    public void simpleRead2() {
        EasyExcel.read("/home/akic/Documents/test2.xlsx",
                Students.class, new PageReadListener<Students>((students)-> {
                    System.out.println(students);
                })).sheet().doRead();
    }
    public void simpleRead3() {
        EasyExcel.read("/home/akic/Documents/test2.xlsx",
                Activities.class, new PageReadListener<Activities>((activity)-> {
                    System.out.println(activity);
                })).sheet().doRead();
    }
}