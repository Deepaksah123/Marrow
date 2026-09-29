package in.juspay.widget.qrscanner.com.google.zxing.client.android;

import android.content.Intent;
import android.os.Bundle;
import in.juspay.widget.qrscanner.com.google.zxing.DecodeHintType;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class DecodeHintManager {
    private static final String a = "DecodeHintManager";

    static {
        Pattern.compile(",");
    }

    private DecodeHintManager() {
    }

    public static Map<DecodeHintType, Object> parseDecodeHints(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        for (DecodeHintType decodeHintType : DecodeHintType.values()) {
            if (decodeHintType != DecodeHintType.CHARACTER_SET && decodeHintType != DecodeHintType.NEED_RESULT_POINT_CALLBACK && decodeHintType != DecodeHintType.POSSIBLE_FORMATS) {
                String strName = decodeHintType.name();
                if (extras.containsKey(strName)) {
                    if (decodeHintType.getValueType().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(strName);
                        if (!decodeHintType.getValueType().isInstance(obj)) {
                            Objects.toString(decodeHintType);
                            Objects.toString(obj);
                        }
                    }
                    enumMap.put(decodeHintType, obj);
                }
            }
        }
        enumMap.toString();
        return enumMap;
    }
}
