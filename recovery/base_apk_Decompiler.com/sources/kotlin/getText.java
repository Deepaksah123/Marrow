package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0014\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0014\u0010\u001eR$\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001a\u0010 \"\u0004\b\u001a\u0010!R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u0018\u0010#"}, d2 = {"Lo/getText;", "", "", "p0", "", "p1", "Lo/BackStackState;", "p2", "Lo/getShowsDialog;", "p3", "<init>", "(FZLo/BackStackState;Lo/getShowsDialog;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "F", "RemoteActionCompatParcelizer", "()F", "IconCompatParcelizer", "(F)V", "read", "Z", "AudioAttributesCompatParcelizer", "()Z", "(Z)V", "Lo/BackStackState;", "()Lo/BackStackState;", "(Lo/BackStackState;)V", "Lo/getShowsDialog;", "()Lo/getShowsDialog;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class getText {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getShowsDialog RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private BackStackState AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private float IconCompatParcelizer;

    public getText(float f, boolean z, BackStackState backStackState, getShowsDialog getshowsdialog) {
        this.IconCompatParcelizer = f;
        this.write = z;
        this.AudioAttributesCompatParcelizer = backStackState;
        this.RemoteActionCompatParcelizer = getshowsdialog;
    }

    public /* synthetic */ getText(float f, boolean z, BackStackState backStackState, getShowsDialog getshowsdialog, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : backStackState, (i & 8) != 0 ? null : getshowsdialog);
    }

    public final void IconCompatParcelizer(float f) {
        this.IconCompatParcelizer = f;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public final void write(boolean z) {
        this.write = z;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final BackStackState getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void read(BackStackState backStackState) {
        this.AudioAttributesCompatParcelizer = backStackState;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final getShowsDialog getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public getText() {
        this(BitmapDescriptorFactory.HUE_RED, false, null, null, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getText)) {
            return false;
        }
        getText gettext = (getText) p0;
        return Float.compare(this.IconCompatParcelizer, gettext.IconCompatParcelizer) == 0 && this.write == gettext.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, gettext.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, gettext.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.IconCompatParcelizer);
        int iHashCode2 = Boolean.hashCode(this.write);
        BackStackState backStackState = this.AudioAttributesCompatParcelizer;
        int iHashCode3 = backStackState == null ? 0 : backStackState.hashCode();
        getShowsDialog getshowsdialog = this.RemoteActionCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (getshowsdialog != null ? getshowsdialog.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("getText(IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
