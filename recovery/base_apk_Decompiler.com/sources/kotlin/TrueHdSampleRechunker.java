package kotlin;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes5.dex */
public final class TrueHdSampleRechunker extends Drawable implements readSample {
    private read AudioAttributesCompatParcelizer;

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    /* synthetic */ TrueHdSampleRechunker(read readVar, byte b) {
        this(readVar);
    }

    public TrueHdSampleRechunker(isValidFrameType isvalidframetype) {
        this(new read(new frameSizeBytesByTypeNb(isvalidframetype)));
    }

    private TrueHdSampleRechunker(read readVar) {
        this.AudioAttributesCompatParcelizer = readVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.AudioAttributesCompatParcelizer.read.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.AudioAttributesCompatParcelizer.read.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.AudioAttributesCompatParcelizer.read.setTintList(colorStateList);
    }

    @Override // kotlin.readSample
    public final void setShapeAppearanceModel(isValidFrameType isvalidframetype) {
        this.AudioAttributesCompatParcelizer.read.setShapeAppearanceModel(isvalidframetype);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.AudioAttributesCompatParcelizer.read.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean z = outputPendingSampleMetadata.read(iArr);
        if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer == z) {
            return zOnStateChange;
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer = z;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) {
            this.AudioAttributesCompatParcelizer.read.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.AudioAttributesCompatParcelizer.read.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public TrueHdSampleRechunker mutate() {
        this.AudioAttributesCompatParcelizer = new read(this.AudioAttributesCompatParcelizer);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.AudioAttributesCompatParcelizer.read.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.AudioAttributesCompatParcelizer.read.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.AudioAttributesCompatParcelizer.read.getOpacity();
    }

    static final class read extends Drawable.ConstantState {
        boolean RemoteActionCompatParcelizer;
        frameSizeBytesByTypeNb read;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        public read(frameSizeBytesByTypeNb framesizebytesbytypenb) {
            this.read = framesizebytesbytypenb;
            this.RemoteActionCompatParcelizer = false;
        }

        public read(read readVar) {
            this.read = (frameSizeBytesByTypeNb) readVar.read.getConstantState().newDrawable();
            this.RemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public TrueHdSampleRechunker newDrawable() {
            return new TrueHdSampleRechunker(new read(this), (byte) 0);
        }
    }
}
