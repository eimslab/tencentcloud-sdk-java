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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DealGoodsPriceElem extends AbstractModel{

    /**
    * 实付金额
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Long RealTotalCost;

    /**
     * Get 实付金额 
     * @return RealTotalCost 实付金额
     */
    public Long getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 实付金额
     * @param RealTotalCost 实付金额
     */
    public void setRealTotalCost(Long RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    public DealGoodsPriceElem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DealGoodsPriceElem(DealGoodsPriceElem source) {
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Long(source.RealTotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);

    }
}

