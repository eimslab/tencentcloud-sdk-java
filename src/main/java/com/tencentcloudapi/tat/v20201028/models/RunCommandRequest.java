/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunCommandRequest extends AbstractModel{

    /**
    * Base64编码后的命令内容，长度不可超过64KB。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 待执行命令的实例ID列表。 支持实例类型：
<li> CVM
<li> LIGHTHOUSE
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 命令名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

    /**
    * 命令描述。不超过120字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 命令类型，目前仅支持取值：SHELL。默认：SHELL。
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * 命令执行路径，默认：/root。
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * 命令超时时间，默认60秒。取值范围[1, 86400]。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 是否保存命令，取值范围：
<li> True：保存
<li> False：不保存
默认为 False。
    */
    @SerializedName("SaveCommand")
    @Expose
    private Boolean SaveCommand;

    /**
    * 是否启用自定义参数功能。
一旦创建，此值不提供修改。
默认值：false。
    */
    @SerializedName("EnableParameter")
    @Expose
    private Boolean EnableParameter;

    /**
    * 启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果 Parameters 未提供，将使用这里的默认值进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * Command 的自定义参数。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 DefaultParameters 进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 如果保存命令，可为命令设置标签。列表长度不超过10。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Base64编码后的命令内容，长度不可超过64KB。 
     * @return Content Base64编码后的命令内容，长度不可超过64KB。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Base64编码后的命令内容，长度不可超过64KB。
     * @param Content Base64编码后的命令内容，长度不可超过64KB。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 待执行命令的实例ID列表。 支持实例类型：
<li> CVM
<li> LIGHTHOUSE 
     * @return InstanceIds 待执行命令的实例ID列表。 支持实例类型：
<li> CVM
<li> LIGHTHOUSE
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 待执行命令的实例ID列表。 支持实例类型：
<li> CVM
<li> LIGHTHOUSE
     * @param InstanceIds 待执行命令的实例ID列表。 支持实例类型：
<li> CVM
<li> LIGHTHOUSE
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 命令名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。 
     * @return CommandName 命令名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。
     */
    public String getCommandName() {
        return this.CommandName;
    }

    /**
     * Set 命令名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。
     * @param CommandName 命令名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。
     */
    public void setCommandName(String CommandName) {
        this.CommandName = CommandName;
    }

    /**
     * Get 命令描述。不超过120字符。 
     * @return Description 命令描述。不超过120字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 命令描述。不超过120字符。
     * @param Description 命令描述。不超过120字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 命令类型，目前仅支持取值：SHELL。默认：SHELL。 
     * @return CommandType 命令类型，目前仅支持取值：SHELL。默认：SHELL。
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set 命令类型，目前仅支持取值：SHELL。默认：SHELL。
     * @param CommandType 命令类型，目前仅支持取值：SHELL。默认：SHELL。
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get 命令执行路径，默认：/root。 
     * @return WorkingDirectory 命令执行路径，默认：/root。
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set 命令执行路径，默认：/root。
     * @param WorkingDirectory 命令执行路径，默认：/root。
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get 命令超时时间，默认60秒。取值范围[1, 86400]。 
     * @return Timeout 命令超时时间，默认60秒。取值范围[1, 86400]。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 命令超时时间，默认60秒。取值范围[1, 86400]。
     * @param Timeout 命令超时时间，默认60秒。取值范围[1, 86400]。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 是否保存命令，取值范围：
<li> True：保存
<li> False：不保存
默认为 False。 
     * @return SaveCommand 是否保存命令，取值范围：
<li> True：保存
<li> False：不保存
默认为 False。
     */
    public Boolean getSaveCommand() {
        return this.SaveCommand;
    }

    /**
     * Set 是否保存命令，取值范围：
<li> True：保存
<li> False：不保存
默认为 False。
     * @param SaveCommand 是否保存命令，取值范围：
<li> True：保存
<li> False：不保存
默认为 False。
     */
    public void setSaveCommand(Boolean SaveCommand) {
        this.SaveCommand = SaveCommand;
    }

    /**
     * Get 是否启用自定义参数功能。
一旦创建，此值不提供修改。
默认值：false。 
     * @return EnableParameter 是否启用自定义参数功能。
一旦创建，此值不提供修改。
默认值：false。
     */
    public Boolean getEnableParameter() {
        return this.EnableParameter;
    }

    /**
     * Set 是否启用自定义参数功能。
一旦创建，此值不提供修改。
默认值：false。
     * @param EnableParameter 是否启用自定义参数功能。
一旦创建，此值不提供修改。
默认值：false。
     */
    public void setEnableParameter(Boolean EnableParameter) {
        this.EnableParameter = EnableParameter;
    }

    /**
     * Get 启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果 Parameters 未提供，将使用这里的默认值进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。 
     * @return DefaultParameters 启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果 Parameters 未提供，将使用这里的默认值进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
     */
    public String getDefaultParameters() {
        return this.DefaultParameters;
    }

    /**
     * Set 启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果 Parameters 未提供，将使用这里的默认值进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
     * @param DefaultParameters 启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果 Parameters 未提供，将使用这里的默认值进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
     */
    public void setDefaultParameters(String DefaultParameters) {
        this.DefaultParameters = DefaultParameters;
    }

    /**
     * Get Command 的自定义参数。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 DefaultParameters 进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。 
     * @return Parameters Command 的自定义参数。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 DefaultParameters 进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Command 的自定义参数。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 DefaultParameters 进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
     * @param Parameters Command 的自定义参数。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 DefaultParameters 进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 如果保存命令，可为命令设置标签。列表长度不超过10。 
     * @return Tags 如果保存命令，可为命令设置标签。列表长度不超过10。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 如果保存命令，可为命令设置标签。列表长度不超过10。
     * @param Tags 如果保存命令，可为命令设置标签。列表长度不超过10。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public RunCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunCommandRequest(RunCommandRequest source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.CommandName != null) {
            this.CommandName = new String(source.CommandName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CommandType != null) {
            this.CommandType = new String(source.CommandType);
        }
        if (source.WorkingDirectory != null) {
            this.WorkingDirectory = new String(source.WorkingDirectory);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.SaveCommand != null) {
            this.SaveCommand = new Boolean(source.SaveCommand);
        }
        if (source.EnableParameter != null) {
            this.EnableParameter = new Boolean(source.EnableParameter);
        }
        if (source.DefaultParameters != null) {
            this.DefaultParameters = new String(source.DefaultParameters);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "CommandName", this.CommandName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "SaveCommand", this.SaveCommand);
        this.setParamSimple(map, prefix + "EnableParameter", this.EnableParameter);
        this.setParamSimple(map, prefix + "DefaultParameters", this.DefaultParameters);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

