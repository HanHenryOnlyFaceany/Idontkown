drop table if exists `test`;
# //如果想要改脚本  也可以将其作为一个末班
create table `test`(
                        `id` bigint not null comment 'id',
                        `name` varchar(50) comment '名称',
                        `password` varchar(50) comment '密码',
                        primary key (`id`)
)engine=innodb default charset = utf8mb4 comment ='测试';

# select * from test;
insert into test (id, name, password)
values (1,'ceshi','password');

drop table if exists `demo`;
# //如果想要改脚本  也可以将其作为一个末班
create table `demo`(
                       `id` bigint not null comment 'id',
                       `name` varchar(50) comment '名称',
                       primary key (`id`)
)engine=innodb default charset = utf8mb4 comment ='测试';

insert into demo (id, name)
values (1,'ceshi');