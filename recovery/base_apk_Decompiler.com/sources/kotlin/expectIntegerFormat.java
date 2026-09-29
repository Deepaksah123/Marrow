package kotlin;

import android.text.TextUtils;
import kotlin.JsonFormatVisitorWithSerializerProvider;

/* JADX INFO: loaded from: classes2.dex */
class expectIntegerFormat {
    private static final boolean RemoteActionCompatParcelizer = JsonFormatVisitorWithSerializerProvider.AudioAttributesCompatParcelizer;

    static class write implements JsonFormatVisitorWithSerializerProvider.AudioAttributesCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private String read;

        write(String str, int i, int i2) {
            this.read = str;
            this.AudioAttributesCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return (this.AudioAttributesCompatParcelizer < 0 || writeVar.AudioAttributesCompatParcelizer < 0) ? TextUtils.equals(this.read, writeVar.read) && this.IconCompatParcelizer == writeVar.IconCompatParcelizer : TextUtils.equals(this.read, writeVar.read) && this.AudioAttributesCompatParcelizer == writeVar.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == writeVar.IconCompatParcelizer;
        }

        public int hashCode() {
            return configureFromStringCreator.RemoteActionCompatParcelizer(this.read, Integer.valueOf(this.IconCompatParcelizer));
        }
    }
}
