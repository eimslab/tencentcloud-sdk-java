package com.tencentcloudapi.cds.v20180420;
public enum CdsErrorCode {
    // 无效的资源ID，用于资源不存在或已过期。
     INVALIDPARAMETER_DBAUDITRESOURCEIDINVAILD("InvalidParameter.DbauditResourceIdInvaild"),
     
    // 无操作权限。
     UNAUTHORIZEDOPERATION_NOPERMISSION("UnauthorizedOperation.NoPermission");
     
    private String value;
    private CdsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

