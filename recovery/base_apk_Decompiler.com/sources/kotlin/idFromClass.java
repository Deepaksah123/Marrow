package kotlin;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.ThemeKtExternalSyntheticLambda0;
import kotlin._deserializeWithNativeTypeId;
import kotlin.toDownloadInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class idFromClass extends _collectAndResolveByTypeId implements _deserializeWithNativeTypeId {
    private long AudioAttributesCompatParcelizer;
    private C0156TypeKt AudioAttributesImplApi21Parcelizer;
    private SubTypeValidator AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final parseTraks<String> IconCompatParcelizer;
    private final _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver MediaBrowserCompatCustomActionResultReceiver;
    private final _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver MediaBrowserCompatItemReceiver;
    private final String MediaMetadataCompat;
    private InputStream RatingCompat;
    private final toDownloadInfo.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private long read;
    private final getEncryptedLicenseTimeInfo write;

    /* synthetic */ idFromClass(toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str, getEncryptedLicenseTimeInfo getencryptedlicensetimeinfo, _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, parseTraks parsetraks, byte b) {
        this(audioAttributesCompatParcelizer, str, getencryptedlicensetimeinfo, mediaBrowserCompatCustomActionResultReceiver, parsetraks);
    }

    static {
        isSafeSubType.AudioAttributesCompatParcelizer("media3.datasource.okhttp");
    }

    public static final class read implements _deserializeWithNativeTypeId.AudioAttributesCompatParcelizer {
        private final toDownloadInfo.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
        private String AudioAttributesImplApi21Parcelizer;
        private parseTraks<String> IconCompatParcelizer;
        private TypeNameIdResolver RemoteActionCompatParcelizer;
        private getEncryptedLicenseTimeInfo read;
        private final _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver write = new _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver();

        public read(toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o._deserializeWithNativeTypeId.AudioAttributesCompatParcelizer, o._hasTypeResolver.write
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public idFromClass write() {
            return new idFromClass(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, this.read, this.write, this.IconCompatParcelizer, (byte) 0);
        }
    }

    private idFromClass(toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str, getEncryptedLicenseTimeInfo getencryptedlicensetimeinfo, _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, parseTraks<String> parsetraks) {
        super(true);
        this.RemoteActionCompatParcelizer = (toDownloadInfo.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(audioAttributesCompatParcelizer);
        this.MediaMetadataCompat = str;
        this.write = getencryptedlicensetimeinfo;
        this.MediaBrowserCompatItemReceiver = mediaBrowserCompatCustomActionResultReceiver;
        this.IconCompatParcelizer = parsetraks;
        this.MediaBrowserCompatCustomActionResultReceiver = new _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        C0156TypeKt c0156TypeKt = this.AudioAttributesImplApi21Parcelizer;
        if (c0156TypeKt == null) {
            return null;
        }
        return Uri.parse(c0156TypeKt.getRequest().getUrl().toString());
    }

    @Override // kotlin._hasTypeResolver
    public final Map<String, List<String>> read() {
        C0156TypeKt c0156TypeKt = this.AudioAttributesImplApi21Parcelizer;
        return c0156TypeKt == null ? Collections.emptyMap() : c0156TypeKt.getHeaders().read();
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws _deserializeWithNativeTypeId.read {
        byte[] bArrAudioAttributesCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = subTypeValidator;
        long j = 0;
        this.read = 0L;
        this.AudioAttributesCompatParcelizer = 0L;
        write();
        try {
            C0156TypeKt c0156TypeKtRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer(AudioAttributesCompatParcelizer(subTypeValidator)));
            this.AudioAttributesImplApi21Parcelizer = c0156TypeKtRemoteActionCompatParcelizer;
            ActivityAdapterModule activityAdapterModule = (ActivityAdapterModule) buildTypeSerializer.IconCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer.getBody());
            this.RatingCompat = activityAdapterModule.IconCompatParcelizer();
            int code = c0156TypeKtRemoteActionCompatParcelizer.getCode();
            if (!c0156TypeKtRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                if (code == 416) {
                    if (subTypeValidator.AudioAttributesImplApi21Parcelizer == baseTypeName.RemoteActionCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer.getHeaders().IconCompatParcelizer("Content-Range"))) {
                        this.AudioAttributesImplBaseParcelizer = true;
                        IconCompatParcelizer(subTypeValidator);
                        if (subTypeValidator.MediaBrowserCompatCustomActionResultReceiver != -1) {
                            return subTypeValidator.MediaBrowserCompatCustomActionResultReceiver;
                        }
                        return 0L;
                    }
                }
                try {
                    bArrAudioAttributesCompatParcelizer = resetFragmentInfo.AudioAttributesCompatParcelizer((InputStream) buildTypeSerializer.IconCompatParcelizer(this.RatingCompat));
                } catch (IOException unused) {
                    bArrAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
                }
                byte[] bArr = bArrAudioAttributesCompatParcelizer;
                Map<String, List<String>> map = c0156TypeKtRemoteActionCompatParcelizer.getHeaders().read();
                AudioAttributesImplApi26Parcelizer();
                throw new _deserializeWithNativeTypeId.write(code, c0156TypeKtRemoteActionCompatParcelizer.getMessage(), code == 416 ? new idResolver(2008) : null, map, subTypeValidator, bArr);
            }
            MediaType mediaTypeWrite = activityAdapterModule.write();
            String string = mediaTypeWrite != null ? mediaTypeWrite.toString() : "";
            parseTraks<String> parsetraks = this.IconCompatParcelizer;
            if (parsetraks != null && !parsetraks.apply(string)) {
                AudioAttributesImplApi26Parcelizer();
                throw new _deserializeWithNativeTypeId.RemoteActionCompatParcelizer(string, subTypeValidator);
            }
            if (code == 200 && subTypeValidator.AudioAttributesImplApi21Parcelizer != 0) {
                j = subTypeValidator.AudioAttributesImplApi21Parcelizer;
            }
            if (subTypeValidator.MediaBrowserCompatCustomActionResultReceiver != -1) {
                this.AudioAttributesCompatParcelizer = subTypeValidator.MediaBrowserCompatCustomActionResultReceiver;
            } else {
                long j2 = activityAdapterModule.read();
                this.AudioAttributesCompatParcelizer = j2 != -1 ? j2 - j : -1L;
            }
            this.AudioAttributesImplBaseParcelizer = true;
            IconCompatParcelizer(subTypeValidator);
            try {
                IconCompatParcelizer(j, subTypeValidator);
                return this.AudioAttributesCompatParcelizer;
            } catch (_deserializeWithNativeTypeId.read e) {
                AudioAttributesImplApi26Parcelizer();
                throw e;
            }
        } catch (IOException e2) {
            throw _deserializeWithNativeTypeId.read.IconCompatParcelizer(e2, subTypeValidator, 1);
        }
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws _deserializeWithNativeTypeId.read {
        try {
            return write(bArr, i, i2);
        } catch (IOException e) {
            throw _deserializeWithNativeTypeId.read.IconCompatParcelizer(e, (SubTypeValidator) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer), 2);
        }
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplBaseParcelizer = false;
            RemoteActionCompatParcelizer();
            AudioAttributesImplApi26Parcelizer();
        }
    }

    private ThemeKtExternalSyntheticLambda0 AudioAttributesCompatParcelizer(SubTypeValidator subTypeValidator) throws _deserializeWithNativeTypeId.read {
        ThemeKtExternalSyntheticLambda2 themeKtExternalSyntheticLambda2Create;
        long j = subTypeValidator.AudioAttributesImplApi21Parcelizer;
        long j2 = subTypeValidator.MediaBrowserCompatCustomActionResultReceiver;
        ThemeAlphaConstantsKt themeAlphaConstantsKtIconCompatParcelizer = ThemeAlphaConstantsKt.IconCompatParcelizer(subTypeValidator.AudioAttributesImplBaseParcelizer.toString());
        if (themeAlphaConstantsKtIconCompatParcelizer == null) {
            throw new _deserializeWithNativeTypeId.read("Malformed URL", subTypeValidator, 1004);
        }
        ThemeKtExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizerWrite = new ThemeKtExternalSyntheticLambda0.IconCompatParcelizer().write(themeAlphaConstantsKtIconCompatParcelizer);
        getEncryptedLicenseTimeInfo getencryptedlicensetimeinfo = this.write;
        if (getencryptedlicensetimeinfo != null) {
            iconCompatParcelizerWrite.AudioAttributesCompatParcelizer(getencryptedlicensetimeinfo);
        }
        HashMap map = new HashMap();
        _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatItemReceiver;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            map.putAll(mediaBrowserCompatCustomActionResultReceiver.write());
        }
        map.putAll(this.MediaBrowserCompatCustomActionResultReceiver.write());
        map.putAll(subTypeValidator.MediaBrowserCompatItemReceiver);
        for (Map.Entry entry : map.entrySet()) {
            iconCompatParcelizerWrite.AudioAttributesCompatParcelizer((String) entry.getKey(), (String) entry.getValue());
        }
        String strIconCompatParcelizer = baseTypeName.IconCompatParcelizer(j, j2);
        if (strIconCompatParcelizer != null) {
            iconCompatParcelizerWrite.IconCompatParcelizer(RtspHeaders.RANGE, strIconCompatParcelizer);
        }
        String str = this.MediaMetadataCompat;
        if (str != null) {
            iconCompatParcelizerWrite.IconCompatParcelizer(RtspHeaders.USER_AGENT, str);
        }
        if (!subTypeValidator.read(1)) {
            iconCompatParcelizerWrite.IconCompatParcelizer("Accept-Encoding", "identity");
        }
        if (subTypeValidator.IconCompatParcelizer != null) {
            themeKtExternalSyntheticLambda2Create = ThemeKtExternalSyntheticLambda2.create(subTypeValidator.IconCompatParcelizer);
        } else {
            themeKtExternalSyntheticLambda2Create = subTypeValidator.AudioAttributesCompatParcelizer == 2 ? ThemeKtExternalSyntheticLambda2.create(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer) : null;
        }
        iconCompatParcelizerWrite.AudioAttributesCompatParcelizer(subTypeValidator.write(), themeKtExternalSyntheticLambda2Create);
        return iconCompatParcelizerWrite.RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C0156TypeKt RemoteActionCompatParcelizer(toDownloadInfo todownloadinfo) throws IOException {
        final Mp4ExtractorMp4Track mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver = Mp4ExtractorMp4Track.MediaBrowserCompatCustomActionResultReceiver();
        dolbyVisionStringToProfile.read(todownloadinfo, new MarrowVideoDownloadException() { // from class: o.idFromClass.1
            @Override // kotlin.MarrowVideoDownloadException
            public final void read(toDownloadInfo todownloadinfo2, IOException iOException) {
                mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(iOException);
            }

            @Override // kotlin.MarrowVideoDownloadException
            public final void read(toDownloadInfo todownloadinfo2, C0156TypeKt c0156TypeKt) {
                mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver.read(c0156TypeKt);
            }
        });
        try {
            return (C0156TypeKt) mp4ExtractorMp4TrackMediaBrowserCompatCustomActionResultReceiver.get();
        } catch (InterruptedException unused) {
            todownloadinfo.RemoteActionCompatParcelizer();
            throw new InterruptedIOException();
        } catch (ExecutionException e) {
            throw new IOException(e);
        }
    }

    private void IconCompatParcelizer(long j, SubTypeValidator subTypeValidator) throws _deserializeWithNativeTypeId.read {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                try {
                    int i = ((InputStream) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.RatingCompat)).read(bArr, 0, (int) Math.min(j, 4096L));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i == -1) {
                        throw new _deserializeWithNativeTypeId.read(subTypeValidator, 2008);
                    }
                    j -= (long) i;
                    AudioAttributesCompatParcelizer(i);
                } catch (IOException e) {
                    if (e instanceof _deserializeWithNativeTypeId.read) {
                        throw ((_deserializeWithNativeTypeId.read) e);
                    }
                    throw new _deserializeWithNativeTypeId.read(subTypeValidator, 2000);
                }
            }
        }
    }

    private int write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.AudioAttributesCompatParcelizer;
        if (j != -1) {
            long j2 = j - this.read;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.RatingCompat)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.read += (long) i3;
        AudioAttributesCompatParcelizer(i3);
        return i3;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        C0156TypeKt c0156TypeKt = this.AudioAttributesImplApi21Parcelizer;
        if (c0156TypeKt != null) {
            ((ActivityAdapterModule) buildTypeSerializer.IconCompatParcelizer(c0156TypeKt.getBody())).close();
            this.AudioAttributesImplApi21Parcelizer = null;
        }
        this.RatingCompat = null;
    }
}
