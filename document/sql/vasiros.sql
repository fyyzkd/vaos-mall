use mall;

drop table if exists control_function;
CREATE TABLE control_function (
	id      BIGINT(50)  NOT NULL COMMENT '功能控制id',
	name    varchar(64)  NULL	 COMMENT '功能名称',
	control_desc    varchar(50)  NULL	 COMMENT '功能描述',
	control_value varchar(200) NULL	 COMMENT '功能控制设值',
	primary key (id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='功能控制表(运营维护-系统维护-功能控制)';
insert into control_function VALUES (8,'charge_switch_control', '计费开关','0'); -- 0、关闭1、开启

-- ALTER TABLE control_function change control control_value varchar(200) NULL	 COMMENT '功能控制设值' --修改表字段名;

drop table if exists common_identity;
CREATE TABLE common_identity (
	tablename	varchar(50)  NOT NULL 	COMMENT '表名称',
	idvalue		int 		 NULL 		COMMENT '表自增Id',
    PRIMARY KEY(tablename)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='自增id记录表,记录各种表自增序列号';

DROP TABLE IF EXISTS instance_dc_vdc_rel;
CREATE TABLE instance_dc_vdc_rel(
  instanceid BIGINT(50)		NOT NULL COMMENT'云主机ID',
  vdcid 		BIGINT(50)  NOT NULL COMMENT 'VDC ID',
  dcid		BIGINT(50) 		NOT NULL COMMENT 'DC ID',
  tenantid 	BIGINT(50) 		NOT NULL COMMENT '租户ID'
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='VDC-DC-租户-云主机关系表';

drop table if exists rights_group;
CREATE TABLE rights_group (
	id						BIGINT(50)  	NOT NULL COMMENT 'ID',
	name					varchar(50) 	NOT NULL COMMENT '名称',
	description				varchar(50) 	NULL COMMENT '描述',
	extra					varchar(50)	NULL COMMENT' 扩展字段',
    PRIMARY KEY(id)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='操作组';

drop table if exists rightsgrp_operation_rel;
CREATE TABLE rightsgrp_operation_rel (
	group_id				BIGINT(50)  	NOT NULL COMMENT '权限组id',
	operation_id			BIGINT(50)  	NOT NULL COMMENT '关联的操作码id'
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='操作组关联的操作码';
-- 
drop table if exists rightsgrp_user_rel;
CREATE TABLE rightsgrp_user_rel (
	group_id				BIGINT(50)  	NOT NULL COMMENT '权限组id',
	type					varchar(10) 	NOT NULL COMMENT '0: 管理门户 1:用户门户 2：用户组',
	user_id					BIGINT(50)  	NOT NULL COMMENT '关联的用户id/管理员id/用户组id'
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='操作组-用户组关系';

drop table if exists operation_code;
CREATE TABLE operation_code (
	id						BIGINT(50)  	NOT NULL COMMENT 'ID',
	name					varchar(100) 	NOT NULL COMMENT '名称',
	parentType				varchar(250) 	NULL COMMENT '描述',
    PRIMARY KEY(id)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='操作码';

drop table if exists user_group;
CREATE TABLE user_group (
	id 				BIGINT(50)		NOT NULL,	
	vdcid 			BIGINT(50) 		NOT NULL 	COMMENT 'VDC ID',
	usergroupname 	varchar(64)		NOT NULL 	COMMENT '用户组名称',	
	description 	varchar(250) 	NULL 		COMMENT '用户组描述信息',		
	extra 			varchar	(500) 	NULL 		COMMENT '用户组扩展信息', 
	createdtime 	datetime 		NULL 		COMMENT '用户组创建时间',
	type 			int 			default 0 	COMMENT '用户组类型',	
	PRIMARY KEY(id) 
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='VDC用户组列表';

drop table if exists user_grp_rel;
CREATE TABLE user_grp_rel(
	usergroupid BIGINT(50) NOT NULL COMMENT '用户组Id',	
	userid 		BIGINT(50) NOT NULL COMMENT '用户Id'
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='VDC用户组与用户关联关系表';

drop table if exists user_info;
CREATE TABLE user_info (
	userid  	BIGINT(50) 		NOT NULL COMMENT 'userId',
	vdcid   	BIGINT(50) 		NOT NULL COMMENT 'vdcId',
	username	varchar(100) 	NOT NULL COMMENT '用户名',
	password	varchar(128) 	NOT NULL COMMENT '用户密码',
	email   	varchar(255) 	NULL COMMENT 'Email',
	phone   	varchar(255)  	NULL COMMENT '联系方式',
	orgid		BIGINT(50)  	NULL COMMENT '所属组织',
	type		int 		 	NULL COMMENT '类型',
	status		int 		 	NULL COMMENT '状态',
	description	text				 COMMENT '描述信息',
	opinion		text				 COMMENT '不清楚',
	extra		varchar(1024) 	NULL COMMENT '额外信息',
	createdtime	datetime 		NULL COMMENT '创建时间',
	auditedtime	datetime 		NULL COMMENT 'xx时间',
	islock 		int				default 0	COMMENT '是否锁定，0是未锁定，1是锁定',
	lockperiod 	int				default 0 	COMMENT '锁定期限天数',
	locktime 	datetime		NULL		COMMENT '锁定时间',
	isdisable 	int				default 0 	COMMENT '账户禁用，0是启用，1是禁用',
	usedate 	varchar(100)	NULL		COMMENT '账户有效期',
	iplimit 	int				default 0	COMMENT '登录ip是否限制，0是不限制，1是限制',
	allowIp 	varchar(256)	NULL		COMMENT '允许登录的ip组',
	begintime 	varchar(100)	NULL		COMMENT '开始时间',
	endtime 	varchar(100)	NULL		COMMENT '结束时间',
	maxtrytime 	int				default 0  COMMENT '登录错误次数限制，0是不限制，其他数值为限制次数',
	PRIMARY KEY(userid)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='VDC用户列表';

drop table if exists om_vdc;
CREATE TABLE om_vdc (
	vdcid   	BIGINT(50) NOT NULL ,	
	vdcname 	varchar(64) NOT NULL COMMENT 'vdc名称',
	vdcdesc 	varchar(256) NULL COMMENT 'vdc描述信息',
	domainid	BIGINT(50) DEFAULT 0 NOT NULL,
	tenantid	BIGINT(50) NULL COMMENT '租户Id',
	infoSecurityLevel int NULL,
	isdisaster  tinyint default 0 COMMENT '是否容灾',
	PRIMARY KEY (`vdcid`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='VDC表';


DROP TABLE IF EXISTS `system_config`;
CREATE TABLE `system_config` (
  `id` BIGINT(50) NOT NULL AUTO_INCREMENT,
  `param_name` VARCHAR(255) DEFAULT NULL COMMENT '系统配置名称',
  `param_value` VARCHAR(255) DEFAULT NULL COMMENT '系统配置参数',
  `paramgroup` VARCHAR(255) DEFAULT NULL COMMENT '系统配置分组',
  `param_desc` VARCHAR(255) DEFAULT NULL COMMENT '系统配置说明',
  `description` VARCHAR(255) DEFAULT NULL COMMENT '系统配置描述',
  `field_type` TINYINT(4) DEFAULT NULL,
  `visiblelevel` INT(1) DEFAULT 1  COMMENT '配置是否显示',
  `max_value` VARCHAR(50) DEFAULT NULL  COMMENT '参数最大值',
  `min_value` VARCHAR(50) DEFAULT NULL  COMMENT '参数最小值',
   PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='系统配置表';


DROP TABLE IF EXISTS `vasiros_instance`;
CREATE TABLE `vasiros_instance` (
  `id` BIGINT(50) NOT NULL AUTO_INCREMENT,
  `instance_name` VARCHAR(50) DEFAULT NULL COMMENT '云主机名称',
  `show_status` INT(1) DEFAULT NULL COMMENT '云主机状态',
  `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
   PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='云主机表';

DROP TABLE IF EXISTS vdc_dc_res_static;
CREATE TABLE vdc_dc_res_static (
	vdc_id 				BIGINT(50)	NOT NULL COMMENT 'VDC Id',
	dcid				BIGINT(50) 	NOT NULL COMMENT 'DC ID',
	dcName				VARCHAR(100) 	NOT NULL COMMENT 'DC 名称',
	instances 			INT(11) 		NOT NULL COMMENT '云主机个数',
	cpu 				INT(11) 		DEFAULT '0' COMMENT 'cpu大小',
	cpu_rate 			DOUBLE 			DEFAULT '0' COMMENT 'cpu使用率',
	MEMORY 				INT(11) 		DEFAULT '0' COMMENT  '内存大小',
	mem_rate			DOUBLE 			DEFAULT '0' COMMENT  '内存使用率',
	DISK 				INT(11) 		DEFAULT '0' COMMENT  '磁盘大小',
	router 				INT(11) 		DEFAULT '0' COMMENT  '路由器个数',
	fireWalls 			INT(11) 		DEFAULT '0' COMMENT  '防火墙个数',
	fireWallSwitch      TINYINT 		DEFAULT '0' COMMENT '是否启用防火墙，0:  不启用   1: 启用',
	pubNetIp 			INT(11) 		DEFAULT '0' COMMENT '公网IP个数'
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='VDC资源摘要页';
