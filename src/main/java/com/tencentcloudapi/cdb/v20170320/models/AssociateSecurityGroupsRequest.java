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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateSecurityGroupsRequest extends AbstractModel{

    /**
    * 安全组 ID。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 实例 ID 列表，一个或者多个实例 ID 组成的数组。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 当传入只读实例ID时，默认操作的是对应只读组的安全组。如果需要操作只读实例ID的安全组， 需要将该入参置为True
    */
    @SerializedName("ForReadonlyInstance")
    @Expose
    private Boolean ForReadonlyInstance;

    /**
     * Get 安全组 ID。 
     * @return SecurityGroupId 安全组 ID。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组 ID。
     * @param SecurityGroupId 安全组 ID。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 实例 ID 列表，一个或者多个实例 ID 组成的数组。 
     * @return InstanceIds 实例 ID 列表，一个或者多个实例 ID 组成的数组。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID 列表，一个或者多个实例 ID 组成的数组。
     * @param InstanceIds 实例 ID 列表，一个或者多个实例 ID 组成的数组。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 当传入只读实例ID时，默认操作的是对应只读组的安全组。如果需要操作只读实例ID的安全组， 需要将该入参置为True 
     * @return ForReadonlyInstance 当传入只读实例ID时，默认操作的是对应只读组的安全组。如果需要操作只读实例ID的安全组， 需要将该入参置为True
     */
    public Boolean getForReadonlyInstance() {
        return this.ForReadonlyInstance;
    }

    /**
     * Set 当传入只读实例ID时，默认操作的是对应只读组的安全组。如果需要操作只读实例ID的安全组， 需要将该入参置为True
     * @param ForReadonlyInstance 当传入只读实例ID时，默认操作的是对应只读组的安全组。如果需要操作只读实例ID的安全组， 需要将该入参置为True
     */
    public void setForReadonlyInstance(Boolean ForReadonlyInstance) {
        this.ForReadonlyInstance = ForReadonlyInstance;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ForReadonlyInstance", this.ForReadonlyInstance);

    }
}

