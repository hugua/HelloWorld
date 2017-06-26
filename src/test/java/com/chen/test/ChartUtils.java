package com.chen.test;


import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;
import java.io.File;
import java.text.NumberFormat;

/**
 * Created by cvter on 2017/6/22.
 */
public class ChartUtils {
    public static JFreeChart createBarChart(DefaultCategoryDataset dataset,String title,String categoryAxisLabel,String valueAxisLabel){
        JFreeChart jFreeChart =  ChartFactory.createBarChart(title, categoryAxisLabel, valueAxisLabel, dataset,
                PlotOrientation.VERTICAL, false, true,true );
        //图表背景色,设置为背景无边框
        jFreeChart.setBackgroundPaint(ChartColor.WHITE);
        jFreeChart.setBorderVisible(false);
        jFreeChart.setBorderPaint(null);

        //坐标轴数据区的绘制，设置网格线的颜色和背景颜色
        CategoryPlot categoryplot = (CategoryPlot) jFreeChart.getPlot();
        categoryplot.setRangeGridlinesVisible(true);
        categoryplot.setRangeGridlineStroke(new BasicStroke(0.1f));
        categoryplot.setRangeGridlinePaint(ChartColor.DARK_BLUE);
        categoryplot.setBackgroundPaint(ChartColor.WHITE);
        categoryplot.setOutlineVisible(false);

        //坐标轴设置
        NumberAxis numberAxis = (NumberAxis) categoryplot.getRangeAxis();
        numberAxis.setAutoRangeIncludesZero(true);
        double unit = 100d;
        NumberTickUnit ntu= new NumberTickUnit(unit);
        numberAxis .setTickUnit(ntu);
        numberAxis.setAxisLineVisible(false);
        NumberFormat format = NumberFormat.getIntegerInstance();
        format.setGroupingUsed(false);
        numberAxis.setNumberFormatOverride(format);

        //柱图的呈现器
        BarRenderer renderer = (BarRenderer) categoryplot.getRenderer();
        renderer.setIncludeBaseInRange(true); // 显示每个柱的数值，并修改该数值的字体属性
        renderer.setMaximumBarWidth(0.1);
        StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator = new StandardCategoryItemLabelGenerator("{2}",format);
        renderer.setBaseItemLabelGenerator(standardCategoryItemLabelGenerator);
        renderer.setBaseItemLabelsVisible(true, true);

        //设置柱子的颜色
        for(int i = 0; i < dataset.getRowKeys().size();i ++ ) {
            renderer.setSeriesPaint(i, Color.blue);
        }
        return  jFreeChart;
    }

    public static JFreeChart createLineChart(DefaultCategoryDataset dataset,String title,String categoryAxisLabel,String valueAxisLabel){
        JFreeChart jFreeChart =  ChartFactory.createLineChart(title, categoryAxisLabel, valueAxisLabel, dataset,
                PlotOrientation.VERTICAL, false, true,true );
        //图表背景色
        jFreeChart.setBackgroundPaint(ChartColor.WHITE);
        jFreeChart.setBorderVisible(false);
        jFreeChart.setBorderPaint(null);

        //坐标轴的绘制
        CategoryPlot categoryplot = (CategoryPlot) jFreeChart.getPlot();
        categoryplot.setRangeGridlinesVisible(true);
        categoryplot.setRangeGridlineStroke(new BasicStroke(0.1f));
        categoryplot.setRangeGridlinePaint(ChartColor.DARK_BLUE);
        categoryplot.setBackgroundPaint(ChartColor.WHITE);
        categoryplot.setOutlineVisible(false);
//        categoryplot.setRangeZeroBaselineVisible(true);
        //坐标轴设置
        NumberAxis numberAxis = (NumberAxis) categoryplot.getRangeAxis();
        numberAxis.setAutoRangeIncludesZero(true);
        double unit = 100d;
        NumberTickUnit ntu= new NumberTickUnit(unit);
        numberAxis .setTickUnit(ntu);
        numberAxis.setAxisLineVisible(false);

        //柱图的呈现器
        LineAndShapeRenderer renderer = (LineAndShapeRenderer) categoryplot.getRenderer();
//        renderer.setBarPainter(new StandardBarPainter());//取消渐变效果

        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(true, true);
//        renderer.setShadowVisible(false);//不显示阴影
        //设置柱子的颜色
        for(int i = 0; i < dataset.getRowKeys().size();i ++ )
            renderer.setSeriesPaint(i, Color.blue);
        return  jFreeChart;
    }


    public static void chartToImage(JFreeChart chart,String fileName) throws Exception{
        int width = 640; /* Width of the image */
        int height = 320; /* Height of the image */
        File BarChart = new File( fileName );
        ChartUtilities.saveChartAsJPEG( BarChart , chart , width , height );
    }
}
