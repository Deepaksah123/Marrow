package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class onCameraMotion extends ExoPlayerImplMediaSourceHolderSnapshot<Float> {
    public onCameraMotion(List<setEncoderDelay<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Float read(setEncoderDelay<Float> setencoderdelay, float f) {
        return Float.valueOf(RemoteActionCompatParcelizer(setencoderdelay, f));
    }

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
    private float RemoteActionCompatParcelizer(setEncoderDelay<Float> setencoderdelay, float f) {
        Float f2;
        if (setencoderdelay.MediaBrowserCompatCustomActionResultReceiver == null || setencoderdelay.IconCompatParcelizer == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.IconCompatParcelizer != null && (f2 = (Float) this.IconCompatParcelizer.RemoteActionCompatParcelizer(setencoderdelay.AudioAttributesImplApi26Parcelizer, setencoderdelay.write.floatValue(), setencoderdelay.MediaBrowserCompatCustomActionResultReceiver, setencoderdelay.IconCompatParcelizer, f, write(), RemoteActionCompatParcelizer())) != null) {
            return f2.floatValue();
        }
        return setColorInfo.RemoteActionCompatParcelizer(setencoderdelay.AudioAttributesImplApi26Parcelizer(), setencoderdelay.IconCompatParcelizer(), f);
    }

    public final float MediaBrowserCompatMediaItem() {
        return RemoteActionCompatParcelizer(IconCompatParcelizer(), AudioAttributesCompatParcelizer());
    }
}
