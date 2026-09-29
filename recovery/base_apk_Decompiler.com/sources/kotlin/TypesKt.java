package kotlin;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TypesKt {
    final IconCompatParcelizer IconCompatParcelizer;
    private View write;
    private int RemoteActionCompatParcelizer = 0;
    final write AudioAttributesCompatParcelizer = new write();
    final List<View> read = new ArrayList();

    public interface IconCompatParcelizer {
        int AudioAttributesCompatParcelizer();

        void AudioAttributesCompatParcelizer(int i);

        void AudioAttributesCompatParcelizer(View view);

        void AudioAttributesCompatParcelizer(View view, int i);

        View IconCompatParcelizer(int i);

        void IconCompatParcelizer(View view, int i, ViewGroup.LayoutParams layoutParams);

        RecyclerView.onMediaButtonEvent RemoteActionCompatParcelizer(View view);

        void RemoteActionCompatParcelizer();

        int read(View view);

        void write(int i);

        void write(View view);
    }

    public TypesKt(IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    private void MediaBrowserCompatCustomActionResultReceiver(View view) {
        this.read.add(view);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(view);
    }

    private boolean MediaBrowserCompatItemReceiver(View view) {
        if (!this.read.remove(view)) {
            return false;
        }
        this.IconCompatParcelizer.write(view);
        return true;
    }

    public final void RemoteActionCompatParcelizer(View view) {
        AudioAttributesCompatParcelizer(view, -1, true);
    }

    public final void AudioAttributesCompatParcelizer(View view, int i, boolean z) {
        int iAudioAttributesImplBaseParcelizer;
        if (i < 0) {
            iAudioAttributesImplBaseParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        } else {
            iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i);
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iAudioAttributesImplBaseParcelizer, z);
        if (z) {
            MediaBrowserCompatCustomActionResultReceiver(view);
        }
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(view, iAudioAttributesImplBaseParcelizer);
    }

    private int AudioAttributesImplBaseParcelizer(int i) {
        if (i < 0) {
            return -1;
        }
        int iAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int i2 = i;
        while (i2 < iAudioAttributesCompatParcelizer) {
            int iWrite = i - (i2 - this.AudioAttributesCompatParcelizer.write(i2));
            if (iWrite == 0) {
                while (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iWrite;
        }
        return -1;
    }

    public final void write(View view) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.RemoteActionCompatParcelizer = 1;
            this.write = view;
            int i2 = this.IconCompatParcelizer.read(view);
            if (i2 >= 0) {
                if (this.AudioAttributesCompatParcelizer.read(i2)) {
                    MediaBrowserCompatItemReceiver(view);
                }
                this.IconCompatParcelizer.write(i2);
            }
        } finally {
            this.RemoteActionCompatParcelizer = 0;
            this.write = null;
        }
    }

    public final void IconCompatParcelizer(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i);
            View viewIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(iAudioAttributesImplBaseParcelizer);
            if (viewIconCompatParcelizer != null) {
                this.RemoteActionCompatParcelizer = 1;
                this.write = viewIconCompatParcelizer;
                if (this.AudioAttributesCompatParcelizer.read(iAudioAttributesImplBaseParcelizer)) {
                    MediaBrowserCompatItemReceiver(viewIconCompatParcelizer);
                }
                this.IconCompatParcelizer.write(iAudioAttributesImplBaseParcelizer);
            }
        } finally {
            this.RemoteActionCompatParcelizer = 0;
            this.write = null;
        }
    }

    public final View read(int i) {
        return this.IconCompatParcelizer.IconCompatParcelizer(AudioAttributesImplBaseParcelizer(i));
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.read();
        for (int size = this.read.size() - 1; size >= 0; size--) {
            this.IconCompatParcelizer.write(this.read.get(size));
            this.read.remove(size);
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final View RemoteActionCompatParcelizer(int i) {
        int size = this.read.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.read.get(i2);
            RecyclerView.onMediaButtonEvent onmediabuttoneventRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(view);
            if (onmediabuttoneventRemoteActionCompatParcelizer.getLayoutPosition() == i && !onmediabuttoneventRemoteActionCompatParcelizer.isInvalid() && !onmediabuttoneventRemoteActionCompatParcelizer.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public final void AudioAttributesCompatParcelizer(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iAudioAttributesImplBaseParcelizer;
        if (i < 0) {
            iAudioAttributesImplBaseParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        } else {
            iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i);
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iAudioAttributesImplBaseParcelizer, z);
        if (z) {
            MediaBrowserCompatCustomActionResultReceiver(view);
        }
        this.IconCompatParcelizer.IconCompatParcelizer(view, iAudioAttributesImplBaseParcelizer, layoutParams);
    }

    public final int read() {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer() - this.read.size();
    }

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public final View AudioAttributesCompatParcelizer(int i) {
        return this.IconCompatParcelizer.IconCompatParcelizer(i);
    }

    public final void write(int i) {
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i);
        this.AudioAttributesCompatParcelizer.read(iAudioAttributesImplBaseParcelizer);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(iAudioAttributesImplBaseParcelizer);
    }

    public final int read(View view) {
        int i = this.IconCompatParcelizer.read(view);
        if (i == -1 || this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i)) {
            return -1;
        }
        return i - this.AudioAttributesCompatParcelizer.write(i);
    }

    public final boolean IconCompatParcelizer(View view) {
        return this.read.contains(view);
    }

    public final void AudioAttributesCompatParcelizer(View view) {
        int i = this.IconCompatParcelizer.read(view);
        if (i < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
        }
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
        MediaBrowserCompatCustomActionResultReceiver(view);
    }

    public final void AudioAttributesImplApi21Parcelizer(View view) {
        int i = this.IconCompatParcelizer.read(view);
        if (i < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
        }
        if (!this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i)) {
            throw new RuntimeException("trying to unhide a view that was not hidden".concat(String.valueOf(view)));
        }
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
        MediaBrowserCompatItemReceiver(view);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.AudioAttributesCompatParcelizer.toString());
        sb.append(", hidden list:");
        sb.append(this.read.size());
        return sb.toString();
    }

    public final boolean AudioAttributesImplApi26Parcelizer(View view) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            if (this.write == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.RemoteActionCompatParcelizer = 2;
            int i2 = this.IconCompatParcelizer.read(view);
            if (i2 == -1) {
                MediaBrowserCompatItemReceiver(view);
                return true;
            }
            if (!this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i2)) {
                return false;
            }
            this.AudioAttributesCompatParcelizer.read(i2);
            MediaBrowserCompatItemReceiver(view);
            this.IconCompatParcelizer.write(i2);
            return true;
        } finally {
            this.RemoteActionCompatParcelizer = 0;
        }
    }

    static class write {
        private long IconCompatParcelizer = 0;
        private write RemoteActionCompatParcelizer;

        write() {
        }

        final void IconCompatParcelizer(int i) {
            if (i >= 64) {
                RemoteActionCompatParcelizer();
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(i - 64);
            } else {
                this.IconCompatParcelizer |= 1 << i;
            }
        }

        private void RemoteActionCompatParcelizer() {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new write();
            }
        }

        final void AudioAttributesCompatParcelizer(int i) {
            if (i >= 64) {
                write writeVar = this.RemoteActionCompatParcelizer;
                if (writeVar != null) {
                    writeVar.AudioAttributesCompatParcelizer(i - 64);
                    return;
                }
                return;
            }
            this.IconCompatParcelizer &= ~(1 << i);
        }

        final boolean RemoteActionCompatParcelizer(int i) {
            if (i < 64) {
                return (this.IconCompatParcelizer & (1 << i)) != 0;
            }
            RemoteActionCompatParcelizer();
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i - 64);
        }

        final void read() {
            this.IconCompatParcelizer = 0L;
            write writeVar = this.RemoteActionCompatParcelizer;
            if (writeVar != null) {
                writeVar.read();
            }
        }

        final void RemoteActionCompatParcelizer(int i, boolean z) {
            if (i >= 64) {
                RemoteActionCompatParcelizer();
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i - 64, z);
                return;
            }
            long j = this.IconCompatParcelizer;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.IconCompatParcelizer = (j & j2) | (((~j2) & j) << 1);
            if (z) {
                IconCompatParcelizer(i);
            } else {
                AudioAttributesCompatParcelizer(i);
            }
            if (z2 || this.RemoteActionCompatParcelizer != null) {
                RemoteActionCompatParcelizer();
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(0, z2);
            }
        }

        final boolean read(int i) {
            if (i >= 64) {
                RemoteActionCompatParcelizer();
                return this.RemoteActionCompatParcelizer.read(i - 64);
            }
            long j = 1 << i;
            long j2 = this.IconCompatParcelizer;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.IconCompatParcelizer = j3;
            long j4 = j - 1;
            this.IconCompatParcelizer = Long.rotateRight((~j4) & j3, 1) | (j4 & j3);
            write writeVar = this.RemoteActionCompatParcelizer;
            if (writeVar != null) {
                if (writeVar.RemoteActionCompatParcelizer(0)) {
                    IconCompatParcelizer(63);
                }
                this.RemoteActionCompatParcelizer.read(0);
            }
            return z;
        }

        final int write(int i) {
            write writeVar = this.RemoteActionCompatParcelizer;
            if (writeVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.IconCompatParcelizer);
                }
                return Long.bitCount(this.IconCompatParcelizer & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.IconCompatParcelizer & ((1 << i) - 1));
            }
            return writeVar.write(i - 64) + Long.bitCount(this.IconCompatParcelizer);
        }

        public final String toString() {
            if (this.RemoteActionCompatParcelizer == null) {
                return Long.toBinaryString(this.IconCompatParcelizer);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.RemoteActionCompatParcelizer.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.IconCompatParcelizer));
            return sb.toString();
        }
    }
}
