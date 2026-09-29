package kotlin;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getTimeline extends ExoPlayerImplMediaSourceHolderSnapshot<PointF> {
    private final PointF read;

    public getTimeline(List<setEncoderDelay<PointF>> list) {
        super(list);
        this.read = new PointF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public PointF read(setEncoderDelay<PointF> setencoderdelay, float f) {
        return RemoteActionCompatParcelizer(setencoderdelay, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public PointF RemoteActionCompatParcelizer(setEncoderDelay<PointF> setencoderdelay, float f, float f2, float f3) {
        PointF pointF;
        if (setencoderdelay.MediaBrowserCompatCustomActionResultReceiver == null || setencoderdelay.IconCompatParcelizer == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = setencoderdelay.MediaBrowserCompatCustomActionResultReceiver;
        PointF pointF3 = setencoderdelay.IconCompatParcelizer;
        if (this.IconCompatParcelizer != null && (pointF = (PointF) this.IconCompatParcelizer.RemoteActionCompatParcelizer(setencoderdelay.AudioAttributesImplApi26Parcelizer, setencoderdelay.write.floatValue(), pointF2, pointF3, f, write(), RemoteActionCompatParcelizer())) != null) {
            return pointF;
        }
        this.read.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
        return this.read;
    }
}
