package kotlin;

import java.util.Map;
import kotlin.JsonSerializableSchema;
import kotlin._hasTypeResolver;
import kotlin.findAndAddPrimarySerializer;
import kotlin.reportInvalidBaseType;

/* JADX INFO: loaded from: classes2.dex */
public final class PropertySerializerMapMulti implements SimpleBeanPropertyFilter {
    private matchesUntyped AudioAttributesCompatParcelizer;
    private _resolveSuperClass IconCompatParcelizer;
    private String MediaBrowserCompatCustomActionResultReceiver;
    private JsonSerializableSchema.write RemoteActionCompatParcelizer;
    private _hasTypeResolver.write read;
    private final Object write = new Object();

    @Override // kotlin.SimpleBeanPropertyFilter
    public final matchesUntyped read(JsonSerializableSchema jsonSerializableSchema) {
        matchesUntyped matchesuntyped;
        JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = jsonSerializableSchema.AudioAttributesCompatParcelizer;
        JsonSerializableSchema.write writeVar = jsonSerializableSchema.AudioAttributesCompatParcelizer.read;
        if (writeVar == null) {
            return matchesUntyped.write;
        }
        synchronized (this.write) {
            if (!LaissezFaireSubTypeValidator.read(writeVar, this.RemoteActionCompatParcelizer)) {
                this.RemoteActionCompatParcelizer = writeVar;
                this.AudioAttributesCompatParcelizer = write(writeVar);
            }
            matchesuntyped = (matchesUntyped) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }
        return matchesuntyped;
    }

    private matchesUntyped write(JsonSerializableSchema.write writeVar) {
        failForEmpty failforempty = new failForEmpty(writeVar.AudioAttributesCompatParcelizer == null ? null : writeVar.AudioAttributesCompatParcelizer.toString(), writeVar.IconCompatParcelizer, new reportInvalidBaseType.IconCompatParcelizer().IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver));
        getCurrentSampleFlags<Map.Entry<String, String>> it = writeVar.write.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            failforempty.AudioAttributesCompatParcelizer(next.getKey(), next.getValue());
        }
        findAndAddPrimarySerializer findandaddprimaryserializerIconCompatParcelizer = new findAndAddPrimarySerializer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(writeVar.MediaBrowserCompatItemReceiver, serializeContentsSlow.write).AudioAttributesCompatParcelizer(writeVar.RemoteActionCompatParcelizer).read(writeVar.AudioAttributesImplBaseParcelizer).RemoteActionCompatParcelizer(parseTextAttribute.write(writeVar.read)).IconCompatParcelizer(failforempty);
        findandaddprimaryserializerIconCompatParcelizer.IconCompatParcelizer(writeVar.AudioAttributesCompatParcelizer());
        return findandaddprimaryserializerIconCompatParcelizer;
    }
}
