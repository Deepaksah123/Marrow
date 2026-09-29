package kotlin;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemAdsConfigurationExternalSyntheticLambda0 implements fromUri<InputStream> {
    private static IconCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer();
    private final IconCompatParcelizer AudioAttributesCompatParcelizer;
    private InputStream IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private HttpURLConnection MediaBrowserCompatItemReceiver;
    private final setMaxPlaybackSpeed read;
    private volatile boolean write;

    interface IconCompatParcelizer {
        HttpURLConnection write(URL url) throws IOException;
    }

    public MediaItemAdsConfigurationExternalSyntheticLambda0(setMaxPlaybackSpeed setmaxplaybackspeed, int i) {
        this(setmaxplaybackspeed, i, RemoteActionCompatParcelizer);
    }

    private MediaItemAdsConfigurationExternalSyntheticLambda0(setMaxPlaybackSpeed setmaxplaybackspeed, int i, IconCompatParcelizer iconCompatParcelizer) {
        this.read = setmaxplaybackspeed;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
    }

    @Override // kotlin.fromUri
    public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super InputStream> audioAttributesCompatParcelizer) {
        long jRemoteActionCompatParcelizer = createTimeline.RemoteActionCompatParcelizer();
        try {
            try {
                audioAttributesCompatParcelizer.write(IconCompatParcelizer(this.read.write(), 0, null, this.read.RemoteActionCompatParcelizer()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    createTimeline.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer);
                }
            } catch (IOException e) {
                audioAttributesCompatParcelizer.IconCompatParcelizer(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    createTimeline.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer);
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                createTimeline.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer);
            }
            throw th;
        }
    }

    private InputStream IconCompatParcelizer(URL url, int i, URL url2, Map<String, String> map) throws onSurfaceSizeChanged {
        if (i >= 5) {
            throw new onSurfaceSizeChanged("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new onSurfaceSizeChanged("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(url, map);
        this.MediaBrowserCompatItemReceiver = httpURLConnectionAudioAttributesCompatParcelizer;
        try {
            httpURLConnectionAudioAttributesCompatParcelizer.connect();
            this.IconCompatParcelizer = this.MediaBrowserCompatItemReceiver.getInputStream();
            if (this.write) {
                return null;
            }
            int iWrite = write(this.MediaBrowserCompatItemReceiver);
            if (RemoteActionCompatParcelizer(iWrite)) {
                return AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
            }
            if (!read(iWrite)) {
                if (iWrite == -1) {
                    throw new onSurfaceSizeChanged(iWrite);
                }
                try {
                    throw new onSurfaceSizeChanged(this.MediaBrowserCompatItemReceiver.getResponseMessage(), iWrite);
                } catch (IOException e) {
                    throw new onSurfaceSizeChanged("Failed to get a response message", iWrite, e);
                }
            }
            String headerField = this.MediaBrowserCompatItemReceiver.getHeaderField(RtspHeaders.LOCATION);
            if (TextUtils.isEmpty(headerField)) {
                throw new onSurfaceSizeChanged("Received empty or null redirect url", iWrite);
            }
            try {
                URL url3 = new URL(url, headerField);
                read();
                return IconCompatParcelizer(url3, i + 1, url, map);
            } catch (MalformedURLException e2) {
                throw new onSurfaceSizeChanged("Bad redirect url: ".concat(String.valueOf(headerField)), iWrite, e2);
            }
        } catch (IOException e3) {
            throw new onSurfaceSizeChanged("Failed to connect or obtain data", write(this.MediaBrowserCompatItemReceiver), e3);
        }
    }

    private static int write(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    private HttpURLConnection AudioAttributesCompatParcelizer(URL url, Map<String, String> map) throws onSurfaceSizeChanged {
        try {
            HttpURLConnection httpURLConnectionWrite = this.AudioAttributesCompatParcelizer.write(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionWrite.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionWrite.setConnectTimeout(this.MediaBrowserCompatCustomActionResultReceiver);
            httpURLConnectionWrite.setReadTimeout(this.MediaBrowserCompatCustomActionResultReceiver);
            httpURLConnectionWrite.setUseCaches(false);
            httpURLConnectionWrite.setDoInput(true);
            httpURLConnectionWrite.setInstanceFollowRedirects(false);
            return httpURLConnectionWrite;
        } catch (IOException e) {
            throw new onSurfaceSizeChanged("URL.openConnection threw", 0, e);
        }
    }

    private static boolean RemoteActionCompatParcelizer(int i) {
        return i / 100 == 2;
    }

    private static boolean read(int i) {
        return i / 100 == 3;
    }

    private InputStream AudioAttributesCompatParcelizer(HttpURLConnection httpURLConnection) throws onSurfaceSizeChanged {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.IconCompatParcelizer = getMediaSourceHolderUid.IconCompatParcelizer(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.IconCompatParcelizer = httpURLConnection.getInputStream();
            }
            return this.IconCompatParcelizer;
        } catch (IOException e) {
            throw new onSurfaceSizeChanged("Failed to obtain InputStream", write(httpURLConnection), e);
        }
    }

    @Override // kotlin.fromUri
    public final void read() {
        InputStream inputStream = this.IconCompatParcelizer;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.MediaBrowserCompatItemReceiver;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.MediaBrowserCompatItemReceiver = null;
    }

    @Override // kotlin.fromUri
    public final void AudioAttributesCompatParcelizer() {
        this.write = true;
    }

    @Override // kotlin.fromUri
    public final Class<InputStream> write() {
        return InputStream.class;
    }

    @Override // kotlin.fromUri
    public final onTracksChanged IconCompatParcelizer() {
        return onTracksChanged.REMOTE;
    }

    static class AudioAttributesCompatParcelizer implements IconCompatParcelizer {
        AudioAttributesCompatParcelizer() {
        }

        @Override // o.MediaItemAdsConfigurationExternalSyntheticLambda0.IconCompatParcelizer
        public final HttpURLConnection write(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) getAvcProfileAndLevel.read(url.openConnection()));
        }
    }
}
