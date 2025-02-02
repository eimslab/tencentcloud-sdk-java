package com.tencentcloudapi.oceanus.v20190422;
public enum OceanusErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 未授权操作。
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // 找不到集群。
     FAILEDOPERATION_CLUSTERNOTFOUND("FailedOperation.ClusterNotFound"),
     
    // 重复的作业名。
     FAILEDOPERATION_DUPLICATEDJOBNAME("FailedOperation.DuplicatedJobName"),
     
    // 集群资源不足。
     FAILEDOPERATION_RESOURCEINSUFFICIENT("FailedOperation.ResourceInsufficient"),
     
    // 用户未实名验证。
     FAILEDOPERATION_USERNOTAUTHENTICATED("FailedOperation.UserNotAuthenticated"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // COS 服务访问错误。
     INTERNALERROR_COSCLIENT("InternalError.COSClient"),
     
    // 数据库异常。
     INTERNALERROR_DB("InternalError.DB"),
     
    // 失败的目标资源。
     INTERNALERROR_FAILEDTOBESCRIBERESOURCES("InternalError.FailedToBescribeResources"),
     
    // 内部错误。
     INTERNALERROR_LOGICERROR("InternalError.LogicError"),
     
    // 资源只有一个版本，无法删除。
     INTERNALERROR_RESOURCECONFIGCANNOTDELETE("InternalError.ResourceConfigCanNotDelete"),
     
    // 资源不存在。
     INTERNALERROR_RESOURCENOTEXIST("InternalError.ResourceNotExist"),
     
    // 未找到sqlcode错误。
     INTERNALERROR_SQLCODENOTFOUND("InternalError.SqlCodeNotFound"),
     
    // 内部错误。
     INTERNALERROR_STSNEWCLIENT("InternalError.StsNewClient"),
     
    // 系统错误。
     INTERNALERROR_SYSTEMERROR("InternalError.SystemError"),
     
    // AppId资源不匹配。
     INVALIDPARAMETER_APPIDRESOURCENOTMATCH("InvalidParameter.AppIdResourceNotMatch"),
     
    // 非法的 MaxParallelism 参数。
     INVALIDPARAMETER_ILLEGALMAXPARALLELISM("InvalidParameter.IllegalMaxParallelism"),
     
    // appid错误。
     INVALIDPARAMETER_INVALIDAPPID("InvalidParameter.InvalidAppId"),
     
    // 无效Region。
     INVALIDPARAMETER_INVALIDREGION("InvalidParameter.InvalidRegion"),
     
    // ResourceIds非法。
     INVALIDPARAMETER_INVALIDRESOURCEIDS("InvalidParameter.InvalidResourceIds"),
     
    // MaxParallelism 过大。
     INVALIDPARAMETER_MAXPARALLELISMTOOLARGE("InvalidParameter.MaxParallelismTooLarge"),
     
    // MaxParallelism 不允许小于算子默认并行度。
     INVALIDPARAMETER_MAXPARALLELISMTOOSMALL("InvalidParameter.MaxParallelismTooSmall"),
     
    // Uin资源不匹配。
     INVALIDPARAMETER_UINRESOURCENOTMATCH("InvalidParameter.UinResourceNotMatch"),
     
    // Flink参数非法。
     INVALIDPARAMETER_UNSUPPORTEDFLINKCONF("InvalidParameter.UnsupportedFlinkConf"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 集群Id指定错误，为空或者不存在。
     INVALIDPARAMETERVALUE_CLUSTERID("InvalidParameterValue.ClusterId"),
     
    // CU内存规格不匹配。
     INVALIDPARAMETERVALUE_CUMEM("InvalidParameterValue.CuMem"),
     
    // 作业id的参数无效。
     INVALIDPARAMETERVALUE_JOBIDVALUEERROR("InvalidParameterValue.JobIdValueError"),
     
    // Illegal JobName。
     INVALIDPARAMETERVALUE_JOBNAME("InvalidParameterValue.JobName"),
     
    // 集群模式与作业类型不匹配。
     INVALIDPARAMETERVALUE_JOBTYPECOMBINEWITHCLUSTERTYPE("InvalidParameterValue.JobTypeCombineWithClusterType"),
     
    // SQL作业不能指定EntrypointClass，JAR作业则必须指定。
     INVALIDPARAMETERVALUE_JOBTYPECOMBINEWITHENTRYPOINTCLASS("InvalidParameterValue.JobTypeCombineWithEntrypointClass"),
     
    // 未找到资源ID。
     INVALIDPARAMETERVALUE_RESOURCEIDSNOTFOUND("InvalidParameterValue.ResourceIdsNotFound"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 作业配置超出限制。
     LIMITEXCEEDED_JOBCONFIG("LimitExceeded.JobConfig"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源名称已存在。
     RESOURCEINUSE_RESOURCENAMEALREADYEXISTS("ResourceInUse.ResourceNameAlreadyExists"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // COS Bucket 未找到或无权限访问。
     RESOURCENOTFOUND_COSBUCKET("ResourceNotFound.COSBucket"),
     
    // 集群不存在。
     RESOURCENOTFOUND_CLUSTERID("ResourceNotFound.ClusterId"),
     
    // 作业不存在。
     RESOURCENOTFOUND_JOB("ResourceNotFound.Job"),
     
    // 找不到作业。
     RESOURCENOTFOUND_JOBID("ResourceNotFound.JobId"),
     
    // 程序包版本不存在。
     RESOURCENOTFOUND_RESOURCECONFIG("ResourceNotFound.ResourceConfig"),
     
    // 资源不存在。
     RESOURCENOTFOUND_RESOURCENOTEXIST("ResourceNotFound.ResourceNotExist"),
     
    // 被某个作业配置使用。
     RESOURCEUNAVAILABLE_BEUSEBYSOMEJOBCONFIG("ResourceUnavailable.BeUseBySomeJobConfig"),
     
    // 检查资源位置是否存在错误。
     RESOURCEUNAVAILABLE_CHECKRESOURCELOCEXISTS("ResourceUnavailable.CheckResourceLocExists"),
     
    // 集群处于非运行状态。
     RESOURCEUNAVAILABLE_CLUSTER("ResourceUnavailable.Cluster"),
     
    // 失败的目标资源。
     RESOURCEUNAVAILABLE_FAILEDTOBESCRIBERESOURCES("ResourceUnavailable.FailedToBescribeResources"),
     
    // 获取发布的作业作业配置错误。
     RESOURCEUNAVAILABLE_GETJOBPUBLISHEDJOBCONFIG("ResourceUnavailable.GetJobPublishedJobConfig"),
     
    // 不允许停止或暂停错误。
     RESOURCEUNAVAILABLE_NOTALLOWEDTOBESTOPORPAUSE("ResourceUnavailable.NotAllowedToBeStopOrPause"),
     
    // cos上的程序包不存在。
     RESOURCEUNAVAILABLE_RESOURCELOCNOTEXISTS("ResourceUnavailable.ResourceLocNotExists"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // Checkpoint 时间间隔，错误。
     UNSUPPORTEDOPERATION_INVALIDCHECKPOINTINTERVALERROR("UnsupportedOperation.InvalidCheckpointIntervalError");
     
    private String value;
    private OceanusErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

