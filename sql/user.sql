
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户的唯一标识符',
  `username` varchar(50) NOT NULL COMMENT '用户名，用于登录',
  `password_hash` varchar(255) NOT NULL COMMENT '密码哈希值，用于安全存储',
  `email` varchar(100) NOT NULL COMMENT '用户邮箱地址，用于账户验证或找回密码',
  `first_name` varchar(50) DEFAULT NULL COMMENT '名字',
  `last_name` varchar(50) DEFAULT NULL COMMENT '姓氏',
  `phone_number` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `date_of_birth` date DEFAULT NULL COMMENT '出生日期',
  `gender` enum('M','F') DEFAULT NULL COMMENT '性别，M代表男性，F代表女性',
  `address` text COMMENT '地址',
  `city` varchar(50) DEFAULT NULL COMMENT '城市',
  `state` varchar(50) DEFAULT NULL COMMENT '州/省',
  `country` varchar(50) DEFAULT NULL COMMENT '国家',
  `postal_code` varchar(20) DEFAULT NULL COMMENT '邮政编码',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '账户创建时间',
  `updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次更新信息的时间',
  `last_login` datetime DEFAULT NULL COMMENT '上次登录时间',
  `is_active` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否激活状态，用于判断账户是否可用',
  `is_staff` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否为管理员',
  `profile_picture` varchar(255) DEFAULT NULL COMMENT '头像图片链接或路径',
  `deleted_time` timestamp NULL DEFAULT NULL COMMENT '删除时间',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除标志',
  `created_by` bigint DEFAULT NULL COMMENT '创建者',
  `updated_by` bigint DEFAULT NULL COMMENT '更新者',
  `version` bigint NOT NULL DEFAULT '1' COMMENT '版本号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=526121 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';

SET FOREIGN_KEY_CHECKS = 1;
