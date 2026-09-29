package kotlin;

import android.content.Context;
import android.util.JsonReader;
import kotlin.TsExtractor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class shouldConsumePacketPayload implements TsExtractor.write {
    public static int AudioAttributesCompatParcelizer;
    public static int write;

    public static int write() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 8321395;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        write = i3;
        return i3;
    }

    @Override // o.TsExtractor.write
    public final Object IconCompatParcelizer(JsonReader jsonReader) {
        return TsExtractor.onFastForward(jsonReader);
    }
}
