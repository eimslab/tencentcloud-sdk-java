package com.tencentcloudapi.tcb.v20180608;
public enum TcbErrorCode {
    // 您没有查看该资源的权限。
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 数据库错误。
     INTERNALERROR_DATABASE("InternalError.Database"),
     
    // 系统失败。
     INTERNALERROR_SYSTEMFAIL("InternalError.SystemFail"),
     
    // 服务超时。
     INTERNALERROR_TIMEOUT("InternalError.Timeout"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 接口名非法。
     INVALIDPARAMETER_ACTION("InvalidParameter.Action"),
     
    // 环境ID非法。
     INVALIDPARAMETER_ENVID("InvalidParameter.EnvId"),
     
    // 服务不存在。
     INVALIDPARAMETER_SERVICENOTEXIST("InvalidParameter.ServiceNotExist"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 命名空间超过配额。
     LIMITEXCEEDED_ERRNAMESPACEMAXLIMIT("LimitExceeded.ErrNamespaceMaxLimit"),
     
    // 镜像容器超过配额。
     LIMITEXCEEDED_ERRREPOMAXLIMIT("LimitExceeded.ErrRepoMaxLimit"),
     
    // 请求次数超过配额限制。
     LIMITEXCEEDED_REQUEST("LimitExceeded.Request"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 缺少必要参数。
     MISSINGPARAMETER_PARAM("MissingParameter.Param"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 用户不存在。
     RESOURCENOTFOUND_USERNOTEXISTS("ResourceNotFound.UserNotExists"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 资源不可用-余额不足。
     RESOURCEUNAVAILABLE_BALANCENOTENOUGH("ResourceUnavailable.BalanceNotEnough"),
     
    // 当前发票余额不足，无法退费。
     RESOURCEUNAVAILABLE_INVOICEAMOUNTLACK("ResourceUnavailable.InvoiceAmountLack"),
     
    // 资源过期。
     RESOURCEUNAVAILABLE_RESOURCEOVERDUE("ResourceUnavailable.ResourceOverdue"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 外部代码仓库未授权。
     UNAUTHORIZEDOPERATION_CODEOAUTHUNAUTHORIZED("UnauthorizedOperation.CodeOAuthUnauthorized"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 有正在进行中的任务。
     UNSUPPORTEDOPERATION_TASKEXISTED("UnsupportedOperation.TaskExisted");
     
    private String value;
    private TcbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

