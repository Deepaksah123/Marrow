package kotlin;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda39;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda37;", "", "", "", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "p0", "<init>", "(Ljava/util/Map;)V", "", "p1", "p2", "AudioAttributesCompatParcelizer", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;[Ljava/lang/String;Ljava/lang/String;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "IconCompatParcelizer", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "RemoteActionCompatParcelizer", "write", "read", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatMediaItem", "RatingCompat", "MediaBrowserCompatSearchResultReceiver", "", "MediaDescriptionCompat", "Ljava/util/Map;"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda37 {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda4 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda4 AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda4 write;
    private final DefaultAnalyticsCollectorExternalSyntheticLambda4 IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda4 AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda4 AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda4 MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda4 RatingCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda4> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda4 MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda4 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda4 read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, String> AudioAttributesCompatParcelizer = VideoTimelineResponseBody.AudioAttributesCompatParcelizer(setAction.write("embedding.weight", "embed.weight"), setAction.write("dense1.weight", "fc1.weight"), setAction.write("dense2.weight", "fc2.weight"), setAction.write("dense3.weight", "fc3.weight"), setAction.write("dense1.bias", "fc1.bias"), setAction.write("dense2.bias", "fc2.bias"), setAction.write("dense3.bias", "fc3.bias"));

    private DefaultAnalyticsCollectorExternalSyntheticLambda37(Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda4> map) {
        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4 = map.get("embed.weight");
        if (defaultAnalyticsCollectorExternalSyntheticLambda4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.AudioAttributesImplApi26Parcelizer = defaultAnalyticsCollectorExternalSyntheticLambda4;
        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda42 = map.get("convs.0.weight");
        if (defaultAnalyticsCollectorExternalSyntheticLambda42 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda41.AudioAttributesCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda42);
        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda43 = map.get("convs.1.weight");
        if (defaultAnalyticsCollectorExternalSyntheticLambda43 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.write = DefaultAnalyticsCollectorExternalSyntheticLambda41.AudioAttributesCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda43);
        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda44 = map.get("convs.2.weight");
        if (defaultAnalyticsCollectorExternalSyntheticLambda44 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.AudioAttributesImplApi21Parcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda41.AudioAttributesCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda44);
        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda45 = map.get("convs.0.bias");
        if (defaultAnalyticsCollectorExternalSyntheticLambda45 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.IconCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda45;
        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda46 = map.get("convs.1.bias");
        if (defaultAnalyticsCollectorExternalSyntheticLambda46 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.read = defaultAnalyticsCollectorExternalSyntheticLambda46;
        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda47 = map.get("convs.2.bias");
        if (defaultAnalyticsCollectorExternalSyntheticLambda47 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.RemoteActionCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda47;
        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda48 = map.get("fc1.weight");
        if (defaultAnalyticsCollectorExternalSyntheticLambda48 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.MediaBrowserCompatItemReceiver = DefaultAnalyticsCollectorExternalSyntheticLambda41.read(defaultAnalyticsCollectorExternalSyntheticLambda48);
        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda49 = map.get("fc2.weight");
        if (defaultAnalyticsCollectorExternalSyntheticLambda49 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.RatingCompat = DefaultAnalyticsCollectorExternalSyntheticLambda41.read(defaultAnalyticsCollectorExternalSyntheticLambda49);
        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda410 = map.get("fc1.bias");
        if (defaultAnalyticsCollectorExternalSyntheticLambda410 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.AudioAttributesImplBaseParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda410;
        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda411 = map.get("fc2.bias");
        if (defaultAnalyticsCollectorExternalSyntheticLambda411 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.MediaBrowserCompatCustomActionResultReceiver = defaultAnalyticsCollectorExternalSyntheticLambda411;
        this.MediaBrowserCompatMediaItem = new HashMap();
        for (String str : getKycMessage.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.AudioAttributesCompatParcelizer.MTML_INTEGRITY_DETECT.write(), DefaultAnalyticsCollectorExternalSyntheticLambda39.AudioAttributesCompatParcelizer.MTML_APP_EVENT_PREDICTION.write())) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".weight");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".bias");
            String string2 = sb2.toString();
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda412 = map.get(string);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda413 = map.get(string2);
            if (defaultAnalyticsCollectorExternalSyntheticLambda412 != null) {
                this.MediaBrowserCompatMediaItem.put(string, DefaultAnalyticsCollectorExternalSyntheticLambda41.read(defaultAnalyticsCollectorExternalSyntheticLambda412));
            }
            if (defaultAnalyticsCollectorExternalSyntheticLambda413 != null) {
                this.MediaBrowserCompatMediaItem.put(string2, defaultAnalyticsCollectorExternalSyntheticLambda413);
            }
        }
    }

    public /* synthetic */ DefaultAnalyticsCollectorExternalSyntheticLambda37(Map map, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(map);
    }

    public static final /* synthetic */ Map AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda37.class)) {
            return null;
        }
        try {
            return AudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda37.class);
            return null;
        }
    }

    public final DefaultAnalyticsCollectorExternalSyntheticLambda4 AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0, String[] p1, String p2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4 = DefaultAnalyticsCollectorExternalSyntheticLambda41.read(DefaultAnalyticsCollectorExternalSyntheticLambda41.RemoteActionCompatParcelizer(p1, this.AudioAttributesImplApi26Parcelizer), this.AudioAttributesCompatParcelizer);
            DefaultAnalyticsCollectorExternalSyntheticLambda41.AudioAttributesCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda4, this.IconCompatParcelizer);
            DefaultAnalyticsCollectorExternalSyntheticLambda41.IconCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda4);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda42 = DefaultAnalyticsCollectorExternalSyntheticLambda41.read(defaultAnalyticsCollectorExternalSyntheticLambda4, this.write);
            DefaultAnalyticsCollectorExternalSyntheticLambda41.AudioAttributesCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda42, this.read);
            DefaultAnalyticsCollectorExternalSyntheticLambda41.IconCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda42);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda43 = DefaultAnalyticsCollectorExternalSyntheticLambda41.read(defaultAnalyticsCollectorExternalSyntheticLambda42, 2);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda44 = DefaultAnalyticsCollectorExternalSyntheticLambda41.read(defaultAnalyticsCollectorExternalSyntheticLambda43, this.AudioAttributesImplApi21Parcelizer);
            DefaultAnalyticsCollectorExternalSyntheticLambda41.AudioAttributesCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda44, this.RemoteActionCompatParcelizer);
            DefaultAnalyticsCollectorExternalSyntheticLambda41.IconCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda44);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda45 = DefaultAnalyticsCollectorExternalSyntheticLambda41.read(defaultAnalyticsCollectorExternalSyntheticLambda4, defaultAnalyticsCollectorExternalSyntheticLambda4.AudioAttributesCompatParcelizer(1));
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda46 = DefaultAnalyticsCollectorExternalSyntheticLambda41.read(defaultAnalyticsCollectorExternalSyntheticLambda43, defaultAnalyticsCollectorExternalSyntheticLambda43.AudioAttributesCompatParcelizer(1));
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda47 = DefaultAnalyticsCollectorExternalSyntheticLambda41.read(defaultAnalyticsCollectorExternalSyntheticLambda44, defaultAnalyticsCollectorExternalSyntheticLambda44.AudioAttributesCompatParcelizer(1));
            DefaultAnalyticsCollectorExternalSyntheticLambda41.write(defaultAnalyticsCollectorExternalSyntheticLambda45);
            DefaultAnalyticsCollectorExternalSyntheticLambda41.write(defaultAnalyticsCollectorExternalSyntheticLambda46);
            DefaultAnalyticsCollectorExternalSyntheticLambda41.write(defaultAnalyticsCollectorExternalSyntheticLambda47);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4RemoteActionCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda41.RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.read(new DefaultAnalyticsCollectorExternalSyntheticLambda4[]{defaultAnalyticsCollectorExternalSyntheticLambda45, defaultAnalyticsCollectorExternalSyntheticLambda46, defaultAnalyticsCollectorExternalSyntheticLambda47, p0}), this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer);
            DefaultAnalyticsCollectorExternalSyntheticLambda41.IconCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda4RemoteActionCompatParcelizer);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4RemoteActionCompatParcelizer2 = DefaultAnalyticsCollectorExternalSyntheticLambda41.RemoteActionCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda4RemoteActionCompatParcelizer, this.RatingCompat, this.MediaBrowserCompatCustomActionResultReceiver);
            DefaultAnalyticsCollectorExternalSyntheticLambda41.IconCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda4RemoteActionCompatParcelizer2);
            Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda4> map = this.MediaBrowserCompatMediaItem;
            StringBuilder sb = new StringBuilder();
            sb.append(p2);
            sb.append(".weight");
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda48 = map.get(sb.toString());
            Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda4> map2 = this.MediaBrowserCompatMediaItem;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p2);
            sb2.append(".bias");
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda49 = map2.get(sb2.toString());
            if (defaultAnalyticsCollectorExternalSyntheticLambda48 == null || defaultAnalyticsCollectorExternalSyntheticLambda49 == null) {
                return null;
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4RemoteActionCompatParcelizer3 = DefaultAnalyticsCollectorExternalSyntheticLambda41.RemoteActionCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda4RemoteActionCompatParcelizer2, defaultAnalyticsCollectorExternalSyntheticLambda48, defaultAnalyticsCollectorExternalSyntheticLambda49);
            DefaultAnalyticsCollectorExternalSyntheticLambda41.RemoteActionCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda4RemoteActionCompatParcelizer3);
            return defaultAnalyticsCollectorExternalSyntheticLambda4RemoteActionCompatParcelizer3;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda37$read, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda37$read;", "", "<init>", "()V", "Ljava/io/File;", "p0", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda37;", "read", "(Ljava/io/File;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda37;", "", "", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "RemoteActionCompatParcelizer", "(Ljava/io/File;)Ljava/util/Map;", "AudioAttributesCompatParcelizer", "Ljava/util/Map;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public final DefaultAnalyticsCollectorExternalSyntheticLambda37 read(File p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda4> mapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0);
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            if (mapRemoteActionCompatParcelizer != null) {
                try {
                    return new DefaultAnalyticsCollectorExternalSyntheticLambda37(mapRemoteActionCompatParcelizer, magicModuleRepositoryImplExternalSyntheticLambda0);
                } catch (Exception unused) {
                }
            }
            return null;
        }

        private static Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda4> RemoteActionCompatParcelizer(File p0) {
            Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda4> mapAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda44.AudioAttributesCompatParcelizer(p0);
            if (mapAudioAttributesCompatParcelizer == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapAudioAttributesCompatParcelizer2 = DefaultAnalyticsCollectorExternalSyntheticLambda37.AudioAttributesCompatParcelizer();
            for (Map.Entry<String, DefaultAnalyticsCollectorExternalSyntheticLambda4> entry : mapAudioAttributesCompatParcelizer.entrySet()) {
                String key = entry.getKey();
                if (mapAudioAttributesCompatParcelizer2.containsKey(entry.getKey()) && (key = (String) mapAudioAttributesCompatParcelizer2.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(key, entry.getValue());
            }
            return map;
        }
    }
}
