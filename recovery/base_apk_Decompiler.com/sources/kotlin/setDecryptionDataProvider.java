package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.MarrowTheme;
import kotlin.Metadata;
import kotlin.SettingsItem;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\b\u0010B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168\u0006@GX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b"}, d2 = {"Lo/setDecryptionDataProvider;", "Lo/MarrowTheme;", "Lo/setDecryptionDataProvider$read;", "p0", "<init>", "(Lo/setDecryptionDataProvider$read;)V", "Lo/ShapeKt;", "", "AudioAttributesCompatParcelizer", "(Lo/ShapeKt;)Z", "Lo/MarrowTheme$AudioAttributesCompatParcelizer;", "Lo/TypeKt;", "(Lo/MarrowTheme$AudioAttributesCompatParcelizer;)Lo/TypeKt;", "", "p1", "", "read", "(Lo/ShapeKt;I)V", "", "", "IconCompatParcelizer", "Ljava/util/Set;", "Lo/setDecryptionDataProvider$AudioAttributesCompatParcelizer;", "Lo/setDecryptionDataProvider$AudioAttributesCompatParcelizer;", "write", "(Lo/setDecryptionDataProvider$AudioAttributesCompatParcelizer;)V", "RemoteActionCompatParcelizer", "Lo/setDecryptionDataProvider$read;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class setDecryptionDataProvider implements MarrowTheme {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final read read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private volatile Set<String> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private volatile AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/setDecryptionDataProvider$AudioAttributesCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write", "read"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum AudioAttributesCompatParcelizer {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    private setDecryptionDataProvider(read readVar) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        this.read = readVar;
        this.AudioAttributesCompatParcelizer = getKycMessage.read();
        this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer.NONE;
    }

    public /* synthetic */ setDecryptionDataProvider(read readVar, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? read.read : readVar);
    }

    public final void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setDecryptionDataProvider$read;", "", "", "p0", "", "IconCompatParcelizer", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface read {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.IconCompatParcelizer;
        public static final read read = new Companion.AudioAttributesCompatParcelizer();

        void IconCompatParcelizer(String p0);

        /* JADX INFO: renamed from: o.setDecryptionDataProvider$read$IconCompatParcelizer, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion IconCompatParcelizer = new Companion();

            private Companion() {
            }

            /* JADX INFO: renamed from: o.setDecryptionDataProvider$read$IconCompatParcelizer$AudioAttributesCompatParcelizer */
            static final class AudioAttributesCompatParcelizer implements read {
                @Override // o.setDecryptionDataProvider.read
                public final void IconCompatParcelizer(String str) {
                    toMagicModuleMetaRepoModel.write(str, "");
                    SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                    SettingsItem.IconCompatParcelizer.write();
                    SettingsItem.RemoteActionCompatParcelizer(str, 0, 6);
                }
            }
        }
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer p0) throws Exception {
        String string;
        String string2;
        Charset charset;
        Long lValueOf;
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0IconCompatParcelizer = p0.IconCompatParcelizer();
        if (audioAttributesCompatParcelizer == AudioAttributesCompatParcelizer.NONE) {
            return p0.RemoteActionCompatParcelizer(themeKtExternalSyntheticLambda0IconCompatParcelizer);
        }
        boolean z = audioAttributesCompatParcelizer == AudioAttributesCompatParcelizer.BODY;
        boolean z2 = z || audioAttributesCompatParcelizer == AudioAttributesCompatParcelizer.HEADERS;
        ThemeKtExternalSyntheticLambda2 body = themeKtExternalSyntheticLambda0IconCompatParcelizer.getBody();
        UserLoggedOutException userLoggedOutExceptionRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(themeKtExternalSyntheticLambda0IconCompatParcelizer.getMethod());
        sb.append(' ');
        sb.append(themeKtExternalSyntheticLambda0IconCompatParcelizer.getUrl());
        sb.append(userLoggedOutExceptionRemoteActionCompatParcelizer != null ? toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(" ", (Object) userLoggedOutExceptionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) : "");
        String string3 = sb.toString();
        if (!z2 && body != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string3);
            sb2.append(" (");
            sb2.append(body.contentLength());
            sb2.append("-byte body)");
            string3 = sb2.toString();
        }
        this.read.IconCompatParcelizer(string3);
        if (z2) {
            ShapeKt headers = themeKtExternalSyntheticLambda0IconCompatParcelizer.getHeaders();
            if (body != null) {
                MediaType iconCompatParcelizer = body.getIconCompatParcelizer();
                if (iconCompatParcelizer != null && headers.IconCompatParcelizer(RtspHeaders.CONTENT_TYPE) == null) {
                    this.read.IconCompatParcelizer(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Content-Type: ", (Object) iconCompatParcelizer));
                }
                if (body.contentLength() != -1 && headers.IconCompatParcelizer(RtspHeaders.CONTENT_LENGTH) == null) {
                    this.read.IconCompatParcelizer(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Content-Length: ", (Object) Long.valueOf(body.contentLength())));
                }
            }
            int iIconCompatParcelizer = headers.IconCompatParcelizer();
            for (int i = 0; i < iIconCompatParcelizer; i++) {
                read(headers, i);
            }
            if (!z || body == null) {
                this.read.IconCompatParcelizer(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("--> END ", (Object) themeKtExternalSyntheticLambda0IconCompatParcelizer.getMethod()));
            } else if (AudioAttributesCompatParcelizer(themeKtExternalSyntheticLambda0IconCompatParcelizer.getHeaders())) {
                read readVar = this.read;
                StringBuilder sb3 = new StringBuilder("--> END ");
                sb3.append(themeKtExternalSyntheticLambda0IconCompatParcelizer.getMethod());
                sb3.append(" (encoded body omitted)");
                readVar.IconCompatParcelizer(sb3.toString());
            } else if (body.isDuplex()) {
                read readVar2 = this.read;
                StringBuilder sb4 = new StringBuilder("--> END ");
                sb4.append(themeKtExternalSyntheticLambda0IconCompatParcelizer.getMethod());
                sb4.append(" (duplex request body omitted)");
                readVar2.IconCompatParcelizer(sb4.toString());
            } else if (body.isOneShot()) {
                read readVar3 = this.read;
                StringBuilder sb5 = new StringBuilder("--> END ");
                sb5.append(themeKtExternalSyntheticLambda0IconCompatParcelizer.getMethod());
                sb5.append(" (one-shot body omitted)");
                readVar3.IconCompatParcelizer(sb5.toString());
            } else {
                resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
                body.writeTo(resetcurrentselectedposition);
                MediaType iconCompatParcelizer2 = body.getIconCompatParcelizer();
                Charset charset2 = iconCompatParcelizer2 == null ? null : iconCompatParcelizer2.read(StandardCharsets.UTF_8);
                if (charset2 == null) {
                    charset2 = StandardCharsets.UTF_8;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset2, "");
                }
                this.read.IconCompatParcelizer("");
                if (getDecryptionDataProvider.AudioAttributesCompatParcelizer(resetcurrentselectedposition)) {
                    this.read.IconCompatParcelizer(resetcurrentselectedposition.write(charset2));
                    read readVar4 = this.read;
                    StringBuilder sb6 = new StringBuilder("--> END ");
                    sb6.append(themeKtExternalSyntheticLambda0IconCompatParcelizer.getMethod());
                    sb6.append(" (");
                    sb6.append(body.contentLength());
                    sb6.append("-byte body)");
                    readVar4.IconCompatParcelizer(sb6.toString());
                } else {
                    read readVar5 = this.read;
                    StringBuilder sb7 = new StringBuilder("--> END ");
                    sb7.append(themeKtExternalSyntheticLambda0IconCompatParcelizer.getMethod());
                    sb7.append(" (binary ");
                    sb7.append(body.contentLength());
                    sb7.append("-byte body omitted)");
                    readVar5.IconCompatParcelizer(sb7.toString());
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            C0156TypeKt c0156TypeKtRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer(themeKtExternalSyntheticLambda0IconCompatParcelizer);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ActivityAdapterModule body2 = c0156TypeKtRemoteActionCompatParcelizer.getBody();
            toMagicModuleMetaRepoModel.write(body2);
            long j = body2.read();
            if (j != -1) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(j);
                sb8.append("-byte");
                string = sb8.toString();
            } else {
                string = "unknown-length";
            }
            read readVar6 = this.read;
            StringBuilder sb9 = new StringBuilder("<-- ");
            sb9.append(c0156TypeKtRemoteActionCompatParcelizer.getCode());
            sb9.append(c0156TypeKtRemoteActionCompatParcelizer.getMessage().length() == 0 ? "" : " ".concat(String.valueOf(c0156TypeKtRemoteActionCompatParcelizer.getMessage())));
            sb9.append(' ');
            sb9.append(c0156TypeKtRemoteActionCompatParcelizer.getRequest().getUrl());
            sb9.append(" (");
            sb9.append(millis);
            sb9.append("ms");
            if (z2) {
                string2 = "";
            } else {
                StringBuilder sb10 = new StringBuilder(", ");
                sb10.append(string);
                sb10.append(" body");
                string2 = sb10.toString();
            }
            sb9.append(string2);
            sb9.append(')');
            readVar6.IconCompatParcelizer(sb9.toString());
            if (z2) {
                ShapeKt headers2 = c0156TypeKtRemoteActionCompatParcelizer.getHeaders();
                int iIconCompatParcelizer2 = headers2.IconCompatParcelizer();
                for (int i2 = 0; i2 < iIconCompatParcelizer2; i2++) {
                    read(headers2, i2);
                }
                if (!z || !FragmentProviderModule.write(c0156TypeKtRemoteActionCompatParcelizer)) {
                    this.read.IconCompatParcelizer("<-- END HTTP");
                } else {
                    if (AudioAttributesCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer.getHeaders())) {
                        this.read.IconCompatParcelizer("<-- END HTTP (encoded body omitted)");
                        return c0156TypeKtRemoteActionCompatParcelizer;
                    }
                    LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = body2.AudioAttributesCompatParcelizer();
                    lessonCompletedDialogAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(Long.MAX_VALUE);
                    resetCurrentSelectedPosition resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer = lessonCompletedDialogAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
                    if (TestGroupLSModel.read("gzip", headers2.IconCompatParcelizer(RtspHeaders.CONTENT_ENCODING), true)) {
                        lValueOf = Long.valueOf(resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.getSize());
                        BookReferenceView bookReferenceView = new BookReferenceView(resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.clone());
                        try {
                            resetCurrentSelectedPosition resetcurrentselectedposition2 = new resetCurrentSelectedPosition();
                            resetcurrentselectedposition2.write(bookReferenceView);
                            charset = null;
                            MagicModuleMetaLSModel.IconCompatParcelizer(bookReferenceView, null);
                            resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer = resetcurrentselectedposition2;
                        } finally {
                        }
                    } else {
                        charset = null;
                        lValueOf = null;
                    }
                    MediaType mediaTypeWrite = body2.write();
                    Charset charset3 = mediaTypeWrite != null ? mediaTypeWrite.read(StandardCharsets.UTF_8) : charset;
                    if (charset3 == null) {
                        charset3 = StandardCharsets.UTF_8;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset3, "");
                    }
                    if (!getDecryptionDataProvider.AudioAttributesCompatParcelizer(resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer)) {
                        this.read.IconCompatParcelizer("");
                        read readVar7 = this.read;
                        StringBuilder sb11 = new StringBuilder("<-- END HTTP (binary ");
                        sb11.append(resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.getSize());
                        sb11.append("-byte body omitted)");
                        readVar7.IconCompatParcelizer(sb11.toString());
                        return c0156TypeKtRemoteActionCompatParcelizer;
                    }
                    if (j != 0) {
                        this.read.IconCompatParcelizer("");
                        this.read.IconCompatParcelizer(resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.clone().write(charset3));
                    }
                    if (lValueOf != null) {
                        read readVar8 = this.read;
                        StringBuilder sb12 = new StringBuilder("<-- END HTTP (");
                        sb12.append(resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.getSize());
                        sb12.append("-byte, ");
                        sb12.append(lValueOf);
                        sb12.append("-gzipped-byte body)");
                        readVar8.IconCompatParcelizer(sb12.toString());
                        return c0156TypeKtRemoteActionCompatParcelizer;
                    }
                    read readVar9 = this.read;
                    StringBuilder sb13 = new StringBuilder("<-- END HTTP (");
                    sb13.append(resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.getSize());
                    sb13.append("-byte body)");
                    readVar9.IconCompatParcelizer(sb13.toString());
                    return c0156TypeKtRemoteActionCompatParcelizer;
                }
            }
            return c0156TypeKtRemoteActionCompatParcelizer;
        } catch (Exception e) {
            this.read.IconCompatParcelizer(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("<-- HTTP FAILED: ", (Object) e));
            throw e;
        }
    }

    private final void read(ShapeKt p0, int p1) {
        String strAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.contains(p0.IconCompatParcelizer(p1)) ? "██" : p0.AudioAttributesCompatParcelizer(p1);
        read readVar = this.read;
        StringBuilder sb = new StringBuilder();
        sb.append(p0.IconCompatParcelizer(p1));
        sb.append(": ");
        sb.append(strAudioAttributesCompatParcelizer);
        readVar.IconCompatParcelizer(sb.toString());
    }

    private static boolean AudioAttributesCompatParcelizer(ShapeKt p0) {
        String strIconCompatParcelizer = p0.IconCompatParcelizer(RtspHeaders.CONTENT_ENCODING);
        return (strIconCompatParcelizer == null || TestGroupLSModel.read(strIconCompatParcelizer, "identity", true) || TestGroupLSModel.read(strIconCompatParcelizer, "gzip", true)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setDecryptionDataProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
