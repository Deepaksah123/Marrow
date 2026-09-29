package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r"}, d2 = {"Lo/getContentPositionMsInternal;", "", "<init>", "()V", "Lo/getContentPositionMsInternal$RemoteActionCompatParcelizer;", "p0", "Lo/SeekParameters;", "p1", "Lo/SimpleExoPlayer;", "RemoteActionCompatParcelizer", "(Lo/getContentPositionMsInternal$RemoteActionCompatParcelizer;Lo/SeekParameters;)Lo/SimpleExoPlayer;", "Lo/clearVideoOutput;", "IconCompatParcelizer", "Lo/clearVideoOutput;", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getContentPositionMsInternal {
    public static final getContentPositionMsInternal INSTANCE = new getContentPositionMsInternal();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final clearVideoOutput AudioAttributesCompatParcelizer = new clearVideoOutput(1000, 5000, true, true, VideoTimelineResponseBody.read(setAction.write("Accept-Encoding", "gzip, deflate")));

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final clearVideoOutput RemoteActionCompatParcelizer = new clearVideoOutput(5000, 15000, true, true, null, 16, null);

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[RemoteActionCompatParcelizer.values().length];
            try {
                iArr[RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RemoteActionCompatParcelizer.write.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RemoteActionCompatParcelizer.IconCompatParcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RemoteActionCompatParcelizer.read.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    private getContentPositionMsInternal() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lo/getContentPositionMsInternal$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer", "write", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private static final /* synthetic */ RemoteActionCompatParcelizer[] MediaBrowserCompatItemReceiver;
        public static final RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = new RemoteActionCompatParcelizer("DOWNLOAD_NOTIFICATION_BITMAP", 0);
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer("DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT", 1);
        public static final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer = new RemoteActionCompatParcelizer("DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP", 2);
        public static final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer = new RemoteActionCompatParcelizer("DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT", 3);
        public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer("DOWNLOAD_INAPP_BITMAP", 4);
        public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer("DOWNLOAD_ANY_BITMAP", 5);
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer("DOWNLOAD_BYTES", 6);
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer("DOWNLOAD_BYTES_WITH_TIME_LIMIT", 7);

        private RemoteActionCompatParcelizer(String str, int i) {
        }

        static {
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            MediaBrowserCompatItemReceiver = remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer);
        }

        public static RemoteActionCompatParcelizer valueOf(String str) {
            return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
        }

        public static RemoteActionCompatParcelizer[] values() {
            return (RemoteActionCompatParcelizer[]) MediaBrowserCompatItemReceiver.clone();
        }

        private static final /* synthetic */ RemoteActionCompatParcelizer[] AudioAttributesCompatParcelizer() {
            return new RemoteActionCompatParcelizer[]{MediaBrowserCompatCustomActionResultReceiver, RemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer, AudioAttributesImplApi26Parcelizer, AudioAttributesCompatParcelizer, write, IconCompatParcelizer, read};
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @getMagicModuleMeta
    public static final SimpleExoPlayer RemoteActionCompatParcelizer(RemoteActionCompatParcelizer p0, SeekParameters p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        int i = read.AudioAttributesCompatParcelizer[p0.ordinal()];
        Boolean bool = Boolean.TRUE;
        int i2 = 3;
        boolean z = false;
        RendererWakeupListener rendererWakeupListener = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        switch (i) {
            case 1:
                return new getMediaItemTransitionReason(new RenderersFactory(new r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI(AudioAttributesCompatParcelizer, new getContentBufferedPositionMsInternal(false, false, null, 7, null), null, 4, 0 == true ? 1 : 0))).read(p1);
            case 2:
                return new RendererConfiguration(new getMediaItemTransitionReason(new RenderersFactory(new r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI(AudioAttributesCompatParcelizer, new getCurrentMediaItemIndexInternal(z, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0), null, 4, null)))).read(p1);
            case 3:
                return new getMediaItemTransitionReason(new RenderersFactory(new r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI(AudioAttributesCompatParcelizer, new getCurrentMediaItemIndexInternal(z, objArr4 == true ? 1 : 0, i2, objArr3 == true ? 1 : 0), new Pair(bool, Integer.valueOf(p1.getMediaBrowserCompatCustomActionResultReceiver()))))).read(p1);
            case 4:
                return new RendererConfiguration(new getMediaItemTransitionReason(new RenderersFactory(new r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI(AudioAttributesCompatParcelizer, new getCurrentMediaItemIndexInternal(z, objArr6 == true ? 1 : 0, i2, objArr5 == true ? 1 : 0), new Pair(bool, Integer.valueOf(p1.getMediaBrowserCompatCustomActionResultReceiver())))))).read(p1);
            case 5:
                return new RenderersFactory(new r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI(RemoteActionCompatParcelizer, new getContentBufferedPositionMsInternal(true, false, null, 6, null), null, 4, 0 == true ? 1 : 0)).read(p1);
            case 6:
                return new RenderersFactory(new r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI(AudioAttributesCompatParcelizer, new getCurrentMediaItemIndexInternal(z, rendererWakeupListener, i2, objArr7 == true ? 1 : 0), null, 4, null)).read(p1);
            case 7:
                return new RenderersFactory(new r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI(RemoteActionCompatParcelizer, new getContentBufferedPositionMsInternal(true, false, null, 4, null), null, 4, 0 == true ? 1 : 0)).read(p1);
            case 8:
                return new RendererConfiguration(new RenderersFactory(new r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI(AudioAttributesCompatParcelizer, new getContentBufferedPositionMsInternal(true, false, null, 4, null), null, 4, 0 == true ? 1 : 0))).read(p1);
            default:
                throw new RenewEligibleCreator();
        }
    }
}
