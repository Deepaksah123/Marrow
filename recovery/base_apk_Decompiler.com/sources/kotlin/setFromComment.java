package kotlin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import kotlin.getActivityBanner;
import kotlin.getMetadataCopyWithAppendedEntriesFrom;

/* JADX INFO: loaded from: classes3.dex */
public final class setFromComment<S extends getMetadataCopyWithAppendedEntriesFrom> extends setFromMetadata {
    private static final collectFromBundle<setFromComment> write = new collectFromBundle<setFromComment>("indicatorLevel") { // from class: o.setFromComment.1
        @Override // kotlin.collectFromBundle
        public final /* bridge */ /* synthetic */ float IconCompatParcelizer(setFromComment setfromcomment) {
            return IconCompatParcelizer2(setfromcomment);
        }

        @Override // kotlin.collectFromBundle
        public final /* synthetic */ void read(setFromComment setfromcomment, float f) {
            AudioAttributesCompatParcelizer(setfromcomment, f);
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
        private static float IconCompatParcelizer2(setFromComment setfromcomment) {
            return setfromcomment.MediaBrowserCompatItemReceiver() * 10000.0f;
        }

        private static void AudioAttributesCompatParcelizer(setFromComment setfromcomment, float f) {
            setfromcomment.IconCompatParcelizer(f / 10000.0f);
        }
    };
    private boolean AudioAttributesImplApi21Parcelizer;
    private ForwardingExtractorInput<S> AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private final ConcreteBeanPropertyBase MediaBrowserCompatCustomActionResultReceiver;
    private final legacyManglePropertyName MediaBrowserCompatItemReceiver;

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

    private setFromComment(Context context, getMetadataCopyWithAppendedEntriesFrom getmetadatacopywithappendedentriesfrom, ForwardingExtractorInput<S> forwardingExtractorInput) {
        super(context, getmetadatacopywithappendedentriesfrom);
        this.AudioAttributesImplApi21Parcelizer = false;
        AudioAttributesCompatParcelizer(forwardingExtractorInput);
        legacyManglePropertyName legacymanglepropertyname = new legacyManglePropertyName();
        this.MediaBrowserCompatItemReceiver = legacymanglepropertyname;
        legacymanglepropertyname.write();
        legacymanglepropertyname.AudioAttributesCompatParcelizer(50.0f);
        ConcreteBeanPropertyBase concreteBeanPropertyBase = new ConcreteBeanPropertyBase(this, write);
        this.MediaBrowserCompatCustomActionResultReceiver = concreteBeanPropertyBase;
        concreteBeanPropertyBase.IconCompatParcelizer(legacymanglepropertyname);
        read(1.0f);
    }

    public static setFromComment<LinearProgressIndicatorSpec> read(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new setFromComment<>(context, linearProgressIndicatorSpec, new IndexSeekMap(linearProgressIndicatorSpec));
    }

    public static setFromComment<CircularProgressIndicatorSpec> read(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new setFromComment<>(context, circularProgressIndicatorSpec, new hasGaplessInfo(circularProgressIndicatorSpec));
    }

    @Override // kotlin.setFromMetadata
    final boolean read(boolean z, boolean z2, boolean z3) {
        boolean z4 = super.read(z, z2, z3);
        FlacStreamMetadataSeekTable flacStreamMetadataSeekTable = this.AudioAttributesCompatParcelizer;
        float fRemoteActionCompatParcelizer = FlacStreamMetadataSeekTable.RemoteActionCompatParcelizer(this.IconCompatParcelizer.getContentResolver());
        if (fRemoteActionCompatParcelizer == BitmapDescriptorFactory.HUE_RED) {
            this.AudioAttributesImplApi21Parcelizer = true;
            return z4;
        }
        this.AudioAttributesImplApi21Parcelizer = false;
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(50.0f / fRemoteActionCompatParcelizer);
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer();
        IconCompatParcelizer(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        if (this.AudioAttributesImplApi21Parcelizer) {
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer();
            IconCompatParcelizer(i / 10000.0f);
            return true;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver() * 10000.0f);
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(i);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.AudioAttributesImplApi26Parcelizer.write();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.AudioAttributesImplApi26Parcelizer.write(canvas, getBounds(), IconCompatParcelizer());
            this.AudioAttributesImplApi26Parcelizer.write(canvas, this.read);
            this.AudioAttributesImplApi26Parcelizer.write(canvas, this.read, BitmapDescriptorFactory.HUE_RED, MediaBrowserCompatItemReceiver(), createExtractors.IconCompatParcelizer(this.RemoteActionCompatParcelizer.write[0], getAlpha()));
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(float f) {
        this.AudioAttributesImplBaseParcelizer = f;
        invalidateSelf();
    }

    public final ForwardingExtractorInput<S> write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private void AudioAttributesCompatParcelizer(ForwardingExtractorInput<S> forwardingExtractorInput) {
        this.AudioAttributesImplApi26Parcelizer = forwardingExtractorInput;
        forwardingExtractorInput.IconCompatParcelizer(this);
    }
}
