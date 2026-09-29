package kotlin;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.SimpleExoPlayer;
import kotlin.access5400;
import kotlin.access5500;
import kotlin.updateWifiLock;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010 \n\u0000\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u001c\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0003\u001a\u00020\u00172\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b!\u0010\"J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b%\u0010\"J\u0017\u0010&\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b&\u0010#J\u0017\u0010'\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b'\u0010#J%\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010)\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b)\u0010+J;\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00162\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020,0\u00182\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0002¢\u0006\u0004\b\u001c\u0010.Jq\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00162\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020,0\u00182\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00018\u00000/2 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020(\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180/H\u0002¢\u0006\u0004\b!\u00100J\u0017\u00101\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0017H\u0002¢\u0006\u0004\b1\u0010+R\u0016\u0010$\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00102R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00103R\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010)\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00106R\u0014\u0010'\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00107R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00108R*\u00101\u001a\u0018\u0012\u0004\u0012\u00020,\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010;"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda6;", "", "Ljava/io/File;", "p0", "p1", "p2", "Lo/PlaylistTimeline1;", "p3", "Lo/SimpleBasePlayerExternalSyntheticLambda60;", "p4", "Lo/updateWifiLock;", "p5", "Lo/access4400;", "p6", "Lo/SimpleBasePlayerExternalSyntheticLambda61;", "p7", "Lo/SimpleBasePlayerExternalSyntheticLambda8;", "p8", "", "p9", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/io/File;Lo/PlaylistTimeline1;Lo/SimpleBasePlayerExternalSyntheticLambda60;Lo/updateWifiLock;Lo/access4400;Lo/SimpleBasePlayerExternalSyntheticLambda61;Lo/SimpleBasePlayerExternalSyntheticLambda8;Z)V", "T", "", "Lo/getSubscriptionExpiresOn;", "", "Lo/access4500;", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Lo/getSubscriptionExpiresOn;Lo/access4500;)V", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/String;)Z", "Landroid/graphics/Bitmap;", "read", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "(Ljava/lang/String;)[B", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "write", "Lo/SimpleExoPlayer;", "RemoteActionCompatParcelizer", "(Lo/SimpleExoPlayer;)Lo/getSubscriptionExpiresOn;", "(Ljava/lang/String;)V", "Lo/lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer;", "Lo/access5500;", "(Lo/getSubscriptionExpiresOn;Lo/access5500;)Ljava/lang/Object;", "Lkotlin/Function1;", "(Lo/getSubscriptionExpiresOn;Lo/access4500;Lo/getAnswerMap;Lo/getAnswerMap;)Ljava/lang/Object;", "MediaBrowserCompatItemReceiver", "Lo/PlaylistTimeline1;", "Lo/SimpleBasePlayerExternalSyntheticLambda60;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/access4400;", "Lo/SimpleBasePlayerExternalSyntheticLambda61;", "Lo/SimpleBasePlayerExternalSyntheticLambda8;", "Z", "", "", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda6 {
    private static volatile SimpleBasePlayerExternalSyntheticLambda6 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final PlaylistTimeline1 IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final SimpleBasePlayerExternalSyntheticLambda60 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final SimpleBasePlayerExternalSyntheticLambda8 write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final access4400 read;
    private final Map<lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer, List<access4500<?>>> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final SimpleBasePlayerExternalSyntheticLambda61 RemoteActionCompatParcelizer;

    public final /* synthetic */ class write {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[SimpleExoPlayer.write.values().length];
            try {
                iArr[SimpleExoPlayer.write.MediaBrowserCompatItemReceiver.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    private SimpleBasePlayerExternalSyntheticLambda6(File file, File file2, File file3, PlaylistTimeline1 playlistTimeline1, SimpleBasePlayerExternalSyntheticLambda60 simpleBasePlayerExternalSyntheticLambda60, updateWifiLock updatewifilock, access4400 access4400Var, SimpleBasePlayerExternalSyntheticLambda61 simpleBasePlayerExternalSyntheticLambda61, SimpleBasePlayerExternalSyntheticLambda8 simpleBasePlayerExternalSyntheticLambda8, boolean z) {
        toMagicModuleMetaRepoModel.write(file, "");
        toMagicModuleMetaRepoModel.write(file2, "");
        toMagicModuleMetaRepoModel.write(file3, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda60, "");
        toMagicModuleMetaRepoModel.write(updatewifilock, "");
        toMagicModuleMetaRepoModel.write(access4400Var, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda61, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda8, "");
        this.IconCompatParcelizer = playlistTimeline1;
        this.AudioAttributesCompatParcelizer = simpleBasePlayerExternalSyntheticLambda60;
        this.read = access4400Var;
        this.RemoteActionCompatParcelizer = simpleBasePlayerExternalSyntheticLambda61;
        this.write = simpleBasePlayerExternalSyntheticLambda8;
        this.AudioAttributesImplApi21Parcelizer = z;
        this.MediaBrowserCompatItemReceiver = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.IconCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new access4500[]{access4400Var, simpleBasePlayerExternalSyntheticLambda8, simpleBasePlayerExternalSyntheticLambda61})), setAction.write(lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.read, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new access4500[]{simpleBasePlayerExternalSyntheticLambda61, simpleBasePlayerExternalSyntheticLambda8, access4400Var})), setAction.write(lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.RemoteActionCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new access4500[]{simpleBasePlayerExternalSyntheticLambda8, access4400Var, simpleBasePlayerExternalSyntheticLambda61})));
    }

    public static final /* synthetic */ Pair IconCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda6 simpleBasePlayerExternalSyntheticLambda6, SimpleExoPlayer simpleExoPlayer) {
        return RemoteActionCompatParcelizer(simpleExoPlayer);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SimpleBasePlayerExternalSyntheticLambda6(File file, File file2, File file3, PlaylistTimeline1 playlistTimeline1, SimpleBasePlayerExternalSyntheticLambda60 simpleBasePlayerExternalSyntheticLambda60, updateWifiLock updatewifilock, access4400 access4400Var, SimpleBasePlayerExternalSyntheticLambda61 simpleBasePlayerExternalSyntheticLambda61, SimpleBasePlayerExternalSyntheticLambda8 simpleBasePlayerExternalSyntheticLambda8, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        updateWifiLock updatewifilockWrite;
        PlaylistTimeline1 playlistTimeline12 = (i & 8) != 0 ? null : playlistTimeline1;
        SimpleBasePlayerExternalSyntheticLambda60 simpleBasePlayerExternalSyntheticLambda57 = (i & 16) != 0 ? new SimpleBasePlayerExternalSyntheticLambda57() : simpleBasePlayerExternalSyntheticLambda60;
        if ((i & 32) != 0) {
            updateWifiLock.Companion readVar = updateWifiLock.INSTANCE;
            access5400.Companion iconCompatParcelizer = access5400.INSTANCE;
            access4300<Bitmap> access4300VarAudioAttributesCompatParcelizer = access5400.Companion.AudioAttributesCompatParcelizer(file, playlistTimeline12);
            access5400.Companion iconCompatParcelizer2 = access5400.INSTANCE;
            access4300<byte[]> access4300VarRemoteActionCompatParcelizer = access5400.Companion.RemoteActionCompatParcelizer(file2, playlistTimeline12);
            access5400.Companion iconCompatParcelizer3 = access5400.INSTANCE;
            updatewifilockWrite = readVar.write(access4300VarAudioAttributesCompatParcelizer, access4300VarRemoteActionCompatParcelizer, access5400.Companion.write(file3, playlistTimeline12));
        } else {
            updatewifilockWrite = updatewifilock;
        }
        this(file, file2, file3, playlistTimeline12, simpleBasePlayerExternalSyntheticLambda57, updatewifilockWrite, (i & 64) != 0 ? new access4400(updatewifilockWrite, playlistTimeline12) : access4400Var, (i & 128) != 0 ? new SimpleBasePlayerExternalSyntheticLambda61(updatewifilockWrite, playlistTimeline12) : simpleBasePlayerExternalSyntheticLambda61, (i & 256) != 0 ? new SimpleBasePlayerExternalSyntheticLambda8(updatewifilockWrite, playlistTimeline12) : simpleBasePlayerExternalSyntheticLambda8, (i & 512) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: o.SimpleBasePlayerExternalSyntheticLambda6$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda6$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/PlaylistTimeline1;", "p1", "Lo/SimpleBasePlayerExternalSyntheticLambda6;", "read", "(Landroid/content/Context;Lo/PlaylistTimeline1;)Lo/SimpleBasePlayerExternalSyntheticLambda6;", "AudioAttributesCompatParcelizer", "Lo/SimpleBasePlayerExternalSyntheticLambda6;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final SimpleBasePlayerExternalSyntheticLambda6 read(Context p0, PlaylistTimeline1 p1) {
            SimpleBasePlayerExternalSyntheticLambda6 simpleBasePlayerExternalSyntheticLambda6;
            toMagicModuleMetaRepoModel.write(p0, "");
            SimpleBasePlayerExternalSyntheticLambda6 simpleBasePlayerExternalSyntheticLambda62 = SimpleBasePlayerExternalSyntheticLambda6.AudioAttributesCompatParcelizer;
            if (simpleBasePlayerExternalSyntheticLambda62 != null) {
                return simpleBasePlayerExternalSyntheticLambda62;
            }
            synchronized (this) {
                simpleBasePlayerExternalSyntheticLambda6 = SimpleBasePlayerExternalSyntheticLambda6.AudioAttributesCompatParcelizer;
                if (simpleBasePlayerExternalSyntheticLambda6 == null) {
                    File dir = p0.getDir("CleverTap.Images.", 0);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dir, "");
                    File dir2 = p0.getDir("CleverTap.Gif.", 0);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dir2, "");
                    File dir3 = p0.getDir("CleverTap.Files.", 0);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dir3, "");
                    simpleBasePlayerExternalSyntheticLambda6 = new SimpleBasePlayerExternalSyntheticLambda6(dir, dir2, dir3, p1, null, null, null, null, null, false, AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, null);
                    Companion companion = SimpleBasePlayerExternalSyntheticLambda6.INSTANCE;
                    SimpleBasePlayerExternalSyntheticLambda6.AudioAttributesCompatParcelizer = simpleBasePlayerExternalSyntheticLambda6;
                }
            }
            return simpleBasePlayerExternalSyntheticLambda6;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static <T> void AudioAttributesCompatParcelizer(String p0, Pair<? extends T, byte[]> p1, access4500<T> p2) {
        p2.RemoteActionCompatParcelizer(p0, new Pair<>(p1.write(), p2.write(p0, p1.IconCompatParcelizer())));
    }

    public final boolean AudioAttributesImplBaseParcelizer(String p0) {
        Pair pair;
        toMagicModuleMetaRepoModel.write(p0, "");
        List<access4500<?>> list = this.MediaBrowserCompatItemReceiver.get(lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.RemoteActionCompatParcelizer);
        Serializable serializable = null;
        if (list != null) {
            List<access4500<?>> list2 = list;
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    pair = null;
                    break;
                }
                pair = ((access4500) it.next()).read(p0);
                if (pair != null) {
                    break;
                }
            }
            if (pair == null) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    File fileRemoteActionCompatParcelizer = ((access4500) it2.next()).RemoteActionCompatParcelizer(p0);
                    if (fileRemoteActionCompatParcelizer != null) {
                        serializable = fileRemoteActionCompatParcelizer;
                        break;
                    }
                }
            } else {
                serializable = pair;
            }
            serializable = serializable;
        }
        return serializable != null;
    }

    public final Bitmap read(String p0) {
        return (Bitmap) AudioAttributesCompatParcelizer(new Pair<>(p0, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.IconCompatParcelizer), access5500.write.INSTANCE);
    }

    public final byte[] AudioAttributesCompatParcelizer(String p0) {
        return (byte[]) AudioAttributesCompatParcelizer(new Pair<>(p0, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.read), access5500.IconCompatParcelizer.INSTANCE);
    }

    public final byte[] IconCompatParcelizer(String p0) {
        return (byte[]) AudioAttributesCompatParcelizer(new Pair<>(p0, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.RemoteActionCompatParcelizer), access5500.IconCompatParcelizer.INSTANCE);
    }

    public final Bitmap AudioAttributesImplApi26Parcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (Bitmap) read(new Pair<>(p0, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.IconCompatParcelizer), this.read, new MediaBrowserCompatCustomActionResultReceiver(this), new getAnswerMap() { // from class: o.SimpleBasePlayerExternalSyntheticLambda59
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return SimpleBasePlayerExternalSyntheticLambda6.read((SimpleExoPlayer) obj);
            }
        });
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class MediaBrowserCompatCustomActionResultReceiver extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<String, Bitmap> {
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke(String str) {
            return ((SimpleBasePlayerExternalSyntheticLambda6) this.AudioAttributesImplApi26Parcelizer).read(str);
        }

        MediaBrowserCompatCustomActionResultReceiver(Object obj) {
            super(1, obj, SimpleBasePlayerExternalSyntheticLambda6.class, "read", "read(Ljava/lang/String;)Landroid/graphics/Bitmap;", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair read(SimpleExoPlayer simpleExoPlayer) {
        toMagicModuleMetaRepoModel.write(simpleExoPlayer, "");
        if (write.RemoteActionCompatParcelizer[simpleExoPlayer.getAudioAttributesCompatParcelizer().ordinal()] != 1) {
            return null;
        }
        Bitmap read = simpleExoPlayer.getRead();
        toMagicModuleMetaRepoModel.write(read);
        byte[] iconCompatParcelizer = simpleExoPlayer.getIconCompatParcelizer();
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer);
        return new Pair(read, iconCompatParcelizer);
    }

    public final byte[] AudioAttributesImplApi21Parcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (byte[]) read(new Pair<>(p0, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.read), this.RemoteActionCompatParcelizer, new AudioAttributesCompatParcelizer(this), new AudioAttributesImplBaseParcelizer(this));
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AudioAttributesCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<String, byte[]> {
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final byte[] invoke(String str) {
            return ((SimpleBasePlayerExternalSyntheticLambda6) this.AudioAttributesImplApi26Parcelizer).AudioAttributesCompatParcelizer(str);
        }

        AudioAttributesCompatParcelizer(Object obj) {
            super(1, obj, SimpleBasePlayerExternalSyntheticLambda6.class, "AudioAttributesCompatParcelizer", "AudioAttributesCompatParcelizer(Ljava/lang/String;)[B", 0);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AudioAttributesImplBaseParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<SimpleExoPlayer, Pair<? extends byte[], ? extends byte[]>> {
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Pair<byte[], byte[]> invoke(SimpleExoPlayer simpleExoPlayer) {
            toMagicModuleMetaRepoModel.write(simpleExoPlayer, "");
            return SimpleBasePlayerExternalSyntheticLambda6.IconCompatParcelizer((SimpleBasePlayerExternalSyntheticLambda6) this.AudioAttributesImplApi26Parcelizer, simpleExoPlayer);
        }

        AudioAttributesImplBaseParcelizer(Object obj) {
            super(1, obj, SimpleBasePlayerExternalSyntheticLambda6.class, "RemoteActionCompatParcelizer", "RemoteActionCompatParcelizer(Lo/SimpleExoPlayer;)Lo/getSubscriptionExpiresOn;", 0);
        }
    }

    public final byte[] write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (byte[]) read(new Pair<>(p0, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.RemoteActionCompatParcelizer), this.write, new IconCompatParcelizer(this), new RemoteActionCompatParcelizer(this));
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<String, byte[]> {
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final byte[] invoke(String str) {
            return ((SimpleBasePlayerExternalSyntheticLambda6) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer(str);
        }

        IconCompatParcelizer(Object obj) {
            super(1, obj, SimpleBasePlayerExternalSyntheticLambda6.class, "IconCompatParcelizer", "IconCompatParcelizer(Ljava/lang/String;)[B", 0);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class RemoteActionCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<SimpleExoPlayer, Pair<? extends byte[], ? extends byte[]>> {
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Pair<byte[], byte[]> invoke(SimpleExoPlayer simpleExoPlayer) {
            toMagicModuleMetaRepoModel.write(simpleExoPlayer, "");
            return SimpleBasePlayerExternalSyntheticLambda6.IconCompatParcelizer((SimpleBasePlayerExternalSyntheticLambda6) this.AudioAttributesImplApi26Parcelizer, simpleExoPlayer);
        }

        RemoteActionCompatParcelizer(Object obj) {
            super(1, obj, SimpleBasePlayerExternalSyntheticLambda6.class, "RemoteActionCompatParcelizer", "RemoteActionCompatParcelizer(Lo/SimpleExoPlayer;)Lo/getSubscriptionExpiresOn;", 0);
        }
    }

    private static Pair<byte[], byte[]> RemoteActionCompatParcelizer(SimpleExoPlayer p0) {
        if (write.RemoteActionCompatParcelizer[p0.getAudioAttributesCompatParcelizer().ordinal()] != 1) {
            return null;
        }
        byte[] iconCompatParcelizer = p0.getIconCompatParcelizer();
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer);
        return new Pair<>(iconCompatParcelizer, p0.getIconCompatParcelizer());
    }

    public final void RemoteActionCompatParcelizer(String p0) {
        String str;
        toMagicModuleMetaRepoModel.write(p0, "");
        List<access4500<?>> list = this.MediaBrowserCompatItemReceiver.get(lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.IconCompatParcelizer);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                access4500 access4500Var = (access4500) it.next();
                if (access4500Var instanceof access4400) {
                    str = lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.IconCompatParcelizer;
                } else if (access4500Var instanceof SimpleBasePlayerExternalSyntheticLambda61) {
                    str = lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.read;
                } else {
                    str = access4500Var instanceof SimpleBasePlayerExternalSyntheticLambda8 ? lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.RemoteActionCompatParcelizer : "";
                }
                if (access4500Var.IconCompatParcelizer(p0) != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(p0);
                    sb.append(" was present in ");
                    sb.append(str);
                    sb.append(" in-memory cache is successfully removed");
                    MediaBrowserCompatItemReceiver(sb.toString());
                }
                if (access4500Var.write(p0)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(p0);
                    sb2.append(" was present in ");
                    sb2.append(str);
                    sb2.append(" disk-memory cache is successfully removed");
                    MediaBrowserCompatItemReceiver(sb2.toString());
                }
            }
        }
    }

    private final <T> T AudioAttributesCompatParcelizer(Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer> p0, access5500<T> p1) {
        T t;
        String strWrite = p0.write();
        lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer lambdaaddmediaitems3comgoogleandroidexoplayer2simplebaseplayerIconCompatParcelizer = p0.IconCompatParcelizer();
        StringBuilder sb = new StringBuilder();
        sb.append(lambdaaddmediaitems3comgoogleandroidexoplayer2simplebaseplayerIconCompatParcelizer.name());
        sb.append(" data for key ");
        sb.append(strWrite);
        sb.append(" requested");
        MediaBrowserCompatItemReceiver(sb.toString());
        if (strWrite == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lambdaaddmediaitems3comgoogleandroidexoplayer2simplebaseplayerIconCompatParcelizer.name());
            sb2.append(" data for null key requested");
            MediaBrowserCompatItemReceiver(sb2.toString());
            return null;
        }
        List<access4500<?>> list = this.MediaBrowserCompatItemReceiver.get(lambdaaddmediaitems3comgoogleandroidexoplayer2simplebaseplayerIconCompatParcelizer);
        if (list == null) {
            return null;
        }
        List<access4500<?>> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = (T) ((access4500) it.next()).IconCompatParcelizer(strWrite, p1);
            if (t != null) {
                break;
            }
        }
        if (t != null) {
            return t;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            T t2 = (T) ((access4500) it2.next()).AudioAttributesCompatParcelizer(strWrite, p1);
            if (t2 != null) {
                return t2;
            }
        }
        return null;
    }

    private final <T> T read(Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer> p0, access4500<T> p1, getAnswerMap<? super String, ? extends T> p2, getAnswerMap<? super SimpleExoPlayer, ? extends Pair<? extends T, byte[]>> p3) {
        T tInvoke = p2.invoke(p0.write());
        if (tInvoke != null) {
            StringBuilder sb = new StringBuilder("Returning requested ");
            sb.append(p0.write());
            sb.append(' ');
            sb.append(p0.IconCompatParcelizer().name());
            sb.append(" from cache");
            MediaBrowserCompatItemReceiver(sb.toString());
            return tInvoke;
        }
        SimpleExoPlayer simpleExoPlayer = this.AudioAttributesCompatParcelizer.read(p0);
        if (write.RemoteActionCompatParcelizer[simpleExoPlayer.getAudioAttributesCompatParcelizer().ordinal()] == 1) {
            Pair<? extends T, byte[]> pairInvoke = p3.invoke(simpleExoPlayer);
            toMagicModuleMetaRepoModel.write(pairInvoke);
            Pair<? extends T, byte[]> pair = pairInvoke;
            AudioAttributesCompatParcelizer(p0.write(), pair, p1);
            StringBuilder sb2 = new StringBuilder("Returning requested ");
            sb2.append(p0.write());
            sb2.append(' ');
            sb2.append(p0.IconCompatParcelizer().name());
            sb2.append(" with network, saved in cache");
            MediaBrowserCompatItemReceiver(sb2.toString());
            return pair.write();
        }
        StringBuilder sb3 = new StringBuilder("There was a problem fetching data for ");
        sb3.append(p0.IconCompatParcelizer().name());
        sb3.append(", status: ");
        sb3.append(simpleExoPlayer.getAudioAttributesCompatParcelizer());
        MediaBrowserCompatItemReceiver(sb3.toString());
        return null;
    }

    private final void MediaBrowserCompatItemReceiver(String p0) {
        PlaylistTimeline1 playlistTimeline1;
        if (!this.AudioAttributesImplApi21Parcelizer || (playlistTimeline1 = this.IconCompatParcelizer) == null) {
            return;
        }
        playlistTimeline1.write("FileDownload", p0);
    }

    @getMagicModuleMeta
    public static final SimpleBasePlayerExternalSyntheticLambda6 RemoteActionCompatParcelizer(Context context, PlaylistTimeline1 playlistTimeline1) {
        return INSTANCE.read(context, playlistTimeline1);
    }
}
