package com.soft1851.springboot.mbp.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/16
 */
@Slf4j
public class MyBatisPlusGenerator {
    public static void main(String[] args) {
        //全局策略配置
        GlobalConfig config = new GlobalConfig();
        //获得当前项目根路径d:/dev/SpringBoot/spring-boot-learning
        String projectPath = System.getProperty("user.dir");
        config.setActiveRecord(true)
                //作者注释
                .setAuthor("yhChen")
                //代码生成输出路径
                .setOutputDir(projectPath + "/spring-boot-mybatis-plus/src/main/java")
                //覆盖已有文件，默认false
                .setFileOverride(true)
                //是否打开输出目录窗口。默认true
                .setOpen(false)
                //开启swagger2模式
                //.setSwagger2(true)
                //开启ActiveRecord模式
                .setActiveRecord(true)
                //mapper添加restMap
                .setBaseResultMap(true)
                //mapper添加Base_Column_List
                .setBaseColumnList(true)
                //时间类型对应策略，默认time_pack
                //.setDateType(DateType.TIME_PACK)
                //相关包中的接口和类名后缀
                .setMapperName("%sMapper")
                .setServiceName("%sService")
                .setServiceImplName("%sServiceImpl");

        //数据库表配置，通过该配置，可指定需要生成哪些表或者排除哪些表
        StrategyConfig strategyConfig = new StrategyConfig();
        //是否大写命名
        strategyConfig.setCapitalMode(true)
                //是否跳过视图
                .setSkipView(true)
                //数据库表映射到实体的命名策略为驼峰式
                .setNaming(NamingStrategy.underline_to_camel)
                //生成表，可以写多个,如果不加参数，默认为所有表
//                .setInclude("operate_log", "clazz", "teacher", "student", "course", "course_student")
                .setEntityBuilderModel(true)
                .setEntityLombokModel(true)
                .setRestControllerStyle(true)
                .setEntityTableFieldAnnotationEnable(true);

        //包名配置
        PackageConfig packageConfig = new PackageConfig();
        //父包名
        packageConfig.setParent("com.soft1851.springboot.mbp")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setXml("mapper")
                .setEntity("entity");

        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://rm-m5ee476bu350735gjeo.mysql.rds.aliyuncs.com:3306/db_cyh?useUnicode=true&characterEncoding=utf8&useSSL=false&autoReconnect=true&allowMultiQueries=true")
                .setUsername("root")
                .setPassword("XuNiit_#");

        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(config)
                .setStrategy(strategyConfig)
                .setDataSource(dataSourceConfig)
                .setTemplateEngine(new FreemarkerTemplateEngine())
                .setPackageInfo(packageConfig);

        autoGenerator.execute();
        log.info("=============代码生成成功================");
    }
}