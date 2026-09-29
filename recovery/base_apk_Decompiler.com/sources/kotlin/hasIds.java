package kotlin;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hasIds {
    private int IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private int read;
    private String MediaDescriptionCompat = "";
    private String MediaMetadataCompat = "";
    private Set<String> MediaBrowserCompatMediaItem = Collections.emptySet();
    private String onCustomAction = "";
    private String write = null;
    private boolean MediaBrowserCompatItemReceiver = false;
    private boolean AudioAttributesImplBaseParcelizer = false;
    private int RatingCompat = -1;
    private int onAddQueueItem = -1;
    private int RemoteActionCompatParcelizer = -1;
    private int AudioAttributesImplApi26Parcelizer = -1;
    private int AudioAttributesImplApi21Parcelizer = -1;
    private int MediaBrowserCompatSearchResultReceiver = -1;
    private boolean AudioAttributesCompatParcelizer = false;

    public final void RemoteActionCompatParcelizer(String str) {
        this.MediaDescriptionCompat = str;
    }

    public final void write(String str) {
        this.MediaMetadataCompat = str;
    }

    public final void AudioAttributesCompatParcelizer(String[] strArr) {
        this.MediaBrowserCompatMediaItem = new HashSet(Arrays.asList(strArr));
    }

    public final void read(String str) {
        this.onCustomAction = str;
    }

    public final int AudioAttributesCompatParcelizer(String str, String str2, Set<String> set, String str3) {
        if (this.MediaDescriptionCompat.isEmpty() && this.MediaMetadataCompat.isEmpty() && this.MediaBrowserCompatMediaItem.isEmpty() && this.onCustomAction.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iIconCompatParcelizer = IconCompatParcelizer(IconCompatParcelizer(IconCompatParcelizer(0, this.MediaDescriptionCompat, str, 1073741824), this.MediaMetadataCompat, str2, 2), this.onCustomAction, str3, 4);
        if (iIconCompatParcelizer == -1 || !set.containsAll(this.MediaBrowserCompatMediaItem)) {
            return 0;
        }
        return iIconCompatParcelizer + (this.MediaBrowserCompatMediaItem.size() << 2);
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == -1 && this.AudioAttributesImplApi26Parcelizer == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.AudioAttributesImplApi26Parcelizer == 1 ? 2 : 0);
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.RatingCompat == 1;
    }

    public final boolean MediaDescriptionCompat() {
        return this.onAddQueueItem == 1;
    }

    public final hasIds MediaBrowserCompatSearchResultReceiver() {
        this.onAddQueueItem = 1;
        return this;
    }

    public final hasIds RatingCompat() {
        this.RemoteActionCompatParcelizer = 1;
        return this;
    }

    public final hasIds MediaMetadataCompat() {
        this.AudioAttributesImplApi26Parcelizer = 1;
        return this;
    }

    public final String write() {
        return this.write;
    }

    public final hasIds AudioAttributesCompatParcelizer(String str) {
        this.write = str == null ? null : parseMdhd.read(str);
        return this;
    }

    public final int read() {
        if (!this.MediaBrowserCompatItemReceiver) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.read;
    }

    public final hasIds write(int i) {
        this.read = i;
        this.MediaBrowserCompatItemReceiver = true;
        return this;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final int IconCompatParcelizer() {
        if (!this.AudioAttributesImplBaseParcelizer) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.IconCompatParcelizer;
    }

    public final hasIds read(int i) {
        this.IconCompatParcelizer = i;
        this.AudioAttributesImplBaseParcelizer = true;
        return this;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final hasIds RemoteActionCompatParcelizer(float f) {
        this.MediaBrowserCompatCustomActionResultReceiver = f;
        return this;
    }

    public final hasIds IconCompatParcelizer(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
        return this;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final float RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final hasIds RemoteActionCompatParcelizer(int i) {
        this.MediaBrowserCompatSearchResultReceiver = i;
        return this;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final hasIds read(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
        return this;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    private static int IconCompatParcelizer(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
