package kotlin;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaGiYIuSgkdcClbkNSWm6YyOduvLI extends ExoPlayerImplMediaSourceHolderSnapshot<PointF> {
    private final float[] AudioAttributesImplApi21Parcelizer;
    private final float[] AudioAttributesImplBaseParcelizer;
    private final PointF MediaBrowserCompatItemReceiver;
    private ExoPlayerImplInternal read;
    private final PathMeasure write;

    public r8lambdaGiYIuSgkdcClbkNSWm6YyOduvLI(List<? extends setEncoderDelay<PointF>> list) {
        super(list);
        this.MediaBrowserCompatItemReceiver = new PointF();
        this.AudioAttributesImplBaseParcelizer = new float[2];
        this.AudioAttributesImplApi21Parcelizer = new float[2];
        this.write = new PathMeasure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public PointF read(setEncoderDelay<PointF> setencoderdelay, float f) {
        PointF pointF;
        ExoPlayerImplInternal exoPlayerImplInternal = (ExoPlayerImplInternal) setencoderdelay;
        Path path = exoPlayerImplInternal.read();
        if (this.IconCompatParcelizer != null && setencoderdelay.write != null && (pointF = (PointF) this.IconCompatParcelizer.RemoteActionCompatParcelizer(exoPlayerImplInternal.AudioAttributesImplApi26Parcelizer, exoPlayerImplInternal.write.floatValue(), (PointF) exoPlayerImplInternal.MediaBrowserCompatCustomActionResultReceiver, (PointF) exoPlayerImplInternal.IconCompatParcelizer, write(), f, RemoteActionCompatParcelizer())) != null) {
            return pointF;
        }
        if (path == null) {
            return setencoderdelay.MediaBrowserCompatCustomActionResultReceiver;
        }
        if (this.read != exoPlayerImplInternal) {
            this.write.setPath(path, false);
            this.read = exoPlayerImplInternal;
        }
        float length = this.write.getLength();
        float f2 = f * length;
        this.write.getPosTan(f2, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer);
        PointF pointF2 = this.MediaBrowserCompatItemReceiver;
        float[] fArr = this.AudioAttributesImplBaseParcelizer;
        pointF2.set(fArr[0], fArr[1]);
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            PointF pointF3 = this.MediaBrowserCompatItemReceiver;
            float[] fArr2 = this.AudioAttributesImplApi21Parcelizer;
            pointF3.offset(fArr2[0] * f2, fArr2[1] * f2);
        } else if (f2 > length) {
            PointF pointF4 = this.MediaBrowserCompatItemReceiver;
            float[] fArr3 = this.AudioAttributesImplApi21Parcelizer;
            float f3 = f2 - length;
            pointF4.offset(fArr3[0] * f3, fArr3[1] * f3);
        }
        return this.MediaBrowserCompatItemReceiver;
    }
}
