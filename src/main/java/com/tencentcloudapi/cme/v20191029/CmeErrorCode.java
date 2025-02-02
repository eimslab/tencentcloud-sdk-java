package com.tencentcloudapi.cme.v20191029;
public enum CmeErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 创建录制任务失败。
     FAILEDOPERATION_CREATERECORDTASK("FailedOperation.CreateRecordTask"),
     
    // 转推失败。
     FAILEDOPERATION_STREAMCONNECT("FailedOperation.StreamConnect"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 发起预处理任务失败。
     INTERNALERROR_CREATETASK("InternalError.CreateTask"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 平台参数非法。
     INVALIDPARAMETER_PLATFORM("InvalidParameter.Platform"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 画布宽高比不合法。
     INVALIDPARAMETERVALUE_ASPECTRATIO("InvalidParameterValue.AspectRatio"),
     
    // 画布宽高比不合法。
     INVALIDPARAMETERVALUE_ASPECTRATIOSET("InvalidParameterValue.AspectRatioSet"),
     
    // 项目类别不合法。
     INVALIDPARAMETERVALUE_CATEGORY("InvalidParameterValue.Category"),
     
    // 项目类别不合法。
     INVALIDPARAMETERVALUE_CATEGORYSET("InvalidParameterValue.CategorySet"),
     
    // 分类已存在。
     INVALIDPARAMETERVALUE_CLASSEXIST("InvalidParameterValue.ClassExist"),
     
    // 分类不为空。
     INVALIDPARAMETERVALUE_CLASSNOTEMPTY("InvalidParameterValue.ClassNotEmpty"),
     
    // 分类不存在。
     INVALIDPARAMETERVALUE_CLASSNOTEXIST("InvalidParameterValue.ClassNotExist"),
     
    // 分类路径不合法。
     INVALIDPARAMETERVALUE_CLASSPATH("InvalidParameterValue.ClassPath"),
     
    // 查询不到数据。
     INVALIDPARAMETERVALUE_DATANOTFOUNDINDB("InvalidParameterValue.DataNotFoundInDB"),
     
    // 模板 ID 无效。
     INVALIDPARAMETERVALUE_DEFINITION("InvalidParameterValue.Definition"),
     
    // 目标分类不存在。
     INVALIDPARAMETERVALUE_DSTCLASSPATHNOTEXIST("InvalidParameterValue.DstClassPathNotExist"),
     
    // 导出目标不合法。
     INVALIDPARAMETERVALUE_EXPORTDESTINATION("InvalidParameterValue.ExportDestination"),
     
    // 转推输入流参数非法。
     INVALIDPARAMETERVALUE_INPUT("InvalidParameterValue.Input"),
     
    // 返回记录条数不合法。
     INVALIDPARAMETERVALUE_LIMIT("InvalidParameterValue.Limit"),
     
    // 媒体 ID 无效。
     INVALIDPARAMETERVALUE_MATERIALID("InvalidParameterValue.MaterialId"),
     
    // 媒体替换信息无效。
     INVALIDPARAMETERVALUE_MEDIAREPLACEMENTINFO("InvalidParameterValue.MediaReplacementInfo"),
     
    // 无效的成员列表。
     INVALIDPARAMETERVALUE_MEMBERIDS("InvalidParameterValue.MemberIds"),
     
    // 团队成员不存在。
     INVALIDPARAMETERVALUE_MEMBERNOTEXIST("InvalidParameterValue.MemberNotExist"),
     
    // 名称字段编辑错误，需使用 UTF8 编码。
     INVALIDPARAMETERVALUE_NAME("InvalidParameterValue.Name"),
     
    // 名称字段长度超长，限制 30 个中文字符。
     INVALIDPARAMETERVALUE_NAMELENLIMT("InvalidParameterValue.NameLenLimt"),
     
    // 分布偏移不合法。
     INVALIDPARAMETERVALUE_OFFSET("InvalidParameterValue.Offset"),
     
    // 无效的操作者。
     INVALIDPARAMETERVALUE_OPERATOR("InvalidParameterValue.Operator"),
     
    // 归属者 ID 不合法。
     INVALIDPARAMETERVALUE_OWNERID("InvalidParameterValue.OwnerId"),
     
    // 团队 Owner 的备注不合法。
     INVALIDPARAMETERVALUE_OWNERREMARK("InvalidParameterValue.OwnerRemark"),
     
    // 归属者类型不合法。
     INVALIDPARAMETERVALUE_OWNERTYPE("InvalidParameterValue.OwnerType"),
     
    // 平台参数取值错误。
     INVALIDPARAMETERVALUE_PLATFORM("InvalidParameterValue.Platform"),
     
    // 预处理模板 ID 无效。
     INVALIDPARAMETERVALUE_PREPROCESSDEFINITION("InvalidParameterValue.PreProcessDefinition"),
     
    // 项目不存在。
     INVALIDPARAMETERVALUE_PROJECTID("InvalidParameterValue.ProjectId"),
     
    // 角色不合法。
     INVALIDPARAMETERVALUE_ROLE("InvalidParameterValue.Role"),
     
    // 排序方式无效。
     INVALIDPARAMETERVALUE_SORTORDER("InvalidParameterValue.SortOrder"),
     
    // 云转推信息非法。
     INVALIDPARAMETERVALUE_STREAMCONNECT("InvalidParameterValue.StreamConnect"),
     
    // 转推输入源信息非法。
     INVALIDPARAMETERVALUE_STREAMCONNECTINPUTINVALID("InvalidParameterValue.StreamConnectInputInvalid"),
     
    // 转推输出源信息非法。
     INVALIDPARAMETERVALUE_STREAMCONNECTOUTPUTINVALID("InvalidParameterValue.StreamConnectOutputInvalid"),
     
    // 输入流参数错误。
     INVALIDPARAMETERVALUE_STREAMINPUT("InvalidParameterValue.StreamInput"),
     
    // 团队 ID 已经存在，不能重复创建。
     INVALIDPARAMETERVALUE_TEAMID("InvalidParameterValue.TeamId"),
     
    // 团队不存在。
     INVALIDPARAMETERVALUE_TEAMNOTEXIST("InvalidParameterValue.TeamNotExist"),
     
    // 发布通道 ID 无效。
     INVALIDPARAMETERVALUE_THIRDYPARTYPUBLISHCHANNELID("InvalidParameterValue.ThirdyPartyPublishChannelId"),
     
    // 轨道数据无效。
     INVALIDPARAMETERVALUE_TRACKDATA("InvalidParameterValue.TrackData"),
     
    // 轨道元素无效。
     INVALIDPARAMETERVALUE_TRACKITEM("InvalidParameterValue.TrackItem"),
     
    // 视频编辑模板不存在。
     INVALIDPARAMETERVALUE_VIDEOEDITTEMPLATEIDNOTEXIST("InvalidParameterValue.VideoEditTemplateIdNotExist"),
     
    // 参数缺少 VodFile。
     INVALIDPARAMETERVALUE_VODFILEID("InvalidParameterValue.VodFileId"),
     
    // 点播文件不存在。
     INVALIDPARAMETERVALUE_VODFILENOTEXIST("InvalidParameterValue.VodFileNotExist"),
     
    // 绑定的点播子应用无效。
     INVALIDPARAMETERVALUE_VODSUBAPPID("InvalidParameterValue.VodSubAppid"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 权限不足，请检查对应操作者的权限。
     OPERATIONDENIED_PERMISSIONDENY("OperationDenied.PermissionDeny"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 平台不存在。
     RESOURCENOTFOUND_PLATFORM("ResourceNotFound.Platform"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private CmeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

