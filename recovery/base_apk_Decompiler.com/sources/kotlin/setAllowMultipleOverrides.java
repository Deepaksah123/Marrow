package kotlin;

import kotlin.AbstractDeserializer;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u000f\u0010\u0011"}, d2 = {"Lo/setAllowMultipleOverrides;", "", "Lo/AbstractDeserializer;", "p0", "<init>", "(Lo/AbstractDeserializer;)V", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_deserializeFromObjectId;", "Lo/_findPropertyUnwrapper;", "p1", "", "read", "(Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;Lo/_findPropertyUnwrapper;)V", "IconCompatParcelizer", "Lo/AbstractDeserializer;", "write", "RemoteActionCompatParcelizer", "()Lo/AbstractDeserializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setAllowMultipleOverrides {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final AbstractDeserializer write;
    private AbstractDeserializer RemoteActionCompatParcelizer;

    public setAllowMultipleOverrides(AbstractDeserializer abstractDeserializer) {
        this.write = abstractDeserializer;
        this.RemoteActionCompatParcelizer = abstractDeserializer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final AbstractDeserializer getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(final AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> p0, final _findPropertyUnwrapper p1) {
        final MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer = this.write.IconCompatParcelizer(new getAnswerMap() { // from class: o.setAllowAdaptiveSelections
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setAllowMultipleOverrides.IconCompatParcelizer(audioAttributesCompatParcelizer, p0, p1, (AbstractDeserializer.AudioAttributesCompatParcelizer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractDeserializer.AudioAttributesCompatParcelizer IconCompatParcelizer(MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2, _findPropertyUnwrapper _findpropertyunwrapper, AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3) {
        AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer4;
        AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer5;
        AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer6;
        if (audioAttributesCompatParcelizer.IconCompatParcelizer && (audioAttributesCompatParcelizer3.IconCompatParcelizer() instanceof _findPropertyUnwrapper) && audioAttributesCompatParcelizer3.AudioAttributesImplBaseParcelizer() == audioAttributesCompatParcelizer2.AudioAttributesImplBaseParcelizer() && audioAttributesCompatParcelizer3.getAudioAttributesCompatParcelizer() == audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer()) {
            audioAttributesCompatParcelizer5 = new AbstractDeserializer.AudioAttributesCompatParcelizer(_findpropertyunwrapper == null ? new _findPropertyUnwrapper(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null) : _findpropertyunwrapper, audioAttributesCompatParcelizer3.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer3.getAudioAttributesCompatParcelizer());
            audioAttributesCompatParcelizer4 = audioAttributesCompatParcelizer2;
            audioAttributesCompatParcelizer6 = audioAttributesCompatParcelizer3;
        } else {
            audioAttributesCompatParcelizer4 = audioAttributesCompatParcelizer2;
            audioAttributesCompatParcelizer5 = audioAttributesCompatParcelizer3;
            audioAttributesCompatParcelizer6 = audioAttributesCompatParcelizer5;
        }
        audioAttributesCompatParcelizer.IconCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer4, audioAttributesCompatParcelizer6);
        return audioAttributesCompatParcelizer5;
    }
}
