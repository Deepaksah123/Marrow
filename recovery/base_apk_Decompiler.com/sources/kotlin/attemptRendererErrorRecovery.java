package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class attemptRendererErrorRecovery extends ExoPlayerImplMediaSourceHolderSnapshot<setHeight> {
    private final setHeight read;

    public attemptRendererErrorRecovery(List<setEncoderDelay<setHeight>> list) {
        super(list);
        this.read = new setHeight();
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
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public setHeight read(setEncoderDelay<setHeight> setencoderdelay, float f) {
        setHeight setheight;
        if (setencoderdelay.MediaBrowserCompatCustomActionResultReceiver == null || setencoderdelay.IconCompatParcelizer == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        setHeight setheight2 = setencoderdelay.MediaBrowserCompatCustomActionResultReceiver;
        setHeight setheight3 = setencoderdelay.IconCompatParcelizer;
        if (this.IconCompatParcelizer != null && (setheight = (setHeight) this.IconCompatParcelizer.RemoteActionCompatParcelizer(setencoderdelay.AudioAttributesImplApi26Parcelizer, setencoderdelay.write.floatValue(), setheight2, setheight3, f, write(), RemoteActionCompatParcelizer())) != null) {
            return setheight;
        }
        this.read.AudioAttributesCompatParcelizer(setColorInfo.RemoteActionCompatParcelizer(setheight2.RemoteActionCompatParcelizer(), setheight3.RemoteActionCompatParcelizer(), f), setColorInfo.RemoteActionCompatParcelizer(setheight2.read(), setheight3.read(), f));
        return this.read;
    }
}
