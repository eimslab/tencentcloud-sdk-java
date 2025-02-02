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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LivenessRecognitionRequest extends AbstractModel{

    /**
    * 身份证号
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名。中文请使用UTF-8编码。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用于活体检测的视频，视频的BASE64值；
BASE64编码后的大小不超过8M，支持mp4、avi、flv格式。
    */
    @SerializedName("VideoBase64")
    @Expose
    private String VideoBase64;

    /**
    * 活体检测类型，取值：LIP/ACTION/SILENT。
LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。
    */
    @SerializedName("LivenessType")
    @Expose
    private String LivenessType;

    /**
    * 数字模式传参：传数字验证码，验证码需先调用<a href="https://cloud.tencent.com/document/product/1007/31821">获取数字验证码接口</a>得到；
动作模式传参：传动作顺序，动作顺序需先调用<a href="https://cloud.tencent.com/document/product/1007/31822">获取动作顺序接口</a>得到；
静默模式传参：空。
    */
    @SerializedName("ValidateData")
    @Expose
    private String ValidateData;

    /**
    * 额外配置，传入JSON字符串。
{
"BestFrameNum": 2  //需要返回多张最佳截图，取值范围2-10
}
    */
    @SerializedName("Optional")
    @Expose
    private String Optional;

    /**
     * Get 身份证号 
     * @return IdCard 身份证号
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 身份证号
     * @param IdCard 身份证号
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 姓名。中文请使用UTF-8编码。 
     * @return Name 姓名。中文请使用UTF-8编码。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名。中文请使用UTF-8编码。
     * @param Name 姓名。中文请使用UTF-8编码。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用于活体检测的视频，视频的BASE64值；
BASE64编码后的大小不超过8M，支持mp4、avi、flv格式。 
     * @return VideoBase64 用于活体检测的视频，视频的BASE64值；
BASE64编码后的大小不超过8M，支持mp4、avi、flv格式。
     */
    public String getVideoBase64() {
        return this.VideoBase64;
    }

    /**
     * Set 用于活体检测的视频，视频的BASE64值；
BASE64编码后的大小不超过8M，支持mp4、avi、flv格式。
     * @param VideoBase64 用于活体检测的视频，视频的BASE64值；
BASE64编码后的大小不超过8M，支持mp4、avi、flv格式。
     */
    public void setVideoBase64(String VideoBase64) {
        this.VideoBase64 = VideoBase64;
    }

    /**
     * Get 活体检测类型，取值：LIP/ACTION/SILENT。
LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。 
     * @return LivenessType 活体检测类型，取值：LIP/ACTION/SILENT。
LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。
     */
    public String getLivenessType() {
        return this.LivenessType;
    }

    /**
     * Set 活体检测类型，取值：LIP/ACTION/SILENT。
LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。
     * @param LivenessType 活体检测类型，取值：LIP/ACTION/SILENT。
LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。
     */
    public void setLivenessType(String LivenessType) {
        this.LivenessType = LivenessType;
    }

    /**
     * Get 数字模式传参：传数字验证码，验证码需先调用<a href="https://cloud.tencent.com/document/product/1007/31821">获取数字验证码接口</a>得到；
动作模式传参：传动作顺序，动作顺序需先调用<a href="https://cloud.tencent.com/document/product/1007/31822">获取动作顺序接口</a>得到；
静默模式传参：空。 
     * @return ValidateData 数字模式传参：传数字验证码，验证码需先调用<a href="https://cloud.tencent.com/document/product/1007/31821">获取数字验证码接口</a>得到；
动作模式传参：传动作顺序，动作顺序需先调用<a href="https://cloud.tencent.com/document/product/1007/31822">获取动作顺序接口</a>得到；
静默模式传参：空。
     */
    public String getValidateData() {
        return this.ValidateData;
    }

    /**
     * Set 数字模式传参：传数字验证码，验证码需先调用<a href="https://cloud.tencent.com/document/product/1007/31821">获取数字验证码接口</a>得到；
动作模式传参：传动作顺序，动作顺序需先调用<a href="https://cloud.tencent.com/document/product/1007/31822">获取动作顺序接口</a>得到；
静默模式传参：空。
     * @param ValidateData 数字模式传参：传数字验证码，验证码需先调用<a href="https://cloud.tencent.com/document/product/1007/31821">获取数字验证码接口</a>得到；
动作模式传参：传动作顺序，动作顺序需先调用<a href="https://cloud.tencent.com/document/product/1007/31822">获取动作顺序接口</a>得到；
静默模式传参：空。
     */
    public void setValidateData(String ValidateData) {
        this.ValidateData = ValidateData;
    }

    /**
     * Get 额外配置，传入JSON字符串。
{
"BestFrameNum": 2  //需要返回多张最佳截图，取值范围2-10
} 
     * @return Optional 额外配置，传入JSON字符串。
{
"BestFrameNum": 2  //需要返回多张最佳截图，取值范围2-10
}
     */
    public String getOptional() {
        return this.Optional;
    }

    /**
     * Set 额外配置，传入JSON字符串。
{
"BestFrameNum": 2  //需要返回多张最佳截图，取值范围2-10
}
     * @param Optional 额外配置，传入JSON字符串。
{
"BestFrameNum": 2  //需要返回多张最佳截图，取值范围2-10
}
     */
    public void setOptional(String Optional) {
        this.Optional = Optional;
    }

    public LivenessRecognitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LivenessRecognitionRequest(LivenessRecognitionRequest source) {
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VideoBase64 != null) {
            this.VideoBase64 = new String(source.VideoBase64);
        }
        if (source.LivenessType != null) {
            this.LivenessType = new String(source.LivenessType);
        }
        if (source.ValidateData != null) {
            this.ValidateData = new String(source.ValidateData);
        }
        if (source.Optional != null) {
            this.Optional = new String(source.Optional);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VideoBase64", this.VideoBase64);
        this.setParamSimple(map, prefix + "LivenessType", this.LivenessType);
        this.setParamSimple(map, prefix + "ValidateData", this.ValidateData);
        this.setParamSimple(map, prefix + "Optional", this.Optional);

    }
}

