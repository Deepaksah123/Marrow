package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001:\u0001=B\u0099\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0004HÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00104\u001a\u00020\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0013HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\u009b\u0001\u00108\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0006HÆ\u0001J\u0013\u00109\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0006HÖ\u0001J\t\u0010<\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010!R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001b¨\u0006>"}, d2 = {"Lcom/marrow2/ui/bookmark/detail/model/BookmarkDetailUIState;", "", "mcqIds", "", "", "lastMcqPosition", "", "bookmarkParentType", "Lcom/marrow2/ui/bookmark/detail/BookmarkParentType;", "parentId", "showGrid", "", "isSharingAllowed", "showAnswer", "selectedBookmarkFilter", "Lcom/marrow2/domain/mcq/model/BookmarkType;", "selectedSubjectIdFilter", "selectedSubjectToolbarTitle", "reviewMode", "Lcom/marrow2/ui/bookmark/detail/model/BookmarkDetailUIState$ReviewMode;", "tabTitles", "tabStepSize", "<init>", "(Ljava/util/List;ILcom/marrow2/ui/bookmark/detail/BookmarkParentType;Ljava/lang/String;ZZZLcom/marrow2/domain/mcq/model/BookmarkType;Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/ui/bookmark/detail/model/BookmarkDetailUIState$ReviewMode;Ljava/util/List;I)V", "getMcqIds", "()Ljava/util/List;", "getLastMcqPosition", "()I", "getBookmarkParentType", "()Lcom/marrow2/ui/bookmark/detail/BookmarkParentType;", "getParentId", "()Ljava/lang/String;", "getShowGrid", "()Z", "getShowAnswer", "getSelectedBookmarkFilter", "()Lcom/marrow2/domain/mcq/model/BookmarkType;", "getSelectedSubjectIdFilter", "getSelectedSubjectToolbarTitle", "getReviewMode", "()Lcom/marrow2/ui/bookmark/detail/model/BookmarkDetailUIState$ReviewMode;", "getTabTitles", "getTabStepSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "ReviewMode", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class updateVideoFrameProcessingOffsetCounters {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final read AudioAttributesImplApi26Parcelizer;
    private final onDisplayInfoChanged AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatMediaItem;
    private final boolean MediaDescriptionCompat;
    private final List<String> MediaMetadataCompat;
    private final boolean RemoteActionCompatParcelizer;
    private final List<String> read;
    private final isBufferLate write;

    private updateVideoFrameProcessingOffsetCounters(List<String> list, int i, isBufferLate isbufferlate, String str, boolean z, boolean z2, boolean z3, onDisplayInfoChanged ondisplayinfochanged, String str2, String str3, read readVar, List<String> list2, int i2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(isbufferlate, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.read = list;
        this.IconCompatParcelizer = i;
        this.write = isbufferlate;
        this.AudioAttributesCompatParcelizer = str;
        this.MediaDescriptionCompat = z;
        this.RemoteActionCompatParcelizer = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = z3;
        this.AudioAttributesImplBaseParcelizer = ondisplayinfochanged;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.MediaBrowserCompatItemReceiver = str3;
        this.AudioAttributesImplApi26Parcelizer = readVar;
        this.MediaMetadataCompat = list2;
        this.MediaBrowserCompatMediaItem = i2;
    }

    public /* synthetic */ updateVideoFrameProcessingOffsetCounters(List list, int i, isBufferLate isbufferlate, String str, boolean z, boolean z2, boolean z3, onDisplayInfoChanged ondisplayinfochanged, String str2, String str3, read readVar, List list2, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? isBufferLate.IconCompatParcelizer : isbufferlate, (i3 & 8) != 0 ? "b_parent_id" : str, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? true : z2, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? null : ondisplayinfochanged, (i3 & 256) == 0 ? str2 : null, (i3 & 512) != 0 ? "" : str3, (i3 & 1024) != 0 ? read.RemoteActionCompatParcelizer : readVar, (i3 & 2048) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i3 & 4096) == 0 ? i2 : 0);
    }

    public final List<String> IconCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final isBufferLate getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final onDisplayInfoChanged getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final read getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final List<String> MediaBrowserCompatMediaItem() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final int getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/updateVideoFrameProcessingOffsetCounters$read;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private static final /* synthetic */ read[] write;
        public static final read RemoteActionCompatParcelizer = new read("QBANK", 0);
        public static final read IconCompatParcelizer = new read("REVIEW", 1);

        private read(String str, int i) {
        }

        static {
            read[] readVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            write = readVarArrAudioAttributesCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(readVarArrAudioAttributesCompatParcelizer);
        }

        private static final /* synthetic */ read[] AudioAttributesCompatParcelizer() {
            return new read[]{RemoteActionCompatParcelizer, IconCompatParcelizer};
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) write.clone();
        }
    }

    public updateVideoFrameProcessingOffsetCounters() {
        this(null, 0, null, null, false, false, false, null, null, null, null, null, 0, 8191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static updateVideoFrameProcessingOffsetCounters IconCompatParcelizer(List<String> list, int i, isBufferLate isbufferlate, String str, boolean z, boolean z2, boolean z3, onDisplayInfoChanged ondisplayinfochanged, String str2, String str3, read readVar, List<String> list2, int i2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(isbufferlate, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        return new updateVideoFrameProcessingOffsetCounters(list, i, isbufferlate, str, z, z2, z3, ondisplayinfochanged, str2, str3, readVar, list2, i2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof updateVideoFrameProcessingOffsetCounters)) {
            return false;
        }
        updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters = (updateVideoFrameProcessingOffsetCounters) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, updatevideoframeprocessingoffsetcounters.read) && this.IconCompatParcelizer == updatevideoframeprocessingoffsetcounters.IconCompatParcelizer && this.write == updatevideoframeprocessingoffsetcounters.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) updatevideoframeprocessingoffsetcounters.AudioAttributesCompatParcelizer) && this.MediaDescriptionCompat == updatevideoframeprocessingoffsetcounters.MediaDescriptionCompat && this.RemoteActionCompatParcelizer == updatevideoframeprocessingoffsetcounters.RemoteActionCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == updatevideoframeprocessingoffsetcounters.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplBaseParcelizer == updatevideoframeprocessingoffsetcounters.AudioAttributesImplBaseParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) updatevideoframeprocessingoffsetcounters.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) updatevideoframeprocessingoffsetcounters.MediaBrowserCompatItemReceiver) && this.AudioAttributesImplApi26Parcelizer == updatevideoframeprocessingoffsetcounters.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, updatevideoframeprocessingoffsetcounters.MediaMetadataCompat) && this.MediaBrowserCompatMediaItem == updatevideoframeprocessingoffsetcounters.MediaBrowserCompatMediaItem;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = Integer.hashCode(this.IconCompatParcelizer);
        int iHashCode3 = this.write.hashCode();
        int iHashCode4 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode5 = Boolean.hashCode(this.MediaDescriptionCompat);
        int iHashCode6 = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode7 = Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        onDisplayInfoChanged ondisplayinfochanged = this.AudioAttributesImplBaseParcelizer;
        int iHashCode8 = ondisplayinfochanged == null ? 0 : ondisplayinfochanged.hashCode();
        String str = this.AudioAttributesImplApi21Parcelizer;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatMediaItem);
    }

    public final String toString() {
        List<String> list = this.read;
        int i = this.IconCompatParcelizer;
        isBufferLate isbufferlate = this.write;
        String str = this.AudioAttributesCompatParcelizer;
        boolean z = this.MediaDescriptionCompat;
        boolean z2 = this.RemoteActionCompatParcelizer;
        boolean z3 = this.MediaBrowserCompatCustomActionResultReceiver;
        onDisplayInfoChanged ondisplayinfochanged = this.AudioAttributesImplBaseParcelizer;
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        String str3 = this.MediaBrowserCompatItemReceiver;
        read readVar = this.AudioAttributesImplApi26Parcelizer;
        List<String> list2 = this.MediaMetadataCompat;
        int i2 = this.MediaBrowserCompatMediaItem;
        StringBuilder sb = new StringBuilder("BookmarkDetailUIState(mcqIds=");
        sb.append(list);
        sb.append(", lastMcqPosition=");
        sb.append(i);
        sb.append(", bookmarkParentType=");
        sb.append(isbufferlate);
        sb.append(", parentId=");
        sb.append(str);
        sb.append(", showGrid=");
        sb.append(z);
        sb.append(", isSharingAllowed=");
        sb.append(z2);
        sb.append(", showAnswer=");
        sb.append(z3);
        sb.append(", selectedBookmarkFilter=");
        sb.append(ondisplayinfochanged);
        sb.append(", selectedSubjectIdFilter=");
        sb.append(str2);
        sb.append(", selectedSubjectToolbarTitle=");
        sb.append(str3);
        sb.append(", reviewMode=");
        sb.append(readVar);
        sb.append(", tabTitles=");
        sb.append(list2);
        sb.append(", tabStepSize=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
