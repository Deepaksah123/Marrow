package kotlin;

import java.util.Map;
import java.util.UUID;
import kotlin.PropertySerializerMapDouble;
import kotlin.PropertySerializerMapEmpty;

/* JADX INFO: loaded from: classes2.dex */
public final class StringArraySerializer implements PropertySerializerMapDouble {
    private final PropertySerializerMapDouble.IconCompatParcelizer read;

    @Override // kotlin.PropertySerializerMapDouble
    public final handleMissingId AudioAttributesCompatParcelizer() {
        return null;
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final void AudioAttributesCompatParcelizer(PropertySerializerMapEmpty.read readVar) {
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final boolean AudioAttributesCompatParcelizer(String str) {
        return false;
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final int IconCompatParcelizer() {
        return 1;
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return false;
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final Map<String, String> MediaBrowserCompatItemReceiver() {
        return null;
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final void read(PropertySerializerMapEmpty.read readVar) {
    }

    public StringArraySerializer(PropertySerializerMapDouble.IconCompatParcelizer iconCompatParcelizer) {
        this.read = (PropertySerializerMapDouble.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(iconCompatParcelizer);
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final PropertySerializerMapDouble.IconCompatParcelizer write() {
        return this.read;
    }

    @Override // kotlin.PropertySerializerMapDouble
    public final UUID read() {
        return JsonMapFormatVisitor.read;
    }
}
