package kotlin;

import android.net.Uri;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import kotlin._deserializeWithNativeTypeId;
import kotlin.reportInvalidBaseType;

/* JADX INFO: loaded from: classes2.dex */
public final class reportInvalidBaseType extends _collectAndResolveByTypeId implements _deserializeWithNativeTypeId {
    private final boolean AudioAttributesCompatParcelizer;
    private final parseTraks<String> AudioAttributesImplApi21Parcelizer;
    private final _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private long IconCompatParcelizer;
    private SubTypeValidator MediaBrowserCompatCustomActionResultReceiver;
    private InputStream MediaBrowserCompatItemReceiver;
    private final boolean MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private final _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private boolean RatingCompat;
    private HttpURLConnection RemoteActionCompatParcelizer;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private long read;
    private final int write;

    /* synthetic */ reportInvalidBaseType(String str, int i, int i2, boolean z, boolean z2, _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, parseTraks parsetraks, boolean z3, byte b) {
        this(str, i, i2, z, z2, mediaBrowserCompatCustomActionResultReceiver, parsetraks, z3);
    }

    public static final class IconCompatParcelizer implements _deserializeWithNativeTypeId.AudioAttributesCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;
        private String AudioAttributesImplApi21Parcelizer;
        private TypeNameIdResolver AudioAttributesImplBaseParcelizer;
        private boolean IconCompatParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private parseTraks<String> write;
        private final _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver RemoteActionCompatParcelizer = new _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver();
        private int read = 8000;
        private int MediaBrowserCompatItemReceiver = 8000;

        public final IconCompatParcelizer IconCompatParcelizer(String str) {
            this.AudioAttributesImplApi21Parcelizer = str;
            return this;
        }

        public final IconCompatParcelizer IconCompatParcelizer(TypeNameIdResolver typeNameIdResolver) {
            this.AudioAttributesImplBaseParcelizer = typeNameIdResolver;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o._deserializeWithNativeTypeId.AudioAttributesCompatParcelizer, o._hasTypeResolver.write
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public reportInvalidBaseType write() {
            reportInvalidBaseType reportinvalidbasetype = new reportInvalidBaseType(this.AudioAttributesImplApi21Parcelizer, this.read, this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.MediaBrowserCompatCustomActionResultReceiver, (byte) 0);
            TypeNameIdResolver typeNameIdResolver = this.AudioAttributesImplBaseParcelizer;
            if (typeNameIdResolver != null) {
                reportinvalidbasetype.read(typeNameIdResolver);
            }
            return reportinvalidbasetype;
        }
    }

    private reportInvalidBaseType(String str, int i, int i2, boolean z, boolean z2, _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, parseTraks<String> parsetraks, boolean z3) {
        super(true);
        this.handleMediaPlayPauseIfPendingOnHandler = str;
        this.write = i;
        this.MediaMetadataCompat = i2;
        this.AudioAttributesCompatParcelizer = z;
        this.AudioAttributesImplBaseParcelizer = z2;
        if (z && z2) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.AudioAttributesImplApi26Parcelizer = mediaBrowserCompatCustomActionResultReceiver;
        this.AudioAttributesImplApi21Parcelizer = parsetraks;
        this.MediaDescriptionCompat = new _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver();
        this.MediaBrowserCompatMediaItem = z3;
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        HttpURLConnection httpURLConnection = this.RemoteActionCompatParcelizer;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // kotlin._hasTypeResolver
    public final Map<String, List<String>> read() {
        if (this.RemoteActionCompatParcelizer == null) {
            return onMoovContainerAtomRead.AudioAttributesCompatParcelizer();
        }
        return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.getHeaderFields());
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws _deserializeWithNativeTypeId.read {
        byte[] bArrAudioAttributesCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = subTypeValidator;
        long j = 0;
        this.read = 0L;
        this.IconCompatParcelizer = 0L;
        write();
        try {
            HttpURLConnection httpURLConnection = read(subTypeValidator);
            this.RemoteActionCompatParcelizer = httpURLConnection;
            this.MediaBrowserCompatSearchResultReceiver = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            int i = this.MediaBrowserCompatSearchResultReceiver;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (this.MediaBrowserCompatSearchResultReceiver == 416) {
                    if (subTypeValidator.AudioAttributesImplApi21Parcelizer == baseTypeName.RemoteActionCompatParcelizer(httpURLConnection.getHeaderField("Content-Range"))) {
                        this.RatingCompat = true;
                        IconCompatParcelizer(subTypeValidator);
                        if (subTypeValidator.MediaBrowserCompatCustomActionResultReceiver != -1) {
                            return subTypeValidator.MediaBrowserCompatCustomActionResultReceiver;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    bArrAudioAttributesCompatParcelizer = errorStream != null ? resetFragmentInfo.AudioAttributesCompatParcelizer(errorStream) : LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
                } catch (IOException unused) {
                    bArrAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
                }
                byte[] bArr = bArrAudioAttributesCompatParcelizer;
                MediaBrowserCompatCustomActionResultReceiver();
                throw new _deserializeWithNativeTypeId.write(this.MediaBrowserCompatSearchResultReceiver, responseMessage, this.MediaBrowserCompatSearchResultReceiver == 416 ? new idResolver(2008) : null, headerFields, subTypeValidator, bArr);
            }
            String contentType = httpURLConnection.getContentType();
            parseTraks<String> parsetraks = this.AudioAttributesImplApi21Parcelizer;
            if (parsetraks != null && !parsetraks.apply(contentType)) {
                MediaBrowserCompatCustomActionResultReceiver();
                throw new _deserializeWithNativeTypeId.RemoteActionCompatParcelizer(contentType, subTypeValidator);
            }
            if (this.MediaBrowserCompatSearchResultReceiver == 200 && subTypeValidator.AudioAttributesImplApi21Parcelizer != 0) {
                j = subTypeValidator.AudioAttributesImplApi21Parcelizer;
            }
            boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(httpURLConnection);
            if (zRemoteActionCompatParcelizer || subTypeValidator.MediaBrowserCompatCustomActionResultReceiver != -1) {
                this.IconCompatParcelizer = subTypeValidator.MediaBrowserCompatCustomActionResultReceiver;
            } else {
                long j2 = baseTypeName.read(httpURLConnection.getHeaderField(RtspHeaders.CONTENT_LENGTH), httpURLConnection.getHeaderField("Content-Range"));
                this.IconCompatParcelizer = j2 != -1 ? j2 - j : -1L;
            }
            try {
                this.MediaBrowserCompatItemReceiver = httpURLConnection.getInputStream();
                if (zRemoteActionCompatParcelizer) {
                    this.MediaBrowserCompatItemReceiver = new GZIPInputStream(this.MediaBrowserCompatItemReceiver);
                }
                this.RatingCompat = true;
                IconCompatParcelizer(subTypeValidator);
                try {
                    RemoteActionCompatParcelizer(j, subTypeValidator);
                    return this.IconCompatParcelizer;
                } catch (IOException e) {
                    MediaBrowserCompatCustomActionResultReceiver();
                    if (e instanceof _deserializeWithNativeTypeId.read) {
                        throw ((_deserializeWithNativeTypeId.read) e);
                    }
                    throw new _deserializeWithNativeTypeId.read(e, subTypeValidator, 2000, 1);
                }
            } catch (IOException e2) {
                MediaBrowserCompatCustomActionResultReceiver();
                throw new _deserializeWithNativeTypeId.read(e2, subTypeValidator, 2000, 1);
            }
        } catch (IOException e3) {
            MediaBrowserCompatCustomActionResultReceiver();
            throw _deserializeWithNativeTypeId.read.IconCompatParcelizer(e3, subTypeValidator, 1);
        }
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws _deserializeWithNativeTypeId.read {
        try {
            return RemoteActionCompatParcelizer(bArr, i, i2);
        } catch (IOException e) {
            throw _deserializeWithNativeTypeId.read.IconCompatParcelizer(e, (SubTypeValidator) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver), 2);
        }
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() throws _deserializeWithNativeTypeId.read {
        try {
            InputStream inputStream = this.MediaBrowserCompatItemReceiver;
            if (inputStream != null) {
                long j = this.IconCompatParcelizer;
                IconCompatParcelizer(this.RemoteActionCompatParcelizer, j != -1 ? j - this.read : -1L);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new _deserializeWithNativeTypeId.read(e, (SubTypeValidator) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver), 2000, 3);
                }
            }
        } finally {
            this.MediaBrowserCompatItemReceiver = null;
            MediaBrowserCompatCustomActionResultReceiver();
            if (this.RatingCompat) {
                this.RatingCompat = false;
                RemoteActionCompatParcelizer();
            }
        }
    }

    private HttpURLConnection read(SubTypeValidator subTypeValidator) throws IOException {
        HttpURLConnection httpURLConnectionIconCompatParcelizer;
        URL url = new URL(subTypeValidator.AudioAttributesImplBaseParcelizer.toString());
        int i = subTypeValidator.AudioAttributesCompatParcelizer;
        byte[] bArr = subTypeValidator.IconCompatParcelizer;
        long j = subTypeValidator.AudioAttributesImplApi21Parcelizer;
        long j2 = subTypeValidator.MediaBrowserCompatCustomActionResultReceiver;
        boolean z = subTypeValidator.read(1);
        if (!this.AudioAttributesCompatParcelizer && !this.AudioAttributesImplBaseParcelizer && !this.MediaBrowserCompatMediaItem) {
            return IconCompatParcelizer(url, i, bArr, j, j2, z, true, subTypeValidator.MediaBrowserCompatItemReceiver);
        }
        int i2 = 0;
        URL urlWrite = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        while (true) {
            int i4 = i2 + 1;
            if (i2 <= 20) {
                long j3 = j;
                long j4 = j;
                int i5 = i3;
                URL url2 = urlWrite;
                long j5 = j2;
                httpURLConnectionIconCompatParcelizer = IconCompatParcelizer(urlWrite, i3, bArr2, j3, j2, z, false, subTypeValidator.MediaBrowserCompatItemReceiver);
                int responseCode = httpURLConnectionIconCompatParcelizer.getResponseCode();
                String headerField = httpURLConnectionIconCompatParcelizer.getHeaderField(RtspHeaders.LOCATION);
                if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    httpURLConnectionIconCompatParcelizer.disconnect();
                    urlWrite = write(url2, headerField, subTypeValidator);
                    i3 = i5;
                } else {
                    if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    httpURLConnectionIconCompatParcelizer.disconnect();
                    if (this.MediaBrowserCompatMediaItem && responseCode == 302) {
                        i3 = i5;
                    } else {
                        bArr2 = null;
                        i3 = 1;
                    }
                    urlWrite = write(url2, headerField, subTypeValidator);
                }
                i2 = i4;
                j = j4;
                j2 = j5;
            } else {
                throw new _deserializeWithNativeTypeId.read(new NoRouteToHostException("Too many redirects: ".concat(String.valueOf(i4))), subTypeValidator, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
            }
        }
        return httpURLConnectionIconCompatParcelizer;
    }

    private HttpURLConnection IconCompatParcelizer(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionWrite = write(url);
        httpURLConnectionWrite.setConnectTimeout(this.write);
        httpURLConnectionWrite.setReadTimeout(this.MediaMetadataCompat);
        HashMap map2 = new HashMap();
        _deserializeWithNativeTypeId.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi26Parcelizer;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            map2.putAll(mediaBrowserCompatCustomActionResultReceiver.write());
        }
        map2.putAll(this.MediaDescriptionCompat.write());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionWrite.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strIconCompatParcelizer = baseTypeName.IconCompatParcelizer(j, j2);
        if (strIconCompatParcelizer != null) {
            httpURLConnectionWrite.setRequestProperty(RtspHeaders.RANGE, strIconCompatParcelizer);
        }
        String str = this.handleMediaPlayPauseIfPendingOnHandler;
        if (str != null) {
            httpURLConnectionWrite.setRequestProperty(RtspHeaders.USER_AGENT, str);
        }
        httpURLConnectionWrite.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnectionWrite.setInstanceFollowRedirects(z2);
        httpURLConnectionWrite.setDoOutput(bArr != null);
        httpURLConnectionWrite.setRequestMethod(SubTypeValidator.AudioAttributesCompatParcelizer(i));
        if (bArr != null) {
            httpURLConnectionWrite.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionWrite.connect();
            OutputStream outputStream = httpURLConnectionWrite.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnectionWrite;
        }
        httpURLConnectionWrite.connect();
        return httpURLConnectionWrite;
    }

    private static HttpURLConnection write(URL url) throws IOException {
        return (HttpURLConnection) ((URLConnection) getAvcProfileAndLevel.read(url.openConnection()));
    }

    private URL write(URL url, String str, SubTypeValidator subTypeValidator) throws _deserializeWithNativeTypeId.read {
        if (str == null) {
            throw new _deserializeWithNativeTypeId.read("Null location redirect", subTypeValidator, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new _deserializeWithNativeTypeId.read("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), subTypeValidator, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
            }
            if (this.AudioAttributesCompatParcelizer || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (!this.AudioAttributesImplBaseParcelizer) {
                StringBuilder sb = new StringBuilder("Disallowed cross-protocol redirect (");
                sb.append(url.getProtocol());
                sb.append(" to ");
                sb.append(protocol);
                sb.append(")");
                throw new _deserializeWithNativeTypeId.read(sb.toString(), subTypeValidator, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
            }
            try {
                return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
            } catch (MalformedURLException e) {
                throw new _deserializeWithNativeTypeId.read(e, subTypeValidator, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
            }
        } catch (MalformedURLException e2) {
            throw new _deserializeWithNativeTypeId.read(e2, subTypeValidator, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        }
    }

    private void RemoteActionCompatParcelizer(long j, SubTypeValidator subTypeValidator) throws IOException {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                int i = ((InputStream) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver)).read(bArr, 0, (int) Math.min(j, 4096L));
                if (Thread.currentThread().isInterrupted()) {
                    throw new _deserializeWithNativeTypeId.read(new InterruptedIOException(), subTypeValidator, 2000, 1);
                }
                if (i == -1) {
                    throw new _deserializeWithNativeTypeId.read(subTypeValidator, 2008);
                }
                j -= (long) i;
                AudioAttributesCompatParcelizer(i);
            }
        }
    }

    private int RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.IconCompatParcelizer;
        if (j != -1) {
            long j2 = j - this.read;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.read += (long) i3;
        AudioAttributesCompatParcelizer(i3);
        return i3;
    }

    private static void IconCompatParcelizer(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection == null || LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) buildTypeSerializer.IconCompatParcelizer(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        HttpURLConnection httpURLConnection = this.RemoteActionCompatParcelizer;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                prune.read("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.RemoteActionCompatParcelizer = null;
        }
    }

    private static boolean RemoteActionCompatParcelizer(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(RtspHeaders.CONTENT_ENCODING));
    }

    static class RemoteActionCompatParcelizer extends FragmentedMp4Extractor<String, List<String>> {
        private final Map<String, List<String>> RemoteActionCompatParcelizer;

        static /* synthetic */ boolean IconCompatParcelizer(String str) {
            return str != null;
        }

        public RemoteActionCompatParcelizer(Map<String, List<String>> map) {
            this.RemoteActionCompatParcelizer = map;
        }

        @Override // kotlin.FragmentedMp4Extractor, kotlin.getDrmInitDataFromAtoms
        public final Map<String, List<String>> delegate() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.FragmentedMp4Extractor, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.FragmentedMp4Extractor, java.util.Map
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // kotlin.FragmentedMp4Extractor, java.util.Map
        public final Set<String> keySet() {
            return modifyTrack.RemoteActionCompatParcelizer(super.keySet(), new parseTraks() { // from class: o._findDeserializer
                @Override // kotlin.parseTraks
                public final boolean apply(Object obj) {
                    return reportInvalidBaseType.RemoteActionCompatParcelizer.IconCompatParcelizer((String) obj);
                }
            });
        }

        static /* synthetic */ boolean write(Map.Entry entry) {
            return entry.getKey() != null;
        }

        @Override // kotlin.FragmentedMp4Extractor, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return modifyTrack.RemoteActionCompatParcelizer(super.entrySet(), new parseTraks() { // from class: o._handleMissingTypeId
                @Override // kotlin.parseTraks
                public final boolean apply(Object obj) {
                    return reportInvalidBaseType.RemoteActionCompatParcelizer.write((Map.Entry) obj);
                }
            });
        }

        @Override // kotlin.FragmentedMp4Extractor, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // kotlin.FragmentedMp4Extractor, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // kotlin.FragmentedMp4Extractor, java.util.Map
        public final boolean containsValue(Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // kotlin.FragmentedMp4Extractor, java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // kotlin.FragmentedMp4Extractor, java.util.Map
        public final int hashCode() {
            return super.standardHashCode();
        }
    }
}
