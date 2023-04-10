drop table if exists `test1`;
# //如果想要改脚本  也可以将其作为一个末班
create table `test1`(
                        `id` bigint not null comment 'id',
                        `name` varchar(50) comment '名称',
                        primary key (`id`)
)engine=innodb default charset = utf8mb4 comment ='测试'

select * from test;

