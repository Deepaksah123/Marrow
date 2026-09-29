package kotlin;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class setMaxPlaybackSpeed implements onVolumeChanged {
    private String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private URL AudioAttributesImplBaseParcelizer;
    private final setMinOffsetMs IconCompatParcelizer;
    private final URL MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private volatile byte[] write;

    public setMaxPlaybackSpeed(URL url) {
        this(url, setMinOffsetMs.RemoteActionCompatParcelizer);
    }

    public setMaxPlaybackSpeed(String str) {
        this(str, setMinOffsetMs.RemoteActionCompatParcelizer);
    }

    private setMaxPlaybackSpeed(URL url, setMinOffsetMs setminoffsetms) {
        this.MediaBrowserCompatItemReceiver = (URL) moveMediaSource.AudioAttributesCompatParcelizer(url);
        this.AudioAttributesImplApi21Parcelizer = null;
        this.IconCompatParcelizer = (setMinOffsetMs) moveMediaSource.AudioAttributesCompatParcelizer(setminoffsetms);
    }

    private setMaxPlaybackSpeed(String str, setMinOffsetMs setminoffsetms) {
        this.MediaBrowserCompatItemReceiver = null;
        this.AudioAttributesImplApi21Parcelizer = moveMediaSource.IconCompatParcelizer(str);
        this.IconCompatParcelizer = (setMinOffsetMs) moveMediaSource.AudioAttributesCompatParcelizer(setminoffsetms);
    }

    public final URL write() throws MalformedURLException {
        return MediaBrowserCompatItemReceiver();
    }

    private URL MediaBrowserCompatItemReceiver() throws MalformedURLException {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = new URL(IconCompatParcelizer());
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String read() {
        return IconCompatParcelizer();
    }

    private String IconCompatParcelizer() {
        if (TextUtils.isEmpty(this.AudioAttributesCompatParcelizer)) {
            String string = this.AudioAttributesImplApi21Parcelizer;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) moveMediaSource.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver)).toString();
            }
            this.AudioAttributesCompatParcelizer = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.AudioAttributesCompatParcelizer;
    }

    public final Map<String, String> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private String AudioAttributesImplApi21Parcelizer() {
        String str = this.AudioAttributesImplApi21Parcelizer;
        return str != null ? str : ((URL) moveMediaSource.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver)).toString();
    }

    public String toString() {
        return AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
        messageDigest.update(AudioAttributesCompatParcelizer());
    }

    private byte[] AudioAttributesCompatParcelizer() {
        if (this.write == null) {
            this.write = AudioAttributesImplApi21Parcelizer().getBytes(read);
        }
        return this.write;
    }

    @Override // kotlin.onVolumeChanged
    public boolean equals(Object obj) {
        if (!(obj instanceof setMaxPlaybackSpeed)) {
            return false;
        }
        setMaxPlaybackSpeed setmaxplaybackspeed = (setMaxPlaybackSpeed) obj;
        return AudioAttributesImplApi21Parcelizer().equals(setmaxplaybackspeed.AudioAttributesImplApi21Parcelizer()) && this.IconCompatParcelizer.equals(setmaxplaybackspeed.IconCompatParcelizer);
    }

    @Override // kotlin.onVolumeChanged
    public int hashCode() {
        if (this.RemoteActionCompatParcelizer == 0) {
            int iHashCode = AudioAttributesImplApi21Parcelizer().hashCode();
            this.RemoteActionCompatParcelizer = iHashCode;
            this.RemoteActionCompatParcelizer = (iHashCode * 31) + this.IconCompatParcelizer.hashCode();
        }
        return this.RemoteActionCompatParcelizer;
    }
}
