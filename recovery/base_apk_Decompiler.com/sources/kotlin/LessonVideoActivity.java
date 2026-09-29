package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0011J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\t\u0010\u0012R\u0014\u0010\t\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001a"}, d2 = {"Lo/LessonVideoActivity;", "", "<init>", "()V", "", "p0", "p1", "p2", "", "RemoteActionCompatParcelizer", "(III)V", "Lo/LessonCompletedDialog;", "", "Lo/LessonCompletedDialogonViewCreatedllm1;", "IconCompatParcelizer", "(Lo/LessonCompletedDialog;JLo/LessonCompletedDialogonViewCreatedllm1;)V", "Lo/getRelatedModuleAdapter;", "(Lo/getRelatedModuleAdapter;Lo/LessonCompletedDialogonViewCreatedllm1;)V", "(Lo/getRelatedModuleAdapter;)I", "", "AudioAttributesCompatParcelizer", "[I", "", "read", "[B", "Lo/LessonVideoActivity$RemoteActionCompatParcelizer;", "Lo/LessonVideoActivity$RemoteActionCompatParcelizer;", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LessonVideoActivity {
    public static final LessonVideoActivity INSTANCE = new LessonVideoActivity();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final int[] RemoteActionCompatParcelizer = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED, AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, 4090, 8185, 21, 248, 2042, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, AnalyticsListener.EVENT_VIDEO_DECODER_RELEASED, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, AnalyticsListener.EVENT_VIDEO_DISABLED, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final byte[] read = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer();

    private LessonVideoActivity() {
    }

    static {
        for (int i = 0; i < 256; i++) {
            RemoteActionCompatParcelizer(i, RemoteActionCompatParcelizer[i], read[i]);
        }
    }

    public static void IconCompatParcelizer(getRelatedModuleAdapter p0, LessonCompletedDialogonViewCreatedllm1 p1) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        int iMediaBrowserCompatCustomActionResultReceiver = p0.MediaBrowserCompatCustomActionResultReceiver();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < iMediaBrowserCompatCustomActionResultReceiver; i2++) {
            int iWrite = FirebaseDataModule.write(p0.read(i2));
            int i3 = RemoteActionCompatParcelizer[iWrite];
            byte b = read[iWrite];
            j = (j << b) | ((long) i3);
            i += b;
            while (i >= 8) {
                i -= 8;
                p1.read((int) (j >> i));
            }
        }
        if (i > 0) {
            p1.read((int) ((j << (8 - i)) | (255 >>> i)));
        }
    }

    public static int RemoteActionCompatParcelizer(getRelatedModuleAdapter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int iMediaBrowserCompatCustomActionResultReceiver = p0.MediaBrowserCompatCustomActionResultReceiver();
        long j = 0;
        for (int i = 0; i < iMediaBrowserCompatCustomActionResultReceiver; i++) {
            j += (long) read[FirebaseDataModule.write(p0.read(i))];
        }
        return (int) ((j + 7) >> 3);
    }

    public static void IconCompatParcelizer(LessonCompletedDialog p0, long p1, LessonCompletedDialogonViewCreatedllm1 p2) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = write;
        int i = 0;
        int iWrite = 0;
        for (long j = 0; j < p1; j++) {
            iWrite = (iWrite << 8) | FirebaseDataModule.write(p0.MediaMetadataCompat());
            i += 8;
            while (i >= 8) {
                RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer);
                remoteActionCompatParcelizer = remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer[(iWrite >>> (i - 8)) & 255];
                toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer);
                if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer() == null) {
                    p2.read(remoteActionCompatParcelizer.RemoteActionCompatParcelizer());
                    i -= remoteActionCompatParcelizer.read();
                    remoteActionCompatParcelizer = write;
                } else {
                    i -= 8;
                }
            }
        }
        while (i > 0) {
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer2 = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer2);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer2[(iWrite << (8 - i)) & 255];
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer2);
            if (remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer() != null || remoteActionCompatParcelizer2.read() > i) {
                return;
            }
            p2.read(remoteActionCompatParcelizer2.RemoteActionCompatParcelizer());
            i -= remoteActionCompatParcelizer2.read();
            remoteActionCompatParcelizer = write;
        }
    }

    private static void RemoteActionCompatParcelizer(int p0, int p1, int p2) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(p0, p2);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = write;
        while (p2 > 8) {
            p2 -= 8;
            int i = (p1 >>> p2) & 255;
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer = remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer[i];
            if (remoteActionCompatParcelizer3 == null) {
                remoteActionCompatParcelizer3 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer[i] = remoteActionCompatParcelizer3;
            }
            remoteActionCompatParcelizer2 = remoteActionCompatParcelizer3;
        }
        int i2 = 8 - p2;
        int i3 = (p1 << i2) & 255;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer2 = remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer2);
        getOrderDetails.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerArrAudioAttributesCompatParcelizer2, remoteActionCompatParcelizer, i3, (1 << i2) + i3);
    }

    static final class RemoteActionCompatParcelizer {
        private final int IconCompatParcelizer;
        private final int read;
        private final RemoteActionCompatParcelizer[] write;

        public final RemoteActionCompatParcelizer[] AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int read() {
            return this.read;
        }

        public RemoteActionCompatParcelizer() {
            this.write = new RemoteActionCompatParcelizer[256];
            this.IconCompatParcelizer = 0;
            this.read = 0;
        }

        public RemoteActionCompatParcelizer(int i, int i2) {
            this.write = null;
            this.IconCompatParcelizer = i;
            int i3 = i2 & 7;
            this.read = i3 == 0 ? 8 : i3;
        }
    }
}
