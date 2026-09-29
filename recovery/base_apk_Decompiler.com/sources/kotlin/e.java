package kotlin;

import android.net.NetworkRequest;
import android.net.Uri;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 (2\u00020\u0001:\u00031.(B1\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB_\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0018J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010(\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0013\u0010,\u001a\u0004\u0018\u00010)8G¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\u00020\u00138\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u00100R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u001a\u0010\u0017\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b,\u00103\u001a\u0004\b,\u00104R\u001a\u0010\u001c\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b(\u00104R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b1\u00106"}, d2 = {"Lo/e;", "", "Lo/ia;", "p0", "", "p1", "p2", "p3", "<init>", "(Lo/ia;ZZZ)V", "p4", "(Lo/ia;ZZZB)V", "", "p5", "p6", "", "Lo/e$read;", "p7", "(Lo/ia;ZZZZJJLjava/util/Set;)V", "Lo/buildTextRenderers;", "p8", "(Lo/buildTextRenderers;Lo/ia;ZZZZJJLjava/util/Set;)V", "(Lo/e;)V", "MediaBrowserCompatItemReceiver", "()Z", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaDescriptionCompat", "MediaBrowserCompatCustomActionResultReceiver", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "Lo/ia;", "()Lo/ia;", "AudioAttributesCompatParcelizer", "Landroid/net/NetworkRequest;", "RemoteActionCompatParcelizer", "()Landroid/net/NetworkRequest;", "IconCompatParcelizer", "Lo/buildTextRenderers;", "read", "()Lo/buildTextRenderers;", "Z", "write", "RatingCompat", "J", "()J", "Ljava/util/Set;", "()Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final e write = new e(null, false, false, false, 15, null);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final ia AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final buildTextRenderers read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Set<read> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final ia getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final NetworkRequest RemoteActionCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final buildTextRenderers getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final Set<read> write() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public /* synthetic */ e(ia iaVar, boolean z, boolean z2, boolean z3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? ia.RemoteActionCompatParcelizer : iaVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private e(ia iaVar, boolean z, boolean z2, boolean z3) {
        this(iaVar, z, z2, z3, (byte) 0);
        toMagicModuleMetaRepoModel.write(iaVar, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private e(ia iaVar, boolean z, boolean z2, boolean z3, byte b) {
        this(iaVar, z, false, z2, z3, -1L, 0L, null, PsExtractor.AUDIO_STREAM, null);
        toMagicModuleMetaRepoModel.write(iaVar, "");
    }

    public /* synthetic */ e(ia iaVar, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? ia.RemoteActionCompatParcelizer : iaVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? -1L : j, (i & 64) == 0 ? j2 : -1L, (i & 128) != 0 ? getKycMessage.read() : set);
    }

    private e(ia iaVar, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set<read> set) {
        toMagicModuleMetaRepoModel.write(iaVar, "");
        toMagicModuleMetaRepoModel.write(set, "");
        this.read = new buildTextRenderers(null, 1, null);
        this.AudioAttributesCompatParcelizer = iaVar;
        this.write = z;
        this.RemoteActionCompatParcelizer = z2;
        this.AudioAttributesImplApi21Parcelizer = z3;
        this.AudioAttributesImplApi26Parcelizer = z4;
        this.MediaBrowserCompatItemReceiver = j;
        this.MediaBrowserCompatCustomActionResultReceiver = j2;
        this.AudioAttributesImplBaseParcelizer = set;
    }

    public e(buildTextRenderers buildtextrenderers, ia iaVar, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set<read> set) {
        toMagicModuleMetaRepoModel.write(buildtextrenderers, "");
        toMagicModuleMetaRepoModel.write(iaVar, "");
        toMagicModuleMetaRepoModel.write(set, "");
        this.read = buildtextrenderers;
        this.AudioAttributesCompatParcelizer = iaVar;
        this.write = z;
        this.RemoteActionCompatParcelizer = z2;
        this.AudioAttributesImplApi21Parcelizer = z3;
        this.AudioAttributesImplApi26Parcelizer = z4;
        this.MediaBrowserCompatItemReceiver = j;
        this.MediaBrowserCompatCustomActionResultReceiver = j2;
        this.AudioAttributesImplBaseParcelizer = set;
    }

    public e(e eVar) {
        toMagicModuleMetaRepoModel.write(eVar, "");
        this.write = eVar.write;
        this.RemoteActionCompatParcelizer = eVar.RemoteActionCompatParcelizer;
        this.read = eVar.read;
        this.AudioAttributesCompatParcelizer = eVar.AudioAttributesCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = eVar.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplApi26Parcelizer = eVar.AudioAttributesImplApi26Parcelizer;
        this.AudioAttributesImplBaseParcelizer = eVar.AudioAttributesImplBaseParcelizer;
        this.MediaBrowserCompatItemReceiver = eVar.MediaBrowserCompatItemReceiver;
        this.MediaBrowserCompatCustomActionResultReceiver = eVar.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return !this.AudioAttributesImplBaseParcelizer.isEmpty();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), p0.getClass())) {
            return false;
        }
        e eVar = (e) p0;
        if (this.write == eVar.write && this.RemoteActionCompatParcelizer == eVar.RemoteActionCompatParcelizer && this.AudioAttributesImplApi21Parcelizer == eVar.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == eVar.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatItemReceiver == eVar.MediaBrowserCompatItemReceiver && this.MediaBrowserCompatCustomActionResultReceiver == eVar.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), eVar.RemoteActionCompatParcelizer()) && this.AudioAttributesCompatParcelizer == eVar.AudioAttributesCompatParcelizer) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, eVar.AudioAttributesImplBaseParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        boolean z = this.write;
        boolean z2 = this.RemoteActionCompatParcelizer;
        boolean z3 = this.AudioAttributesImplApi21Parcelizer;
        boolean z4 = this.AudioAttributesImplApi26Parcelizer;
        long j = this.MediaBrowserCompatItemReceiver;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int iHashCode2 = this.AudioAttributesImplBaseParcelizer.hashCode();
        NetworkRequest networkRequestRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        return (((((((((((((((iHashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + i) * 31) + i2) * 31) + iHashCode2) * 31) + (networkRequestRemoteActionCompatParcelizer != null ? networkRequestRemoteActionCompatParcelizer.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Constraints{requiredNetworkType=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", requiresCharging=");
        sb.append(this.write);
        sb.append(", requiresDeviceIdle=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", requiresBatteryNotLow=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", requiresStorageNotLow=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", contentTriggerUpdateDelayMillis=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", contentTriggerMaxDelayMillis=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", contentUriTriggers=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", }");
        return sb.toString();
    }

    public static final class write {
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private boolean read;
        private boolean write;
        private buildTextRenderers IconCompatParcelizer = new buildTextRenderers(null, 1, null);
        private ia AudioAttributesCompatParcelizer = ia.RemoteActionCompatParcelizer;
        private long AudioAttributesImplApi21Parcelizer = -1;
        private long AudioAttributesImplApi26Parcelizer = -1;
        private Set<read> RemoteActionCompatParcelizer = new LinkedHashSet();

        public final write RemoteActionCompatParcelizer(boolean z) {
            this.write = z;
            return this;
        }

        public final write IconCompatParcelizer(ia iaVar) {
            toMagicModuleMetaRepoModel.write(iaVar, "");
            this.AudioAttributesCompatParcelizer = iaVar;
            this.IconCompatParcelizer = new buildTextRenderers(null, 1, null);
            return this;
        }

        public final write RemoteActionCompatParcelizer() {
            this.read = true;
            return this;
        }

        public final e AudioAttributesCompatParcelizer() {
            Set setOnPlayFromUri = IntermediateLoginResponseBody.onPlayFromUri(this.RemoteActionCompatParcelizer);
            return new e(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, false, this.read, false, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer, setOnPlayFromUri);
        }
    }

    public static final class read {
        private final Uri RemoteActionCompatParcelizer;
        private final boolean write;

        public read(Uri uri, boolean z) {
            toMagicModuleMetaRepoModel.write(uri, "");
            this.RemoteActionCompatParcelizer = uri;
            this.write = z;
        }

        public final Uri IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            toMagicModuleMetaRepoModel.read(obj, "");
            read readVar = (read) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, readVar.RemoteActionCompatParcelizer) && this.write == readVar.write;
        }

        public final int hashCode() {
            return (this.RemoteActionCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.write);
        }
    }
}
