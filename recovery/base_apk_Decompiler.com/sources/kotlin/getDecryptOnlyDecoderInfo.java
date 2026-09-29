package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class getDecryptOnlyDecoderInfo {
    private final HttpURLConnection AudioAttributesCompatParcelizer;
    private final avcLevelToMaxFrameSize RemoteActionCompatParcelizer;
    private final Timer write;
    private long read = -1;
    private long IconCompatParcelizer = -1;

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    public getDecryptOnlyDecoderInfo(HttpURLConnection httpURLConnection, Timer timer, avcLevelToMaxFrameSize avcleveltomaxframesize) {
        this.AudioAttributesCompatParcelizer = httpURLConnection;
        this.RemoteActionCompatParcelizer = avcleveltomaxframesize;
        this.write = timer;
        avcleveltomaxframesize.IconCompatParcelizer(httpURLConnection.getURL().toString());
    }

    public final void IconCompatParcelizer() throws IOException {
        if (this.read == -1) {
            this.write.IconCompatParcelizer();
            long jWrite = this.write.write();
            this.read = jWrite;
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(jWrite);
        }
        try {
            this.AudioAttributesCompatParcelizer.connect();
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.RemoteActionCompatParcelizer);
            throw e;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        this.AudioAttributesCompatParcelizer.disconnect();
    }

    public final Object write() throws IOException {
        onRemoveQueueItem();
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getResponseCode());
        try {
            Object content = this.AudioAttributesCompatParcelizer.getContent();
            if (content instanceof InputStream) {
                this.RemoteActionCompatParcelizer.read(this.AudioAttributesCompatParcelizer.getContentType());
                return new getAlternativeDecoderInfos((InputStream) content, this.RemoteActionCompatParcelizer, this.write);
            }
            this.RemoteActionCompatParcelizer.read(this.AudioAttributesCompatParcelizer.getContentType());
            this.RemoteActionCompatParcelizer.read(this.AudioAttributesCompatParcelizer.getContentLength());
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            return content;
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.RemoteActionCompatParcelizer);
            throw e;
        }
    }

    public final Object write(Class[] clsArr) throws IOException {
        onRemoveQueueItem();
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getResponseCode());
        try {
            Object content = this.AudioAttributesCompatParcelizer.getContent(clsArr);
            if (content instanceof InputStream) {
                this.RemoteActionCompatParcelizer.read(this.AudioAttributesCompatParcelizer.getContentType());
                return new getAlternativeDecoderInfos((InputStream) content, this.RemoteActionCompatParcelizer, this.write);
            }
            this.RemoteActionCompatParcelizer.read(this.AudioAttributesCompatParcelizer.getContentType());
            this.RemoteActionCompatParcelizer.read(this.AudioAttributesCompatParcelizer.getContentLength());
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            return content;
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.RemoteActionCompatParcelizer);
            throw e;
        }
    }

    public final InputStream MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException {
        onRemoveQueueItem();
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getResponseCode());
        this.RemoteActionCompatParcelizer.read(this.AudioAttributesCompatParcelizer.getContentType());
        try {
            InputStream inputStream = this.AudioAttributesCompatParcelizer.getInputStream();
            return inputStream != null ? new getAlternativeDecoderInfos(inputStream, this.RemoteActionCompatParcelizer, this.write) : inputStream;
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.RemoteActionCompatParcelizer);
            throw e;
        }
    }

    public final long handleMediaPlayPauseIfPendingOnHandler() {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getLastModified();
    }

    public final OutputStream onPlay() throws IOException {
        try {
            OutputStream outputStream = this.AudioAttributesCompatParcelizer.getOutputStream();
            return outputStream != null ? new getCodecMimeType(outputStream, this.RemoteActionCompatParcelizer, this.write) : outputStream;
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.RemoteActionCompatParcelizer);
            throw e;
        }
    }

    public final Permission onFastForward() throws IOException {
        try {
            return this.AudioAttributesCompatParcelizer.getPermission();
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.RemoteActionCompatParcelizer);
            throw e;
        }
    }

    public final int onPrepareFromSearch() throws IOException {
        onRemoveQueueItem();
        if (this.IconCompatParcelizer == -1) {
            long jAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
            this.IconCompatParcelizer = jAudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(jAudioAttributesCompatParcelizer);
        }
        try {
            int responseCode = this.AudioAttributesCompatParcelizer.getResponseCode();
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.RemoteActionCompatParcelizer);
            throw e;
        }
    }

    public final String onPlayFromSearch() throws IOException {
        onRemoveQueueItem();
        if (this.IconCompatParcelizer == -1) {
            long jAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
            this.IconCompatParcelizer = jAudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(jAudioAttributesCompatParcelizer);
        }
        try {
            String responseMessage = this.AudioAttributesCompatParcelizer.getResponseMessage();
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.RemoteActionCompatParcelizer);
            throw e;
        }
    }

    public final long MediaBrowserCompatSearchResultReceiver() {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getExpiration();
    }

    public final String RemoteActionCompatParcelizer(int i) {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getHeaderField(i);
    }

    public final String RemoteActionCompatParcelizer(String str) {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getHeaderField(str);
    }

    public final long RemoteActionCompatParcelizer(String str, long j) {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getHeaderFieldDate(str, j);
    }

    public final int AudioAttributesCompatParcelizer(String str, int i) {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getHeaderFieldInt(str, i);
    }

    public final long AudioAttributesCompatParcelizer(String str, long j) {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getHeaderFieldLong(str, j);
    }

    public final String IconCompatParcelizer(int i) {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getHeaderFieldKey(i);
    }

    public final Map<String, List<String>> onCommand() {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getHeaderFields();
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getContentEncoding();
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getContentLength();
    }

    public final long AudioAttributesImplBaseParcelizer() {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getContentLengthLong();
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getContentType();
    }

    public final long MediaBrowserCompatItemReceiver() {
        onRemoveQueueItem();
        return this.AudioAttributesCompatParcelizer.getDate();
    }

    public final void write(String str, String str2) {
        this.AudioAttributesCompatParcelizer.addRequestProperty(str, str2);
    }

    public final boolean equals(Object obj) {
        return this.AudioAttributesCompatParcelizer.equals(obj);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getAllowUserInteraction();
    }

    public final int read() {
        return this.AudioAttributesCompatParcelizer.getConnectTimeout();
    }

    public final boolean MediaMetadataCompat() {
        return this.AudioAttributesCompatParcelizer.getDefaultUseCaches();
    }

    public final boolean RatingCompat() {
        return this.AudioAttributesCompatParcelizer.getDoInput();
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.AudioAttributesCompatParcelizer.getDoOutput();
    }

    public final InputStream MediaDescriptionCompat() {
        onRemoveQueueItem();
        try {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getResponseCode());
        } catch (IOException unused) {
        }
        InputStream errorStream = this.AudioAttributesCompatParcelizer.getErrorStream();
        return errorStream != null ? new getAlternativeDecoderInfos(errorStream, this.RemoteActionCompatParcelizer, this.write) : errorStream;
    }

    public final long onCustomAction() {
        return this.AudioAttributesCompatParcelizer.getIfModifiedSince();
    }

    public final boolean onAddQueueItem() {
        return this.AudioAttributesCompatParcelizer.getInstanceFollowRedirects();
    }

    public final int onMediaButtonEvent() {
        return this.AudioAttributesCompatParcelizer.getReadTimeout();
    }

    public final String onPause() {
        return this.AudioAttributesCompatParcelizer.getRequestMethod();
    }

    public final Map<String, List<String>> onPlayFromMediaId() {
        return this.AudioAttributesCompatParcelizer.getRequestProperties();
    }

    public final String read(String str) {
        return this.AudioAttributesCompatParcelizer.getRequestProperty(str);
    }

    public final URL onPrepareFromMediaId() {
        return this.AudioAttributesCompatParcelizer.getURL();
    }

    public final boolean onPlayFromUri() {
        return this.AudioAttributesCompatParcelizer.getUseCaches();
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer.setAllowUserInteraction(z);
    }

    public final void write(int i) {
        this.AudioAttributesCompatParcelizer.setChunkedStreamingMode(i);
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer.setConnectTimeout(i);
    }

    public final void write(boolean z) {
        this.AudioAttributesCompatParcelizer.setDefaultUseCaches(z);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer.setDoInput(z);
    }

    public final void read(boolean z) {
        this.AudioAttributesCompatParcelizer.setDoOutput(z);
    }

    public final void read(int i) {
        this.AudioAttributesCompatParcelizer.setFixedLengthStreamingMode(i);
    }

    public final void read(long j) {
        this.AudioAttributesCompatParcelizer.setFixedLengthStreamingMode(j);
    }

    public final void write(long j) {
        this.AudioAttributesCompatParcelizer.setIfModifiedSince(j);
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer.setInstanceFollowRedirects(z);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(int i) {
        this.AudioAttributesCompatParcelizer.setReadTimeout(i);
    }

    public final void write(String str) throws ProtocolException {
        this.AudioAttributesCompatParcelizer.setRequestMethod(str);
    }

    public final void IconCompatParcelizer(String str, String str2) {
        if (RtspHeaders.USER_AGENT.equalsIgnoreCase(str)) {
            this.RemoteActionCompatParcelizer.write(str2);
        }
        this.AudioAttributesCompatParcelizer.setRequestProperty(str, str2);
    }

    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer.setUseCaches(z);
    }

    public final String toString() {
        return this.AudioAttributesCompatParcelizer.toString();
    }

    public final boolean onPrepare() {
        return this.AudioAttributesCompatParcelizer.usingProxy();
    }

    private void onRemoveQueueItem() {
        if (this.read == -1) {
            this.write.IconCompatParcelizer();
            long jWrite = this.write.write();
            this.read = jWrite;
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(jWrite);
        }
        String strOnPause = onPause();
        if (strOnPause != null) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(strOnPause);
        } else if (MediaBrowserCompatMediaItem()) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("POST");
        } else {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("GET");
        }
    }
}
