package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006#"}, d2 = {"Lcom/marrow2/ui/video/revision_video/model/RevisionProgressInfo;", "", "videosCompleted", "", "videosTotal", "activeRecallCompleted", "activeRecallTotal", "playAnimation", "", "<init>", "(IIIIZ)V", "getVideosCompleted", "()I", "getVideosTotal", "getActiveRecallCompleted", "getActiveRecallTotal", "getPlayAnimation", "()Z", "videosProgress", "", "getVideosProgress", "()F", "activeRecallProgress", "getActiveRecallProgress", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class component3 {
    private final int AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public component3(int i, int i2, int i3, int i4, boolean z) {
        this.read = i;
        this.write = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.IconCompatParcelizer = i4;
        this.RemoteActionCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final float AudioAttributesImplBaseParcelizer() {
        int i = this.write;
        return i > 0 ? this.read / i : BitmapDescriptorFactory.HUE_RED;
    }

    public final float write() {
        int i = this.IconCompatParcelizer;
        return i > 0 ? this.AudioAttributesCompatParcelizer / i : BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static component3 write(int i, int i2, int i3, int i4, boolean z) {
        return new component3(i, i2, i3, i4, false);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof component3)) {
            return false;
        }
        component3 component3Var = (component3) other;
        return this.read == component3Var.read && this.write == component3Var.write && this.AudioAttributesCompatParcelizer == component3Var.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == component3Var.IconCompatParcelizer && this.RemoteActionCompatParcelizer == component3Var.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.read) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = this.read;
        int i2 = this.write;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = this.IconCompatParcelizer;
        boolean z = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("RevisionProgressInfo(videosCompleted=");
        sb.append(i);
        sb.append(", videosTotal=");
        sb.append(i2);
        sb.append(", activeRecallCompleted=");
        sb.append(i3);
        sb.append(", activeRecallTotal=");
        sb.append(i4);
        sb.append(", playAnimation=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
