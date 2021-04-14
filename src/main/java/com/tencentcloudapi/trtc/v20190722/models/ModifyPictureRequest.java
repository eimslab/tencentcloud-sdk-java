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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPictureRequest extends AbstractModel{

    /**
    * 图片id
    */
    @SerializedName("PictureId")
    @Expose
    private Long PictureId;

    /**
    * 应用id
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 图片长度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 图片宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 显示位置x轴方向
    */
    @SerializedName("XPosition")
    @Expose
    private Long XPosition;

    /**
    * 显示位置y轴方向
    */
    @SerializedName("YPosition")
    @Expose
    private Long YPosition;

    /**
     * Get 图片id 
     * @return PictureId 图片id
     */
    public Long getPictureId() {
        return this.PictureId;
    }

    /**
     * Set 图片id
     * @param PictureId 图片id
     */
    public void setPictureId(Long PictureId) {
        this.PictureId = PictureId;
    }

    /**
     * Get 应用id 
     * @return SdkAppId 应用id
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用id
     * @param SdkAppId 应用id
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 图片长度 
     * @return Height 图片长度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 图片长度
     * @param Height 图片长度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 图片宽度 
     * @return Width 图片宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 图片宽度
     * @param Width 图片宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 显示位置x轴方向 
     * @return XPosition 显示位置x轴方向
     */
    public Long getXPosition() {
        return this.XPosition;
    }

    /**
     * Set 显示位置x轴方向
     * @param XPosition 显示位置x轴方向
     */
    public void setXPosition(Long XPosition) {
        this.XPosition = XPosition;
    }

    /**
     * Get 显示位置y轴方向 
     * @return YPosition 显示位置y轴方向
     */
    public Long getYPosition() {
        return this.YPosition;
    }

    /**
     * Set 显示位置y轴方向
     * @param YPosition 显示位置y轴方向
     */
    public void setYPosition(Long YPosition) {
        this.YPosition = YPosition;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PictureId", this.PictureId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "XPosition", this.XPosition);
        this.setParamSimple(map, prefix + "YPosition", this.YPosition);

    }
}

