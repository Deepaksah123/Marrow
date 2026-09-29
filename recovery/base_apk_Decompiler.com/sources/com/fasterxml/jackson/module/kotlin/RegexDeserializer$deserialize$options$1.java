package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.JsonNode;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.copyYearItem;
import kotlin.getAnswerMap;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fasterxml/jackson/databind/JsonNode;", "p0", "Lo/copyYearItem;", "invoke", "(Lcom/fasterxml/jackson/databind/JsonNode;)Lo/copyYearItem;"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class RegexDeserializer$deserialize$options$1 extends MagicModuleUseCase implements getAnswerMap<JsonNode, copyYearItem> {
    public static final RegexDeserializer$deserialize$options$1 INSTANCE = new RegexDeserializer$deserialize$options$1();

    @Override // kotlin.getAnswerMap
    public final copyYearItem invoke(JsonNode jsonNode) {
        String strAsText = jsonNode.asText();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAsText, "");
        return copyYearItem.valueOf(strAsText);
    }

    RegexDeserializer$deserialize$options$1() {
        super(1);
    }
}
