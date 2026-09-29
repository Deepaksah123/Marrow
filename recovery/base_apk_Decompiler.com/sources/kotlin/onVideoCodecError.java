package kotlin;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class onVideoCodecError {
    private final Map<String, String> read = new HashMap();
    private boolean write = true;
    private final LottieAnimationView IconCompatParcelizer = null;
    private final ExoPlayerImplExternalSyntheticLambda6 AudioAttributesCompatParcelizer = null;

    private static String IconCompatParcelizer(String str) {
        return str;
    }

    onVideoCodecError() {
    }

    private static String read(String str) {
        return IconCompatParcelizer(str);
    }

    public final String write(String str) {
        if (this.write && this.read.containsKey(str)) {
            return this.read.get(str);
        }
        String str2 = read(str);
        if (this.write) {
            this.read.put(str, str2);
        }
        return str2;
    }
}
