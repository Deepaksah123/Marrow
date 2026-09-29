package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\"R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010\"R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b*\u0010\"R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b+\u0010\"R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b,\u0010\"R\u001a\u0010,\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010 R\u001a\u0010#\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b)\u0010 R\u001a\u00103\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b-\u00102R\u001a\u00104\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b&\u00102R\u001a\u00107\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010 R\u001a\u00109\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010:\u001a\u0004\b#\u0010;R\u001c\u0010'\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b7\u0010=R\u001a\u0010*\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u0010 R\u001a\u00106\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b3\u0010 R\u001a\u0010.\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010>\u001a\u0004\b5\u0010?R\u001a\u00105\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010>\u001a\u0004\b@\u0010?R\u001a\u00108\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010>\u001a\u0004\b'\u0010?"}, d2 = {"Lo/getIcon;", "", "", "p0", "p1", "p2", "p3", "p4", "", "p5", "p6", "", "p7", "p8", "p9", "p10", "", "Lo/PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException;", "p11", "Lo/PublicKeyCredentialRpEntity;", "p12", "p13", "p14", "", "p15", "p16", "p17", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJIILjava/util/List;Lo/PublicKeyCredentialRpEntity;IIZZZ)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "write", "MediaBrowserCompatMediaItem", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesCompatParcelizer", "RatingCompat", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "read", "onCommand", "I", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "J", "()J", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "handleMediaPlayPauseIfPendingOnHandler", "MediaDescriptionCompat", "MediaBrowserCompatItemReceiver", "onCustomAction", "MediaMetadataCompat", "Ljava/util/List;", "()Ljava/util/List;", "Lo/PublicKeyCredentialRpEntity;", "()Lo/PublicKeyCredentialRpEntity;", "Z", "()Z", "onAddQueueItem"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getIcon {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int RatingCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final PublicKeyCredentialRpEntity MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final List<PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final boolean onCustomAction;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean onCommand;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final int MediaMetadataCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    public getIcon(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, long j2, int i3, int i4, List<PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException> list, PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, int i5, int i6, boolean z, boolean z2, boolean z3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.read = str5;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.AudioAttributesImplApi26Parcelizer = i2;
        this.AudioAttributesImplBaseParcelizer = j;
        this.AudioAttributesImplApi21Parcelizer = j2;
        this.MediaBrowserCompatItemReceiver = i3;
        this.MediaMetadataCompat = i4;
        this.MediaBrowserCompatSearchResultReceiver = list;
        this.MediaBrowserCompatMediaItem = publicKeyCredentialRpEntity;
        this.RatingCompat = i5;
        this.MediaDescriptionCompat = i6;
        this.onCommand = z;
        this.handleMediaPlayPauseIfPendingOnHandler = z2;
        this.onCustomAction = z3;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final List<PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException> AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final PublicKeyCredentialRpEntity getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final boolean getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final boolean getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final boolean getOnCustomAction() {
        return this.onCustomAction;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getIcon)) {
            return false;
        }
        getIcon geticon = (getIcon) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) geticon.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) geticon.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) geticon.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) geticon.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) geticon.read) && this.MediaBrowserCompatCustomActionResultReceiver == geticon.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi26Parcelizer == geticon.AudioAttributesImplApi26Parcelizer && this.AudioAttributesImplBaseParcelizer == geticon.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi21Parcelizer == geticon.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatItemReceiver == geticon.MediaBrowserCompatItemReceiver && this.MediaMetadataCompat == geticon.MediaMetadataCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, geticon.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, geticon.MediaBrowserCompatMediaItem) && this.RatingCompat == geticon.RatingCompat && this.MediaDescriptionCompat == geticon.MediaDescriptionCompat && this.onCommand == geticon.onCommand && this.handleMediaPlayPauseIfPendingOnHandler == geticon.handleMediaPlayPauseIfPendingOnHandler && this.onCustomAction == geticon.onCustomAction;
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        int iHashCode4 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode5 = this.read.hashCode();
        int iHashCode6 = Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode7 = Integer.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iHashCode8 = Long.hashCode(this.AudioAttributesImplBaseParcelizer);
        int iHashCode9 = Long.hashCode(this.AudioAttributesImplApi21Parcelizer);
        int iHashCode10 = Integer.hashCode(this.MediaBrowserCompatItemReceiver);
        int iHashCode11 = Integer.hashCode(this.MediaMetadataCompat);
        int iHashCode12 = this.MediaBrowserCompatSearchResultReceiver.hashCode();
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.MediaBrowserCompatMediaItem;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (publicKeyCredentialRpEntity == null ? 0 : publicKeyCredentialRpEntity.hashCode())) * 31) + Integer.hashCode(this.RatingCompat)) * 31) + Integer.hashCode(this.MediaDescriptionCompat)) * 31) + Boolean.hashCode(this.onCommand)) * 31) + Boolean.hashCode(this.handleMediaPlayPauseIfPendingOnHandler)) * 31) + Boolean.hashCode(this.onCustomAction);
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.IconCompatParcelizer;
        String str4 = this.RemoteActionCompatParcelizer;
        String str5 = this.read;
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        int i2 = this.AudioAttributesImplApi26Parcelizer;
        long j = this.AudioAttributesImplBaseParcelizer;
        long j2 = this.AudioAttributesImplApi21Parcelizer;
        int i3 = this.MediaBrowserCompatItemReceiver;
        int i4 = this.MediaMetadataCompat;
        List<PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException> list = this.MediaBrowserCompatSearchResultReceiver;
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.MediaBrowserCompatMediaItem;
        int i5 = this.RatingCompat;
        int i6 = this.MediaDescriptionCompat;
        boolean z = this.onCommand;
        boolean z2 = this.handleMediaPlayPauseIfPendingOnHandler;
        boolean z3 = this.onCustomAction;
        StringBuilder sb = new StringBuilder("getIcon(write=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str2);
        sb.append(", IconCompatParcelizer=");
        sb.append(str3);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str4);
        sb.append(", read=");
        sb.append(str5);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(i);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(i2);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(j);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(j2);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(i3);
        sb.append(", MediaMetadataCompat=");
        sb.append(i4);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(list);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(publicKeyCredentialRpEntity);
        sb.append(", RatingCompat=");
        sb.append(i5);
        sb.append(", MediaDescriptionCompat=");
        sb.append(i6);
        sb.append(", onCommand=");
        sb.append(z);
        sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
        sb.append(z2);
        sb.append(", onCustomAction=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
