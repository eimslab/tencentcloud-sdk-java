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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceNetworkRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 新VPC网络Id
    */
    @SerializedName("NewVpcId")
    @Expose
    private String NewVpcId;

    /**
    * 新子网Id
    */
    @SerializedName("NewSubnetId")
    @Expose
    private String NewSubnetId;

    /**
    * 原vip保留时长，单位小时，默认为0，代表立即回收，最大为168小时
    */
    @SerializedName("OldIpRetainTime")
    @Expose
    private Long OldIpRetainTime;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 新VPC网络Id 
     * @return NewVpcId 新VPC网络Id
     */
    public String getNewVpcId() {
        return this.NewVpcId;
    }

    /**
     * Set 新VPC网络Id
     * @param NewVpcId 新VPC网络Id
     */
    public void setNewVpcId(String NewVpcId) {
        this.NewVpcId = NewVpcId;
    }

    /**
     * Get 新子网Id 
     * @return NewSubnetId 新子网Id
     */
    public String getNewSubnetId() {
        return this.NewSubnetId;
    }

    /**
     * Set 新子网Id
     * @param NewSubnetId 新子网Id
     */
    public void setNewSubnetId(String NewSubnetId) {
        this.NewSubnetId = NewSubnetId;
    }

    /**
     * Get 原vip保留时长，单位小时，默认为0，代表立即回收，最大为168小时 
     * @return OldIpRetainTime 原vip保留时长，单位小时，默认为0，代表立即回收，最大为168小时
     */
    public Long getOldIpRetainTime() {
        return this.OldIpRetainTime;
    }

    /**
     * Set 原vip保留时长，单位小时，默认为0，代表立即回收，最大为168小时
     * @param OldIpRetainTime 原vip保留时长，单位小时，默认为0，代表立即回收，最大为168小时
     */
    public void setOldIpRetainTime(Long OldIpRetainTime) {
        this.OldIpRetainTime = OldIpRetainTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NewVpcId", this.NewVpcId);
        this.setParamSimple(map, prefix + "NewSubnetId", this.NewSubnetId);
        this.setParamSimple(map, prefix + "OldIpRetainTime", this.OldIpRetainTime);

    }
}
