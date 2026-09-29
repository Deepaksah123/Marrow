package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplFrameMetadataListener extends ExoPlayerImplMediaSourceHolderSnapshot<Integer> {
    public ExoPlayerImplFrameMetadataListener(List<setEncoderDelay<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Integer read(setEncoderDelay<Integer> setencoderdelay, float f) {
        return Integer.valueOf(write(setencoderdelay, f));
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
    private int write(setEncoderDelay<Integer> setencoderdelay, float f) {
        Integer num;
        if (setencoderdelay.MediaBrowserCompatCustomActionResultReceiver == null || setencoderdelay.IconCompatParcelizer == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.IconCompatParcelizer != null && setencoderdelay.write != null && (num = (Integer) this.IconCompatParcelizer.RemoteActionCompatParcelizer(setencoderdelay.AudioAttributesImplApi26Parcelizer, setencoderdelay.write.floatValue(), setencoderdelay.MediaBrowserCompatCustomActionResultReceiver, setencoderdelay.IconCompatParcelizer, f, write(), RemoteActionCompatParcelizer())) != null) {
            return num.intValue();
        }
        return setAccessibilityChannel.write(setColorInfo.AudioAttributesCompatParcelizer(f, BitmapDescriptorFactory.HUE_RED, 1.0f), setencoderdelay.MediaBrowserCompatCustomActionResultReceiver.intValue(), setencoderdelay.IconCompatParcelizer.intValue());
    }

    public final int MediaBrowserCompatMediaItem() {
        return write(IconCompatParcelizer(), AudioAttributesCompatParcelizer());
    }
}
