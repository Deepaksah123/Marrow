package kotlin;

import kotlin.Metadata;

/* JADX INFO: renamed from: o.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/marrow2/ui/video/lesson_list/model/VideoListAdapterUIState;", "", "arePaidLessonsUnLocked", "", "currentEdition", "", "shouldShowPyt", "<init>", "(ZIZ)V", "getArePaidLessonsUnLocked", "()Z", "getCurrentEdition", "()I", "getShouldShowPyt", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class C0195r {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final int write;

    private C0195r(boolean z, int i, boolean z2) {
        this.AudioAttributesCompatParcelizer = z;
        this.write = i;
        this.RemoteActionCompatParcelizer = z2;
    }

    public /* synthetic */ C0195r(boolean z, int i, boolean z2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 6 : i, (i2 & 4) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public C0195r() {
        this(false, 0, false, 7, null);
    }

    public static /* synthetic */ C0195r read(C0195r c0195r, boolean z, int i, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = c0195r.AudioAttributesCompatParcelizer;
        }
        if ((i2 & 2) != 0) {
            i = c0195r.write;
        }
        if ((i2 & 4) != 0) {
            z2 = c0195r.RemoteActionCompatParcelizer;
        }
        return RemoteActionCompatParcelizer(z, i, z2);
    }

    private static C0195r RemoteActionCompatParcelizer(boolean z, int i, boolean z2) {
        return new C0195r(z, i, z2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0195r)) {
            return false;
        }
        C0195r c0195r = (C0195r) other;
        return this.AudioAttributesCompatParcelizer == c0195r.AudioAttributesCompatParcelizer && this.write == c0195r.write && this.RemoteActionCompatParcelizer == c0195r.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((Boolean.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Integer.hashCode(this.write)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.AudioAttributesCompatParcelizer;
        int i = this.write;
        boolean z2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("VideoListAdapterUIState(arePaidLessonsUnLocked=");
        sb.append(z);
        sb.append(", currentEdition=");
        sb.append(i);
        sb.append(", shouldShowPyt=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
