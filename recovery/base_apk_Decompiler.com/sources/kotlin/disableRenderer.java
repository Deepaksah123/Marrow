package kotlin;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class disableRenderer extends ExoPlayerImplComponentListenerExternalSyntheticLambda5<setMediaItemsInternal, Path> {
    private Path AudioAttributesImplApi21Parcelizer;
    private final setMediaItemsInternal AudioAttributesImplApi26Parcelizer;
    private Path AudioAttributesImplBaseParcelizer;
    private final Path read;
    private List<ExoPlayerImplComponentListenerExternalSyntheticLambda4> write;

    public disableRenderer(List<setEncoderDelay<setMediaItemsInternal>> list) {
        super(list);
        this.AudioAttributesImplApi26Parcelizer = new setMediaItemsInternal();
        this.read = new Path();
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    protected final boolean MediaBrowserCompatCustomActionResultReceiver() {
        List<ExoPlayerImplComponentListenerExternalSyntheticLambda4> list = this.write;
        return (list == null || list.isEmpty()) ? false : true;
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
    public Path read(setEncoderDelay<setMediaItemsInternal> setencoderdelay, float f) {
        setMediaItemsInternal setmediaitemsinternal = setencoderdelay.MediaBrowserCompatCustomActionResultReceiver;
        setMediaItemsInternal setmediaitemsinternal2 = setencoderdelay.IconCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer.read(setmediaitemsinternal, setmediaitemsinternal2 == null ? setmediaitemsinternal : setmediaitemsinternal2, f);
        setMediaItemsInternal setmediaitemsinternalWrite = this.AudioAttributesImplApi26Parcelizer;
        List<ExoPlayerImplComponentListenerExternalSyntheticLambda4> list = this.write;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                setmediaitemsinternalWrite = this.write.get(size).write(setmediaitemsinternalWrite);
            }
        }
        setColorInfo.AudioAttributesCompatParcelizer(setmediaitemsinternalWrite, this.read);
        if (this.IconCompatParcelizer != null) {
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                this.AudioAttributesImplApi21Parcelizer = new Path();
                this.AudioAttributesImplBaseParcelizer = new Path();
            }
            setColorInfo.AudioAttributesCompatParcelizer(setmediaitemsinternal, this.AudioAttributesImplApi21Parcelizer);
            if (setmediaitemsinternal2 != null) {
                setColorInfo.AudioAttributesCompatParcelizer(setmediaitemsinternal2, this.AudioAttributesImplBaseParcelizer);
            }
            setDrmInitData<A> setdrminitdata = this.IconCompatParcelizer;
            float f2 = setencoderdelay.AudioAttributesImplApi26Parcelizer;
            float fFloatValue = setencoderdelay.write.floatValue();
            Path path = this.AudioAttributesImplApi21Parcelizer;
            return (Path) setdrminitdata.RemoteActionCompatParcelizer(f2, fFloatValue, path, setmediaitemsinternal2 == null ? path : this.AudioAttributesImplBaseParcelizer, f, write(), RemoteActionCompatParcelizer());
        }
        return this.read;
    }

    public final void AudioAttributesCompatParcelizer(List<ExoPlayerImplComponentListenerExternalSyntheticLambda4> list) {
        this.write = list;
    }
}
