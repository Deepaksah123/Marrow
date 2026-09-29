package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class constructSet implements Comparable<constructSet> {
    private static int MediaDescriptionCompat = 1;
    RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    public boolean IconCompatParcelizer;
    public float RemoteActionCompatParcelizer;
    private String handleMediaPlayPauseIfPendingOnHandler;
    public int AudioAttributesCompatParcelizer = -1;
    int read = -1;
    public int MediaBrowserCompatCustomActionResultReceiver = 0;
    public boolean write = false;
    float[] AudioAttributesImplApi21Parcelizer = new float[9];
    float[] AudioAttributesImplBaseParcelizer = new float[9];
    private _fromString[] RatingCompat = new _fromString[16];
    private int MediaBrowserCompatMediaItem = 0;
    public int MediaMetadataCompat = 0;
    boolean MediaBrowserCompatItemReceiver = false;
    private int onCustomAction = -1;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = BitmapDescriptorFactory.HUE_RED;
    private HashSet<_fromString> MediaBrowserCompatSearchResultReceiver = null;

    public enum RemoteActionCompatParcelizer {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    static void write() {
        MediaDescriptionCompat++;
    }

    public constructSet(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
    }

    public final void read(_fromString _fromstring) {
        int i = 0;
        while (true) {
            int i2 = this.MediaBrowserCompatMediaItem;
            if (i < i2) {
                if (this.RatingCompat[i] == _fromstring) {
                    return;
                } else {
                    i++;
                }
            } else {
                _fromString[] _fromstringArr = this.RatingCompat;
                if (i2 >= _fromstringArr.length) {
                    this.RatingCompat = (_fromString[]) Arrays.copyOf(_fromstringArr, _fromstringArr.length << 1);
                }
                _fromString[] _fromstringArr2 = this.RatingCompat;
                int i3 = this.MediaBrowserCompatMediaItem;
                _fromstringArr2[i3] = _fromstring;
                this.MediaBrowserCompatMediaItem = i3 + 1;
                return;
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(_fromString _fromstring) {
        int i = this.MediaBrowserCompatMediaItem;
        int i2 = 0;
        while (i2 < i) {
            if (this.RatingCompat[i2] == _fromstring) {
                while (i2 < i - 1) {
                    _fromString[] _fromstringArr = this.RatingCompat;
                    int i3 = i2 + 1;
                    _fromstringArr[i2] = _fromstringArr[i3];
                    i2 = i3;
                }
                this.MediaBrowserCompatMediaItem--;
                return;
            }
            i2++;
        }
    }

    public final void IconCompatParcelizer(_getToStringLookup _gettostringlookup, _fromString _fromstring) {
        int i = this.MediaBrowserCompatMediaItem;
        for (int i2 = 0; i2 < i; i2++) {
            this.RatingCompat[i2].write(_gettostringlookup, _fromstring, false);
        }
        this.MediaBrowserCompatMediaItem = 0;
    }

    public final void RemoteActionCompatParcelizer(_getToStringLookup _gettostringlookup, float f) {
        this.RemoteActionCompatParcelizer = f;
        this.write = true;
        this.MediaBrowserCompatItemReceiver = false;
        this.onCustomAction = -1;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = BitmapDescriptorFactory.HUE_RED;
        int i = this.MediaBrowserCompatMediaItem;
        this.read = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.RatingCompat[i2].RemoteActionCompatParcelizer(_gettostringlookup, this, false);
        }
        this.MediaBrowserCompatMediaItem = 0;
    }

    public final void IconCompatParcelizer() {
        this.handleMediaPlayPauseIfPendingOnHandler = null;
        this.AudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer.UNKNOWN;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesCompatParcelizer = -1;
        this.read = -1;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.write = false;
        this.MediaBrowserCompatItemReceiver = false;
        this.onCustomAction = -1;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = BitmapDescriptorFactory.HUE_RED;
        int i = this.MediaBrowserCompatMediaItem;
        for (int i2 = 0; i2 < i; i2++) {
            this.RatingCompat[i2] = null;
        }
        this.MediaBrowserCompatMediaItem = 0;
        this.MediaMetadataCompat = 0;
        this.IconCompatParcelizer = false;
        Arrays.fill(this.AudioAttributesImplBaseParcelizer, BitmapDescriptorFactory.HUE_RED);
    }

    public final void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public int compareTo(constructSet constructset) {
        return this.AudioAttributesCompatParcelizer - constructset.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }
}
