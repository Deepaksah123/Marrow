package kotlin;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.removeSoftRefsClearedByGc;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0010J/\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0010J/\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0010J/\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J?\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0014J?\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0014J\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\f\u0010\u0017J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u000b\u0010\u0017J\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\r\u0010\u0019J\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\f\u0010\u001bJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u000b\u0010\u001fJ\u000f\u0010\t\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\t\u0010 J'\u0010\u000b\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020!H\u0016¢\u0006\u0004\b\u000b\u0010#J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\f\u0010$R\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b\u0011\u0010&R\u0018\u0010\t\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0018\u0010\u0011\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010*R\u0018\u0010\u000b\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010,R$\u0010\f\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020-8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010.\"\u0004\b\f\u0010/R\u0014\u00101\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u00100"}, d2 = {"Lo/getCurrentSegment;", "Lo/removeSoftRefsClearedByGc;", "Landroid/graphics/Path;", "p0", "<init>", "(Landroid/graphics/Path;)V", "", "p1", "", "IconCompatParcelizer", "(FF)V", "read", "write", "RemoteActionCompatParcelizer", "p2", "p3", "(FFFF)V", "AudioAttributesCompatParcelizer", "p4", "p5", "(FFFFFF)V", "Lo/WritableTypeIdInclusion;", "Lo/removeSoftRefsClearedByGc$write;", "(Lo/WritableTypeIdInclusion;Lo/removeSoftRefsClearedByGc$write;)V", "Lo/WritableTypeId;", "(Lo/WritableTypeId;Lo/removeSoftRefsClearedByGc$write;)V", "Lo/getReferencedType;", "(Lo/removeSoftRefsClearedByGc;J)V", "()V", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "(J)V", "()Lo/WritableTypeIdInclusion;", "Lo/wrapAndTrack;", "", "(Lo/removeSoftRefsClearedByGc;Lo/removeSoftRefsClearedByGc;I)Z", "(Lo/WritableTypeIdInclusion;)V", "Landroid/graphics/Path;", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "", "[F", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "Lo/instance;", "()I", "(I)V", "()Z", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getCurrentSegment implements removeSoftRefsClearedByGc {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Matrix read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private RectF IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Path RemoteActionCompatParcelizer;

    public getCurrentSegment(Path path) {
        this.RemoteActionCompatParcelizer = path;
    }

    public /* synthetic */ getCurrentSegment(Path path, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? new Path() : path);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Path getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final int write() {
        if (this.RemoteActionCompatParcelizer.getFillType() == Path.FillType.EVEN_ODD) {
            return instance.INSTANCE.write();
        }
        return instance.INSTANCE.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void write(int i) {
        Path.FillType fillType;
        Path path = this.RemoteActionCompatParcelizer;
        if (instance.AudioAttributesCompatParcelizer(i, instance.INSTANCE.write())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void IconCompatParcelizer(float p0, float p1) {
        this.RemoteActionCompatParcelizer.moveTo(p0, p1);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void read(float p0, float p1) {
        this.RemoteActionCompatParcelizer.rMoveTo(p0, p1);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void write(float p0, float p1) {
        this.RemoteActionCompatParcelizer.lineTo(p0, p1);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void RemoteActionCompatParcelizer(float p0, float p1) {
        this.RemoteActionCompatParcelizer.rLineTo(p0, p1);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void write(float p0, float p1, float p2, float p3) {
        this.RemoteActionCompatParcelizer.quadTo(p0, p1, p2, p3);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void RemoteActionCompatParcelizer(float p0, float p1, float p2, float p3) {
        this.RemoteActionCompatParcelizer.quadTo(p0, p1, p2, p3);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void read(float p0, float p1, float p2, float p3) {
        this.RemoteActionCompatParcelizer.rQuadTo(p0, p1, p2, p3);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void AudioAttributesCompatParcelizer(float p0, float p1, float p2, float p3) {
        this.RemoteActionCompatParcelizer.rQuadTo(p0, p1, p2, p3);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void read(float p0, float p1, float p2, float p3, float p4, float p5) {
        this.RemoteActionCompatParcelizer.cubicTo(p0, p1, p2, p3, p4, p5);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void RemoteActionCompatParcelizer(float p0, float p1, float p2, float p3, float p4, float p5) {
        this.RemoteActionCompatParcelizer.rCubicTo(p0, p1, p2, p3, p4, p5);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void write(WritableTypeIdInclusion p0, removeSoftRefsClearedByGc.write p1) {
        write(p0);
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new RectF();
        }
        RectF rectF = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(rectF);
        rectF.set(p0.getAudioAttributesCompatParcelizer(), p0.getRemoteActionCompatParcelizer(), p0.getWrite(), p0.getIconCompatParcelizer());
        Path path = this.RemoteActionCompatParcelizer;
        RectF rectF2 = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(rectF2);
        path.addRect(rectF2, writeIndentation.RemoteActionCompatParcelizer(p1));
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void read(WritableTypeIdInclusion p0, removeSoftRefsClearedByGc.write p1) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new RectF();
        }
        RectF rectF = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(rectF);
        rectF.set(p0.getAudioAttributesCompatParcelizer(), p0.getRemoteActionCompatParcelizer(), p0.getWrite(), p0.getIconCompatParcelizer());
        Path path = this.RemoteActionCompatParcelizer;
        RectF rectF2 = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(rectF2);
        path.addOval(rectF2, writeIndentation.RemoteActionCompatParcelizer(p1));
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void RemoteActionCompatParcelizer(WritableTypeId p0, removeSoftRefsClearedByGc.write p1) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new RectF();
        }
        RectF rectF = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(rectF);
        rectF.set(p0.getRemoteActionCompatParcelizer(), p0.getIconCompatParcelizer(), p0.getRead(), p0.getAudioAttributesCompatParcelizer());
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new float[8];
        }
        float[] fArr = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(fArr);
        fArr[0] = Float.intBitsToFloat((int) (p0.getWrite() >> 32));
        fArr[1] = Float.intBitsToFloat((int) p0.getWrite());
        fArr[2] = Float.intBitsToFloat((int) (p0.getMediaBrowserCompatItemReceiver() >> 32));
        fArr[3] = Float.intBitsToFloat((int) p0.getMediaBrowserCompatItemReceiver());
        fArr[4] = Float.intBitsToFloat((int) (p0.getMediaBrowserCompatCustomActionResultReceiver() >> 32));
        fArr[5] = Float.intBitsToFloat((int) p0.getMediaBrowserCompatCustomActionResultReceiver());
        fArr[6] = Float.intBitsToFloat((int) (p0.getAudioAttributesImplBaseParcelizer() >> 32));
        fArr[7] = Float.intBitsToFloat((int) p0.getAudioAttributesImplBaseParcelizer());
        Path path = this.RemoteActionCompatParcelizer;
        RectF rectF2 = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(rectF2);
        float[] fArr2 = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(fArr2);
        path.addRoundRect(rectF2, fArr2, writeIndentation.RemoteActionCompatParcelizer(p1));
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void write(removeSoftRefsClearedByGc p0, long p1) {
        Path path = this.RemoteActionCompatParcelizer;
        if (p0 instanceof getCurrentSegment) {
            path.addPath(((getCurrentSegment) p0).getRemoteActionCompatParcelizer(), Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) p1));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void read() {
        this.RemoteActionCompatParcelizer.close();
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void AudioAttributesImplApi26Parcelizer() {
        this.RemoteActionCompatParcelizer.reset();
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.RemoteActionCompatParcelizer.rewind();
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final void read(long p0) {
        Matrix matrix = this.read;
        if (matrix == null) {
            this.read = new Matrix();
        } else {
            toMagicModuleMetaRepoModel.write(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.read;
        toMagicModuleMetaRepoModel.write(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) p0));
        Path path = this.RemoteActionCompatParcelizer;
        Matrix matrix3 = this.read;
        toMagicModuleMetaRepoModel.write(matrix3);
        path.transform(matrix3);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final WritableTypeIdInclusion IconCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new RectF();
        }
        RectF rectF = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(rectF);
        this.RemoteActionCompatParcelizer.computeBounds(rectF, true);
        return new WritableTypeIdInclusion(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final boolean read(removeSoftRefsClearedByGc p0, removeSoftRefsClearedByGc p1, int p2) {
        Path.Op op;
        if (wrapAndTrack.AudioAttributesCompatParcelizer(p2, wrapAndTrack.INSTANCE.AudioAttributesCompatParcelizer())) {
            op = Path.Op.DIFFERENCE;
        } else if (wrapAndTrack.AudioAttributesCompatParcelizer(p2, wrapAndTrack.INSTANCE.RemoteActionCompatParcelizer())) {
            op = Path.Op.INTERSECT;
        } else if (wrapAndTrack.AudioAttributesCompatParcelizer(p2, wrapAndTrack.INSTANCE.IconCompatParcelizer())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = wrapAndTrack.AudioAttributesCompatParcelizer(p2, wrapAndTrack.INSTANCE.read()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.RemoteActionCompatParcelizer;
        if (!(p0 instanceof getCurrentSegment)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path remoteActionCompatParcelizer = ((getCurrentSegment) p0).getRemoteActionCompatParcelizer();
        if (p1 instanceof getCurrentSegment) {
            return path.op(remoteActionCompatParcelizer, ((getCurrentSegment) p1).getRemoteActionCompatParcelizer(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // kotlin.removeSoftRefsClearedByGc
    public final boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.isEmpty();
    }

    private final void write(WritableTypeIdInclusion p0) {
        if (Float.isNaN(p0.getAudioAttributesCompatParcelizer()) || Float.isNaN(p0.getRemoteActionCompatParcelizer()) || Float.isNaN(p0.getWrite()) || Float.isNaN(p0.getIconCompatParcelizer())) {
            writeIndentation.read("Invalid rectangle, make sure no value is NaN");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getCurrentSegment() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
