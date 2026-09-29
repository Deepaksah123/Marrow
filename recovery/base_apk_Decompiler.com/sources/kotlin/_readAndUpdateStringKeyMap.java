package kotlin;

import kotlin._int;

/* JADX INFO: loaded from: classes2.dex */
public final class _readAndUpdateStringKeyMap extends _readAndBindStringKeyMap {
    @Override // kotlin._readAndBindStringKeyMap
    public final void read(int i, int i2, int i3, int i4) {
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer() + AudioAttributesImplApi26Parcelizer();
        int iR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() + AudioAttributesCompatParcelizer();
        if (((JsonNodeDeserializerArrayDeserializer) this).onStop > 0) {
            iAudioAttributesImplBaseParcelizer += ((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[0].onSetShuffleMode();
            iR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 += ((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[0].onAddQueueItem();
        }
        int iMax = Math.max(onPrepareFromSearch(), iAudioAttributesImplBaseParcelizer);
        int iMax2 = Math.max(onPlayFromSearch(), iR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(iMax, i2);
            } else {
                i2 = i == 0 ? iMax : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(iMax2, i4);
            } else {
                i4 = i3 == 0 ? iMax2 : 0;
            }
        }
        MediaBrowserCompatItemReceiver(i2, i4);
        onFastForward(i2);
        MediaMetadataCompat(i4);
        RemoteActionCompatParcelizer(((JsonNodeDeserializerArrayDeserializer) this).onStop > 0);
    }

    @Override // kotlin.JdkDeserializers
    public final void IconCompatParcelizer(_getToStringLookup _gettostringlookup, boolean z) {
        super.IconCompatParcelizer(_gettostringlookup, z);
        if (((JsonNodeDeserializerArrayDeserializer) this).onStop > 0) {
            JdkDeserializers jdkDeserializers = ((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[0];
            jdkDeserializers.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            jdkDeserializers.write(_int.read.LEFT, this, _int.read.LEFT);
            jdkDeserializers.write(_int.read.RIGHT, this, _int.read.RIGHT);
            jdkDeserializers.write(_int.read.TOP, this, _int.read.TOP);
            jdkDeserializers.write(_int.read.BOTTOM, this, _int.read.BOTTOM);
        }
    }
}
