package kotlin;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class EmptyResponseException {
    private final Map<String, String> AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;

    public EmptyResponseException(String str, Map<String, String> map) {
        String lowerCase;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.IconCompatParcelizer = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
                lowerCase = key.toLowerCase(locale);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapUnmodifiableMap, "");
        this.AudioAttributesCompatParcelizer = mapUnmodifiableMap;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.get("realm");
    }

    public final Charset IconCompatParcelizer() {
        String str = this.AudioAttributesCompatParcelizer.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charsetForName, "");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset, "");
        return charset;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EmptyResponseException)) {
            return false;
        }
        EmptyResponseException emptyResponseException = (EmptyResponseException) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) emptyResponseException.IconCompatParcelizer, (Object) this.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(emptyResponseException.AudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return ((this.IconCompatParcelizer.hashCode() + 899) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer);
        sb.append(" authParams=");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }
}
