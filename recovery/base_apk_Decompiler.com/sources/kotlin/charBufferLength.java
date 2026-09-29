package kotlin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0006\u0010\u000fJ\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0006\u0010\u0010J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000b\u0010\u0012J7\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0005\u0010\u0017J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0006\u0010\u0019J\u0011\u0010\u0006\u001a\u00020\u001a*\u00020\u0015¢\u0006\u0004\b\u0006\u0010\u001bJ'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\u001fJG\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\"J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010#JO\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010&J\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010'J'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020(2\u0006\u0010\n\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010)J?\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020(2\u0006\u0010\n\u001a\u00020*2\u0006\u0010\u0013\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020+2\u0006\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010,J\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003R&\u0010\u000b\u001a\u00060-j\u0002`.8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010/\u001a\u0004\b\u000b\u00100\"\u0004\b\u001d\u00101R\u0018\u0010\u0006\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0018\u0010\u001d\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0005\u00103"}, d2 = {"Lo/charBufferLength;", "Lo/JsonParserDelegate;", "<init>", "()V", "", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/WritableTypeIdInclusion;", "p0", "Lo/releaseBuffers;", "p1", "read", "(Lo/WritableTypeIdInclusion;Lo/releaseBuffers;)V", "", "RemoteActionCompatParcelizer", "(FF)V", "(F)V", "Lo/resetWithShared;", "([F)V", "p2", "p3", "Lo/ReadConstrainedTextBuffer;", "p4", "(FFFFI)V", "Lo/removeSoftRefsClearedByGc;", "(Lo/removeSoftRefsClearedByGc;I)V", "Landroid/graphics/Region$Op;", "(I)Landroid/graphics/Region$Op;", "Lo/getReferencedType;", "write", "(JJLo/releaseBuffers;)V", "(FFFFLo/releaseBuffers;)V", "p5", "p6", "(FFFFFFLo/releaseBuffers;)V", "(JFLo/releaseBuffers;)V", "", "p7", "(FFFFFFZLo/releaseBuffers;)V", "(Lo/removeSoftRefsClearedByGc;Lo/releaseBuffers;)V", "Lo/unshare;", "(Lo/unshare;JLo/releaseBuffers;)V", "Lo/hasReferringProperties;", "Lo/getKey;", "(Lo/unshare;JJJJLo/releaseBuffers;)V", "Landroid/graphics/Canvas;", "Lo/read;", "Landroid/graphics/Canvas;", "()Landroid/graphics/Canvas;", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class charBufferLength implements JsonParserDelegate {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Canvas read = balloc.RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Rect write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Rect AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from getter */
    public final Canvas getRead() {
        return this.read;
    }

    public final void write(Canvas canvas) {
        this.read = canvas;
    }

    @Override // kotlin.JsonParserDelegate
    public final void IconCompatParcelizer() {
        this.read.save();
    }

    @Override // kotlin.JsonParserDelegate
    public final void AudioAttributesCompatParcelizer() {
        this.read.restore();
    }

    @Override // kotlin.JsonParserDelegate
    public final void read(WritableTypeIdInclusion p0, releaseBuffers p1) {
        this.read.saveLayer(p0.getAudioAttributesCompatParcelizer(), p0.getRemoteActionCompatParcelizer(), p0.getWrite(), p0.getIconCompatParcelizer(), p1.IconCompatParcelizer(), 31);
    }

    @Override // kotlin.JsonParserDelegate
    public final void RemoteActionCompatParcelizer(float p0, float p1) {
        this.read.translate(p0, p1);
    }

    @Override // kotlin.JsonParserDelegate
    public final void AudioAttributesCompatParcelizer(float p0, float p1) {
        this.read.scale(p0, p1);
    }

    @Override // kotlin.JsonParserDelegate
    public final void AudioAttributesCompatParcelizer(float p0) {
        this.read.rotate(p0);
    }

    @Override // kotlin.JsonParserDelegate
    public final void read(float[] p0) {
        if (getTextBuffer.write(p0)) {
            return;
        }
        Matrix matrix = new Matrix();
        appendThreeBytes.read(matrix, p0);
        this.read.concat(matrix);
    }

    @Override // kotlin.JsonParserDelegate
    public final void IconCompatParcelizer(float p0, float p1, float p2, float p3, int p4) {
        this.read.clipRect(p0, p1, p2, p3, AudioAttributesCompatParcelizer(p4));
    }

    @Override // kotlin.JsonParserDelegate
    public final void AudioAttributesCompatParcelizer(removeSoftRefsClearedByGc p0, int p1) {
        Canvas canvas = this.read;
        if (p0 instanceof getCurrentSegment) {
            canvas.clipPath(((getCurrentSegment) p0).getRemoteActionCompatParcelizer(), AudioAttributesCompatParcelizer(p1));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final Region.Op AudioAttributesCompatParcelizer(int i) {
        return ReadConstrainedTextBuffer.write(i, ReadConstrainedTextBuffer.INSTANCE.RemoteActionCompatParcelizer()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // kotlin.JsonParserDelegate
    public final void write(long p0, long p1, releaseBuffers p2) {
        this.read.drawLine(Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) p0), Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) p1), p2.IconCompatParcelizer());
    }

    @Override // kotlin.JsonParserDelegate
    public final void read(float p0, float p1, float p2, float p3, releaseBuffers p4) {
        this.read.drawRect(p0, p1, p2, p3, p4.IconCompatParcelizer());
    }

    @Override // kotlin.JsonParserDelegate
    public final void read(float p0, float p1, float p2, float p3, float p4, float p5, releaseBuffers p6) {
        this.read.drawRoundRect(p0, p1, p2, p3, p4, p5, p6.IconCompatParcelizer());
    }

    @Override // kotlin.JsonParserDelegate
    public final void read(long p0, float p1, releaseBuffers p2) {
        this.read.drawCircle(Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) p0), p1, p2.IconCompatParcelizer());
    }

    @Override // kotlin.JsonParserDelegate
    public final void read(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6, releaseBuffers p7) {
        this.read.drawArc(p0, p1, p2, p3, p4, p5, p6, p7.IconCompatParcelizer());
    }

    @Override // kotlin.JsonParserDelegate
    public final void write(removeSoftRefsClearedByGc p0, releaseBuffers p1) {
        Canvas canvas = this.read;
        if (p0 instanceof getCurrentSegment) {
            canvas.drawPath(((getCurrentSegment) p0).getRemoteActionCompatParcelizer(), p1.IconCompatParcelizer());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // kotlin.JsonParserDelegate
    public final void RemoteActionCompatParcelizer(unshare p0, long p1, releaseBuffers p2) {
        this.read.drawBitmap(_allocMore.AudioAttributesCompatParcelizer(p0), Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) p1), p2.IconCompatParcelizer());
    }

    @Override // kotlin.JsonParserDelegate
    public final void write(unshare p0, long p1, long p2, long p3, long p4, releaseBuffers p5) {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new Rect();
            this.write = new Rect();
        }
        Canvas canvas = this.read;
        Bitmap bitmapAudioAttributesCompatParcelizer = _allocMore.AudioAttributesCompatParcelizer(p0);
        Rect rect = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(rect);
        rect.left = hasReferringProperties.IconCompatParcelizer(p1);
        rect.top = hasReferringProperties.AudioAttributesCompatParcelizer(p1);
        rect.right = hasReferringProperties.IconCompatParcelizer(p1) + ((int) (p2 >> 32));
        rect.bottom = hasReferringProperties.AudioAttributesCompatParcelizer(p1) + ((int) p2);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        Rect rect2 = this.write;
        toMagicModuleMetaRepoModel.write(rect2);
        rect2.left = hasReferringProperties.IconCompatParcelizer(p3);
        rect2.top = hasReferringProperties.AudioAttributesCompatParcelizer(p3);
        rect2.right = hasReferringProperties.IconCompatParcelizer(p3) + ((int) (p4 >> 32));
        rect2.bottom = hasReferringProperties.AudioAttributesCompatParcelizer(p3) + ((int) p4);
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        canvas.drawBitmap(bitmapAudioAttributesCompatParcelizer, rect, rect2, p5.IconCompatParcelizer());
    }

    @Override // kotlin.JsonParserDelegate
    public final void write() {
        addFlattenedActiveParsers.INSTANCE.read(this.read, true);
    }

    @Override // kotlin.JsonParserDelegate
    public final void RemoteActionCompatParcelizer() {
        addFlattenedActiveParsers.INSTANCE.read(this.read, false);
    }
}
