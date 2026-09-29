package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/AppCompatToggleButton;", "", "Lkotlin/Function1;", "Lo/getKey;", "Lo/hasReferringProperties;", "p0", "Lo/SwitchCompat;", "p1", "<init>", "(Lo/getAnswerMap;Lo/SwitchCompat;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "Lo/getAnswerMap;", "AudioAttributesCompatParcelizer", "()Lo/getAnswerMap;", "RemoteActionCompatParcelizer", "Lo/SwitchCompat;", "read", "()Lo/SwitchCompat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppCompatToggleButton {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final SwitchCompat<hasReferringProperties> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<getKey, hasReferringProperties> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public AppCompatToggleButton(getAnswerMap<? super getKey, hasReferringProperties> getanswermap, SwitchCompat<hasReferringProperties> switchCompat) {
        this.RemoteActionCompatParcelizer = getanswermap;
        this.write = switchCompat;
    }

    public final getAnswerMap<getKey, hasReferringProperties> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final SwitchCompat<hasReferringProperties> read() {
        return this.write;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AppCompatToggleButton)) {
            return false;
        }
        AppCompatToggleButton appCompatToggleButton = (AppCompatToggleButton) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, appCompatToggleButton.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, appCompatToggleButton.write);
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppCompatToggleButton(RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
