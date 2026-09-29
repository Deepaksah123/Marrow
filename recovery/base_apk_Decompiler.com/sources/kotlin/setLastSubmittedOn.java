package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000eR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lo/setLastSubmittedOn;", "", "", "p0", "", "p1", "", "p2", "p3", "<init>", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "I", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "write", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setLastSubmittedOn {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private String read;
    private Boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    private setLastSubmittedOn(@JsonProperty("code") int i, @JsonProperty("error_msg") String str, @JsonProperty("ignore_db_flush") Boolean bool, @JsonProperty("status") String str2) {
        this.RemoteActionCompatParcelizer = i;
        this.read = str;
        this.IconCompatParcelizer = bool;
        this.AudioAttributesCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    public /* synthetic */ setLastSubmittedOn(int i, String str, Boolean bool, String str2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? Boolean.TRUE : bool, (i2 & 8) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final Boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public setLastSubmittedOn() {
        this(0, null, null, null, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setLastSubmittedOn)) {
            return false;
        }
        setLastSubmittedOn setlastsubmittedon = (setLastSubmittedOn) p0;
        return this.RemoteActionCompatParcelizer == setlastsubmittedon.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) setlastsubmittedon.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setlastsubmittedon.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setlastsubmittedon.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.RemoteActionCompatParcelizer);
        String str = this.read;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.IconCompatParcelizer;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str2 = this.AudioAttributesCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        String str = this.read;
        Boolean bool = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("setLastSubmittedOn(RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", read=");
        sb.append(str);
        sb.append(", IconCompatParcelizer=");
        sb.append(bool);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
