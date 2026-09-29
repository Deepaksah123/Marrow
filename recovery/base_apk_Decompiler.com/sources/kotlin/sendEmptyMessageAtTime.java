package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Lo/sendEmptyMessageAtTime;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class sendEmptyMessageAtTime {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private String write;
    private String read;

    private sendEmptyMessageAtTime(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = str;
        this.write = str2;
    }

    public /* synthetic */ sendEmptyMessageAtTime(String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sendEmptyMessageAtTime() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof sendEmptyMessageAtTime)) {
            return false;
        }
        sendEmptyMessageAtTime sendemptymessageattime = (sendEmptyMessageAtTime) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) sendemptymessageattime.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) sendemptymessageattime.write);
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        String str = this.write;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.write;
        StringBuilder sb = new StringBuilder("sendEmptyMessageAtTime(read=");
        sb.append(str);
        sb.append(", write=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
