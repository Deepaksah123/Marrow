package kotlin;

import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public final class _replaceCreatorProperty extends Writer {
    private final String AudioAttributesCompatParcelizer;
    private StringBuilder IconCompatParcelizer = new StringBuilder(128);

    public _replaceCreatorProperty(String str) {
        this.AudioAttributesCompatParcelizer = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AudioAttributesCompatParcelizer();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        AudioAttributesCompatParcelizer();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                AudioAttributesCompatParcelizer();
            } else {
                this.IconCompatParcelizer.append(c);
            }
        }
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer.length() > 0) {
            StringBuilder sb = this.IconCompatParcelizer;
            sb.delete(0, sb.length());
        }
    }
}
