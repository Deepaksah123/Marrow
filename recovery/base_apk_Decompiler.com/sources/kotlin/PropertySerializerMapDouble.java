package kotlin;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import kotlin.PropertySerializerMapEmpty;

/* JADX INFO: loaded from: classes2.dex */
public interface PropertySerializerMapDouble {
    handleMissingId AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(PropertySerializerMapEmpty.read readVar);

    boolean AudioAttributesCompatParcelizer(String str);

    int IconCompatParcelizer();

    default boolean MediaBrowserCompatCustomActionResultReceiver() {
        return false;
    }

    Map<String, String> MediaBrowserCompatItemReceiver();

    UUID read();

    void read(PropertySerializerMapEmpty.read readVar);

    IconCompatParcelizer write();

    static void RemoteActionCompatParcelizer(PropertySerializerMapDouble propertySerializerMapDouble, PropertySerializerMapDouble propertySerializerMapDouble2) {
        if (propertySerializerMapDouble != propertySerializerMapDouble2) {
            if (propertySerializerMapDouble2 != null) {
                propertySerializerMapDouble2.AudioAttributesCompatParcelizer((PropertySerializerMapEmpty.read) null);
            }
            if (propertySerializerMapDouble != null) {
                propertySerializerMapDouble.read(null);
            }
        }
    }

    public static class IconCompatParcelizer extends IOException {
        public final int RemoteActionCompatParcelizer;

        public IconCompatParcelizer(Throwable th, int i) {
            super(th);
            this.RemoteActionCompatParcelizer = i;
        }
    }
}
