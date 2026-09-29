package kotlin;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda32;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028G@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\r\u0010\u0011R$\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00128\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\r\u0010\u0019\"\u0004\b\u0017\u0010\u001aR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0016\u0010\u0011R\u0011\u0010\r\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR$\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u0014\u0010!"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda35;", "", "", "p0", "p1", "Ljava/util/UUID;", "p2", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;)V", "", "AudioAttributesImplApi21Parcelizer", "()V", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "Ljava/lang/Long;", "RemoteActionCompatParcelizer", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "", "I", "IconCompatParcelizer", "()I", "read", "write", "Ljava/util/UUID;", "()Ljava/util/UUID;", "(Ljava/util/UUID;)V", "()J", "MediaBrowserCompatItemReceiver", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda32;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda32;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda32;", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda32;)V", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda35 {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private DefaultAnalyticsCollectorExternalSyntheticLambda32 AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Long MediaBrowserCompatItemReceiver;
    private Long IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int read;
    private UUID write;

    private DefaultAnalyticsCollectorExternalSyntheticLambda35(Long l, Long l2, UUID uuid) {
        toMagicModuleMetaRepoModel.write(uuid, "");
        this.MediaBrowserCompatItemReceiver = l;
        this.IconCompatParcelizer = l2;
        this.write = uuid;
    }

    public final void read(Long l) {
        this.IconCompatParcelizer = l;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DefaultAnalyticsCollectorExternalSyntheticLambda35(Long l, Long l2, UUID uuid, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i & 4) != 0) {
            uuid = UUID.randomUUID();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uuid, "");
        }
        this(l, l2, uuid);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final UUID getWrite() {
        return this.write;
    }

    public final void write(UUID uuid) {
        toMagicModuleMetaRepoModel.write(uuid, "");
        this.write = uuid;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public final void AudioAttributesCompatParcelizer(Long l) {
        this.RemoteActionCompatParcelizer = l;
    }

    public final Long RemoteActionCompatParcelizer() {
        Long l = this.RemoteActionCompatParcelizer;
        return Long.valueOf(l != null ? l.longValue() : 0L);
    }

    public final void IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda32 defaultAnalyticsCollectorExternalSyntheticLambda32) {
        this.AudioAttributesImplApi26Parcelizer = defaultAnalyticsCollectorExternalSyntheticLambda32;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final DefaultAnalyticsCollectorExternalSyntheticLambda32 getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.read++;
    }

    public final long read() {
        Long l;
        if (this.MediaBrowserCompatItemReceiver == null || (l = this.IconCompatParcelizer) == null) {
            return 0L;
        }
        if (l != null) {
            return l.longValue() - this.MediaBrowserCompatItemReceiver.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void AudioAttributesImplBaseParcelizer() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()).edit();
        Long l = this.MediaBrowserCompatItemReceiver;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l != null ? l.longValue() : 0L);
        Long l2 = this.IconCompatParcelizer;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.read);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.write.toString());
        editorEdit.apply();
        DefaultAnalyticsCollectorExternalSyntheticLambda32 defaultAnalyticsCollectorExternalSyntheticLambda32 = this.AudioAttributesImplApi26Parcelizer;
        if (defaultAnalyticsCollectorExternalSyntheticLambda32 == null || defaultAnalyticsCollectorExternalSyntheticLambda32 == null) {
            return;
        }
        defaultAnalyticsCollectorExternalSyntheticLambda32.write();
    }

    /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda35$read, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda35$read;", "", "<init>", "()V", "", "write", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda35;", "read", "()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda35;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public static DefaultAnalyticsCollectorExternalSyntheticLambda35 read() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda35 defaultAnalyticsCollectorExternalSyntheticLambda35 = new DefaultAnalyticsCollectorExternalSyntheticLambda35(Long.valueOf(j), Long.valueOf(j2), null, 4, null);
            defaultAnalyticsCollectorExternalSyntheticLambda35.read = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            DefaultAnalyticsCollectorExternalSyntheticLambda32.Companion companion = DefaultAnalyticsCollectorExternalSyntheticLambda32.INSTANCE;
            defaultAnalyticsCollectorExternalSyntheticLambda35.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda32.Companion.write());
            defaultAnalyticsCollectorExternalSyntheticLambda35.AudioAttributesCompatParcelizer(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uuidFromString, "");
            defaultAnalyticsCollectorExternalSyntheticLambda35.write(uuidFromString);
            return defaultAnalyticsCollectorExternalSyntheticLambda35;
        }

        @getMagicModuleMeta
        public static void write() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            DefaultAnalyticsCollectorExternalSyntheticLambda32.Companion companion = DefaultAnalyticsCollectorExternalSyntheticLambda32.INSTANCE;
            DefaultAnalyticsCollectorExternalSyntheticLambda32.Companion.read();
        }
    }
}
