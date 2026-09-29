package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplComponentListenerExternalSyntheticLambda8 extends ExoPlayerImplMediaSourceHolderSnapshot<Integer> {
    public ExoPlayerImplComponentListenerExternalSyntheticLambda8(List<setEncoderDelay<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public Integer read(setEncoderDelay<Integer> setencoderdelay, float f) {
        return Integer.valueOf(IconCompatParcelizer(setencoderdelay, f));
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
    private int IconCompatParcelizer(setEncoderDelay<Integer> setencoderdelay, float f) {
        if (setencoderdelay.MediaBrowserCompatCustomActionResultReceiver == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iAudioAttributesImplApi21Parcelizer = setencoderdelay.IconCompatParcelizer == null ? setencoderdelay.AudioAttributesImplApi21Parcelizer() : setencoderdelay.AudioAttributesCompatParcelizer();
        if (this.IconCompatParcelizer != null) {
            Integer num = (Integer) this.IconCompatParcelizer.RemoteActionCompatParcelizer(setencoderdelay.AudioAttributesImplApi26Parcelizer, setencoderdelay.write.floatValue(), setencoderdelay.MediaBrowserCompatCustomActionResultReceiver, Integer.valueOf(iAudioAttributesImplApi21Parcelizer), f, write(), RemoteActionCompatParcelizer());
            if (num != null) {
                return num.intValue();
            }
        }
        return setColorInfo.read(setencoderdelay.AudioAttributesImplApi21Parcelizer(), iAudioAttributesImplApi21Parcelizer, f);
    }
}
