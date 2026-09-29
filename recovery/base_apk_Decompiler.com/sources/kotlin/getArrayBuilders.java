package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJu\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJk\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010&\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010\u001d\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b\u001f\u0010'R\u001a\u0010\u001b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u001f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b+\u00101R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010%R\u001a\u0010+\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b3\u0010'R\u001a\u00103\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b*\u0010.R\u001a\u0010*\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u00105\u001a\u0004\b4\u00106R\u001a\u0010/\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b/\u0010'R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158G¢\u0006\u0006\u001a\u0004\b\u001d\u00108R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u00109R\u001c\u0010)\u001a\u00020\u00068\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b$\u0010'R\u0011\u00107\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0016\u0010(\u001a\u00020\b8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0016\u0010:\u001a\u00020\b8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u0018\u0010<\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b&\u0010;"}, d2 = {"Lo/getArrayBuilders;", "", "Lo/findClass;", "p0", "", "p1", "Lo/getReferencedType;", "p2", "", "p3", "", "p4", "p5", "p6", "p7", "p8", "Lo/handleWeirdNumberValue;", "p9", "p10", "<init>", "(JJJZFJJZZIJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "Lo/findTypeDeserializer;", "p11", "p12", "(JJJZFJJZZILjava/util/List;JJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "RemoteActionCompatParcelizer", "()V", "read", "(JJJZJJZILjava/util/List;J)Lo/getArrayBuilders;", "AudioAttributesCompatParcelizer", "(JJJZFJJZILjava/util/List;J)Lo/getArrayBuilders;", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "J", "write", "()J", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "Z", "MediaBrowserCompatCustomActionResultReceiver", "()Z", "AudioAttributesImplApi21Parcelizer", "F", "()F", "MediaDescriptionCompat", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatMediaItem", "I", "()I", "RatingCompat", "()Ljava/util/List;", "Ljava/util/List;", "onCommand", "Lo/getArrayBuilders;", "handleMediaPlayPauseIfPendingOnHandler"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getArrayBuilders {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public boolean onCommand;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final long AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private long MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final long read;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final long MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final long AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public boolean MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private List<findTypeDeserializer> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public getArrayBuilders handleMediaPlayPauseIfPendingOnHandler;

    private getArrayBuilders(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.IconCompatParcelizer = j;
        this.write = j2;
        this.read = j3;
        this.RemoteActionCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = f;
        this.MediaBrowserCompatCustomActionResultReceiver = j4;
        this.AudioAttributesImplBaseParcelizer = j5;
        this.AudioAttributesImplApi26Parcelizer = z2;
        this.MediaBrowserCompatItemReceiver = i;
        this.AudioAttributesImplApi21Parcelizer = j6;
        this.MediaMetadataCompat = getReferencedType.INSTANCE.write();
        this.MediaBrowserCompatSearchResultReceiver = z3;
        this.onCommand = z3;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final long getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public /* synthetic */ getArrayBuilders(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & 512) != 0 ? handleWeirdNumberValue.INSTANCE.AudioAttributesCompatParcelizer() : i, (i2 & 1024) != 0 ? getReferencedType.INSTANCE.write() : j6, null);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final long getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private getArrayBuilders(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List<findTypeDeserializer> list, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, null);
        this.MediaBrowserCompatMediaItem = list;
        this.MediaMetadataCompat = j7;
    }

    public final List<findTypeDeserializer> read() {
        List<findTypeDeserializer> list = this.MediaBrowserCompatMediaItem;
        return list == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final boolean MediaDescriptionCompat() {
        getArrayBuilders getarraybuilders = this.handleMediaPlayPauseIfPendingOnHandler;
        return getarraybuilders != null ? getarraybuilders.MediaDescriptionCompat() : this.MediaBrowserCompatSearchResultReceiver || this.onCommand;
    }

    public final void RemoteActionCompatParcelizer() {
        getArrayBuilders getarraybuilders = this.handleMediaPlayPauseIfPendingOnHandler;
        if (getarraybuilders == null) {
            this.MediaBrowserCompatSearchResultReceiver = true;
            this.onCommand = true;
        } else if (getarraybuilders != null) {
            getarraybuilders.RemoteActionCompatParcelizer();
        }
    }

    public final getArrayBuilders read(long p0, long p1, long p2, boolean p3, long p4, long p5, boolean p6, int p7, List<findTypeDeserializer> p8, long p9) {
        getArrayBuilders getarraybuildersAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, p1, p2, p3, this.AudioAttributesCompatParcelizer, p4, p5, p6, p7, p8, p9);
        getArrayBuilders getarraybuilders = this;
        getArrayBuilders getarraybuilders2 = getarraybuilders.handleMediaPlayPauseIfPendingOnHandler;
        if (getarraybuilders2 != null) {
            getarraybuilders = getarraybuilders2;
        }
        getarraybuildersAudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler = getarraybuilders;
        return getarraybuildersAudioAttributesCompatParcelizer;
    }

    public final getArrayBuilders AudioAttributesCompatParcelizer(long p0, long p1, long p2, boolean p3, float p4, long p5, long p6, boolean p7, int p8, List<findTypeDeserializer> p9, long p10) {
        getArrayBuilders getarraybuilders = this;
        getArrayBuilders getarraybuilders2 = new getArrayBuilders(p0, p1, p2, p3, p4, p5, p6, p7, false, p8, p9, p10, getarraybuilders.MediaMetadataCompat, null);
        getArrayBuilders getarraybuilders3 = getarraybuilders.handleMediaPlayPauseIfPendingOnHandler;
        if (getarraybuilders3 != null) {
            getarraybuilders = getarraybuilders3;
        }
        getarraybuilders2.handleMediaPlayPauseIfPendingOnHandler = getarraybuilders;
        return getarraybuilders2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) findClass.IconCompatParcelizer(this.IconCompatParcelizer));
        sb.append(", uptimeMillis=");
        sb.append(this.write);
        sb.append(", position=");
        sb.append((Object) getReferencedType.AudioAttributesImplBaseParcelizer(this.read));
        sb.append(", pressed=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", pressure=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", previousUptimeMillis=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", previousPosition=");
        sb.append((Object) getReferencedType.AudioAttributesImplBaseParcelizer(this.AudioAttributesImplBaseParcelizer));
        sb.append(", previousPressed=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", isConsumed=");
        sb.append(MediaDescriptionCompat());
        sb.append(", type=");
        sb.append((Object) handleWeirdNumberValue.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver));
        sb.append(", historical=");
        sb.append(read());
        sb.append(",scrollDelta=");
        sb.append((Object) getReferencedType.AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi21Parcelizer));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ getArrayBuilders(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    public /* synthetic */ getArrayBuilders(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, long j7, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, (List<findTypeDeserializer>) list, j6, j7);
    }
}
