package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001d\"\u0004\b\"\u0010#R\"\u0010'\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\"\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b+\u0010\u001d\"\u0004\b)\u0010#R\"\u0010)\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010!\u001a\u0004\b$\u0010\u001d\"\u0004\b'\u0010#R\"\u0010+\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u001d\"\u0004\b%\u0010#R\"\u0010/\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010!\u001a\u0004\b%\u0010\u001d\"\u0004\b+\u0010#R\"\u00101\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010!\u001a\u0004\b,\u0010\u001d\"\u0004\b,\u0010#R\"\u0010,\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u00102\u001a\u0004\b3\u00104\"\u0004\b$\u00105R\"\u0010 \u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b6\u00104\"\u0004\b1\u00105R\"\u0010%\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00102\u001a\u0004\b7\u00104\"\u0004\b'\u00105R\"\u0010.\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u00102\u001a\u0004\b8\u00104\"\u0004\b+\u00105R\"\u00103\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u00102\u001a\u0004\b9\u00104\"\u0004\b\"\u00105R\"\u00108\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b \u0010<\"\u0004\b+\u0010=R\"\u0010:\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010;\u001a\u0004\b1\u0010<\"\u0004\b'\u0010=R\"\u00109\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010!\u001a\u0004\b/\u0010\u001d\"\u0004\b$\u0010#R\"\u00107\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010>\u001a\u0004\b)\u0010\u001f\"\u0004\b)\u0010?R\"\u0010-\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u00102\u001a\u0004\b:\u00104\"\u0004\b)\u00105"}, d2 = {"Lo/ProviderInstallerProviderInstallListener;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "p8", "p9", "p10", "p11", "", "p12", "p13", "p14", "", "p15", "p16", "<init>", "(IJIIIIIZZZZZDDILjava/lang/String;Z)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "I", "read", "(I)V", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "J", "AudioAttributesCompatParcelizer", "()J", "IconCompatParcelizer", "(J)V", "write", "AudioAttributesImplApi21Parcelizer", "onCustomAction", "RatingCompat", "AudioAttributesImplBaseParcelizer", "handleMediaPlayPauseIfPendingOnHandler", "AudioAttributesImplApi26Parcelizer", "Z", "MediaDescriptionCompat", "()Z", "(Z)V", "onAddQueueItem", "onCommand", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatMediaItem", "MediaMetadataCompat", "D", "()D", "(D)V", "Ljava/lang/String;", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProviderInstallerProviderInstallListener {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private double MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private String onCommand;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private double MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean RatingCompat;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean MediaDescriptionCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean onCustomAction;

    private ProviderInstallerProviderInstallListener(int i, long j, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, double d, double d2, int i7, String str, boolean z6) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = j;
        this.read = i2;
        this.IconCompatParcelizer = i3;
        this.write = i4;
        this.AudioAttributesImplBaseParcelizer = i5;
        this.AudioAttributesImplApi26Parcelizer = i6;
        this.AudioAttributesImplApi21Parcelizer = z;
        this.MediaBrowserCompatItemReceiver = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = z3;
        this.RatingCompat = z4;
        this.MediaDescriptionCompat = z5;
        this.MediaBrowserCompatSearchResultReceiver = d;
        this.MediaMetadataCompat = d2;
        this.MediaBrowserCompatMediaItem = i7;
        this.onCommand = str;
        this.onCustomAction = z6;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(long j) {
        this.AudioAttributesCompatParcelizer = j;
    }

    public final void IconCompatParcelizer(int i) {
        this.read = i;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.IconCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(int i) {
        this.write = i;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void write(int i) {
        this.AudioAttributesImplBaseParcelizer = i;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void AudioAttributesImplApi21Parcelizer(int i) {
        this.AudioAttributesImplApi26Parcelizer = i;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final boolean getRatingCompat() {
        return this.RatingCompat;
    }

    public final void write(boolean z) {
        this.RatingCompat = z;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final boolean getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public final void read(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final double getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void write(double d) {
        this.MediaBrowserCompatSearchResultReceiver = d;
    }

    public final void AudioAttributesCompatParcelizer(double d) {
        this.MediaMetadataCompat = d;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final double getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ ProviderInstallerProviderInstallListener(int i, long j, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, double d, double d2, int i7, String str, boolean z6, int i8, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0L : j, (i8 & 4) != 0 ? 0 : i2, (i8 & 8) != 0 ? 0 : i3, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? 0 : i6, (i8 & 128) != 0 ? false : z, (i8 & 256) != 0 ? false : z2, (i8 & 512) != 0 ? false : z3, (i8 & 1024) != 0 ? false : z4, (i8 & 2048) != 0 ? false : z5, (i8 & 4096) != 0 ? 0.0d : d, (i8 & 8192) == 0 ? d2 : 0.0d, (i8 & 16384) != 0 ? 0 : i7, (i8 & 32768) != 0 ? "" : str, (i8 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0 ? z6 : false);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getOnCommand() {
        return this.onCommand;
    }

    public final void IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.onCommand = str;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.onCustomAction = z;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final boolean getOnCustomAction() {
        return this.onCustomAction;
    }

    public ProviderInstallerProviderInstallListener() {
        this(0, 0L, 0, 0, 0, 0, 0, false, false, false, false, false, 0.0d, 0.0d, 0, null, false, 131071, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ProviderInstallerProviderInstallListener)) {
            return false;
        }
        ProviderInstallerProviderInstallListener providerInstallerProviderInstallListener = (ProviderInstallerProviderInstallListener) p0;
        return this.RemoteActionCompatParcelizer == providerInstallerProviderInstallListener.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == providerInstallerProviderInstallListener.AudioAttributesCompatParcelizer && this.read == providerInstallerProviderInstallListener.read && this.IconCompatParcelizer == providerInstallerProviderInstallListener.IconCompatParcelizer && this.write == providerInstallerProviderInstallListener.write && this.AudioAttributesImplBaseParcelizer == providerInstallerProviderInstallListener.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi26Parcelizer == providerInstallerProviderInstallListener.AudioAttributesImplApi26Parcelizer && this.AudioAttributesImplApi21Parcelizer == providerInstallerProviderInstallListener.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatItemReceiver == providerInstallerProviderInstallListener.MediaBrowserCompatItemReceiver && this.MediaBrowserCompatCustomActionResultReceiver == providerInstallerProviderInstallListener.MediaBrowserCompatCustomActionResultReceiver && this.RatingCompat == providerInstallerProviderInstallListener.RatingCompat && this.MediaDescriptionCompat == providerInstallerProviderInstallListener.MediaDescriptionCompat && Double.compare(this.MediaBrowserCompatSearchResultReceiver, providerInstallerProviderInstallListener.MediaBrowserCompatSearchResultReceiver) == 0 && Double.compare(this.MediaMetadataCompat, providerInstallerProviderInstallListener.MediaMetadataCompat) == 0 && this.MediaBrowserCompatMediaItem == providerInstallerProviderInstallListener.MediaBrowserCompatMediaItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCommand, (Object) providerInstallerProviderInstallListener.onCommand) && this.onCustomAction == providerInstallerProviderInstallListener.onCustomAction;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((Integer.hashCode(this.RemoteActionCompatParcelizer) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Boolean.hashCode(this.RatingCompat)) * 31) + Boolean.hashCode(this.MediaDescriptionCompat)) * 31) + Double.hashCode(this.MediaBrowserCompatSearchResultReceiver)) * 31) + Double.hashCode(this.MediaMetadataCompat)) * 31) + Integer.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + this.onCommand.hashCode()) * 31) + Boolean.hashCode(this.onCustomAction);
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        long j = this.AudioAttributesCompatParcelizer;
        int i2 = this.read;
        int i3 = this.IconCompatParcelizer;
        int i4 = this.write;
        int i5 = this.AudioAttributesImplBaseParcelizer;
        int i6 = this.AudioAttributesImplApi26Parcelizer;
        boolean z = this.AudioAttributesImplApi21Parcelizer;
        boolean z2 = this.MediaBrowserCompatItemReceiver;
        boolean z3 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z4 = this.RatingCompat;
        boolean z5 = this.MediaDescriptionCompat;
        double d = this.MediaBrowserCompatSearchResultReceiver;
        double d2 = this.MediaMetadataCompat;
        int i7 = this.MediaBrowserCompatMediaItem;
        String str = this.onCommand;
        boolean z6 = this.onCustomAction;
        StringBuilder sb = new StringBuilder("ProviderInstallerProviderInstallListener(RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(j);
        sb.append(", read=");
        sb.append(i2);
        sb.append(", IconCompatParcelizer=");
        sb.append(i3);
        sb.append(", write=");
        sb.append(i4);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(i5);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(i6);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(z);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(z2);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(z3);
        sb.append(", RatingCompat=");
        sb.append(z4);
        sb.append(", MediaDescriptionCompat=");
        sb.append(z5);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(d);
        sb.append(", MediaMetadataCompat=");
        sb.append(d2);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(i7);
        sb.append(", onCommand=");
        sb.append(str);
        sb.append(", onCustomAction=");
        sb.append(z6);
        sb.append(")");
        return sb.toString();
    }
}
