package com.marrow2.core.network.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.Data;
import com.marrow.data.models.ResponseError;
import java.io.Serializable;
import java.lang.reflect.Array;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\"\u0010\u0019\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b$\u0010\u0007R\u0011\u0010%\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b%\u0010\u0007R\u0011\u0010)\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b*\u0010\u0007R\u0011\u0010,\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b+\u0010\f"}, d2 = {"Lcom/marrow2/core/network/model/NetworkApiResponse;", "Res", "Ljava/io/Serializable;", "<init>", "()V", "", "hasData", "()Z", "", "status", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "", "code", "I", "getCode", "()I", "setCode", "(I)V", "errorMessage", "getErrorMessage", "setErrorMessage", "isDbFlushIgnored", "Z", "setDbFlushIgnored", "(Z)V", "Lcom/marrow/data/api/models/response/Data;", "data", "Lcom/marrow/data/api/models/response/Data;", "getData", "()Lcom/marrow/data/api/models/response/Data;", "setData", "(Lcom/marrow/data/api/models/response/Data;)V", "isNonEmpty", "isEmpty", "Lcom/marrow/data/models/ResponseError;", "getError", "()Lcom/marrow/data/models/ResponseError;", "error", "isSuccessful", "getReadableErrorMessage", "readableErrorMessage", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkApiResponse<Res> implements Serializable {
    public static final String KEY_IGNORE_FLUSH_DB = "ignore_db_flush";
    public static final String STATUS_SUCCESS = "success";

    @JsonProperty("code")
    private int code;

    @JsonProperty("data")
    private Data<Res> data;

    @JsonProperty("error_msg")
    private String errorMessage;

    @JsonProperty("ignore_db_flush")
    private boolean isDbFlushIgnored;

    @JsonProperty("status")
    private String status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final int getCode() {
        return this.code;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    /* JADX INFO: renamed from: isDbFlushIgnored, reason: from getter */
    public final boolean getIsDbFlushIgnored() {
        return this.isDbFlushIgnored;
    }

    public final void setDbFlushIgnored(boolean z) {
        this.isDbFlushIgnored = z;
    }

    public final Data<Res> getData() {
        return this.data;
    }

    public final void setData(Data<Res> data) {
        this.data = data;
    }

    public final boolean hasData() {
        Data<Res> data = this.data;
        if (data == null) {
            return false;
        }
        toMagicModuleMetaRepoModel.write(data);
        return data.hasData();
    }

    public final boolean isNonEmpty() {
        if (!hasData()) {
            return false;
        }
        Data<Res> data = this.data;
        Res res = data != null ? data.data : null;
        toMagicModuleMetaRepoModel.write(res);
        if (res.getClass().isArray()) {
            return true;
        }
        Data<Res> data2 = this.data;
        toMagicModuleMetaRepoModel.write(data2);
        return Array.getLength(data2.data) > 0;
    }

    public final boolean isEmpty() {
        return !isNonEmpty();
    }

    @JsonIgnore
    public final ResponseError getError() {
        return new ResponseError(this.code, this.errorMessage, this.isDbFlushIgnored);
    }

    @JsonIgnore
    public final boolean isSuccessful() {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "success", (Object) this.status);
    }

    public final String getReadableErrorMessage() {
        String str = this.errorMessage;
        if (str == null) {
            return "";
        }
        toMagicModuleMetaRepoModel.write((Object) str);
        return str;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/marrow2/core/network/model/NetworkApiResponse$Companion;", "", "<init>", "()V", "Res", "p0", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "create", "(Ljava/lang/Object;)Lcom/marrow2/core/network/model/NetworkApiResponse;", "", "KEY_IGNORE_FLUSH_DB", "Ljava/lang/String;", "STATUS_SUCCESS"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <Res> NetworkApiResponse<Res> create(Res p0) {
            NetworkApiResponse<Res> networkApiResponse = new NetworkApiResponse<>();
            networkApiResponse.setCode(200);
            networkApiResponse.setStatus("success");
            networkApiResponse.setData(new Data<>(p0));
            return networkApiResponse;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
