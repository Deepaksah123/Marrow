package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0004\u0006R\u0014\u0010\u0006\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_findCachedDeserializer;", "Lo/parseDouble;", "", "", "RemoteActionCompatParcelizer", "()Z", "IconCompatParcelizer", "Lo/_findCachedDeserializer$IconCompatParcelizer;", "Lo/_findCachedDeserializer$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _findCachedDeserializer extends parseDouble<Object> {
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    boolean getAudioAttributesCompatParcelizer();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\b\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u000f"}, d2 = {"Lo/_findCachedDeserializer$RemoteActionCompatParcelizer;", "Lo/_findCachedDeserializer;", "", "p0", "", "p1", "<init>", "(Ljava/lang/Object;Z)V", "AudioAttributesCompatParcelizer", "Ljava/lang/Object;", "read", "()Ljava/lang/Object;", "RemoteActionCompatParcelizer", "write", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements _findCachedDeserializer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final Object RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final boolean AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(Object obj, boolean z) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer = z;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(Object obj, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(obj, (i & 2) != 0 ? true : z);
        }

        @Override // kotlin._findCachedDeserializer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final boolean getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.parseDouble
        /* JADX INFO: renamed from: read, reason: from getter */
        public final Object getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00038\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/_findCachedDeserializer$IconCompatParcelizer;", "Lo/_findCachedDeserializer;", "Lo/parseDouble;", "", "Lo/_deserialize;", "p0", "<init>", "(Lo/_deserialize;)V", "AudioAttributesCompatParcelizer", "Lo/_deserialize;", "", "RemoteActionCompatParcelizer", "()Z", "IconCompatParcelizer", "read", "()Ljava/lang/Object;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements _findCachedDeserializer {
        private final _deserialize AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(_deserialize _deserializeVar) {
            this.AudioAttributesCompatParcelizer = _deserializeVar;
        }

        @Override // kotlin._findCachedDeserializer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
        public final boolean getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // kotlin.parseDouble
        /* JADX INFO: renamed from: read */
        public final Object getRemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        }
    }
}
