package kotlin;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.reportWithConversionId;

/* JADX INFO: loaded from: classes4.dex */
final class enableAutomatedUsageReporting extends ViewGroup implements PieEntry {
    final View AudioAttributesCompatParcelizer;
    private final ViewTreeObserver.OnPreDrawListener IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private Matrix RemoteActionCompatParcelizer;
    View read;
    ViewGroup write;

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    private enableAutomatedUsageReporting(View view) {
        super(view.getContext());
        this.IconCompatParcelizer = new ViewTreeObserver.OnPreDrawListener() { // from class: o.enableAutomatedUsageReporting.5
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                enableAutomatedUsageReporting.this.postInvalidateOnAnimation();
                if (enableAutomatedUsageReporting.this.write == null || enableAutomatedUsageReporting.this.read == null) {
                    return true;
                }
                enableAutomatedUsageReporting.this.write.endViewTransition(enableAutomatedUsageReporting.this.read);
                enableAutomatedUsageReporting.this.write.postInvalidateOnAnimation();
                enableAutomatedUsageReporting.this.write = null;
                enableAutomatedUsageReporting.this.read = null;
                return true;
            }
        };
        this.AudioAttributesCompatParcelizer = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // android.view.View, kotlin.PieEntry
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer) == this) {
            ab.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, i == 0 ? 4 : 0);
        }
    }

    private void write(Matrix matrix) {
        this.RemoteActionCompatParcelizer = matrix;
    }

    @Override // kotlin.PieEntry
    public final void IconCompatParcelizer(ViewGroup viewGroup, View view) {
        this.write = viewGroup;
        this.read = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this);
        this.AudioAttributesCompatParcelizer.getViewTreeObserver().addOnPreDrawListener(this.IconCompatParcelizer);
        ab.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 4);
        if (this.AudioAttributesCompatParcelizer.getParent() != null) {
            ((View) this.AudioAttributesCompatParcelizer.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.AudioAttributesCompatParcelizer.getViewTreeObserver().removeOnPreDrawListener(this.IconCompatParcelizer);
        ab.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 0);
        AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, null);
        if (this.AudioAttributesCompatParcelizer.getParent() != null) {
            ((View) this.AudioAttributesCompatParcelizer.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        ScatterChart.RemoteActionCompatParcelizer(canvas, true);
        canvas.setMatrix(this.RemoteActionCompatParcelizer);
        ab.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 0);
        this.AudioAttributesCompatParcelizer.invalidate();
        ab.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 4);
        drawChild(canvas, this.AudioAttributesCompatParcelizer, getDrawingTime());
        ScatterChart.RemoteActionCompatParcelizer(canvas, false);
    }

    private static void IconCompatParcelizer(View view, View view2) {
        ab.write(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    private static enableAutomatedUsageReporting AudioAttributesCompatParcelizer(View view) {
        return (enableAutomatedUsageReporting) view.getTag(reportWithConversionId.RemoteActionCompatParcelizer.ghost_view);
    }

    private static void AudioAttributesCompatParcelizer(View view, enableAutomatedUsageReporting enableautomatedusagereporting) {
        view.setTag(reportWithConversionId.RemoteActionCompatParcelizer.ghost_view, enableautomatedusagereporting);
    }

    private static void RemoteActionCompatParcelizer(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        ab.IconCompatParcelizer(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        ab.AudioAttributesCompatParcelizer(viewGroup, matrix);
    }

    static enableAutomatedUsageReporting read(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        AdWordsAutomatedUsageReporter adWordsAutomatedUsageReporter;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        AdWordsAutomatedUsageReporter adWordsAutomatedUsageReporterAudioAttributesCompatParcelizer = AdWordsAutomatedUsageReporter.AudioAttributesCompatParcelizer(viewGroup);
        enableAutomatedUsageReporting enableautomatedusagereportingAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(view);
        if (enableautomatedusagereportingAudioAttributesCompatParcelizer == null || (adWordsAutomatedUsageReporter = (AdWordsAutomatedUsageReporter) enableautomatedusagereportingAudioAttributesCompatParcelizer.getParent()) == adWordsAutomatedUsageReporterAudioAttributesCompatParcelizer) {
            i = 0;
        } else {
            i = enableautomatedusagereportingAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
            adWordsAutomatedUsageReporter.removeView(enableautomatedusagereportingAudioAttributesCompatParcelizer);
            enableautomatedusagereportingAudioAttributesCompatParcelizer = null;
        }
        if (enableautomatedusagereportingAudioAttributesCompatParcelizer == null) {
            if (matrix == null) {
                matrix = new Matrix();
                RemoteActionCompatParcelizer(view, viewGroup, matrix);
            }
            enableautomatedusagereportingAudioAttributesCompatParcelizer = new enableAutomatedUsageReporting(view);
            enableautomatedusagereportingAudioAttributesCompatParcelizer.write(matrix);
            if (adWordsAutomatedUsageReporterAudioAttributesCompatParcelizer == null) {
                adWordsAutomatedUsageReporterAudioAttributesCompatParcelizer = new AdWordsAutomatedUsageReporter(viewGroup);
            } else {
                adWordsAutomatedUsageReporterAudioAttributesCompatParcelizer.write();
            }
            IconCompatParcelizer((View) viewGroup, (View) adWordsAutomatedUsageReporterAudioAttributesCompatParcelizer);
            IconCompatParcelizer((View) viewGroup, (View) enableautomatedusagereportingAudioAttributesCompatParcelizer);
            adWordsAutomatedUsageReporterAudioAttributesCompatParcelizer.read(enableautomatedusagereportingAudioAttributesCompatParcelizer);
            enableautomatedusagereportingAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver = i;
        } else if (matrix != null) {
            enableautomatedusagereportingAudioAttributesCompatParcelizer.write(matrix);
        }
        enableautomatedusagereportingAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver++;
        return enableautomatedusagereportingAudioAttributesCompatParcelizer;
    }

    static void write(View view) {
        enableAutomatedUsageReporting enableautomatedusagereportingAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(view);
        if (enableautomatedusagereportingAudioAttributesCompatParcelizer != null) {
            int i = enableautomatedusagereportingAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver - 1;
            enableautomatedusagereportingAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver = i;
            if (i <= 0) {
                ((AdWordsAutomatedUsageReporter) enableautomatedusagereportingAudioAttributesCompatParcelizer.getParent()).removeView(enableautomatedusagereportingAudioAttributesCompatParcelizer);
            }
        }
    }
}
