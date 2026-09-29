package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class setIncludableProperties implements MapDeserializerMapReferring {
    NumberDeserializersBigDecimalDeserializer AudioAttributesImplApi26Parcelizer;
    public int RatingCompat;
    int read;
    public MapDeserializerMapReferring MediaBrowserCompatSearchResultReceiver = null;
    public boolean write = false;
    public boolean MediaBrowserCompatItemReceiver = false;
    read MediaBrowserCompatCustomActionResultReceiver = read.UNKNOWN;
    int RemoteActionCompatParcelizer = 1;
    _squashDups IconCompatParcelizer = null;
    public boolean AudioAttributesImplBaseParcelizer = false;
    List<MapDeserializerMapReferring> AudioAttributesCompatParcelizer = new ArrayList();
    List<setIncludableProperties> AudioAttributesImplApi21Parcelizer = new ArrayList();

    enum read {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public setIncludableProperties(NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer) {
        this.AudioAttributesImplApi26Parcelizer = numberDeserializersBigDecimalDeserializer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver.MediaBrowserCompatSearchResultReceiver());
        sb.append(":");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append("(");
        sb.append(this.AudioAttributesImplBaseParcelizer ? Integer.valueOf(this.RatingCompat) : "unresolved");
        sb.append(") <t=");
        sb.append(this.AudioAttributesImplApi21Parcelizer.size());
        sb.append(":d=");
        sb.append(this.AudioAttributesCompatParcelizer.size());
        sb.append(">");
        return sb.toString();
    }

    public void RemoteActionCompatParcelizer(int i) {
        if (this.AudioAttributesImplBaseParcelizer) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = true;
        this.RatingCompat = i;
        Iterator<MapDeserializerMapReferring> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    @Override // kotlin.MapDeserializerMapReferring
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        Iterator<setIncludableProperties> it = this.AudioAttributesImplApi21Parcelizer.iterator();
        while (it.hasNext()) {
            if (!it.next().AudioAttributesImplBaseParcelizer) {
                return;
            }
        }
        this.MediaBrowserCompatItemReceiver = true;
        MapDeserializerMapReferring mapDeserializerMapReferring = this.MediaBrowserCompatSearchResultReceiver;
        if (mapDeserializerMapReferring != null) {
            mapDeserializerMapReferring.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (this.write) {
            this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        setIncludableProperties setincludableproperties = null;
        int i = 0;
        for (setIncludableProperties setincludableproperties2 : this.AudioAttributesImplApi21Parcelizer) {
            if (!(setincludableproperties2 instanceof _squashDups)) {
                i++;
                setincludableproperties = setincludableproperties2;
            }
        }
        if (setincludableproperties != null && i == 1 && setincludableproperties.AudioAttributesImplBaseParcelizer) {
            _squashDups _squashdups = this.IconCompatParcelizer;
            if (_squashdups != null) {
                if (!_squashdups.AudioAttributesImplBaseParcelizer) {
                    return;
                } else {
                    this.read = this.RemoteActionCompatParcelizer * _squashdups.RatingCompat;
                }
            }
            RemoteActionCompatParcelizer(setincludableproperties.RatingCompat + this.read);
        }
        MapDeserializerMapReferring mapDeserializerMapReferring2 = this.MediaBrowserCompatSearchResultReceiver;
        if (mapDeserializerMapReferring2 != null) {
            mapDeserializerMapReferring2.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    public final void write(MapDeserializerMapReferring mapDeserializerMapReferring) {
        this.AudioAttributesCompatParcelizer.add(mapDeserializerMapReferring);
        if (this.AudioAttributesImplBaseParcelizer) {
            mapDeserializerMapReferring.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.clear();
        this.AudioAttributesCompatParcelizer.clear();
        this.AudioAttributesImplBaseParcelizer = false;
        this.RatingCompat = 0;
        this.MediaBrowserCompatItemReceiver = false;
        this.write = false;
    }
}
