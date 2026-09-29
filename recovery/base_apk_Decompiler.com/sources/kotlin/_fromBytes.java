package kotlin;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class _fromBytes {
    private final DisplayCutout RemoteActionCompatParcelizer;

    private _fromBytes(DisplayCutout displayCutout) {
        this.RemoteActionCompatParcelizer = displayCutout;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return AudioAttributesCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final int read() {
        return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final int write() {
        return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final int AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer.read(this.RemoteActionCompatParcelizer);
    }

    public final List<Rect> RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer.write(this.RemoteActionCompatParcelizer);
    }

    public final _verifyEndArrayForSingle AudioAttributesImplApi21Parcelizer() {
        if (Build.VERSION.SDK_INT >= 30) {
            return _verifyEndArrayForSingle.write(read.IconCompatParcelizer(this.RemoteActionCompatParcelizer));
        }
        return _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
    }

    public final Path IconCompatParcelizer() {
        if (Build.VERSION.SDK_INT >= 31) {
            return write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return configureFromStringCreator.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((_fromBytes) obj).RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.RemoteActionCompatParcelizer;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayCutoutCompat{");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public static _fromBytes AudioAttributesCompatParcelizer(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new _fromBytes(displayCutout);
    }

    static class AudioAttributesCompatParcelizer {
        static int IconCompatParcelizer(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        static int RemoteActionCompatParcelizer(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int AudioAttributesCompatParcelizer(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int read(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static List<Rect> write(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }
    }

    static class read {
        static Insets IconCompatParcelizer(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    static class write {
        static Path AudioAttributesCompatParcelizer(DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }
}
