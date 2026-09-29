package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class compare extends setDrmUserAgent {
    public compare(onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(onkeyresponse, lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
    }

    protected final void write(Canvas canvas, Path path, Drawable drawable) {
        if (IconCompatParcelizer()) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            drawable.setBounds((int) this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), (int) this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer(), (int) this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), (int) this.MediaBrowserCompatSearchResultReceiver.read());
            drawable.draw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        StringBuilder sb = new StringBuilder("Fill-drawables not (yet) supported below API level 18, this code was run on API level ");
        sb.append(drmSessionAcquired.RemoteActionCompatParcelizer());
        sb.append(".");
        throw new RuntimeException(sb.toString());
    }

    protected final void IconCompatParcelizer(Canvas canvas, Path path, int i, int i2) {
        int i3 = (i & 16777215) | (i2 << 24);
        if (IconCompatParcelizer()) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i3);
            canvas.restoreToCount(iSave);
            return;
        }
        Paint.Style style = this.AudioAttributesImplBaseParcelizer.getStyle();
        int color = this.AudioAttributesImplBaseParcelizer.getColor();
        this.AudioAttributesImplBaseParcelizer.setStyle(Paint.Style.FILL);
        this.AudioAttributesImplBaseParcelizer.setColor(i3);
        canvas.drawPath(path, this.AudioAttributesImplBaseParcelizer);
        this.AudioAttributesImplBaseParcelizer.setColor(color);
        this.AudioAttributesImplBaseParcelizer.setStyle(style);
    }

    private static boolean IconCompatParcelizer() {
        return drmSessionAcquired.RemoteActionCompatParcelizer() >= 18;
    }
}
