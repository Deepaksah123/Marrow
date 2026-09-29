package kotlin;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class rootObjectScope {
    private boolean AudioAttributesCompatParcelizer;
    private final View IconCompatParcelizer;
    private ViewParent RemoteActionCompatParcelizer;
    private ViewParent read;
    private int[] write;

    public rootObjectScope(View view) {
        this.IconCompatParcelizer = view;
    }

    public final void write(boolean z) {
        if (this.AudioAttributesCompatParcelizer) {
            InvalidTypeIdException.onSetCaptioningEnabled(this.IconCompatParcelizer);
        }
        this.AudioAttributesCompatParcelizer = z;
    }

    public final boolean read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean write() {
        return read(0);
    }

    public final boolean read(int i) {
        return IconCompatParcelizer(i) != null;
    }

    public final boolean write(int i) {
        return read(i, 0);
    }

    public final boolean read(int i, int i2) {
        if (read(i2)) {
            return true;
        }
        if (!read()) {
            return false;
        }
        View view = this.IconCompatParcelizer;
        for (ViewParent parent = this.IconCompatParcelizer.getParent(); parent != null; parent = parent.getParent()) {
            if (Java7HandlersImpl.IconCompatParcelizer(parent, view, this.IconCompatParcelizer, i, i2)) {
                IconCompatParcelizer(i2, parent);
                Java7HandlersImpl.read(parent, view, this.IconCompatParcelizer, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public final void IconCompatParcelizer() {
        AudioAttributesCompatParcelizer(0);
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        ViewParent viewParentIconCompatParcelizer = IconCompatParcelizer(i);
        if (viewParentIconCompatParcelizer != null) {
            Java7HandlersImpl.AudioAttributesCompatParcelizer(viewParentIconCompatParcelizer, this.IconCompatParcelizer, i);
            IconCompatParcelizer(i, null);
        }
    }

    public final boolean RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int[] iArr) {
        return AudioAttributesCompatParcelizer(i, i2, i3, i4, iArr, 0, null);
    }

    public final void IconCompatParcelizer(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        AudioAttributesCompatParcelizer(i, i2, i3, i4, iArr, i5, iArr2);
    }

    private boolean AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentIconCompatParcelizer;
        int i6;
        int i7;
        int[] iArr3;
        if (!read() || (viewParentIconCompatParcelizer = IconCompatParcelizer(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.IconCompatParcelizer.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] iArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            iArrAudioAttributesCompatParcelizer[0] = 0;
            iArrAudioAttributesCompatParcelizer[1] = 0;
            iArr3 = iArrAudioAttributesCompatParcelizer;
        } else {
            iArr3 = iArr2;
        }
        Java7HandlersImpl.write(viewParentIconCompatParcelizer, this.IconCompatParcelizer, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.IconCompatParcelizer.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final boolean write(int i, int i2, int[] iArr, int[] iArr2) {
        return write(i, i2, iArr, iArr2, 0);
    }

    public final boolean write(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentIconCompatParcelizer;
        int i4;
        int i5;
        if (!read() || (viewParentIconCompatParcelizer = IconCompatParcelizer(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.IconCompatParcelizer.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = AudioAttributesCompatParcelizer();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        Java7HandlersImpl.IconCompatParcelizer(viewParentIconCompatParcelizer, this.IconCompatParcelizer, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.IconCompatParcelizer.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean AudioAttributesCompatParcelizer(float f, float f2, boolean z) {
        ViewParent viewParentIconCompatParcelizer;
        if (!read() || (viewParentIconCompatParcelizer = IconCompatParcelizer(0)) == null) {
            return false;
        }
        return Java7HandlersImpl.RemoteActionCompatParcelizer(viewParentIconCompatParcelizer, this.IconCompatParcelizer, f, f2, z);
    }

    public final boolean RemoteActionCompatParcelizer(float f, float f2) {
        ViewParent viewParentIconCompatParcelizer;
        if (!read() || (viewParentIconCompatParcelizer = IconCompatParcelizer(0)) == null) {
            return false;
        }
        return Java7HandlersImpl.AudioAttributesCompatParcelizer(viewParentIconCompatParcelizer, this.IconCompatParcelizer, f, f2);
    }

    private ViewParent IconCompatParcelizer(int i) {
        if (i == 0) {
            return this.read;
        }
        if (i != 1) {
            return null;
        }
        return this.RemoteActionCompatParcelizer;
    }

    private void IconCompatParcelizer(int i, ViewParent viewParent) {
        if (i == 0) {
            this.read = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.RemoteActionCompatParcelizer = viewParent;
        }
    }

    private int[] AudioAttributesCompatParcelizer() {
        if (this.write == null) {
            this.write = new int[2];
        }
        return this.write;
    }
}
