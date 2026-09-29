package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0016HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jä\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u00162\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u000bHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001b¨\u0006J"}, d2 = {"Lcom/marrow2/ui/notespurchase/billingdetails/NotesPurchaseBillingUiState;", "", "email", "", "phone", "alternatePhone", "completeAddress", "planId", "planGroupId", "planTitle", "planSubscriptionPeriod", "", "payableAmount", "", "planBasePrice", "basePriceText", "discountAmountText", "shippingChargesText", "cgstText", "sgstText", "igstText", "showIgst", "", "total", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPhone", "getAlternatePhone", "getCompleteAddress", "getPlanId", "getPlanGroupId", "getPlanTitle", "getPlanSubscriptionPeriod", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPayableAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPlanBasePrice", "getBasePriceText", "getDiscountAmountText", "getShippingChargesText", "getCgstText", "getSgstText", "getIgstText", "getShowIgst", "()Z", "getTotal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/marrow2/ui/notespurchase/billingdetails/NotesPurchaseBillingUiState;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class toTask {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final Double MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final Integer MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final boolean handleMediaPlayPauseIfPendingOnHandler;
    private final String onAddQueueItem;
    private final String onCommand;
    private final String read;
    private final String write;

    private toTask(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Double d, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, String str15) {
        this.AudioAttributesImplApi26Parcelizer = str;
        this.AudioAttributesImplBaseParcelizer = str2;
        this.read = str3;
        this.AudioAttributesCompatParcelizer = str4;
        this.RatingCompat = str5;
        this.MediaBrowserCompatSearchResultReceiver = str6;
        this.MediaDescriptionCompat = str7;
        this.MediaBrowserCompatMediaItem = num;
        this.MediaBrowserCompatCustomActionResultReceiver = d;
        this.MediaBrowserCompatItemReceiver = str8;
        this.IconCompatParcelizer = str9;
        this.write = str10;
        this.onCommand = str11;
        this.RemoteActionCompatParcelizer = str12;
        this.MediaMetadataCompat = str13;
        this.AudioAttributesImplApi21Parcelizer = str14;
        this.handleMediaPlayPauseIfPendingOnHandler = z;
        this.onAddQueueItem = str15;
    }

    public /* synthetic */ toTask(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Double d, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : d, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z, (i & 131072) != 0 ? null : str15);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final String getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final String getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final Integer getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final Double getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final String getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final String getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final boolean getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final String getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    public toTask() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static toTask write(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Double d, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, String str15) {
        return new toTask(str, str2, str3, str4, str5, str6, str7, num, d, str8, str9, str10, str11, str12, str13, str14, z, str15);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof toTask)) {
            return false;
        }
        toTask totask = (toTask) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) totask.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) totask.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) totask.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) totask.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) totask.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) totask.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) totask.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, totask.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, totask.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) totask.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) totask.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) totask.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCommand, (Object) totask.onCommand) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) totask.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) totask.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) totask.AudioAttributesImplApi21Parcelizer) && this.handleMediaPlayPauseIfPendingOnHandler == totask.handleMediaPlayPauseIfPendingOnHandler && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onAddQueueItem, (Object) totask.onAddQueueItem);
    }

    public final int hashCode() {
        String str = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.AudioAttributesImplBaseParcelizer;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.read;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AudioAttributesCompatParcelizer;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.RatingCompat;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.MediaBrowserCompatSearchResultReceiver;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.MediaDescriptionCompat;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        Integer num = this.MediaBrowserCompatMediaItem;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Double d = this.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode9 = d == null ? 0 : d.hashCode();
        String str8 = this.MediaBrowserCompatItemReceiver;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.IconCompatParcelizer;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.write;
        int iHashCode12 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.onCommand;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.RemoteActionCompatParcelizer;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.MediaMetadataCompat;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode16 = str14 == null ? 0 : str14.hashCode();
        int iHashCode17 = Boolean.hashCode(this.handleMediaPlayPauseIfPendingOnHandler);
        String str15 = this.onAddQueueItem;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (str15 != null ? str15.hashCode() : 0);
    }

    public final String toString() {
        String str = this.AudioAttributesImplApi26Parcelizer;
        String str2 = this.AudioAttributesImplBaseParcelizer;
        String str3 = this.read;
        String str4 = this.AudioAttributesCompatParcelizer;
        String str5 = this.RatingCompat;
        String str6 = this.MediaBrowserCompatSearchResultReceiver;
        String str7 = this.MediaDescriptionCompat;
        Integer num = this.MediaBrowserCompatMediaItem;
        Double d = this.MediaBrowserCompatCustomActionResultReceiver;
        String str8 = this.MediaBrowserCompatItemReceiver;
        String str9 = this.IconCompatParcelizer;
        String str10 = this.write;
        String str11 = this.onCommand;
        String str12 = this.RemoteActionCompatParcelizer;
        String str13 = this.MediaMetadataCompat;
        String str14 = this.AudioAttributesImplApi21Parcelizer;
        boolean z = this.handleMediaPlayPauseIfPendingOnHandler;
        String str15 = this.onAddQueueItem;
        StringBuilder sb = new StringBuilder("NotesPurchaseBillingUiState(email=");
        sb.append(str);
        sb.append(", phone=");
        sb.append(str2);
        sb.append(", alternatePhone=");
        sb.append(str3);
        sb.append(", completeAddress=");
        sb.append(str4);
        sb.append(", planId=");
        sb.append(str5);
        sb.append(", planGroupId=");
        sb.append(str6);
        sb.append(", planTitle=");
        sb.append(str7);
        sb.append(", planSubscriptionPeriod=");
        sb.append(num);
        sb.append(", payableAmount=");
        sb.append(d);
        sb.append(", planBasePrice=");
        sb.append(str8);
        sb.append(", basePriceText=");
        sb.append(str9);
        sb.append(", discountAmountText=");
        sb.append(str10);
        sb.append(", shippingChargesText=");
        sb.append(str11);
        sb.append(", cgstText=");
        sb.append(str12);
        sb.append(", sgstText=");
        sb.append(str13);
        sb.append(", igstText=");
        sb.append(str14);
        sb.append(", showIgst=");
        sb.append(z);
        sb.append(", total=");
        sb.append(str15);
        sb.append(")");
        return sb.toString();
    }
}
