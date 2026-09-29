package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lo/_jsonNodeType;", "Lo/createDummyDeserializationContext;", "Lo/_prefetchRootDeserializer;", "p0", "<init>", "(Lo/_prefetchRootDeserializer;)V", "read", "Lo/_prefetchRootDeserializer;", "IconCompatParcelizer", "()Lo/_prefetchRootDeserializer;", "", "onRemoveQueueItem", "()Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _jsonNodeType implements createDummyDeserializationContext {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final _prefetchRootDeserializer IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int write = 8;
    private static final getAnswerMap<_jsonNodeType, getShowPopup> IconCompatParcelizer = AnonymousClass3.IconCompatParcelizer;

    public _jsonNodeType(_prefetchRootDeserializer _prefetchrootdeserializer) {
        this.IconCompatParcelizer = _prefetchrootdeserializer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final _prefetchRootDeserializer getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.createDummyDeserializationContext
    public final boolean onRemoveQueueItem() {
        return this.IconCompatParcelizer.getRead().getRatingCompat();
    }

    /* JADX INFO: renamed from: o._jsonNodeType$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lo/_jsonNodeType$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lkotlin/Function1;", "Lo/_jsonNodeType;", "", "IconCompatParcelizer", "Lo/getAnswerMap;", "AudioAttributesCompatParcelizer", "()Lo/getAnswerMap;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final getAnswerMap<_jsonNodeType, getShowPopup> AudioAttributesCompatParcelizer() {
            return _jsonNodeType.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o._jsonNodeType$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_jsonNodeType;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/_jsonNodeType;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<_jsonNodeType, getShowPopup> {
        public static final AnonymousClass3 IconCompatParcelizer = new AnonymousClass3();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_jsonNodeType _jsonnodetype) {
            AudioAttributesCompatParcelizer(_jsonnodetype);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_jsonNodeType _jsonnodetype) {
            if (_jsonnodetype.onRemoveQueueItem()) {
                _jsonnodetype.getIconCompatParcelizer().MediaMetadataCompat();
            }
        }

        AnonymousClass3() {
            super(1);
        }
    }
}
