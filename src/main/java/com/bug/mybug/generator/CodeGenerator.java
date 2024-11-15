package com.bug.mybug.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.bug.mybug.base.BaseEntity;
import org.apache.ibatis.annotations.Mapper;

import java.net.URL;

public class CodeGenerator {
    // 作者
    static String author = "codeGen";
    // 指定父包名
    static String parent = "com.bug";
    // 模块名
    static String moduleName = "mybug";

    static String host = "127.0.0.1";
    static String username = "root";
    static String password = "123456";
    static String dataName = "test";
    static String url = "jdbc:mysql://" + host + ":3306/" + dataName + "?useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true&nullCatalogMeansCurrent=true";
    // 增加表匹配
    static String addInclude = "user";
    // 增加过滤表前缀
    static String[] addTablePrefix = {"user"};

    public static void main(String[] args) {
        URL resource = CodeGenerator.class.getClassLoader().getResource("");
        assert resource != null;
        String path = resource.getPath();
        String modulePath = path.substring(0, path.indexOf("/target"));
        System.out.println(modulePath);
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> builder
                        .author(author)
                        .outputDir(modulePath + "/src/main/java")
                        .commentDate("yyyy-MM-dd")
                        .build()

                )
                .packageConfig(builder -> builder
                        .parent(parent)
                        .moduleName(moduleName)
                        .entity("entity")
                        .controller("controller")
                        .mapper("repository.mapper")
                        .service("repository.service")
                        .serviceImpl("repository.service.impl")
                        .xml("repository.mapper.xml")
                        // .pathInfo(Collections.singletonMap(OutputFile.xml, modulePath + "/src/main/resources/mapper")) // 设置mapperXml生成路径
                        .build()
                )

                .strategyConfig(builder -> builder
                         .addInclude(addInclude) // 增加表匹配
                        // .addTablePrefix(addTablePrefix)// 增加过滤表前缀
                        .entityBuilder()
                        .superClass(BaseEntity.class)
                        .javaTemplate("/templates/entity.java")
                        .enableLombok()
                        .enableChainModel()
                        .enableFileOverride()
                        .enableColumnConstant()
                        .versionColumnName("version")
                        .logicDeletePropertyName("deleted")
                        .addSuperEntityColumns("id", "created_by", "created_time", "updated_by", "updated_time","deleted_time","deleted","version")
                        .addTableFills(new Column("created_by", FieldFill.INSERT))
                        .addTableFills(new Column("created_time", FieldFill.INSERT))
                        .addTableFills(new Column("updated_by", FieldFill.INSERT_UPDATE))
                        .addTableFills(new Column("updated_time", FieldFill.INSERT_UPDATE))
                        .disableSerialVersionUID()
                        //.idType(IdType.AUTO)
                        .formatFileName("%sEntity")
                        .build()

                        .controllerBuilder()
                        .enableHyphenStyle()
                        .enableRestStyle()
                        .formatFileName("%sController")
                        .enableFileOverride()
                        // .disable()
                        .build()

                        .serviceBuilder()
                        .formatServiceFileName("%sService")
                        .formatServiceImplFileName("%sServiceImpl")
                        .enableFileOverride()
                        .build()

                        .mapperBuilder()
                        .superClass(BaseMapper.class)
                        .mapperAnnotation(Mapper.class)
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .formatMapperFileName("%sMapper")
                        .formatXmlFileName("%sMapper")
                        .enableFileOverride()
                        .build()
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
