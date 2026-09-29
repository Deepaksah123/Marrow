package kotlin;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class IgnoredPropertyException {
    private final write AudioAttributesCompatParcelizer;

    interface write {
        void read(int i, int i2, int i3, int i4);

        void write(int i, int i2, int i3, boolean z);
    }

    private IgnoredPropertyException(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(view);
        } else {
            this.AudioAttributesCompatParcelizer = new IconCompatParcelizer();
        }
    }

    public static IgnoredPropertyException read(View view) {
        return new IgnoredPropertyException(view);
    }

    public void RemoteActionCompatParcelizer(int i, int i2, int i3, boolean z) {
        this.AudioAttributesCompatParcelizer.write(i, i2, i3, z);
    }

    public void IconCompatParcelizer(int i, int i2, int i3, int i4) {
        this.AudioAttributesCompatParcelizer.read(i, i2, i3, i4);
    }

    static class AudioAttributesCompatParcelizer implements write {
        private final ScrollFeedbackProvider read;

        AudioAttributesCompatParcelizer(View view) {
            this.read = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // o.IgnoredPropertyException.write
        public void write(int i, int i2, int i3, boolean z) {
            this.read.onScrollLimit(i, i2, i3, z);
        }

        @Override // o.IgnoredPropertyException.write
        public void read(int i, int i2, int i3, int i4) {
            this.read.onScrollProgress(i, i2, i3, i4);
        }
    }

    static class IconCompatParcelizer implements write {
        @Override // o.IgnoredPropertyException.write
        public void read(int i, int i2, int i3, int i4) {
        }

        @Override // o.IgnoredPropertyException.write
        public void write(int i, int i2, int i3, boolean z) {
        }

        private IconCompatParcelizer() {
        }
    }
}
