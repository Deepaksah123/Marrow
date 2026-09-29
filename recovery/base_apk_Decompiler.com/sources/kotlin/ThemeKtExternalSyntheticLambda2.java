package kotlin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.MediaType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/ThemeKtExternalSyntheticLambda2;", "", "<init>", "()V", "", "contentLength", "()J", "Lo/ExtendedColors;", "contentType", "()Lo/ExtendedColors;", "", "isDuplex", "()Z", "isOneShot", "Lo/LessonCompletedDialogonViewCreatedllm1;", "p0", "", "writeTo", "(Lo/LessonCompletedDialogonViewCreatedllm1;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ThemeKtExternalSyntheticLambda2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(LessonCompletedDialogonViewCreatedllm1 p0) throws IOException;

    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(File file, MediaType mediaType) {
        return Companion.RemoteActionCompatParcelizer(file, mediaType);
    }

    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(String str, MediaType mediaType) {
        return Companion.write(str, mediaType);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(MediaType mediaType, File file) {
        return Companion.IconCompatParcelizer(mediaType, file);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(MediaType mediaType, String str) {
        return INSTANCE.read(mediaType, str);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(MediaType mediaType, getRelatedModuleAdapter getrelatedmoduleadapter) {
        return Companion.write(mediaType, getrelatedmoduleadapter);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(MediaType mediaType, byte[] bArr) {
        return INSTANCE.AudioAttributesCompatParcelizer(mediaType, bArr);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(MediaType mediaType, byte[] bArr, int i) {
        return INSTANCE.read(mediaType, bArr, i);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(MediaType mediaType, byte[] bArr, int i, int i2) {
        return Companion.read(mediaType, bArr, i, i2);
    }

    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(getRelatedModuleAdapter getrelatedmoduleadapter, MediaType mediaType) {
        return Companion.RemoteActionCompatParcelizer(getrelatedmoduleadapter, mediaType);
    }

    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(byte[] bArr) {
        return INSTANCE.RemoteActionCompatParcelizer(bArr);
    }

    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(byte[] bArr, MediaType mediaType) {
        return INSTANCE.write(bArr, mediaType);
    }

    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(byte[] bArr, MediaType mediaType, int i) {
        return INSTANCE.RemoteActionCompatParcelizer(bArr, mediaType, i);
    }

    @getMagicModuleMeta
    public static final ThemeKtExternalSyntheticLambda2 create(byte[] bArr, MediaType mediaType, int i, int i2) {
        return Companion.read(bArr, mediaType, i, i2);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000eH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000fH\u0007J\u001d\u0010\u0010\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J1\u0010\u0011\u001a\u00020\u0004*\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0012"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "()V", "create", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "file", "Ljava/io/File;", "content", "", "offset", "", "byteCount", "", "Lokio/ByteString;", "asRequestBody", "toRequestBody", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static ThemeKtExternalSyntheticLambda2 write(String str, MediaType mediaType) {
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
            byte[] bytes = str.getBytes(charset);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            return read(bytes, mediaType, 0, bytes.length);
        }

        @getMagicModuleMeta
        public static ThemeKtExternalSyntheticLambda2 RemoteActionCompatParcelizer(final getRelatedModuleAdapter getrelatedmoduleadapter, final MediaType mediaType) {
            toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
            return new ThemeKtExternalSyntheticLambda2() { // from class: o.ThemeKtExternalSyntheticLambda2$RemoteActionCompatParcelizer$write
                @Override // kotlin.ThemeKtExternalSyntheticLambda2
                public final MediaType contentType() {
                    return mediaType;
                }

                @Override // kotlin.ThemeKtExternalSyntheticLambda2
                public final long contentLength() {
                    return getrelatedmoduleadapter.MediaBrowserCompatCustomActionResultReceiver();
                }

                @Override // kotlin.ThemeKtExternalSyntheticLambda2
                public final void writeTo(LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1) throws IOException {
                    toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1, "");
                    lessonCompletedDialogonViewCreatedllm1.AudioAttributesCompatParcelizer(getrelatedmoduleadapter);
                }
            };
        }

        public static /* synthetic */ ThemeKtExternalSyntheticLambda2 write(byte[] bArr, MediaType mediaType, int i, int i2, int i3) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return read(bArr, mediaType, i, i2);
        }

        @getMagicModuleMeta
        public static ThemeKtExternalSyntheticLambda2 read(final byte[] bArr, final MediaType mediaType, final int i, final int i2) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            FirebaseDataModule.AudioAttributesCompatParcelizer(bArr.length, i, i2);
            return new ThemeKtExternalSyntheticLambda2() { // from class: o.ThemeKtExternalSyntheticLambda2$RemoteActionCompatParcelizer$IconCompatParcelizer
                @Override // kotlin.ThemeKtExternalSyntheticLambda2
                public final MediaType contentType() {
                    return mediaType;
                }

                @Override // kotlin.ThemeKtExternalSyntheticLambda2
                public final long contentLength() {
                    return i2;
                }

                @Override // kotlin.ThemeKtExternalSyntheticLambda2
                public final void writeTo(LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1) throws IOException {
                    toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1, "");
                    lessonCompletedDialogonViewCreatedllm1.AudioAttributesCompatParcelizer(bArr, i, i2);
                }
            };
        }

        @getMagicModuleMeta
        public static ThemeKtExternalSyntheticLambda2 RemoteActionCompatParcelizer(final File file, final MediaType mediaType) {
            toMagicModuleMetaRepoModel.write(file, "");
            return new ThemeKtExternalSyntheticLambda2() { // from class: o.ThemeKtExternalSyntheticLambda2$RemoteActionCompatParcelizer$read
                @Override // kotlin.ThemeKtExternalSyntheticLambda2
                public final MediaType contentType() {
                    return mediaType;
                }

                @Override // kotlin.ThemeKtExternalSyntheticLambda2
                public final long contentLength() {
                    return file.length();
                }

                @Override // kotlin.ThemeKtExternalSyntheticLambda2
                public final void writeTo(LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1) throws FileNotFoundException {
                    toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1, "");
                    setLockedFromSeek setlockedfromseekRemoteActionCompatParcelizer = CustomAppBarLayout.RemoteActionCompatParcelizer(file);
                    try {
                        lessonCompletedDialogonViewCreatedllm1.write(setlockedfromseekRemoteActionCompatParcelizer);
                        MagicModuleMetaLSModel.IconCompatParcelizer(setlockedfromseekRemoteActionCompatParcelizer, null);
                    } finally {
                    }
                }
            };
        }

        @getRenewGrpId
        @getMagicModuleMeta
        public final ThemeKtExternalSyntheticLambda2 read(MediaType mediaType, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return write(str, mediaType);
        }

        @getRenewGrpId
        @getMagicModuleMeta
        public static ThemeKtExternalSyntheticLambda2 write(MediaType mediaType, getRelatedModuleAdapter getrelatedmoduleadapter) {
            toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
            return RemoteActionCompatParcelizer(getrelatedmoduleadapter, mediaType);
        }

        private static /* synthetic */ ThemeKtExternalSyntheticLambda2 AudioAttributesCompatParcelizer(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return read(mediaType, bArr, i, i2);
        }

        @getRenewGrpId
        @getMagicModuleMeta
        public static ThemeKtExternalSyntheticLambda2 read(MediaType mediaType, byte[] bArr, int i, int i2) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return read(bArr, mediaType, i, i2);
        }

        @getRenewGrpId
        @getMagicModuleMeta
        public static ThemeKtExternalSyntheticLambda2 IconCompatParcelizer(MediaType mediaType, File file) {
            toMagicModuleMetaRepoModel.write(file, "");
            return RemoteActionCompatParcelizer(file, mediaType);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getRenewGrpId
        @getMagicModuleMeta
        public final ThemeKtExternalSyntheticLambda2 AudioAttributesCompatParcelizer(MediaType mediaType, byte[] bArr) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return AudioAttributesCompatParcelizer(this, mediaType, bArr, 0, 0, 12);
        }

        @getRenewGrpId
        @getMagicModuleMeta
        public final ThemeKtExternalSyntheticLambda2 read(MediaType mediaType, byte[] bArr, int i) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return AudioAttributesCompatParcelizer(this, mediaType, bArr, i, 0, 8);
        }

        @getMagicModuleMeta
        public final ThemeKtExternalSyntheticLambda2 RemoteActionCompatParcelizer(byte[] bArr) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return write(bArr, null, 0, 0, 7);
        }

        @getMagicModuleMeta
        public final ThemeKtExternalSyntheticLambda2 write(byte[] bArr, MediaType mediaType) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return write(bArr, mediaType, 0, 0, 6);
        }

        @getMagicModuleMeta
        public final ThemeKtExternalSyntheticLambda2 RemoteActionCompatParcelizer(byte[] bArr, MediaType mediaType, int i) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return write(bArr, mediaType, i, 0, 4);
        }
    }
}
