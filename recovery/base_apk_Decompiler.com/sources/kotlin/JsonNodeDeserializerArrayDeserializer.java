package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class JsonNodeDeserializerArrayDeserializer extends JdkDeserializers implements JsonNodeDeserializer {
    public JdkDeserializers[] setSessionImpl = new JdkDeserializers[4];
    public int onStop = 0;

    @Override // kotlin.JsonNodeDeserializer
    public void MediaBrowserCompatMediaItem() {
    }

    @Override // kotlin.JsonNodeDeserializer
    public final void IconCompatParcelizer(JdkDeserializers jdkDeserializers) {
        if (jdkDeserializers == this || jdkDeserializers == null) {
            return;
        }
        int i = this.onStop;
        JdkDeserializers[] jdkDeserializersArr = this.setSessionImpl;
        if (i + 1 > jdkDeserializersArr.length) {
            this.setSessionImpl = (JdkDeserializers[]) Arrays.copyOf(jdkDeserializersArr, jdkDeserializersArr.length << 1);
        }
        JdkDeserializers[] jdkDeserializersArr2 = this.setSessionImpl;
        int i2 = this.onStop;
        jdkDeserializersArr2[i2] = jdkDeserializers;
        this.onStop = i2 + 1;
    }

    @Override // kotlin.JdkDeserializers
    public void AudioAttributesCompatParcelizer(JdkDeserializers jdkDeserializers, HashMap<JdkDeserializers, JdkDeserializers> map) {
        super.AudioAttributesCompatParcelizer(jdkDeserializers, map);
        JsonNodeDeserializerArrayDeserializer jsonNodeDeserializerArrayDeserializer = (JsonNodeDeserializerArrayDeserializer) jdkDeserializers;
        this.onStop = 0;
        int i = jsonNodeDeserializerArrayDeserializer.onStop;
        for (int i2 = 0; i2 < i; i2++) {
            IconCompatParcelizer(map.get(jsonNodeDeserializerArrayDeserializer.setSessionImpl[i2]));
        }
    }

    @Override // kotlin.JsonNodeDeserializer
    public final void MediaBrowserCompatItemReceiver() {
        this.onStop = 0;
        Arrays.fill(this.setSessionImpl, (Object) null);
    }

    public final void write(ArrayList<_parseByte> arrayList, int i, _parseByte _parsebyte) {
        for (int i2 = 0; i2 < this.onStop; i2++) {
            _parsebyte.IconCompatParcelizer(this.setSessionImpl[i2]);
        }
        for (int i3 = 0; i3 < this.onStop; i3++) {
            MapEntryDeserializer.write(this.setSessionImpl[i3], i, arrayList, _parsebyte);
        }
    }

    public final int onSetRating(int i) {
        for (int i2 = 0; i2 < this.onStop; i2++) {
            JdkDeserializers jdkDeserializers = this.setSessionImpl[i2];
            if (i == 0 && jdkDeserializers.write != -1) {
                return jdkDeserializers.write;
            }
            if (i == 1 && jdkDeserializers.onSkipToNext != -1) {
                return jdkDeserializers.onSkipToNext;
            }
        }
        return -1;
    }
}
