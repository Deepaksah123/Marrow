package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class deliverMessage extends ExoPlayerImplMediaSourceHolderSnapshot<isTimelineReady> {
    public deliverMessage(List<setEncoderDelay<isTimelineReady>> list) {
        super(list);
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
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public isTimelineReady read(setEncoderDelay<isTimelineReady> setencoderdelay, float f) {
        if (this.IconCompatParcelizer != null) {
            return (isTimelineReady) this.IconCompatParcelizer.RemoteActionCompatParcelizer(setencoderdelay.AudioAttributesImplApi26Parcelizer, setencoderdelay.write == null ? Float.MAX_VALUE : setencoderdelay.write.floatValue(), setencoderdelay.MediaBrowserCompatCustomActionResultReceiver, setencoderdelay.IconCompatParcelizer == null ? setencoderdelay.MediaBrowserCompatCustomActionResultReceiver : setencoderdelay.IconCompatParcelizer, f, AudioAttributesCompatParcelizer(), RemoteActionCompatParcelizer());
        }
        if (f != 1.0f || setencoderdelay.IconCompatParcelizer == null) {
            return setencoderdelay.MediaBrowserCompatCustomActionResultReceiver;
        }
        return setencoderdelay.IconCompatParcelizer;
    }

    public final void read(final setDrmInitData<String> setdrminitdata) {
        final setInitializationData setinitializationdata = new setInitializationData();
        final isTimelineReady istimelineready = new isTimelineReady();
        super.AudioAttributesCompatParcelizer(new setDrmInitData<isTimelineReady>(this) { // from class: o.deliverMessage.5
            private /* synthetic */ deliverMessage write;

            {
                this.write = this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.setDrmInitData
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public isTimelineReady write(setInitializationData<isTimelineReady> setinitializationdata2) {
                setinitializationdata.IconCompatParcelizer(setinitializationdata2.AudioAttributesImplApi21Parcelizer(), setinitializationdata2.RemoteActionCompatParcelizer(), setinitializationdata2.MediaBrowserCompatItemReceiver().MediaBrowserCompatSearchResultReceiver, setinitializationdata2.AudioAttributesCompatParcelizer().MediaBrowserCompatSearchResultReceiver, setinitializationdata2.IconCompatParcelizer(), setinitializationdata2.read(), setinitializationdata2.write());
                String str = (String) setdrminitdata.write(setinitializationdata);
                isTimelineReady istimelinereadyAudioAttributesCompatParcelizer = setinitializationdata2.read() == 1.0f ? setinitializationdata2.AudioAttributesCompatParcelizer() : setinitializationdata2.MediaBrowserCompatItemReceiver();
                istimelineready.RemoteActionCompatParcelizer(str, istimelinereadyAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, istimelinereadyAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, istimelinereadyAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver, istimelinereadyAudioAttributesCompatParcelizer.RatingCompat, istimelinereadyAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer, istimelinereadyAudioAttributesCompatParcelizer.IconCompatParcelizer, istimelinereadyAudioAttributesCompatParcelizer.read, istimelinereadyAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer, istimelinereadyAudioAttributesCompatParcelizer.MediaDescriptionCompat, istimelinereadyAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver, istimelinereadyAudioAttributesCompatParcelizer.write, istimelinereadyAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
                return istimelineready;
            }
        });
    }
}
