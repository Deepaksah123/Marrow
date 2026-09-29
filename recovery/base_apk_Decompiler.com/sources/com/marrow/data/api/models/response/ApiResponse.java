package com.marrow.data.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.ResponseError;
import java.io.Serializable;
import java.lang.reflect.Array;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse<Res> implements Serializable {
    public static final String KEY_IGNORE_FLUSH_DB = "ignore_db_flush";
    public static final String STATUS_FAILURE = "failed";
    public static final String STATUS_SUCCESS = "success";

    @JsonProperty("code")
    public int code;

    @JsonProperty("data")
    public Data<Res> data;

    @JsonProperty("error_msg")
    public String errorMessage;

    @JsonProperty("ignore_db_flush")
    public boolean isDbFlushIgnored;

    @JsonProperty("status")
    public String status;

    public static ApiResponse fromJsonError(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.code = jSONObject.optInt("code");
        apiResponse.errorMessage = jSONObject.optString("error_msg");
        apiResponse.status = jSONObject.optString("status");
        return apiResponse;
    }

    public boolean hasData() {
        Data<Res> data = this.data;
        return data != null && data.hasData();
    }

    public boolean isNonEmpty() {
        if (hasData()) {
            return !this.data.data.getClass().isArray() || Array.getLength(this.data.data) > 0;
        }
        return false;
    }

    public boolean isEmpty() {
        return !isNonEmpty();
    }

    @JsonIgnore
    public static <T> ApiResponse<T> newError(int i, String str) {
        ApiResponse<T> apiResponse = new ApiResponse<>();
        apiResponse.code = i;
        apiResponse.errorMessage = str;
        apiResponse.status = STATUS_FAILURE;
        return apiResponse;
    }

    @JsonIgnore
    public ResponseError getError() {
        return new ResponseError(this.code, this.errorMessage, this.isDbFlushIgnored);
    }

    @JsonIgnore
    public boolean isSuccessful() {
        return "success".equals(this.status);
    }

    public static <Res> ApiResponse<Res> create(Res res) {
        ApiResponse<Res> apiResponse = new ApiResponse<>();
        apiResponse.code = 200;
        apiResponse.status = "success";
        apiResponse.data = new Data<>(res);
        return apiResponse;
    }

    public String getReadableErrorMessage() {
        String str = this.errorMessage;
        return str != null ? str : "";
    }
}
