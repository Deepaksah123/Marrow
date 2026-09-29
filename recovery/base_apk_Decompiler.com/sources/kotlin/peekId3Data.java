package kotlin;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import kotlin.getActivityBanner;
import kotlin.getMetadataCopyWithAppendedEntriesFrom;

/* JADX INFO: loaded from: classes3.dex */
public final class peekId3Data<S extends getMetadataCopyWithAppendedEntriesFrom> extends setFromMetadata {
    private ForwardingExtractorInput<S> MediaBrowserCompatCustomActionResultReceiver;
    private setFromXingHeaderValue<ObjectAnimator> write;

    @Override // kotlin.setFromMetadata
    public final /* bridge */ /* synthetic */ boolean AudioAttributesCompatParcelizer() {
        return super.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setFromMetadata
    public final /* bridge */ /* synthetic */ boolean AudioAttributesCompatParcelizer(getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return super.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
    }

    @Override // kotlin.setFromMetadata
    public final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
    }

    @Override // kotlin.setFromMetadata
    public final /* bridge */ /* synthetic */ boolean RemoteActionCompatParcelizer() {
        return super.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setFromMetadata, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // kotlin.setFromMetadata, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // kotlin.setFromMetadata, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // kotlin.setFromMetadata
    public final /* bridge */ /* synthetic */ boolean read() {
        return super.read();
    }

    @Override // kotlin.setFromMetadata, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // kotlin.setFromMetadata, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // kotlin.setFromMetadata, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // kotlin.setFromMetadata, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // kotlin.setFromMetadata, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // kotlin.setFromMetadata
    public final /* bridge */ /* synthetic */ boolean write(boolean z, boolean z2, boolean z3) {
        return super.write(z, z2, z3);
    }

    private peekId3Data(Context context, getMetadataCopyWithAppendedEntriesFrom getmetadatacopywithappendedentriesfrom, ForwardingExtractorInput<S> forwardingExtractorInput, setFromXingHeaderValue<ObjectAnimator> setfromxingheadervalue) {
        super(context, getmetadatacopywithappendedentriesfrom);
        IconCompatParcelizer(forwardingExtractorInput);
        read(setfromxingheadervalue);
    }

    public static peekId3Data<LinearProgressIndicatorSpec> AudioAttributesCompatParcelizer(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        setFromXingHeaderValue positionHolder;
        IndexSeekMap indexSeekMap = new IndexSeekMap(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.AudioAttributesImplBaseParcelizer == 0) {
            positionHolder = new Id3Peeker(linearProgressIndicatorSpec);
        } else {
            positionHolder = new PositionHolder(context, linearProgressIndicatorSpec);
        }
        return new peekId3Data<>(context, linearProgressIndicatorSpec, indexSeekMap, positionHolder);
    }

    public static peekId3Data<CircularProgressIndicatorSpec> AudioAttributesCompatParcelizer(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new peekId3Data<>(context, circularProgressIndicatorSpec, new hasGaplessInfo(circularProgressIndicatorSpec), new GaplessInfoHolder(circularProgressIndicatorSpec));
    }

    @Override // kotlin.setFromMetadata
    final boolean read(boolean z, boolean z2, boolean z3) {
        boolean z4 = super.read(z, z2, z3);
        if (!isRunning()) {
            this.write.RemoteActionCompatParcelizer();
        }
        FlacStreamMetadataSeekTable flacStreamMetadataSeekTable = this.AudioAttributesCompatParcelizer;
        FlacStreamMetadataSeekTable.RemoteActionCompatParcelizer(this.IconCompatParcelizer.getContentResolver());
        if (!z || !z3) {
            return z4;
        }
        this.write.AudioAttributesCompatParcelizer();
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.MediaBrowserCompatCustomActionResultReceiver.write();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.MediaBrowserCompatCustomActionResultReceiver.write(canvas, getBounds(), IconCompatParcelizer());
            this.MediaBrowserCompatCustomActionResultReceiver.write(canvas, this.read);
            for (int i = 0; i < this.write.RemoteActionCompatParcelizer.length; i++) {
                int i2 = i << 1;
                this.MediaBrowserCompatCustomActionResultReceiver.write(canvas, this.read, this.write.read[i2], this.write.read[i2 + 1], this.write.RemoteActionCompatParcelizer[i]);
            }
            canvas.restore();
        }
    }

    public final setFromXingHeaderValue<ObjectAnimator> write() {
        return this.write;
    }

    public final void read(setFromXingHeaderValue<ObjectAnimator> setfromxingheadervalue) {
        this.write = setfromxingheadervalue;
        setfromxingheadervalue.write(this);
    }

    public final ForwardingExtractorInput<S> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    private void IconCompatParcelizer(ForwardingExtractorInput<S> forwardingExtractorInput) {
        this.MediaBrowserCompatCustomActionResultReceiver = forwardingExtractorInput;
        forwardingExtractorInput.IconCompatParcelizer(this);
    }
}
