package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013"}, d2 = {"Lo/getDefault;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "write", "Lkotlin/Function0;", "AudioAttributesCompatParcelizer", "Lo/getCreatedOnDateMs;", "()Lo/getCreatedOnDateMs;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDefault {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<Boolean> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    public final getCreatedOnDateMs<Boolean> RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getDefault)) {
            return false;
        }
        getDefault getdefault = (getDefault) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getdefault.write) && this.read == getdefault.read;
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAccessibilityAction(label=");
        sb.append(this.write);
        sb.append(", action=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
