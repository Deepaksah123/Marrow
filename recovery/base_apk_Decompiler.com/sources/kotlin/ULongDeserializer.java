package kotlin;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ULongDeserializer {
    private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();
    final IconCompatParcelizer IconCompatParcelizer;

    public interface IconCompatParcelizer {
        int AudioAttributesCompatParcelizer();

        int AudioAttributesCompatParcelizer(View view);

        View IconCompatParcelizer(int i);

        int read(View view);

        int write();
    }

    public ULongDeserializer(IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    static class RemoteActionCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int read;
        private int write = 0;

        private static int RemoteActionCompatParcelizer(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        RemoteActionCompatParcelizer() {
        }

        final void AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4) {
            this.RemoteActionCompatParcelizer = i;
            this.read = i2;
            this.AudioAttributesCompatParcelizer = i3;
            this.IconCompatParcelizer = i4;
        }

        final void write(int i) {
            this.write = i | this.write;
        }

        final void IconCompatParcelizer() {
            this.write = 0;
        }

        final boolean read() {
            int i = this.write;
            if ((i & 7) != 0 && (i & RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer)) == 0) {
                return false;
            }
            int i2 = this.write;
            if ((i2 & 112) != 0 && (i2 & (RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read) << 4)) == 0) {
                return false;
            }
            int i3 = this.write;
            if ((i3 & 1792) != 0 && (i3 & (RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer) << 8)) == 0) {
                return false;
            }
            int i4 = this.write;
            return (i4 & 28672) == 0 || ((RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.read) << 12) & i4) != 0;
        }
    }

    public final View RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        int iAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iWrite = this.IconCompatParcelizer.write();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(i);
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, iWrite, this.IconCompatParcelizer.read(viewIconCompatParcelizer), this.IconCompatParcelizer.AudioAttributesCompatParcelizer(viewIconCompatParcelizer));
            if (i3 != 0) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
                this.AudioAttributesCompatParcelizer.write(i3);
                if (this.AudioAttributesCompatParcelizer.read()) {
                    return viewIconCompatParcelizer;
                }
            }
            if (i4 != 0) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
                this.AudioAttributesCompatParcelizer.write(i4);
                if (this.AudioAttributesCompatParcelizer.read()) {
                    view = viewIconCompatParcelizer;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean write(View view) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.AudioAttributesCompatParcelizer(), this.IconCompatParcelizer.write(), this.IconCompatParcelizer.read(view), this.IconCompatParcelizer.AudioAttributesCompatParcelizer(view));
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer.write(24579);
        return this.AudioAttributesCompatParcelizer.read();
    }
}
