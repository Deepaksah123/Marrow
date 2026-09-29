package kotlin;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class copyWithNewSegmentIndex {
    public static final int write(JsonNode jsonNode, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (jsonNode == null) {
            return 0;
        }
        try {
            JsonNode jsonNode2 = jsonNode.get(str);
            if (jsonNode2 != null) {
                return jsonNode2.asInt();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final boolean AudioAttributesCompatParcelizer(JsonNode jsonNode, String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (jsonNode != null) {
            try {
                JsonNode jsonNode2 = jsonNode.get(str);
                if (jsonNode2 != null) {
                    return jsonNode2.asBoolean();
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public static final String AudioAttributesCompatParcelizer(JsonNode jsonNode, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (jsonNode == null) {
            return null;
        }
        try {
            JsonNode jsonNode2 = jsonNode.get(str);
            if (jsonNode2 != null) {
                return jsonNode2.asText();
            }
            return null;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final List<JsonNode> IconCompatParcelizer(JsonNode jsonNode, String str) {
        List<JsonNode> listOnPlay;
        toMagicModuleMetaRepoModel.write(str, "");
        if (jsonNode != null) {
            try {
                JsonNode jsonNodeWithArray = jsonNode.withArray(str);
                if (jsonNodeWithArray != null && (listOnPlay = IntermediateLoginResponseBody.onPlay(jsonNodeWithArray)) != null) {
                    return listOnPlay;
                }
            } catch (Exception unused) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }
}
