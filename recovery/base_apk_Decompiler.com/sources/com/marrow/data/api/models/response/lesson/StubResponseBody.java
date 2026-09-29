package com.marrow.data.api.models.response.lesson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/marrow/data/api/models/response/lesson/StubResponseBody;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/marrow/data/api/models/response/lesson/StubResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "deeplink", "Ljava/lang/String;", "getDeeplink", "sno", "I", "getSno", "title", "getTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StubResponseBody {
    private final String deeplink;
    private final int sno;
    private final String title;

    public StubResponseBody(@JsonProperty("deeplink") String str, @JsonProperty("sno") int i, @JsonProperty("title") String str2) {
        this.deeplink = str;
        this.sno = i;
        this.title = str2;
    }

    public /* synthetic */ StubResponseBody(String str, int i, String str2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final int getSno() {
        return this.sno;
    }

    public final String getTitle() {
        return this.title;
    }

    public StubResponseBody() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ StubResponseBody copy$default(StubResponseBody stubResponseBody, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stubResponseBody.deeplink;
        }
        if ((i2 & 2) != 0) {
            i = stubResponseBody.sno;
        }
        if ((i2 & 4) != 0) {
            str2 = stubResponseBody.title;
        }
        return stubResponseBody.copy(str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSno() {
        return this.sno;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final StubResponseBody copy(@JsonProperty("deeplink") String p0, @JsonProperty("sno") int p1, @JsonProperty("title") String p2) {
        return new StubResponseBody(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof StubResponseBody)) {
            return false;
        }
        StubResponseBody stubResponseBody = (StubResponseBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.deeplink, (Object) stubResponseBody.deeplink) && this.sno == stubResponseBody.sno && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) stubResponseBody.title);
    }

    public final int hashCode() {
        String str = this.deeplink;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Integer.hashCode(this.sno);
        String str2 = this.title;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.deeplink;
        int i = this.sno;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("StubResponseBody(deeplink=");
        sb.append(str);
        sb.append(", sno=");
        sb.append(i);
        sb.append(", title=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
