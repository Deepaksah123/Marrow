package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class buildBitrateString extends ReplacementSpan {
    private int AudioAttributesCompatParcelizer;
    private Resources IconCompatParcelizer;
    private Paint RemoteActionCompatParcelizer;
    private int read;
    private Context write;

    public buildBitrateString(Context context) {
        Paint paint = new Paint();
        this.RemoteActionCompatParcelizer = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(updateNavigation.read(context, 1));
        paint.setPathEffect(new CornerPathEffect(updateNavigation.read(context, 4)));
        paint.setAntiAlias(true);
        this.IconCompatParcelizer = context.getResources();
        this.write = context;
        paint.setColor(_isNaN.getColor(context, R.color.v1_onbackgroundsurface3));
        this.read = _isNaN.getColor(context, R.color.v1_onbackgroundsurface3);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int iMeasureText = (int) paint.measureText(charSequence, i, i2);
        this.AudioAttributesCompatParcelizer = iMeasureText;
        return iMeasureText + updateNavigation.read(this.write, 8) + ((int) this.RemoteActionCompatParcelizer.getStrokeWidth());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.setTextSize(TypedValue.applyDimension(2, 10.0f, this.write.getResources().getDisplayMetrics()));
        int iMeasureText = (int) paint.measureText(charSequence, i, i2);
        int i6 = updateNavigation.read(this.write, 4);
        int i7 = updateNavigation.read(this.write, 3);
        float strokeWidth = this.RemoteActionCompatParcelizer.getStrokeWidth() / 2.0f;
        float f2 = i6;
        float f3 = f + f2;
        canvas.drawRect(f + strokeWidth, i3 + i7 + strokeWidth, ((iMeasureText + f3) + f2) - strokeWidth, i5 - strokeWidth, this.RemoteActionCompatParcelizer);
        paint.setColor(this.read);
        canvas.drawText(charSequence, i, i2, f3, i4, paint);
    }
}
