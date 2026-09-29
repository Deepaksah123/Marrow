package kotlin;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class getCodecProfileAndLevel extends HttpsURLConnection {
    private final HttpsURLConnection AudioAttributesCompatParcelizer;
    private final getDecryptOnlyDecoderInfo RemoteActionCompatParcelizer;

    getCodecProfileAndLevel(HttpsURLConnection httpsURLConnection, Timer timer, avcLevelToMaxFrameSize avcleveltomaxframesize) {
        super(httpsURLConnection.getURL());
        this.AudioAttributesCompatParcelizer = httpsURLConnection;
        this.RemoteActionCompatParcelizer = new getDecryptOnlyDecoderInfo(httpsURLConnection, timer, avcleveltomaxframesize);
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // java.net.URLConnection
    public final Object getContent() throws IOException {
        return this.RemoteActionCompatParcelizer.write();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) throws IOException {
        return this.RemoteActionCompatParcelizer.write(clsArr);
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        return this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        return this.RemoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws IOException {
        return this.RemoteActionCompatParcelizer.onPlay();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        return this.RemoteActionCompatParcelizer.onFastForward();
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() throws IOException {
        return this.RemoteActionCompatParcelizer.onPrepareFromSearch();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() throws IOException {
        return this.RemoteActionCompatParcelizer.onPlayFromSearch();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str, i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str, j);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(i);
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        return this.RemoteActionCompatParcelizer.onCommand();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.RemoteActionCompatParcelizer.write(str, str2);
    }

    public final boolean equals(Object obj) {
        return this.RemoteActionCompatParcelizer.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.RemoteActionCompatParcelizer.read();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.RemoteActionCompatParcelizer.MediaMetadataCompat();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.RemoteActionCompatParcelizer.RatingCompat();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.RemoteActionCompatParcelizer.MediaDescriptionCompat();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.RemoteActionCompatParcelizer.onCustomAction();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.RemoteActionCompatParcelizer.onAddQueueItem();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.RemoteActionCompatParcelizer.onMediaButtonEvent();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.RemoteActionCompatParcelizer.onPause();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        return this.RemoteActionCompatParcelizer.onPlayFromMediaId();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.RemoteActionCompatParcelizer.read(str);
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.RemoteActionCompatParcelizer.onPrepareFromMediaId();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.RemoteActionCompatParcelizer.onPlayFromUri();
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.RemoteActionCompatParcelizer.write(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.RemoteActionCompatParcelizer.write(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.RemoteActionCompatParcelizer.read(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.RemoteActionCompatParcelizer.read(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.RemoteActionCompatParcelizer.read(j);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.RemoteActionCompatParcelizer.write(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.RemoteActionCompatParcelizer.write(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.RemoteActionCompatParcelizer.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.RemoteActionCompatParcelizer.onPrepare();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.AudioAttributesCompatParcelizer.getCipherSuite();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.AudioAttributesCompatParcelizer.getHostnameVerifier();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.AudioAttributesCompatParcelizer.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.AudioAttributesCompatParcelizer.getLocalPrincipal();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.AudioAttributesCompatParcelizer.getPeerPrincipal();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.AudioAttributesCompatParcelizer.getServerCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.AudioAttributesCompatParcelizer.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.AudioAttributesCompatParcelizer.setHostnameVerifier(hostnameVerifier);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.AudioAttributesCompatParcelizer.setSSLSocketFactory(sSLSocketFactory);
    }
}
