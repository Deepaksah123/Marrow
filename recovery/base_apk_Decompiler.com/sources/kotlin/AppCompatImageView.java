package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010!\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u0019\u0010 "}, d2 = {"Lo/AppCompatImageView;", "", "Lo/_skipWSOrEnd;", "p0", "Lkotlin/Function1;", "Lo/getKey;", "p1", "Lo/SwitchCompat;", "p2", "", "p3", "<init>", "(Lo/_skipWSOrEnd;Lo/getAnswerMap;Lo/SwitchCompat;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/_skipWSOrEnd;", "write", "()Lo/_skipWSOrEnd;", "RemoteActionCompatParcelizer", "Lo/getAnswerMap;", "()Lo/getAnswerMap;", "AudioAttributesCompatParcelizer", "Lo/SwitchCompat;", "()Lo/SwitchCompat;", "Z", "()Z", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppCompatImageView {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final SwitchCompat<getKey> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final _skipWSOrEnd RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<getKey, getKey> AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public AppCompatImageView(_skipWSOrEnd _skipwsorend, getAnswerMap<? super getKey, getKey> getanswermap, SwitchCompat<getKey> switchCompat, boolean z) {
        this.RemoteActionCompatParcelizer = _skipwsorend;
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.write = switchCompat;
        this.IconCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final _skipWSOrEnd getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final getAnswerMap<getKey, getKey> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final SwitchCompat<getKey> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AppCompatImageView)) {
            return false;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, appCompatImageView.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, appCompatImageView.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, appCompatImageView.write) && this.IconCompatParcelizer == appCompatImageView.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppCompatImageView(RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
