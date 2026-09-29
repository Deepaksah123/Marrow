package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JP\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012R\u0017\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010#\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010&\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0012R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0015"}, d2 = {"Lcom/marrow2/data/test/remote/model/GTNudgeRSModel;", "", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/util/List;", "copy", "(ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/marrow2/data/test/remote/model/GTNudgeRSModel;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "showNudge", "Z", "getShowNudge", "nudgeType", "Ljava/lang/Integer;", "getNudgeType", "testId", "Ljava/lang/String;", "getTestId", "title", "getTitle", "body", "Ljava/util/List;", "getBody"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GTNudgeRSModel {
    public static final int $stable = 8;
    private final List<String> body;
    private final Integer nudgeType;
    private final boolean showNudge;
    private final String testId;
    private final String title;

    public GTNudgeRSModel(@JsonProperty("show_nudge") boolean z, @JsonProperty("nudge_type") Integer num, @JsonProperty("test_id") String str, @JsonProperty("title") String str2, @JsonProperty("body") List<String> list) {
        this.showNudge = z;
        this.nudgeType = num;
        this.testId = str;
        this.title = str2;
        this.body = list;
    }

    public final boolean getShowNudge() {
        return this.showNudge;
    }

    public /* synthetic */ GTNudgeRSModel(boolean z, Integer num, String str, String str2, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final Integer getNudgeType() {
        return this.nudgeType;
    }

    public final String getTestId() {
        return this.testId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<String> getBody() {
        return this.body;
    }

    public GTNudgeRSModel() {
        this(false, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GTNudgeRSModel copy$default(GTNudgeRSModel gTNudgeRSModel, boolean z, Integer num, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = gTNudgeRSModel.showNudge;
        }
        if ((i & 2) != 0) {
            num = gTNudgeRSModel.nudgeType;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str = gTNudgeRSModel.testId;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = gTNudgeRSModel.title;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            list = gTNudgeRSModel.body;
        }
        return gTNudgeRSModel.copy(z, num2, str3, str4, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowNudge() {
        return this.showNudge;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getNudgeType() {
        return this.nudgeType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTestId() {
        return this.testId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component5() {
        return this.body;
    }

    public final GTNudgeRSModel copy(@JsonProperty("show_nudge") boolean p0, @JsonProperty("nudge_type") Integer p1, @JsonProperty("test_id") String p2, @JsonProperty("title") String p3, @JsonProperty("body") List<String> p4) {
        return new GTNudgeRSModel(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GTNudgeRSModel)) {
            return false;
        }
        GTNudgeRSModel gTNudgeRSModel = (GTNudgeRSModel) p0;
        return this.showNudge == gTNudgeRSModel.showNudge && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.nudgeType, gTNudgeRSModel.nudgeType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.testId, (Object) gTNudgeRSModel.testId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) gTNudgeRSModel.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.body, gTNudgeRSModel.body);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.showNudge);
        Integer num = this.nudgeType;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.testId;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.body;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.showNudge;
        Integer num = this.nudgeType;
        String str = this.testId;
        String str2 = this.title;
        List<String> list = this.body;
        StringBuilder sb = new StringBuilder("GTNudgeRSModel(showNudge=");
        sb.append(z);
        sb.append(", nudgeType=");
        sb.append(num);
        sb.append(", testId=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", body=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
