package kotlin;

import java.util.Iterator;
import kotlin.setIncludableProperties;

/* JADX INFO: loaded from: classes2.dex */
class _squashDups extends setIncludableProperties {
    public int MediaBrowserCompatMediaItem;

    _squashDups(NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer) {
        super(numberDeserializersBigDecimalDeserializer);
        if (numberDeserializersBigDecimalDeserializer instanceof NumberDeserializers) {
            this.MediaBrowserCompatCustomActionResultReceiver = setIncludableProperties.read.HORIZONTAL_DIMENSION;
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = setIncludableProperties.read.VERTICAL_DIMENSION;
        }
    }

    @Override // kotlin.setIncludableProperties
    public final void RemoteActionCompatParcelizer(int i) {
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
}
