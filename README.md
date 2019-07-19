# 声网生成Token接口

### 一、api 请求参数描述

| 字段 | 描述 | 备注 |
| --- | --- | --- |
| userid | 用户id |  |
| roomid | 直播间id |  |
| sessionid | 登录用户sessionid |  |
| expireTime | 过期期限 | int类型，单位秒，10分钟为600  |


### 二、接口返回数据格式：

```json
{
    "token": "0064789793ea89e4b559033cd3e3756ea1cIACClR8ptTyx47d9srucm/vkOUD0xcg88UKrTL6f12RgYD1Ra00AAAAAEAAUWRqiyX4xXQEAAQCJZTBd", 
    "success": true/false,
    "appId": "4789793ea89e4b559033cd3e3756ea1c",
    "msg": "操作成功"
}
```

##### API
1.请求url 
    
    http://view.csslcloud.net/api/agora/token



