package com.marrow.data.models.user;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import kotlin.Metadata;
import kotlin.copyWithNewSegmentIndex;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/data/models/user/UserConfigDeserializer;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lcom/marrow/data/models/user/UserConfigResponse;", "<init>", "()V", "Lcom/fasterxml/jackson/core/JsonParser;", "p0", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "p1", "deserialize", "(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/marrow/data/models/user/UserConfigResponse;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserConfigDeserializer extends StdDeserializer<UserConfigResponse> {
    public UserConfigDeserializer() {
        super((Class<?>) UserConfigResponse.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final UserConfigResponse deserialize(JsonParser p0, DeserializationContext p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new UserConfigResponse(copyWithNewSegmentIndex.AudioAttributesCompatParcelizer((JsonNode) p0.readValueAsTree(), "show_pearl_deletion_toast", false));
    }
}
