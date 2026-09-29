package kotlin;

import com.google.android.exoplayer2.C;
import java.util.List;
import kotlin.Metadata;
import kotlin.getEndTimestamp;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\nHÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010A\u001a\u00020\u000eHÆ\u0003J\t\u0010B\u001a\u00020\u0011HÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\t\u0010D\u001a\u00020\u0014HÆ\u0003J\t\u0010E\u001a\u00020\nHÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00180\rHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00106J\u0010\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00106JÐ\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020\n2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020\u0005HÖ\u0001J\t\u0010P\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010&R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\r¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b8\u00106R\u0011\u00109\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b9\u0010&¨\u0006Q"}, d2 = {"Lcom/marrow2/ui/test/landing/model/TestPlayUiState;", "", "navigationButtonStatus", "Lcom/marrow2/ui/test/landing/model/NavigationButtonStatus;", "totalMcqCount", "", "currentPagerPosition", "testTimeRemaining", "", "currentMcqStarred", "", "showIntroTooltip", "mcqIds", "", "", "testId", "testReviewState", "Lcom/marrow2/ui/test/landing/model/TestReviewState;", "isBottomBarExpanded", "parentType", "Lcom/marrow2/data/mcq/local/model/McqParentType;", "showTimer", "masterMcqList", "groups", "Lcom/marrow2/ui/test/testplay/model/TestGroupVMModel;", "currentGroup", "progressCurrentIndex", "progressLastIndex", "<init>", "(Lcom/marrow2/ui/test/landing/model/NavigationButtonStatus;IIJZZLjava/util/List;Ljava/lang/String;Lcom/marrow2/ui/test/landing/model/TestReviewState;ZLcom/marrow2/data/mcq/local/model/McqParentType;ZLjava/util/List;Ljava/util/List;Lcom/marrow2/ui/test/testplay/model/TestGroupVMModel;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getNavigationButtonStatus", "()Lcom/marrow2/ui/test/landing/model/NavigationButtonStatus;", "getTotalMcqCount", "()I", "getCurrentPagerPosition", "getTestTimeRemaining", "()J", "getCurrentMcqStarred", "()Z", "getShowIntroTooltip", "getMcqIds", "()Ljava/util/List;", "getTestId", "()Ljava/lang/String;", "getTestReviewState", "()Lcom/marrow2/ui/test/landing/model/TestReviewState;", "getParentType", "()Lcom/marrow2/data/mcq/local/model/McqParentType;", "getShowTimer", "getMasterMcqList", "getGroups", "getCurrentGroup", "()Lcom/marrow2/ui/test/testplay/model/TestGroupVMModel;", "getProgressCurrentIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProgressLastIndex", "isIntermediateTestGroup", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Lcom/marrow2/ui/test/landing/model/NavigationButtonStatus;IIJZZLjava/util/List;Ljava/lang/String;Lcom/marrow2/ui/test/landing/model/TestReviewState;ZLcom/marrow2/data/mcq/local/model/McqParentType;ZLjava/util/List;Ljava/util/List;Lcom/marrow2/ui/test/testplay/model/TestGroupVMModel;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/marrow2/ui/test/landing/model/TestPlayUiState;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getHeader {
    private final setSingleLine AudioAttributesCompatParcelizer;
    private final setDouble AudioAttributesImplApi21Parcelizer;
    private final Integer AudioAttributesImplApi26Parcelizer;
    private final List<String> AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final readBlockToCache MediaBrowserCompatCustomActionResultReceiver;
    private final List<String> MediaBrowserCompatItemReceiver;
    private final boolean MediaBrowserCompatMediaItem;
    private final getEndTimestamp MediaBrowserCompatSearchResultReceiver;
    private final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final Integer MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final boolean RatingCompat;
    private final List<setSingleLine> RemoteActionCompatParcelizer;
    private final int onCommand;
    private final int read;
    private final boolean write;

    private getHeader(setDouble setdouble, int i, int i2, long j, boolean z, boolean z2, List<String> list, String str, getEndTimestamp getendtimestamp, boolean z3, readBlockToCache readblocktocache, boolean z4, List<String> list2, List<setSingleLine> list3, setSingleLine setsingleline, Integer num, Integer num2) {
        toMagicModuleMetaRepoModel.write(setdouble, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getendtimestamp, "");
        toMagicModuleMetaRepoModel.write(readblocktocache, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.AudioAttributesImplApi21Parcelizer = setdouble;
        this.onCommand = i;
        this.read = i2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = j;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompatMediaItem = z2;
        this.AudioAttributesImplBaseParcelizer = list;
        this.MediaMetadataCompat = str;
        this.MediaBrowserCompatSearchResultReceiver = getendtimestamp;
        this.write = z3;
        this.MediaBrowserCompatCustomActionResultReceiver = readblocktocache;
        this.RatingCompat = z4;
        this.MediaBrowserCompatItemReceiver = list2;
        this.RemoteActionCompatParcelizer = list3;
        this.AudioAttributesCompatParcelizer = setsingleline;
        this.AudioAttributesImplApi26Parcelizer = num;
        this.MediaDescriptionCompat = num2;
    }

    public /* synthetic */ getHeader(setDouble setdouble, int i, int i2, long j, boolean z, boolean z2, List list, String str, getEndTimestamp getendtimestamp, boolean z3, readBlockToCache readblocktocache, boolean z4, List list2, List list3, setSingleLine setsingleline, Integer num, Integer num2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? setDouble.RemoteActionCompatParcelizer : setdouble, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 128) != 0 ? "" : str, (i3 & 256) != 0 ? getEndTimestamp.IconCompatParcelizer.INSTANCE : getendtimestamp, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? readBlockToCache.AudioAttributesImplApi26Parcelizer : readblocktocache, (i3 & 2048) == 0 ? z4 : false, (i3 & 4096) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i3 & 8192) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3, (i3 & 16384) != 0 ? null : setsingleline, (i3 & 32768) != 0 ? null : num, (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0 ? num2 : null);
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final setDouble getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final long getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final List<String> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final String getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final getEndTimestamp getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final readBlockToCache getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getRatingCompat() {
        return this.RatingCompat;
    }

    public final List<String> read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final List<setSingleLine> write() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final setSingleLine getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean onCustomAction() {
        setSingleLine setsingleline = this.AudioAttributesCompatParcelizer;
        return setsingleline != null && (getDisplaySizeV16.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setsingleline) ^ true);
    }

    public getHeader() {
        this(null, 0, 0, 0L, false, false, null, null, null, false, null, false, null, null, null, null, null, 131071, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static getHeader AudioAttributesCompatParcelizer(setDouble setdouble, int i, int i2, long j, boolean z, boolean z2, List<String> list, String str, getEndTimestamp getendtimestamp, boolean z3, readBlockToCache readblocktocache, boolean z4, List<String> list2, List<setSingleLine> list3, setSingleLine setsingleline, Integer num, Integer num2) {
        toMagicModuleMetaRepoModel.write(setdouble, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getendtimestamp, "");
        toMagicModuleMetaRepoModel.write(readblocktocache, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        return new getHeader(setdouble, i, i2, j, z, z2, list, str, getendtimestamp, z3, readblocktocache, z4, list2, list3, setsingleline, num, num2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getHeader)) {
            return false;
        }
        getHeader getheader = (getHeader) other;
        return this.AudioAttributesImplApi21Parcelizer == getheader.AudioAttributesImplApi21Parcelizer && this.onCommand == getheader.onCommand && this.read == getheader.read && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == getheader.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.IconCompatParcelizer == getheader.IconCompatParcelizer && this.MediaBrowserCompatMediaItem == getheader.MediaBrowserCompatMediaItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, getheader.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) getheader.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, getheader.MediaBrowserCompatSearchResultReceiver) && this.write == getheader.write && this.MediaBrowserCompatCustomActionResultReceiver == getheader.MediaBrowserCompatCustomActionResultReceiver && this.RatingCompat == getheader.RatingCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, getheader.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getheader.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getheader.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, getheader.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, getheader.MediaDescriptionCompat);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesImplApi21Parcelizer.hashCode();
        int iHashCode2 = Integer.hashCode(this.onCommand);
        int iHashCode3 = Integer.hashCode(this.read);
        int iHashCode4 = Long.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        int iHashCode5 = Boolean.hashCode(this.IconCompatParcelizer);
        int iHashCode6 = Boolean.hashCode(this.MediaBrowserCompatMediaItem);
        int iHashCode7 = this.AudioAttributesImplBaseParcelizer.hashCode();
        int iHashCode8 = this.MediaMetadataCompat.hashCode();
        int iHashCode9 = this.MediaBrowserCompatSearchResultReceiver.hashCode();
        int iHashCode10 = Boolean.hashCode(this.write);
        int iHashCode11 = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
        int iHashCode12 = Boolean.hashCode(this.RatingCompat);
        int iHashCode13 = this.MediaBrowserCompatItemReceiver.hashCode();
        int iHashCode14 = this.RemoteActionCompatParcelizer.hashCode();
        setSingleLine setsingleline = this.AudioAttributesCompatParcelizer;
        int iHashCode15 = setsingleline == null ? 0 : setsingleline.hashCode();
        Integer num = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode16 = num == null ? 0 : num.hashCode();
        Integer num2 = this.MediaDescriptionCompat;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        setDouble setdouble = this.AudioAttributesImplApi21Parcelizer;
        int i = this.onCommand;
        int i2 = this.read;
        long j = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        boolean z = this.IconCompatParcelizer;
        boolean z2 = this.MediaBrowserCompatMediaItem;
        List<String> list = this.AudioAttributesImplBaseParcelizer;
        String str = this.MediaMetadataCompat;
        getEndTimestamp getendtimestamp = this.MediaBrowserCompatSearchResultReceiver;
        boolean z3 = this.write;
        readBlockToCache readblocktocache = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z4 = this.RatingCompat;
        List<String> list2 = this.MediaBrowserCompatItemReceiver;
        List<setSingleLine> list3 = this.RemoteActionCompatParcelizer;
        setSingleLine setsingleline = this.AudioAttributesCompatParcelizer;
        Integer num = this.AudioAttributesImplApi26Parcelizer;
        Integer num2 = this.MediaDescriptionCompat;
        StringBuilder sb = new StringBuilder("TestPlayUiState(navigationButtonStatus=");
        sb.append(setdouble);
        sb.append(", totalMcqCount=");
        sb.append(i);
        sb.append(", currentPagerPosition=");
        sb.append(i2);
        sb.append(", testTimeRemaining=");
        sb.append(j);
        sb.append(", currentMcqStarred=");
        sb.append(z);
        sb.append(", showIntroTooltip=");
        sb.append(z2);
        sb.append(", mcqIds=");
        sb.append(list);
        sb.append(", testId=");
        sb.append(str);
        sb.append(", testReviewState=");
        sb.append(getendtimestamp);
        sb.append(", isBottomBarExpanded=");
        sb.append(z3);
        sb.append(", parentType=");
        sb.append(readblocktocache);
        sb.append(", showTimer=");
        sb.append(z4);
        sb.append(", masterMcqList=");
        sb.append(list2);
        sb.append(", groups=");
        sb.append(list3);
        sb.append(", currentGroup=");
        sb.append(setsingleline);
        sb.append(", progressCurrentIndex=");
        sb.append(num);
        sb.append(", progressLastIndex=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }
}
