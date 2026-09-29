package kotlin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.constructSet;

/* JADX INFO: loaded from: classes2.dex */
public final class _int {
    private int AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    public final JdkDeserializers IconCompatParcelizer;
    constructSet RemoteActionCompatParcelizer;
    public _int read;
    public final read write;
    private HashSet<_int> AudioAttributesImplApi26Parcelizer = null;
    public int AudioAttributesCompatParcelizer = 0;
    private int MediaBrowserCompatCustomActionResultReceiver = Integer.MIN_VALUE;

    public enum read {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public final void RemoteActionCompatParcelizer(int i, ArrayList<_parseByte> arrayList, _parseByte _parsebyte) {
        HashSet<_int> hashSet = this.AudioAttributesImplApi26Parcelizer;
        if (hashSet != null) {
            Iterator<_int> it = hashSet.iterator();
            while (it.hasNext()) {
                MapEntryDeserializer.write(it.next().IconCompatParcelizer, i, arrayList, _parsebyte);
            }
        }
    }

    public final HashSet<_int> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        HashSet<_int> hashSet = this.AudioAttributesImplApi26Parcelizer;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        HashSet<_int> hashSet = this.AudioAttributesImplApi26Parcelizer;
        if (hashSet == null) {
            return false;
        }
        Iterator<_int> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().AudioAttributesCompatParcelizer().MediaMetadataCompat()) {
                return true;
            }
        }
        return false;
    }

    public final void IconCompatParcelizer(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
        this.AudioAttributesImplBaseParcelizer = true;
    }

    public final int read() {
        if (this.AudioAttributesImplBaseParcelizer) {
            return this.AudioAttributesImplApi21Parcelizer;
        }
        return 0;
    }

    public final void MediaBrowserCompatMediaItem() {
        this.AudioAttributesImplBaseParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer = 0;
    }

    public final boolean MediaDescriptionCompat() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public _int(JdkDeserializers jdkDeserializers, read readVar) {
        this.IconCompatParcelizer = jdkDeserializers;
        this.write = readVar;
    }

    public final constructSet AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RatingCompat() {
        constructSet constructset = this.RemoteActionCompatParcelizer;
        if (constructset == null) {
            this.RemoteActionCompatParcelizer = new constructSet(constructSet.RemoteActionCompatParcelizer.UNRESTRICTED);
        } else {
            constructset.IconCompatParcelizer();
        }
    }

    public final JdkDeserializers RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final read MediaBrowserCompatCustomActionResultReceiver() {
        return this.write;
    }

    public final int write() {
        _int _intVar;
        if (this.IconCompatParcelizer.onRewind() == 8) {
            return 0;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver != Integer.MIN_VALUE && (_intVar = this.read) != null && _intVar.IconCompatParcelizer.onRewind() == 8) {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }
        return this.AudioAttributesCompatParcelizer;
    }

    public final _int MediaBrowserCompatItemReceiver() {
        return this.read;
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        HashSet<_int> hashSet;
        _int _intVar = this.read;
        if (_intVar != null && (hashSet = _intVar.AudioAttributesImplApi26Parcelizer) != null) {
            hashSet.remove(this);
            if (this.read.AudioAttributesImplApi26Parcelizer.size() == 0) {
                this.read.AudioAttributesImplApi26Parcelizer = null;
            }
        }
        this.AudioAttributesImplApi26Parcelizer = null;
        this.read = null;
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = Integer.MIN_VALUE;
        this.AudioAttributesImplBaseParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer = 0;
    }

    public final boolean write(_int _intVar, int i, int i2, boolean z) {
        if (_intVar == null) {
            MediaBrowserCompatSearchResultReceiver();
            return true;
        }
        if (!z && !AudioAttributesCompatParcelizer(_intVar)) {
            return false;
        }
        this.read = _intVar;
        if (_intVar.AudioAttributesImplApi26Parcelizer == null) {
            _intVar.AudioAttributesImplApi26Parcelizer = new HashSet<>();
        }
        HashSet<_int> hashSet = this.read.AudioAttributesImplApi26Parcelizer;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.AudioAttributesCompatParcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer(_int _intVar, int i) {
        return write(_intVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean MediaMetadataCompat() {
        return this.read != null;
    }

    public final boolean AudioAttributesCompatParcelizer(_int _intVar) {
        if (_intVar == null) {
            return false;
        }
        read readVarMediaBrowserCompatCustomActionResultReceiver = _intVar.MediaBrowserCompatCustomActionResultReceiver();
        read readVar = this.write;
        if (readVarMediaBrowserCompatCustomActionResultReceiver == readVar) {
            return readVar != read.BASELINE || (_intVar.RemoteActionCompatParcelizer().onSetCaptioningEnabled() && RemoteActionCompatParcelizer().onSetCaptioningEnabled());
        }
        switch (readVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z = readVarMediaBrowserCompatCustomActionResultReceiver == read.LEFT || readVarMediaBrowserCompatCustomActionResultReceiver == read.RIGHT;
                return _intVar.RemoteActionCompatParcelizer() instanceof _deserializeUsingCreator ? z || readVarMediaBrowserCompatCustomActionResultReceiver == read.CENTER_X : z;
            case TOP:
            case BOTTOM:
                boolean z2 = readVarMediaBrowserCompatCustomActionResultReceiver == read.TOP || readVarMediaBrowserCompatCustomActionResultReceiver == read.BOTTOM;
                return _intVar.RemoteActionCompatParcelizer() instanceof _deserializeUsingCreator ? z2 || readVarMediaBrowserCompatCustomActionResultReceiver == read.CENTER_Y : z2;
            case BASELINE:
                return (readVarMediaBrowserCompatCustomActionResultReceiver == read.LEFT || readVarMediaBrowserCompatCustomActionResultReceiver == read.RIGHT) ? false : true;
            case CENTER:
                return (readVarMediaBrowserCompatCustomActionResultReceiver == read.BASELINE || readVarMediaBrowserCompatCustomActionResultReceiver == read.CENTER_X || readVarMediaBrowserCompatCustomActionResultReceiver == read.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.write.name());
        }
    }

    public final void write(int i) {
        if (MediaMetadataCompat()) {
            this.MediaBrowserCompatCustomActionResultReceiver = i;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver());
        sb.append(":");
        sb.append(this.write.toString());
        return sb.toString();
    }

    public final _int AudioAttributesCompatParcelizer() {
        switch (this.write) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.IconCompatParcelizer.onPrepareFromMediaId;
            case TOP:
                return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            case RIGHT:
                return this.IconCompatParcelizer.MediaMetadataCompat;
            case BOTTOM:
                return this.IconCompatParcelizer.onSeekTo;
            default:
                throw new AssertionError(this.write.name());
        }
    }
}
