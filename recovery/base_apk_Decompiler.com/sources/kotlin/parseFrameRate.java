package kotlin;

import android.util.Base64;
import com.marrow.data.models.ResponseError;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class parseFrameRate {
    /* JADX INFO: Access modifiers changed from: private */
    public static String AudioAttributesCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        try {
            Charset charsetForName = Charset.forName(CharsetNames.US_ASCII);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charsetForName, "");
            byte[] bytes = str.getBytes(charsetForName);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            String strEncodeToString = Base64.encodeToString(bytes, 10);
            toMagicModuleMetaRepoModel.write((Object) strEncodeToString);
            return strEncodeToString;
        } catch (UnsupportedEncodingException unused) {
            throw new ResponseErrorException(ResponseError.INSTANCE.customError("Encoding Exception"));
        }
    }

    public static final String RemoteActionCompatParcelizer(String str, getAnswerMap<? super String, String> getanswermap) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        if (str.length() == 0) {
            return null;
        }
        return getanswermap.invoke(str);
    }

    public static final JSONObject write(String str) {
        JSONObject jSONObjectAudioAttributesCompatParcelizer = parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(str);
        return jSONObjectAudioAttributesCompatParcelizer == null ? new JSONObject() : jSONObjectAudioAttributesCompatParcelizer;
    }

    public static final JSONArray IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        JSONArray jSONArrayWrite = parseLastSegmentNumberSupplementalProperty.write(str);
        return jSONArrayWrite == null ? new JSONArray() : jSONArrayWrite;
    }

    public static final JSONArray write(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        return list.isEmpty() ? new JSONArray() : new JSONArray((Collection) list);
    }
}
