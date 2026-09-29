package kotlin;

import android.text.TextUtils;
import android.util.Log;
import kotlin.expectNullFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonFormatVisitorWithSerializerProvider {
    static final boolean AudioAttributesCompatParcelizer = Log.isLoggable("MediaSessionManager", 3);

    interface AudioAttributesCompatParcelizer {
    }

    public static final class IconCompatParcelizer {
        private AudioAttributesCompatParcelizer read;

        public IconCompatParcelizer(String str, int i, int i2) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            this.read = new expectNullFormat.IconCompatParcelizer(str, i, i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof IconCompatParcelizer) {
                return this.read.equals(((IconCompatParcelizer) obj).read);
            }
            return false;
        }

        public final int hashCode() {
            return this.read.hashCode();
        }
    }
}
