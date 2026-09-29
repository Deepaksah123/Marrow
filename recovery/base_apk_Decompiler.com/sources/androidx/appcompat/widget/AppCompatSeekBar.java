package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import kotlin._init_lambda5;
import kotlin.remove;
import kotlin.setPositiveButton;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {
    private final remove write;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPositiveButton.IconCompatParcelizer(this, getContext());
        remove removeVar = new remove(this);
        this.write = removeVar;
        removeVar.AudioAttributesCompatParcelizer(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onDraw(Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.write.RemoteActionCompatParcelizer(canvas);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.write.IconCompatParcelizer();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.write.RemoteActionCompatParcelizer();
    }
}
