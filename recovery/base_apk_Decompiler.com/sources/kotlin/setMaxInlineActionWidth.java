package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/marrow2/ui/video/downloaded_videos/model/DownloadVideoListAdapterUIState;", "", "shouldShowPyt", "", "showDeleteUI", "<init>", "(ZZ)V", "getShouldShowPyt", "()Z", "getShowDeleteUI", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setMaxInlineActionWidth {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;

    private setMaxInlineActionWidth(boolean z, boolean z2) {
        this.RemoteActionCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = z2;
    }

    public /* synthetic */ setMaxInlineActionWidth(boolean z, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public setMaxInlineActionWidth() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ setMaxInlineActionWidth IconCompatParcelizer(setMaxInlineActionWidth setmaxinlineactionwidth, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = setmaxinlineactionwidth.RemoteActionCompatParcelizer;
        }
        if ((i & 2) != 0) {
            z2 = setmaxinlineactionwidth.AudioAttributesCompatParcelizer;
        }
        return write(z, z2);
    }

    private static setMaxInlineActionWidth write(boolean z, boolean z2) {
        return new setMaxInlineActionWidth(z, z2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof setMaxInlineActionWidth)) {
            return false;
        }
        setMaxInlineActionWidth setmaxinlineactionwidth = (setMaxInlineActionWidth) other;
        return this.RemoteActionCompatParcelizer == setmaxinlineactionwidth.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == setmaxinlineactionwidth.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.RemoteActionCompatParcelizer;
        boolean z2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("DownloadVideoListAdapterUIState(shouldShowPyt=");
        sb.append(z);
        sb.append(", showDeleteUI=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
