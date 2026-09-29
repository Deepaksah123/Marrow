package kotlin;

import android.content.Context;
import java.io.IOException;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public interface getLessons {
    void RemoteActionCompatParcelizer();

    boolean RemoteActionCompatParcelizer(Context context, FreeVideoListResponse freeVideoListResponse);

    byte[] write(String str, Map<String, Object> map, SSLSocketFactory sSLSocketFactory) throws AudioAttributesCompatParcelizer, IOException;

    public static class AudioAttributesCompatParcelizer extends Exception {
        private final int RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(String str, String str2) {
            int i;
            super(str);
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                i = 0;
            }
            this.RemoteActionCompatParcelizer = i;
        }

        public final int IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
