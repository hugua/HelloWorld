package com.chen.test;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Test;

/**
 * Created by cvter on 2017/6/22.
 */
public class UtilTest {
    @Test
    public  void  chartTest() throws Exception {
        //数据集
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );

        dataset.addValue( 144 , "" , "一年级" );
        dataset.addValue( 233 , "" , "二年级" );
        dataset.addValue( 1124 , "" , "三年级");
        dataset.addValue( 13 , "" , "四年级" );
        dataset.addValue( 244 , "", "五年级" );
        JFreeChart jFreeChart = ChartUtils.createBarChart(dataset,null,null,null);
        ChartUtils.chartToImage(jFreeChart,"1.jpeg");
        JFreeChart jFreeChart2 = ChartUtils.createLineChart(dataset,null,null,null);
        ChartUtils.chartToImage(jFreeChart2,"2.jpeg");
    }
}
