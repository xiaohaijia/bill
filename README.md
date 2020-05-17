# bill 迷你记账项目 项目简介 
SpringBoot + MyBatis + PageHelper + LayUI 练手项目



# 一、开发环境

- Java环境：JDK1.8

- 框架：SpringBoot 2.x + MyBatis + LayUi
- 开发工具：IDEA



# 二、功能需求和数据库设计

## 1、需求

![image-20200517143412320](C:/Users/User/AppData/Roaming/Typora/typora-user-images/image-20200517143412320.png)



​	![image-20200517143515615](C:/Users/User/AppData/Roaming/Typora/typora-user-images/image-20200517143515615.png)

## 2、数据库

| 表名 | sys_user  | 中文表名 | 用户表  |      |      |          |
| ---- | --------- | -------- | ------- | ---- | ---- | -------- |
| 主键 | id        |          |         |      |      |          |
| 序号 | 字段名称  | 字段说明 | 类型    | 长度 | 属性 | 备注     |
| 1    | id        | 类型id   | Int     | 10   | 主键 | 自动增长 |
| 2    | name      | 用户名称 | varchar | 50   | 非空 |          |
| 3    | loginname | 登陆名称 | varchar |      |      |          |
| 4    | pwd       | 密码     | varchar |      |      |          |

| 表名 | bills     | 中文表名 | 账单信息表 |      |      |                     |
| ---- | --------- | -------- | ---------- | ---- | ---- | ------------------- |
| 主键 | id        |          |            |      |      |                     |
| 序号 | 字段名称  | 字段说明 | 类型       | 长度 | 属性 | 备注                |
| 1    | id        | 账单id   | int        | 10   | 主键 | 自动增长            |
| 2    | title     | 账单标题 | varchar    | 50   | 非空 |                     |
| 3    | bill_time | 记账时间 | datetime   |      | 非空 |                     |
| 4    | type_id   | 账单类别 | int        | 10   | 非空 | 引用bill_type表主键 |
| 5    | price     | 账单金额 | int        | 10,2 | 非空 |                     |
| 6    | remark    | 账单说明 | varchar    | 500  |      |                     |

| 表名 | bill_type | 中文表名 | 账单类别表 |      |      |          |
| ---- | --------- | -------- | ---------- | ---- | ---- | -------- |
| 主键 | id        |          |            |      |      |          |
| 序号 | 字段名称  | 字段说明 | 类型       | 长度 | 属性 | 备注     |
| 1    | id        | 类型id   | int        | 10   | 主键 | 自动增长 |
| 2    | name      | 类型名称 | varchar    | 50   | 非空 |          |



# 三、详细开发步骤



## 1、创建数据表模型

![image-20200516190429454](C:\Users\User\AppData\Roaming\Typora\typora-user-images\image-20200516190429454.png)



## 2、创建SpringBoot项目

![image-20200517143549082](../AppData/Roaming/Typora/typora-user-images/image-20200517143549082.png)