package com.marrow.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.video.Subtitle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u00020\u00158\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00158\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/marrow/ui/views/CustomProgressMarkerView;", "Landroid/view/View;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "AudioAttributesCompatParcelizer", "()V", "Landroid/graphics/Canvas;", "onDraw", "(Landroid/graphics/Canvas;)V", "read", "I", "write", "Landroid/graphics/Paint;", "viewPaint", "Landroid/graphics/Paint;", "getViewPaint", "()Landroid/graphics/Paint;", "setViewPaint", "(Landroid/graphics/Paint;)V", "markerPaint", "getMarkerPaint", "setMarkerPaint", "", "Lcom/marrow/data/models/video/Subtitle;", "IconCompatParcelizer", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomProgressMarkerView extends View {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private List<Subtitle> read;
    public Paint markerPaint;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int write;
    public Paint viewPaint;

    public final Paint getViewPaint() {
        Paint paint = this.viewPaint;
        if (paint != null) {
            return paint;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void setViewPaint(Paint paint) {
        toMagicModuleMetaRepoModel.write(paint, "");
        this.viewPaint = paint;
    }

    public final Paint getMarkerPaint() {
        Paint paint = this.markerPaint;
        if (paint != null) {
            return paint;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void setMarkerPaint(Paint paint) {
        toMagicModuleMetaRepoModel.write(paint, "");
        this.markerPaint = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomProgressMarkerView(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        this.read = new ArrayList();
        AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomProgressMarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        this.read = new ArrayList();
        AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomProgressMarkerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.read = new ArrayList();
        AudioAttributesCompatParcelizer();
    }

    private final void AudioAttributesCompatParcelizer() {
        setMarkerPaint(new Paint());
        setViewPaint(new Paint());
        getMarkerPaint().setStyle(Paint.Style.FILL);
        getViewPaint().setStyle(Paint.Style.FILL);
        getMarkerPaint().setColor(Color.parseColor("#d56f62"));
        getViewPaint().setColor(Color.parseColor("#00ffffff"));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), getViewPaint());
        getWidth();
        Iterator<T> it = this.read.iterator();
        if (it.hasNext()) {
            long j = ((Subtitle) it.next()).startTimeMs;
            throw new ArithmeticException();
        }
    }
}
