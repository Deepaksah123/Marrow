package kotlin;

import java.time.Instant;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Calendar;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001cJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010(\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010'R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b+\u0010'R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010)R\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b-\u0010'R\u001a\u0010*\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b.\u0010%R\u0014\u00102\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u001a\u0010+\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001cR\u001a\u00101\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\b,\u0010%R\u001a\u00103\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b2\u0010%R\u001a\u00109\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u00107\u001a\u0004\b1\u00108R\u001a\u0010-\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00107\u001a\u0004\b(\u00108R\u0014\u00106\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u00100R\u0014\u0010:\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u00100R\u001a\u0010 \u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b6\u00108R\u001a\u0010;\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b:\u00108R\u001a\u0010\u001e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b9\u0010%R\u001a\u00105\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b;\u0010\u001cR\u001a\u0010\u001b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b/\u0010%R\u0011\u0010<\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b3\u00108R\u0014\u0010=\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010%R\u0014\u0010>\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010%"}, d2 = {"Lo/getBigEndianInt;", "", "", "p0", "p1", "p2", "p3", "", "p4", "p5", "", "p6", "p7", "p8", "", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIIJJJIIJJIZI)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Z", "MediaDescriptionCompat", "onAddQueueItem", "Ljava/time/YearMonth;", "RatingCompat", "()Ljava/time/YearMonth;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "read", "IconCompatParcelizer", "I", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "Z", "onCustomAction", "MediaBrowserCompatMediaItem", "J", "()J", "AudioAttributesImplApi26Parcelizer", "MediaMetadataCompat", "handleMediaPlayPauseIfPendingOnHandler", "onCommand", "onMediaButtonEvent", "onPlay"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getBigEndianInt {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final long MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean onCustomAction;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final long AudioAttributesImplApi26Parcelizer;
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final long RatingCompat;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final long handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final int onAddQueueItem;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int MediaMetadataCompat;
    private final String write;

    public getBigEndianInt(String str, String str2, String str3, String str4, int i, int i2, boolean z, int i3, int i4, long j, long j2, long j3, int i5, int i6, long j4, long j5, int i7, boolean z2, int i8) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.RemoteActionCompatParcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.MediaBrowserCompatItemReceiver = z;
        this.AudioAttributesImplBaseParcelizer = i3;
        this.AudioAttributesImplApi21Parcelizer = i4;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.MediaBrowserCompatSearchResultReceiver = j2;
        this.MediaBrowserCompatMediaItem = j3;
        this.MediaDescriptionCompat = i5;
        this.MediaMetadataCompat = i6;
        this.RatingCompat = j4;
        this.handleMediaPlayPauseIfPendingOnHandler = j5;
        this.onAddQueueItem = i7;
        this.onCustomAction = z2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i8;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final long getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final long getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final long getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final boolean getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final long AudioAttributesImplApi21Parcelizer() {
        Long lValueOf = Long.valueOf(this.MediaBrowserCompatMediaItem);
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        return lValueOf != null ? lValueOf.longValue() : this.RatingCompat + (((long) this.RemoteActionCompatParcelizer) * 1000);
    }

    private final int onCommand() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.AudioAttributesImplApi26Parcelizer);
        return calendar.get(2);
    }

    private final int onPlay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.AudioAttributesImplApi26Parcelizer);
        return calendar.get(1);
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return onPlay() > Calendar.getInstance().get(1);
    }

    public final boolean MediaDescriptionCompat() {
        return onPlay() >= Calendar.getInstance().get(1) && onCommand() > Calendar.getInstance().get(2);
    }

    public final boolean onAddQueueItem() {
        return onPlay() <= Calendar.getInstance().get(1) && onCommand() < Calendar.getInstance().get(2);
    }

    public final YearMonth RatingCompat() {
        YearMonth yearMonthFrom = YearMonth.from(Instant.ofEpochMilli(this.AudioAttributesImplApi26Parcelizer).atZone(ZoneId.systemDefault()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(yearMonthFrom, "");
        return yearMonthFrom;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getBigEndianInt)) {
            return false;
        }
        getBigEndianInt getbigendianint = (getBigEndianInt) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getbigendianint.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getbigendianint.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getbigendianint.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getbigendianint.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == getbigendianint.RemoteActionCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == getbigendianint.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatItemReceiver == getbigendianint.MediaBrowserCompatItemReceiver && this.AudioAttributesImplBaseParcelizer == getbigendianint.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi21Parcelizer == getbigendianint.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == getbigendianint.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatSearchResultReceiver == getbigendianint.MediaBrowserCompatSearchResultReceiver && this.MediaBrowserCompatMediaItem == getbigendianint.MediaBrowserCompatMediaItem && this.MediaDescriptionCompat == getbigendianint.MediaDescriptionCompat && this.MediaMetadataCompat == getbigendianint.MediaMetadataCompat && this.RatingCompat == getbigendianint.RatingCompat && this.handleMediaPlayPauseIfPendingOnHandler == getbigendianint.handleMediaPlayPauseIfPendingOnHandler && this.onAddQueueItem == getbigendianint.onAddQueueItem && this.onCustomAction == getbigendianint.onCustomAction && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == getbigendianint.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Long.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Long.hashCode(this.MediaBrowserCompatSearchResultReceiver)) * 31) + Long.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + Integer.hashCode(this.MediaDescriptionCompat)) * 31) + Integer.hashCode(this.MediaMetadataCompat)) * 31) + Long.hashCode(this.RatingCompat)) * 31) + Long.hashCode(this.handleMediaPlayPauseIfPendingOnHandler)) * 31) + Integer.hashCode(this.onAddQueueItem)) * 31) + Boolean.hashCode(this.onCustomAction)) * 31) + Integer.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.read;
        String str4 = this.IconCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z = this.MediaBrowserCompatItemReceiver;
        int i3 = this.AudioAttributesImplBaseParcelizer;
        int i4 = this.AudioAttributesImplApi21Parcelizer;
        long j = this.AudioAttributesImplApi26Parcelizer;
        long j2 = this.MediaBrowserCompatSearchResultReceiver;
        long j3 = this.MediaBrowserCompatMediaItem;
        int i5 = this.MediaDescriptionCompat;
        int i6 = this.MediaMetadataCompat;
        long j4 = this.RatingCompat;
        long j5 = this.handleMediaPlayPauseIfPendingOnHandler;
        int i7 = this.onAddQueueItem;
        boolean z2 = this.onCustomAction;
        int i8 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        StringBuilder sb = new StringBuilder("getBigEndianInt(write=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str2);
        sb.append(", read=");
        sb.append(str3);
        sb.append(", IconCompatParcelizer=");
        sb.append(str4);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(i2);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(z);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(i3);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(i4);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(j);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(j2);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(j3);
        sb.append(", MediaDescriptionCompat=");
        sb.append(i5);
        sb.append(", MediaMetadataCompat=");
        sb.append(i6);
        sb.append(", RatingCompat=");
        sb.append(j4);
        sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
        sb.append(j5);
        sb.append(", onAddQueueItem=");
        sb.append(i7);
        sb.append(", onCustomAction=");
        sb.append(z2);
        sb.append(", MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver=");
        sb.append(i8);
        sb.append(")");
        return sb.toString();
    }
}
