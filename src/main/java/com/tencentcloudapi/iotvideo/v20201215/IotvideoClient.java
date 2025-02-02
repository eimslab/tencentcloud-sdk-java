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
package com.tencentcloudapi.iotvideo.v20201215;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iotvideo.v20201215.models.*;

public class IotvideoClient extends AbstractClient{
    private static String endpoint = "iotvideo.tencentcloudapi.com";
    private static String service = "iotvideo";
    private static String version = "2020-12-15";

    public IotvideoClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotvideoClient(Credential credential, String region, ClientProfile profile) {
        super(IotvideoClient.endpoint, IotvideoClient.version, credential, region, profile);
    }

    /**
     *本接口（BatchUpdateFirmware）用于批量更新设备固件 
     * @param req BatchUpdateFirmwareRequest
     * @return BatchUpdateFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public BatchUpdateFirmwareResponse BatchUpdateFirmware(BatchUpdateFirmwareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchUpdateFirmwareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchUpdateFirmwareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchUpdateFirmware");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于取消设备升级任务
     * @param req CancelDeviceFirmwareTaskRequest
     * @return CancelDeviceFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelDeviceFirmwareTaskResponse CancelDeviceFirmwareTask(CancelDeviceFirmwareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelDeviceFirmwareTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelDeviceFirmwareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelDeviceFirmwareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *判断是否开启的转发的权限
     * @param req CheckForwardAuthRequest
     * @return CheckForwardAuthResponse
     * @throws TencentCloudSDKException
     */
    public CheckForwardAuthResponse CheckForwardAuth(CheckForwardAuthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckForwardAuthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckForwardAuthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckForwardAuth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据设备产品ID、设备名称，设置控制设备的属性数据。
     * @param req ControlDeviceDataRequest
     * @return ControlDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public ControlDeviceDataResponse ControlDeviceData(ControlDeviceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlDeviceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ControlDeviceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlDeviceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建批次
     * @param req CreateBatchRequest
     * @return CreateBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchResponse CreateBatch(CreateBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开通云存服务
     * @param req CreateCloudStorageRequest
     * @return CreateCloudStorageResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudStorageResponse CreateCloudStorage(CreateCloudStorageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudStorageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudStorageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudStorage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建转发规则
     * @param req CreateForwardRuleRequest
     * @return CreateForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateForwardRuleResponse CreateForwardRule(CreateForwardRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateForwardRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateForwardRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateForwardRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建产品
     * @param req CreateProductRequest
     * @return CreateProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateProductResponse CreateProduct(CreateProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateTaskFileUrl）用于获取产品级任务文件上传链接
     * @param req CreateTaskFileUrlRequest
     * @return CreateTaskFileUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFileUrlResponse CreateTaskFileUrl(CreateTaskFileUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskFileUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskFileUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTaskFileUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除设备
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteFirmware）用于删除固件 
     * @param req DeleteFirmwareRequest
     * @return DeleteFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFirmwareResponse DeleteFirmware(DeleteFirmwareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFirmwareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFirmwareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFirmware");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除转发规则
     * @param req DeleteForwardRuleRequest
     * @return DeleteForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteForwardRuleResponse DeleteForwardRule(DeleteForwardRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteForwardRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteForwardRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteForwardRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除产品
     * @param req DeleteProductRequest
     * @return DeleteProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductResponse DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询账户余额
     * @param req DescribeBalanceRequest
     * @return DescribeBalanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBalanceResponse DescribeBalance(DescribeBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBalanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBalanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBalance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取账户流水
     * @param req DescribeBalanceTransactionsRequest
     * @return DescribeBalanceTransactionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBalanceTransactionsResponse DescribeBalanceTransactions(DescribeBalanceTransactionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBalanceTransactionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBalanceTransactionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBalanceTransactions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取批次详情
     * @param req DescribeBatchRequest
     * @return DescribeBatchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchResponse DescribeBatch(DescribeBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取批次列表
     * @param req DescribeBatchsRequest
     * @return DescribeBatchsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchsResponse DescribeBatchs(DescribeBatchsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBatchsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBatchsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBatchs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Category详情
     * @param req DescribeCategoryRequest
     * @return DescribeCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCategoryResponse DescribeCategory(DescribeCategoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCategoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCategoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCategory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备云存服务详情
     * @param req DescribeCloudStorageRequest
     * @return DescribeCloudStorageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageResponse DescribeCloudStorage(DescribeCloudStorageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudStorageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudStorageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudStorage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取具有云存的日期
     * @param req DescribeCloudStorageDateRequest
     * @return DescribeCloudStorageDateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageDateResponse DescribeCloudStorageDate(DescribeCloudStorageDateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudStorageDateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudStorageDateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudStorageDate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取云存事件列表
     * @param req DescribeCloudStorageEventsRequest
     * @return DescribeCloudStorageEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageEventsResponse DescribeCloudStorageEvents(DescribeCloudStorageEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudStorageEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudStorageEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudStorageEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取云存事件缩略图
     * @param req DescribeCloudStorageThumbnailRequest
     * @return DescribeCloudStorageThumbnailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageThumbnailResponse DescribeCloudStorageThumbnail(DescribeCloudStorageThumbnailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudStorageThumbnailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudStorageThumbnailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudStorageThumbnail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取某一天云存时间轴
     * @param req DescribeCloudStorageTimeRequest
     * @return DescribeCloudStorageTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageTimeResponse DescribeCloudStorageTime(DescribeCloudStorageTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudStorageTimeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudStorageTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudStorageTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看设备详情
     * @param req DescribeDeviceRequest
     * @return DescribeDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResponse DescribeDevice(DescribeDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为用户提供获取动作历史的能力。
     * @param req DescribeDeviceActionHistoryRequest
     * @return DescribeDeviceActionHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceActionHistoryResponse DescribeDeviceActionHistory(DescribeDeviceActionHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceActionHistoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceActionHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceActionHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备在指定时间范围内的通讯日志
     * @param req DescribeDeviceCommLogRequest
     * @return DescribeDeviceCommLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceCommLogResponse DescribeDeviceCommLog(DescribeDeviceCommLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceCommLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceCommLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceCommLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备属性数据
     * @param req DescribeDeviceDataRequest
     * @return DescribeDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceDataResponse DescribeDeviceData(DescribeDeviceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备在指定时间范围内上报的历史数据。
     * @param req DescribeDeviceDataHistoryRequest
     * @return DescribeDeviceDataHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceDataHistoryResponse DescribeDeviceDataHistory(DescribeDeviceDataHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceDataHistoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceDataHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceDataHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备的历史事件
     * @param req DescribeDeviceEventHistoryRequest
     * @return DescribeDeviceEventHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceEventHistoryResponse DescribeDeviceEventHistory(DescribeDeviceEventHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceEventHistoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceEventHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceEventHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备列表
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFirmware）用于查询固件信息
     * @param req DescribeFirmwareRequest
     * @return DescribeFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareResponse DescribeFirmware(DescribeFirmwareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmware");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口查询固件升级任务详情
     * @param req DescribeFirmwareTaskRequest
     * @return DescribeFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskResponse DescribeFirmwareTask(DescribeFirmwareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmwareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查询固件升级任务的设备列表
     * @param req DescribeFirmwareTaskDevicesRequest
     * @return DescribeFirmwareTaskDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskDevicesResponse DescribeFirmwareTaskDevices(DescribeFirmwareTaskDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareTaskDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareTaskDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmwareTaskDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查询固件升级任务状态分布
     * @param req DescribeFirmwareTaskDistributionRequest
     * @return DescribeFirmwareTaskDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskDistributionResponse DescribeFirmwareTaskDistribution(DescribeFirmwareTaskDistributionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareTaskDistributionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareTaskDistributionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmwareTaskDistribution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查询固件升级任务统计信息
     * @param req DescribeFirmwareTaskStatisticsRequest
     * @return DescribeFirmwareTaskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskStatisticsResponse DescribeFirmwareTaskStatistics(DescribeFirmwareTaskStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareTaskStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareTaskStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmwareTaskStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查询固件升级任务列表
     * @param req DescribeFirmwareTasksRequest
     * @return DescribeFirmwareTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTasksResponse DescribeFirmwareTasks(DescribeFirmwareTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmwareTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取产品转发规则
     * @param req DescribeForwardRuleRequest
     * @return DescribeForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForwardRuleResponse DescribeForwardRule(DescribeForwardRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeForwardRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeForwardRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeForwardRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询产品配置的数据模板信息
     * @param req DescribeModelDefinitionRequest
     * @return DescribeModelDefinitionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelDefinitionResponse DescribeModelDefinition(DescribeModelDefinitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelDefinitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelDefinitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelDefinition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取产品详情
     * @param req DescribeProductRequest
     * @return DescribeProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductResponse DescribeProduct(DescribeProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取产品列表
     * @param req DescribeProductsRequest
     * @return DescribeProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductsResponse DescribeProducts(DescribeProductsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProducts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于编辑固件信息
     * @param req EditFirmwareRequest
     * @return EditFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public EditFirmwareResponse EditFirmware(EditFirmwareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditFirmwareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EditFirmwareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EditFirmware");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取视频防盗链播放URL
     * @param req GenerateSignedVideoURLRequest
     * @return GenerateSignedVideoURLResponse
     * @throws TencentCloudSDKException
     */
    public GenerateSignedVideoURLResponse GenerateSignedVideoURL(GenerateSignedVideoURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateSignedVideoURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateSignedVideoURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateSignedVideoURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetAllFirmwareVersion）用于获取所有的版本列表 
     * @param req GetAllFirmwareVersionRequest
     * @return GetAllFirmwareVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetAllFirmwareVersionResponse GetAllFirmwareVersion(GetAllFirmwareVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAllFirmwareVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAllFirmwareVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAllFirmwareVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetFirmwareURL）用于获取固件存储的URL 
     * @param req GetFirmwareURLRequest
     * @return GetFirmwareURLResponse
     * @throws TencentCloudSDKException
     */
    public GetFirmwareURLResponse GetFirmwareURL(GetFirmwareURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFirmwareURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetFirmwareURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFirmwareURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导入其它产品的数据模板，覆盖现有数据模板的物模型和产品分类信息
     * @param req ImportModelDefinitionRequest
     * @return ImportModelDefinitionResponse
     * @throws TencentCloudSDKException
     */
    public ImportModelDefinitionResponse ImportModelDefinition(ImportModelDefinitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportModelDefinitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImportModelDefinitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImportModelDefinition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListFirmwares）用于获取固件列表 
     * @param req ListFirmwaresRequest
     * @return ListFirmwaresResponse
     * @throws TencentCloudSDKException
     */
    public ListFirmwaresResponse ListFirmwares(ListFirmwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListFirmwaresResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListFirmwaresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListFirmwares");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改设备信息
     * @param req ModifyDeviceRequest
     * @return ModifyDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceResponse ModifyDevice(ModifyDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改转发规则
     * @param req ModifyForwardRuleRequest
     * @return ModifyForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyForwardRuleResponse ModifyForwardRule(ModifyForwardRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyForwardRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyForwardRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyForwardRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供修改产品的数据模板的能力
     * @param req ModifyModelDefinitionRequest
     * @return ModifyModelDefinitionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelDefinitionResponse ModifyModelDefinition(ModifyModelDefinitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyModelDefinitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyModelDefinitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyModelDefinition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改产品信息
     * @param req ModifyProductRequest
     * @return ModifyProductResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProductResponse ModifyProduct(ModifyProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（PublishMessage）用于使用自定义透传协议进行设备远控
     * @param req PublishMessageRequest
     * @return PublishMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishMessageResponse PublishMessage(PublishMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishMessageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PublishMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PublishMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置云存服务
     * @param req ResetCloudStorageRequest
     * @return ResetCloudStorageResponse
     * @throws TencentCloudSDKException
     */
    public ResetCloudStorageResponse ResetCloudStorage(ResetCloudStorageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetCloudStorageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetCloudStorageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetCloudStorage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于重试设备升级任务
     * @param req RetryDeviceFirmwareTaskRequest
     * @return RetryDeviceFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public RetryDeviceFirmwareTaskResponse RetryDeviceFirmwareTask(RetryDeviceFirmwareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RetryDeviceFirmwareTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RetryDeviceFirmwareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RetryDeviceFirmwareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置转发权限
     * @param req SetForwardAuthRequest
     * @return SetForwardAuthResponse
     * @throws TencentCloudSDKException
     */
    public SetForwardAuthResponse SetForwardAuth(SetForwardAuthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetForwardAuthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetForwardAuthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetForwardAuth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *转移云存服务
     * @param req TransferCloudStorageRequest
     * @return TransferCloudStorageResponse
     * @throws TencentCloudSDKException
     */
    public TransferCloudStorageResponse TransferCloudStorage(TransferCloudStorageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransferCloudStorageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TransferCloudStorageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TransferCloudStorage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UploadFirmware）用于上传设备固件信息 
     * @param req UploadFirmwareRequest
     * @return UploadFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public UploadFirmwareResponse UploadFirmware(UploadFirmwareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFirmwareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFirmwareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadFirmware");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
