package com.marrow.ui.views;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.marrow.ui.views.TimerView;
import kotlin.Metadata;
import kotlin.getQues;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010$"}, d2 = {"Lcom/marrow/ui/views/TimerView;", "Lcom/marrow/ui/views/CustomTextView;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "read", "()V", "", "setInterval", "(J)V", "setTotalTimer", "Lcom/marrow/ui/views/TimerView$write;", "setTimerUpdateListener", "(Lcom/marrow/ui/views/TimerView$write;)V", "onDetachedFromWindow", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "AudioAttributesImplBaseParcelizer", "J", "IconCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "Ljava/lang/Runnable;", "RemoteActionCompatParcelizer", "Ljava/lang/Runnable;", "Lcom/marrow/ui/views/TimerView$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TimerView extends CustomTextView {

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private long IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private long write;
    private final Runnable RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private write read;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001À\u0006\u0003"}, d2 = {"Lcom/marrow/ui/views/TimerView$write;", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface write {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(TimerView timerView) {
        timerView.read();
    }

    private final void read() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.write;
        long j2 = this.IconCompatParcelizer;
        long j3 = j + j2;
        if (j2 == -1 || j3 > jCurrentTimeMillis) {
            postDelayed(this.RemoteActionCompatParcelizer, getQues.AudioAttributesCompatParcelizer(j3 - jCurrentTimeMillis, this.AudioAttributesCompatParcelizer));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerView(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = -1L;
        this.AudioAttributesCompatParcelizer = 1000L;
        this.RemoteActionCompatParcelizer = new Runnable() { // from class: o.getPreferredUpdateDelay
            @Override // java.lang.Runnable
            public final void run() {
                TimerView.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = -1L;
        this.AudioAttributesCompatParcelizer = 1000L;
        this.RemoteActionCompatParcelizer = new Runnable() { // from class: o.getPreferredUpdateDelay
            @Override // java.lang.Runnable
            public final void run() {
                TimerView.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = -1L;
        this.AudioAttributesCompatParcelizer = 1000L;
        this.RemoteActionCompatParcelizer = new Runnable() { // from class: o.getPreferredUpdateDelay
            @Override // java.lang.Runnable
            public final void run() {
                TimerView.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            }
        };
    }

    public final void setInterval(long p0) {
        this.AudioAttributesCompatParcelizer = p0;
    }

    public final void setTotalTimer(long p0) {
        this.IconCompatParcelizer = p0;
    }

    public final void setTimerUpdateListener(write p0) {
        this.read = p0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.RemoteActionCompatParcelizer);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putLong("total_time", this.IconCompatParcelizer);
        bundle.putLong("start_time", this.write);
        bundle.putLong("interval", this.AudioAttributesCompatParcelizer);
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof Bundle) {
            Bundle bundle = (Bundle) p0;
            this.IconCompatParcelizer = bundle.getLong("total_time", this.IconCompatParcelizer);
            this.write = bundle.getLong("start_time", this.write);
            this.AudioAttributesCompatParcelizer = bundle.getLong("interval", this.AudioAttributesCompatParcelizer);
            p0 = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(p0);
    }
}
