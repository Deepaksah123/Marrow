package kotlin;

import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.replaceDelegatee;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0005J\u0011\u0010\n\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\n\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/_deserializeObjectAtName;", "Lo/addAbstractTypeResolver;", "Lo/_prefetchRootDeserializer;", "Lo/getLongMask;", "<init>", "()V", "Lo/CharsToNameCanonicalizer;", "p0", "p1", "", "write", "(Lo/CharsToNameCanonicalizer;Lo/CharsToNameCanonicalizer;)V", "MediaMetadataCompat", "Lo/replaceDelegatee;", "()Lo/replaceDelegatee;", "Lo/_handleSpillOverflow;", "AudioAttributesCompatParcelizer", "Lo/_handleSpillOverflow;", "read", "Lo/replaceDelegatee$IconCompatParcelizer;", "IconCompatParcelizer", "Lo/replaceDelegatee$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _deserializeObjectAtName extends addAbstractTypeResolver implements _prefetchRootDeserializer, getLongMask {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final _handleSpillOverflow read = (_handleSpillOverflow) AudioAttributesCompatParcelizer(new _handleSpillOverflow(0, true, new read(this), null, 9, null));

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private replaceDelegatee.IconCompatParcelizer write;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<CharsToNameCanonicalizer, CharsToNameCanonicalizer, getShowPopup> {
        public final void AudioAttributesCompatParcelizer(CharsToNameCanonicalizer charsToNameCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer2) {
            ((_deserializeObjectAtName) this.AudioAttributesImplApi26Parcelizer).write(charsToNameCanonicalizer, charsToNameCanonicalizer2);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(CharsToNameCanonicalizer charsToNameCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer2) {
            AudioAttributesCompatParcelizer(charsToNameCanonicalizer, charsToNameCanonicalizer2);
            return getShowPopup.INSTANCE;
        }

        read(Object obj) {
            super(2, obj, _deserializeObjectAtName.class, "write", "write(Lo/CharsToNameCanonicalizer;Lo/CharsToNameCanonicalizer;)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(CharsToNameCanonicalizer p0, CharsToNameCanonicalizer p1) {
        boolean zWrite;
        if (_verifyNoLeadingZeroes.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && getRatingCompat() && (zWrite = p1.write()) != p0.write()) {
            if (zWrite) {
                replaceDelegatee replacedelegateeWrite = write();
                this.write = replacedelegateeWrite != null ? replacedelegateeWrite.AudioAttributesCompatParcelizer() : null;
            } else {
                replaceDelegatee.IconCompatParcelizer iconCompatParcelizer = this.write;
                if (iconCompatParcelizer != null) {
                    iconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
                }
                this.write = null;
            }
        }
    }

    @Override // kotlin._prefetchRootDeserializer
    public final void MediaMetadataCompat() {
        replaceDelegatee replacedelegateeWrite = write();
        if (this.read.AudioAttributesCompatParcelizer().write()) {
            replaceDelegatee.IconCompatParcelizer iconCompatParcelizer = this.write;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            }
            this.write = replacedelegateeWrite != null ? replacedelegateeWrite.AudioAttributesCompatParcelizer() : null;
        }
    }

    /* JADX INFO: renamed from: o._deserializeObjectAtName$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<replaceDelegatee> $AudioAttributesCompatParcelizer;
        final /* synthetic */ _deserializeObjectAtName read;

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object] */
        public final void IconCompatParcelizer() {
            this.$AudioAttributesCompatParcelizer.write = MappingJsonFactory.write(this.read, _buildMessage.AudioAttributesCompatParcelizer());
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(MagicModuleUseCaseImplWhenMappings.write<replaceDelegatee> writeVar, _deserializeObjectAtName _deserializeobjectatname) {
            super(0);
            this.$AudioAttributesCompatParcelizer = writeVar;
            this.read = _deserializeobjectatname;
        }
    }

    private final replaceDelegatee write() {
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        _detectBindAndClose.read(this, new AnonymousClass3(writeVar, this));
        return (replaceDelegatee) writeVar.write;
    }
}
