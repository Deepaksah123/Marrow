package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.MediaType;
import kotlin.Metadata;
import kotlin.getRelatedModuleAdapter;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \"2\u00020\u0001:\u0003\u001d\"\u0012B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010!"}, d2 = {"Lo/ThemeKtWhenMappings;", "Lo/ThemeKtExternalSyntheticLambda2;", "Lo/getRelatedModuleAdapter;", "p0", "Lo/ExtendedColors;", "p1", "", "Lo/ThemeKtWhenMappings$AudioAttributesCompatParcelizer;", "p2", "<init>", "(Lo/getRelatedModuleAdapter;Lo/ExtendedColors;Ljava/util/List;)V", "", "contentLength", "()J", "contentType", "()Lo/ExtendedColors;", "Lo/LessonCompletedDialogonViewCreatedllm1;", "", "AudioAttributesCompatParcelizer", "(Lo/LessonCompletedDialogonViewCreatedllm1;Z)J", "", "writeTo", "(Lo/LessonCompletedDialogonViewCreatedllm1;)V", "", "read", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/getRelatedModuleAdapter;", "write", "AudioAttributesImplBaseParcelizer", "J", "AudioAttributesImplApi21Parcelizer", "Lo/ExtendedColors;", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/util/List;", "RatingCompat"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThemeKtWhenMappings extends ThemeKtExternalSyntheticLambda2 {
    private static final byte[] AudioAttributesCompatParcelizer;
    private static final byte[] MediaBrowserCompatItemReceiver;
    private static final byte[] RemoteActionCompatParcelizer;
    public static final MediaType read;
    public static final MediaType write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final MediaType IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getRelatedModuleAdapter write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final List<AudioAttributesCompatParcelizer> read;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final MediaType MediaBrowserCompatCustomActionResultReceiver;

    public ThemeKtWhenMappings(getRelatedModuleAdapter getrelatedmoduleadapter, MediaType mediaType, List<AudioAttributesCompatParcelizer> list) {
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
        toMagicModuleMetaRepoModel.write(mediaType, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = getrelatedmoduleadapter;
        this.MediaBrowserCompatCustomActionResultReceiver = mediaType;
        this.read = list;
        MediaType.write writeVar = MediaType.write;
        StringBuilder sb = new StringBuilder();
        sb.append(mediaType);
        sb.append("; boundary=");
        sb.append(read());
        this.IconCompatParcelizer = MediaType.write.RemoteActionCompatParcelizer(sb.toString());
        this.AudioAttributesCompatParcelizer = -1L;
    }

    private String read() {
        return this.write.MediaDescriptionCompat();
    }

    @Override // kotlin.ThemeKtExternalSyntheticLambda2
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.ThemeKtExternalSyntheticLambda2
    public final long contentLength() throws IOException {
        long j = this.AudioAttributesCompatParcelizer;
        if (j != -1) {
            return j;
        }
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(null, true);
        this.AudioAttributesCompatParcelizer = jAudioAttributesCompatParcelizer;
        return jAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.ThemeKtExternalSyntheticLambda2
    public final void writeTo(LessonCompletedDialogonViewCreatedllm1 p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(p0, false);
    }

    private final long AudioAttributesCompatParcelizer(LessonCompletedDialogonViewCreatedllm1 p0, boolean p1) throws IOException {
        resetCurrentSelectedPosition resetcurrentselectedposition;
        resetCurrentSelectedPosition resetcurrentselectedposition2;
        if (p1) {
            resetcurrentselectedposition2 = new resetCurrentSelectedPosition();
            resetcurrentselectedposition = resetcurrentselectedposition2;
        } else {
            resetcurrentselectedposition = p0;
            resetcurrentselectedposition2 = null;
        }
        int size = this.read.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.read.get(i);
            ShapeKt audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
            ThemeKtExternalSyntheticLambda2 remoteActionCompatParcelizer = audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition);
            resetcurrentselectedposition.RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver);
            resetcurrentselectedposition.AudioAttributesCompatParcelizer(this.write);
            resetcurrentselectedposition.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer);
            if (audioAttributesCompatParcelizer2 != null) {
                int iIconCompatParcelizer = audioAttributesCompatParcelizer2.IconCompatParcelizer();
                for (int i2 = 0; i2 < iIconCompatParcelizer; i2++) {
                    resetcurrentselectedposition.read(audioAttributesCompatParcelizer2.IconCompatParcelizer(i2)).RemoteActionCompatParcelizer(RemoteActionCompatParcelizer).read(audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer(i2)).RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer);
                }
            }
            MediaType iconCompatParcelizer = remoteActionCompatParcelizer.getIconCompatParcelizer();
            if (iconCompatParcelizer != null) {
                resetcurrentselectedposition.read("Content-Type: ").read(iconCompatParcelizer.toString()).RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer);
            }
            long jContentLength = remoteActionCompatParcelizer.contentLength();
            if (jContentLength != -1) {
                resetcurrentselectedposition.read("Content-Length: ").MediaBrowserCompatMediaItem(jContentLength).RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer);
            } else if (p1) {
                toMagicModuleMetaRepoModel.write(resetcurrentselectedposition2);
                resetcurrentselectedposition2.IconCompatParcelizer();
                return -1L;
            }
            byte[] bArr = AudioAttributesCompatParcelizer;
            resetcurrentselectedposition.RemoteActionCompatParcelizer(bArr);
            if (p1) {
                j += jContentLength;
            } else {
                remoteActionCompatParcelizer.writeTo(resetcurrentselectedposition);
            }
            resetcurrentselectedposition.RemoteActionCompatParcelizer(bArr);
        }
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition);
        byte[] bArr2 = MediaBrowserCompatItemReceiver;
        resetcurrentselectedposition.RemoteActionCompatParcelizer(bArr2);
        resetcurrentselectedposition.AudioAttributesCompatParcelizer(this.write);
        resetcurrentselectedposition.RemoteActionCompatParcelizer(bArr2);
        resetcurrentselectedposition.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer);
        if (!p1) {
            return j;
        }
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition2);
        long size2 = j + resetcurrentselectedposition2.getSize();
        resetcurrentselectedposition2.IconCompatParcelizer();
        return size2;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/ThemeKtWhenMappings$AudioAttributesCompatParcelizer;", "", "Lo/ShapeKt;", "p0", "Lo/ThemeKtExternalSyntheticLambda2;", "p1", "<init>", "(Lo/ShapeKt;Lo/ThemeKtExternalSyntheticLambda2;)V", "read", "Lo/ThemeKtExternalSyntheticLambda2;", "AudioAttributesCompatParcelizer", "()Lo/ThemeKtExternalSyntheticLambda2;", "RemoteActionCompatParcelizer", "write", "Lo/ShapeKt;", "IconCompatParcelizer", "()Lo/ShapeKt;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final ThemeKtExternalSyntheticLambda2 RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final ShapeKt AudioAttributesCompatParcelizer;

        private AudioAttributesCompatParcelizer(ShapeKt shapeKt, ThemeKtExternalSyntheticLambda2 themeKtExternalSyntheticLambda2) {
            this.AudioAttributesCompatParcelizer = shapeKt;
            this.RemoteActionCompatParcelizer = themeKtExternalSyntheticLambda2;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final ShapeKt getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final ThemeKtExternalSyntheticLambda2 getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(ShapeKt shapeKt, ThemeKtExternalSyntheticLambda2 themeKtExternalSyntheticLambda2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(shapeKt, themeKtExternalSyntheticLambda2);
        }

        /* JADX INFO: renamed from: o.ThemeKtWhenMappings$AudioAttributesCompatParcelizer$IconCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/ThemeKtWhenMappings$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "", "<init>", "()V", "Lo/ShapeKt;", "p0", "Lo/ThemeKtExternalSyntheticLambda2;", "p1", "Lo/ThemeKtWhenMappings$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "(Lo/ShapeKt;Lo/ThemeKtExternalSyntheticLambda2;)Lo/ThemeKtWhenMappings$AudioAttributesCompatParcelizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @getMagicModuleMeta
            public static AudioAttributesCompatParcelizer IconCompatParcelizer(ShapeKt p0, ThemeKtExternalSyntheticLambda2 p1) {
                toMagicModuleMetaRepoModel.write(p1, "");
                MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
                if ((p0 != null ? p0.IconCompatParcelizer(RtspHeaders.CONTENT_TYPE) : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((p0 != null ? p0.IconCompatParcelizer(RtspHeaders.CONTENT_LENGTH) : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                return new AudioAttributesCompatParcelizer(p0, p1, magicModuleRepositoryImplExternalSyntheticLambda0);
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/ThemeKtWhenMappings$write;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "Lo/ShapeKt;", "Lo/ThemeKtExternalSyntheticLambda2;", "p1", "AudioAttributesCompatParcelizer", "(Lo/ShapeKt;Lo/ThemeKtExternalSyntheticLambda2;)Lo/ThemeKtWhenMappings$write;", "Lo/ThemeKtWhenMappings$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "(Lo/ThemeKtWhenMappings$AudioAttributesCompatParcelizer;)Lo/ThemeKtWhenMappings$write;", "Lo/ThemeKtWhenMappings;", "()Lo/ThemeKtWhenMappings;", "Lo/ExtendedColors;", "RemoteActionCompatParcelizer", "(Lo/ExtendedColors;)Lo/ThemeKtWhenMappings$write;", "Lo/getRelatedModuleAdapter;", "Lo/getRelatedModuleAdapter;", "write", "", "Ljava/util/List;", "read", "Lo/ExtendedColors;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class write {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final getRelatedModuleAdapter write;
        private MediaType read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final List<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer;

        private write(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.INSTANCE;
            this.write = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer(str);
            this.read = ThemeKtWhenMappings.write;
            this.RemoteActionCompatParcelizer = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ write(String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            }
            this(str);
        }

        public final write RemoteActionCompatParcelizer(MediaType p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getAudioAttributesImplApi21Parcelizer(), (Object) "multipart")) {
                throw new IllegalArgumentException("multipart != ".concat(String.valueOf(p0)).toString());
            }
            this.read = p0;
            return this;
        }

        public final write AudioAttributesCompatParcelizer(ShapeKt p0, ThemeKtExternalSyntheticLambda2 p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            AudioAttributesCompatParcelizer.Companion companion = AudioAttributesCompatParcelizer.INSTANCE;
            IconCompatParcelizer(AudioAttributesCompatParcelizer.Companion.IconCompatParcelizer(p0, p1));
            return this;
        }

        public final write IconCompatParcelizer(AudioAttributesCompatParcelizer p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.RemoteActionCompatParcelizer.add(p0);
            return this;
        }

        public final ThemeKtWhenMappings IconCompatParcelizer() {
            if (this.RemoteActionCompatParcelizer.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.".toString());
            }
            return new ThemeKtWhenMappings(this.write, this.read, FirebaseDataModule.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public write() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    static {
        MediaType.write writeVar = MediaType.write;
        write = MediaType.write.RemoteActionCompatParcelizer("multipart/mixed");
        MediaType.write writeVar2 = MediaType.write;
        MediaType.write.RemoteActionCompatParcelizer("multipart/alternative");
        MediaType.write writeVar3 = MediaType.write;
        MediaType.write.RemoteActionCompatParcelizer("multipart/digest");
        MediaType.write writeVar4 = MediaType.write;
        MediaType.write.RemoteActionCompatParcelizer("multipart/parallel");
        MediaType.write writeVar5 = MediaType.write;
        read = MediaType.write.RemoteActionCompatParcelizer("multipart/form-data");
        RemoteActionCompatParcelizer = new byte[]{58, 32};
        AudioAttributesCompatParcelizer = new byte[]{13, 10};
        MediaBrowserCompatItemReceiver = new byte[]{45, 45};
    }
}
