package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.StateResult;
import kotlin.copyYearItem;
import kotlin.getKycMessage;
import kotlin.newYearNameItem;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/RegexDeserializer;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lo/newYearNameItem;", "<init>", "()V", "Lcom/fasterxml/jackson/core/JsonParser;", "p0", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "p1", "deserialize", "(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lo/newYearNameItem;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RegexDeserializer extends StdDeserializer<newYearNameItem> {
    public static final RegexDeserializer INSTANCE = new RegexDeserializer();

    private RegexDeserializer() {
        super((Class<?>) newYearNameItem.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final newYearNameItem deserialize(JsonParser p0, DeserializationContext p1) throws IOException {
        Set setMediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        JsonNode tree = p1.readTree(p0);
        if (tree.isTextual()) {
            String strAsText = tree.asText();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAsText, "");
            return new newYearNameItem(strAsText);
        }
        if (tree.isObject()) {
            String strAsText2 = tree.get("pattern").asText();
            if (tree.has("options")) {
                JsonNode jsonNode = tree.get("options");
                if (!jsonNode.isArray()) {
                    throw new IllegalStateException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Expected an array of strings for RegexOptions, but type was ", (Object) tree.getNodeType()));
                }
                Iterator<JsonNode> itElements = jsonNode.elements();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itElements, "");
                setMediaBrowserCompatMediaItem = StateResult.MediaBrowserCompatMediaItem(StateResult.write(StateResult.read((Iterator) itElements), RegexDeserializer$deserialize$options$1.INSTANCE));
            } else {
                setMediaBrowserCompatMediaItem = getKycMessage.read();
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAsText2, "");
            return new newYearNameItem(strAsText2, (Set<? extends copyYearItem>) setMediaBrowserCompatMediaItem);
        }
        throw new IllegalStateException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Expected a string or an object to deserialize a Regex, but type was ", (Object) tree.getNodeType()));
    }
}
