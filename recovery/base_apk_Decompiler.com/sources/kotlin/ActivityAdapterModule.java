package kotlin;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.MediaType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000  2\u00020\u0001:\u0002\u000e B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lo/ActivityAdapterModule;", "Ljava/io/Closeable;", "<init>", "()V", "Ljava/io/InputStream;", "IconCompatParcelizer", "()Ljava/io/InputStream;", "", "AudioAttributesImplApi26Parcelizer", "()[B", "Ljava/io/Reader;", "AudioAttributesImplBaseParcelizer", "()Ljava/io/Reader;", "Ljava/nio/charset/Charset;", "RemoteActionCompatParcelizer", "()Ljava/nio/charset/Charset;", "", "close", "", "read", "()J", "Lo/ExtendedColors;", "write", "()Lo/ExtendedColors;", "Lo/LessonCompletedDialog;", "AudioAttributesCompatParcelizer", "()Lo/LessonCompletedDialog;", "", "AudioAttributesImplApi21Parcelizer", "()Ljava/lang/String;", "reader", "Ljava/io/Reader;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ActivityAdapterModule implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Reader reader;

    public abstract LessonCompletedDialog AudioAttributesCompatParcelizer();

    public abstract long read();

    public abstract MediaType write();

    public final InputStream IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer();
    }

    public final Reader AudioAttributesImplBaseParcelizer() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(), RemoteActionCompatParcelizer());
        this.reader = remoteActionCompatParcelizer;
        return remoteActionCompatParcelizer;
    }

    public final String AudioAttributesImplApi21Parcelizer() throws IOException {
        LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        try {
            LessonCompletedDialog lessonCompletedDialog = lessonCompletedDialogAudioAttributesCompatParcelizer;
            String strWrite = lessonCompletedDialog.write(FirebaseDataModule.write(lessonCompletedDialog, RemoteActionCompatParcelizer()));
            MagicModuleMetaLSModel.IconCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer, null);
            return strWrite;
        } finally {
        }
    }

    private final Charset RemoteActionCompatParcelizer() {
        Charset charset;
        MediaType mediaTypeWrite = write();
        return (mediaTypeWrite == null || (charset = mediaTypeWrite.read(getSubmissionTimestamp.IconCompatParcelizer)) == null) ? getSubmissionTimestamp.IconCompatParcelizer : charset;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        FirebaseDataModule.read(AudioAttributesCompatParcelizer());
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class RemoteActionCompatParcelizer extends Reader {
        private Reader IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private final LessonCompletedDialog read;
        private final Charset write;

        public RemoteActionCompatParcelizer(LessonCompletedDialog lessonCompletedDialog, Charset charset) {
            toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
            toMagicModuleMetaRepoModel.write(charset, "");
            this.read = lessonCompletedDialog;
            this.write = charset;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            toMagicModuleMetaRepoModel.write(cArr, "");
            if (this.RemoteActionCompatParcelizer) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.IconCompatParcelizer;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.read.AudioAttributesImplBaseParcelizer(), FirebaseDataModule.write(this.read, this.write));
                this.IconCompatParcelizer = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            getShowPopup getshowpopup;
            this.RemoteActionCompatParcelizer = true;
            Reader reader = this.IconCompatParcelizer;
            if (reader != null) {
                reader.close();
                getshowpopup = getShowPopup.INSTANCE;
            } else {
                getshowpopup = null;
            }
            if (getshowpopup == null) {
                this.read.close();
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0007J'\u0010\u000e\u001a\u00020\u0004*\u00020\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0010"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "()V", "create", "Lokhttp3/ResponseBody;", "contentType", "Lokhttp3/MediaType;", "content", "", "contentLength", "", "Lokio/BufferedSource;", "", "Lokio/ByteString;", "asResponseBody", "toResponseBody", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static ActivityAdapterModule read(String str, MediaType mediaType) {
            toMagicModuleMetaRepoModel.write(str, "");
            Charset charset = getSubmissionTimestamp.IconCompatParcelizer;
            if (mediaType != null && (charset = mediaType.read((Charset) null)) == null) {
                charset = getSubmissionTimestamp.IconCompatParcelizer;
                MediaType.write writeVar = MediaType.write;
                StringBuilder sb = new StringBuilder();
                sb.append(mediaType);
                sb.append("; charset=utf-8");
                mediaType = MediaType.write.AudioAttributesCompatParcelizer(sb.toString());
            }
            resetCurrentSelectedPosition resetcurrentselectedpositionRemoteActionCompatParcelizer = new resetCurrentSelectedPosition().RemoteActionCompatParcelizer(str, charset);
            return RemoteActionCompatParcelizer(resetcurrentselectedpositionRemoteActionCompatParcelizer, mediaType, resetcurrentselectedpositionRemoteActionCompatParcelizer.getSize());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @getMagicModuleMeta
        public static ActivityAdapterModule write(byte[] bArr, MediaType mediaType) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return RemoteActionCompatParcelizer(new resetCurrentSelectedPosition().RemoteActionCompatParcelizer(bArr), null, bArr.length);
        }

        @getMagicModuleMeta
        private static ActivityAdapterModule RemoteActionCompatParcelizer(LessonCompletedDialog lessonCompletedDialog, MediaType mediaType, long j) {
            toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
            return new write(mediaType, j, lessonCompletedDialog);
        }

        @getRenewGrpId
        @getMagicModuleMeta
        public final ActivityAdapterModule read(MediaType mediaType, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return read(str, mediaType);
        }

        @getRenewGrpId
        @getMagicModuleMeta
        public static ActivityAdapterModule read(MediaType mediaType, long j, LessonCompletedDialog lessonCompletedDialog) {
            toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
            return RemoteActionCompatParcelizer(lessonCompletedDialog, mediaType, j);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class write extends ActivityAdapterModule {
        private /* synthetic */ long AudioAttributesCompatParcelizer;
        private /* synthetic */ MediaType RemoteActionCompatParcelizer;
        private /* synthetic */ LessonCompletedDialog write;

        write(MediaType mediaType, long j, LessonCompletedDialog lessonCompletedDialog) {
            this.RemoteActionCompatParcelizer = mediaType;
            this.AudioAttributesCompatParcelizer = j;
            this.write = lessonCompletedDialog;
        }

        @Override // kotlin.ActivityAdapterModule
        public final MediaType write() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.ActivityAdapterModule
        public final long read() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.ActivityAdapterModule
        public final LessonCompletedDialog AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }

    public final byte[] AudioAttributesImplApi26Parcelizer() throws IOException {
        long j = read();
        if (j > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(j)));
        }
        LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        try {
            byte[] bArrMediaBrowserCompatSearchResultReceiver = lessonCompletedDialogAudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
            MagicModuleMetaLSModel.IconCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer, null);
            int length = bArrMediaBrowserCompatSearchResultReceiver.length;
            if (j == -1 || j == length) {
                return bArrMediaBrowserCompatSearchResultReceiver;
            }
            StringBuilder sb = new StringBuilder("Content-Length (");
            sb.append(j);
            sb.append(") and stream length (");
            sb.append(length);
            sb.append(") disagree");
            throw new IOException(sb.toString());
        } finally {
        }
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final ActivityAdapterModule AudioAttributesCompatParcelizer(MediaType mediaType, long j, LessonCompletedDialog lessonCompletedDialog) {
        return Companion.read(mediaType, j, lessonCompletedDialog);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final ActivityAdapterModule read(MediaType mediaType, String str) {
        return INSTANCE.read(mediaType, str);
    }
}
