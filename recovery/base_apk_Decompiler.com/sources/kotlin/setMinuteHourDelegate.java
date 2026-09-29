package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\r¨\u0006 "}, d2 = {"Lcom/marrow2/ui/video/landing/model/HorizontalScrollUIState;", "", "isBookmarkViewRequired", "", "downloadedVideosTabData", "Lcom/marrow2/ui/video/landing/model/VideoTabsData;", "areTimelineSynced", "bookmarkedVideosCount", "", "showBookmarkedVideosTab", "isSampleVideoViewLoaded", "<init>", "(ZLcom/marrow2/ui/video/landing/model/VideoTabsData;ZIZZ)V", "()Z", "getDownloadedVideosTabData", "()Lcom/marrow2/ui/video/landing/model/VideoTabsData;", "getAreTimelineSynced", "getBookmarkedVideosCount", "()I", "getShowBookmarkedVideosTab", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setMinuteHourDelegate {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final int read;
    private final createStandard write;

    private setMinuteHourDelegate(boolean z, createStandard createstandard, boolean z2, int i, boolean z3, boolean z4) {
        this.RemoteActionCompatParcelizer = z;
        this.write = createstandard;
        this.AudioAttributesCompatParcelizer = z2;
        this.read = i;
        this.AudioAttributesImplApi26Parcelizer = z3;
        this.IconCompatParcelizer = z4;
    }

    public /* synthetic */ setMinuteHourDelegate(boolean z, createStandard createstandard, boolean z2, int i, boolean z3, boolean z4, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : createstandard, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? false : z4);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final createStandard getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public setMinuteHourDelegate() {
        this(false, null, false, 0, false, false, 63, null);
    }

    public static /* synthetic */ setMinuteHourDelegate IconCompatParcelizer(setMinuteHourDelegate setminutehourdelegate, boolean z, createStandard createstandard, boolean z2, int i, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            z = setminutehourdelegate.RemoteActionCompatParcelizer;
        }
        if ((i2 & 2) != 0) {
            createstandard = setminutehourdelegate.write;
        }
        createStandard createstandard2 = createstandard;
        if ((i2 & 4) != 0) {
            z2 = setminutehourdelegate.AudioAttributesCompatParcelizer;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            i = setminutehourdelegate.read;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z3 = setminutehourdelegate.AudioAttributesImplApi26Parcelizer;
        }
        boolean z6 = z3;
        if ((i2 & 32) != 0) {
            z4 = setminutehourdelegate.IconCompatParcelizer;
        }
        return AudioAttributesCompatParcelizer(z, createstandard2, z5, i3, z6, z4);
    }

    private static setMinuteHourDelegate AudioAttributesCompatParcelizer(boolean z, createStandard createstandard, boolean z2, int i, boolean z3, boolean z4) {
        return new setMinuteHourDelegate(z, createstandard, z2, i, z3, z4);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof setMinuteHourDelegate)) {
            return false;
        }
        setMinuteHourDelegate setminutehourdelegate = (setMinuteHourDelegate) other;
        return this.RemoteActionCompatParcelizer == setminutehourdelegate.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, setminutehourdelegate.write) && this.AudioAttributesCompatParcelizer == setminutehourdelegate.AudioAttributesCompatParcelizer && this.read == setminutehourdelegate.read && this.AudioAttributesImplApi26Parcelizer == setminutehourdelegate.AudioAttributesImplApi26Parcelizer && this.IconCompatParcelizer == setminutehourdelegate.IconCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        createStandard createstandard = this.write;
        return (((((((((iHashCode * 31) + (createstandard == null ? 0 : createstandard.hashCode())) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.read)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.RemoteActionCompatParcelizer;
        createStandard createstandard = this.write;
        boolean z2 = this.AudioAttributesCompatParcelizer;
        int i = this.read;
        boolean z3 = this.AudioAttributesImplApi26Parcelizer;
        boolean z4 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("HorizontalScrollUIState(isBookmarkViewRequired=");
        sb.append(z);
        sb.append(", downloadedVideosTabData=");
        sb.append(createstandard);
        sb.append(", areTimelineSynced=");
        sb.append(z2);
        sb.append(", bookmarkedVideosCount=");
        sb.append(i);
        sb.append(", showBookmarkedVideosTab=");
        sb.append(z3);
        sb.append(", isSampleVideoViewLoaded=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }
}
