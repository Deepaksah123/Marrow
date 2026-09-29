package kotlin;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonFormatVisitorWrapperBase {
    public final int AudioAttributesCompatParcelizer;
    public final View RemoteActionCompatParcelizer;
    public final String read;

    public static final class AudioAttributesCompatParcelizer {
        private String AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final View read;

        public AudioAttributesCompatParcelizer(View view, int i) {
            this.read = view;
            this.IconCompatParcelizer = i;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            this.AudioAttributesCompatParcelizer = str;
            return this;
        }

        public final JsonFormatVisitorWrapperBase RemoteActionCompatParcelizer() {
            return new JsonFormatVisitorWrapperBase(this.read, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }
    }

    @Deprecated
    public JsonFormatVisitorWrapperBase(View view, int i, String str) {
        this.RemoteActionCompatParcelizer = view;
        this.AudioAttributesCompatParcelizer = i;
        this.read = str;
    }
}
