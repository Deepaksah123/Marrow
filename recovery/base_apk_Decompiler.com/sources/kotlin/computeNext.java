package kotlin;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* JADX INFO: loaded from: classes2.dex */
public final class computeNext {
    public static final computeNext IconCompatParcelizer = new computeNext(-1, -16777216, 0, 0, -1, null);
    public final int AudioAttributesCompatParcelizer;
    public final int AudioAttributesImplApi26Parcelizer;
    public final Typeface AudioAttributesImplBaseParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int write;

    public static computeNext RemoteActionCompatParcelizer(CaptioningManager.CaptionStyle captionStyle) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21) {
            return IconCompatParcelizer(captionStyle);
        }
        return new computeNext(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    public computeNext(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
        this.AudioAttributesImplApi26Parcelizer = i3;
        this.AudioAttributesCompatParcelizer = i4;
        this.read = i5;
        this.AudioAttributesImplBaseParcelizer = typeface;
    }

    private static computeNext IconCompatParcelizer(CaptioningManager.CaptionStyle captionStyle) {
        return new computeNext(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : IconCompatParcelizer.write, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : IconCompatParcelizer.RemoteActionCompatParcelizer, captionStyle.hasWindowColor() ? captionStyle.windowColor : IconCompatParcelizer.AudioAttributesImplApi26Parcelizer, captionStyle.hasEdgeType() ? captionStyle.edgeType : IconCompatParcelizer.AudioAttributesCompatParcelizer, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : IconCompatParcelizer.read, captionStyle.getTypeface());
    }
}
