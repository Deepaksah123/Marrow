package com.marrow.data.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data<Res> implements Serializable {

    @JsonProperty(CourseConfigKeyConstantsKt.KEY_CONFIG_VERSION)
    public int configVersion;

    @JsonProperty("data")
    public Res data;

    @JsonProperty("env_var")
    public EnvironmentData environmentData;

    @JsonProperty("flush_cache")
    public boolean flushCache;

    @JsonProperty("load_more")
    public boolean loadMore;

    @JsonProperty("next_url")
    public String nextUrl;

    @JsonProperty("page_info")
    public PageInfo pageInfo;

    @JsonProperty("total")
    public int total;

    public Data(Res res) {
        this.data = res;
    }

    public Data() {
    }

    public boolean hasData() {
        return this.data != null;
    }

    public static <Res> Data<Res> cloneFor(Data data, Res res) {
        Data<Res> data2 = new Data<>();
        data2.data = res;
        data2.flushCache = data.flushCache;
        data2.loadMore = data.loadMore;
        data2.environmentData = data.environmentData;
        data2.total = data.total;
        data2.nextUrl = data.nextUrl;
        data2.pageInfo = data.pageInfo;
        data2.configVersion = data.configVersion;
        return data2;
    }
}
