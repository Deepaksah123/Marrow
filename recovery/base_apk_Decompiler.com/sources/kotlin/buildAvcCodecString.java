package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/buildAvcCodecString;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "detectedList", "Ljava/lang/String;", "errorTag", "screenEventId", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class buildAvcCodecString {
    public static final int $stable = 0;

    @JsonProperty("dl")
    private final String detectedList;

    @JsonProperty("et")
    private final String errorTag;

    @JsonProperty("se")
    private final int screenEventId;

    public buildAvcCodecString(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.detectedList = str;
        this.errorTag = str2;
        this.screenEventId = i;
    }

    public /* synthetic */ buildAvcCodecString(String str, String str2, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i);
    }

    public buildAvcCodecString() {
        this(null, null, 0, 7, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof buildAvcCodecString)) {
            return false;
        }
        buildAvcCodecString buildavccodecstring = (buildAvcCodecString) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.detectedList, (Object) buildavccodecstring.detectedList) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.errorTag, (Object) buildavccodecstring.errorTag) && this.screenEventId == buildavccodecstring.screenEventId;
    }

    public final int hashCode() {
        return (((this.detectedList.hashCode() * 31) + this.errorTag.hashCode()) * 31) + Integer.hashCode(this.screenEventId);
    }

    public final String toString() {
        String str = this.detectedList;
        String str2 = this.errorTag;
        int i = this.screenEventId;
        StringBuilder sb = new StringBuilder("buildAvcCodecString(detectedList=");
        sb.append(str);
        sb.append(", errorTag=");
        sb.append(str2);
        sb.append(", screenEventId=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
