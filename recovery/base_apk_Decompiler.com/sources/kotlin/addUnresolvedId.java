package kotlin;

import kotlin.Metadata;
import kotlin.addUnresolvedId;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/addUnresolvedId;", "", "Lo/AbstractDeserializer;", "p0", "Lo/withDelegate;", "AudioAttributesCompatParcelizer", "(Lo/AbstractDeserializer;)Lo/withDelegate;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface addUnresolvedId {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.write;

    withDelegate AudioAttributesCompatParcelizer(AbstractDeserializer p0);

    /* JADX INFO: renamed from: o.addUnresolvedId$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/addUnresolvedId$IconCompatParcelizer;", "", "<init>", "()V", "Lo/addUnresolvedId;", "read", "Lo/addUnresolvedId;", "write", "()Lo/addUnresolvedId;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion write = new Companion();

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private static final addUnresolvedId IconCompatParcelizer = new addUnresolvedId() { // from class: o.UnresolvedId
            @Override // kotlin.addUnresolvedId
            public final withDelegate AudioAttributesCompatParcelizer(AbstractDeserializer abstractDeserializer) {
                return addUnresolvedId.Companion.AudioAttributesCompatParcelizer(abstractDeserializer);
            }
        };

        private Companion() {
        }

        public final addUnresolvedId write() {
            return IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final withDelegate AudioAttributesCompatParcelizer(AbstractDeserializer abstractDeserializer) {
            return new withDelegate(abstractDeserializer, SettableBeanProperty.INSTANCE.RemoteActionCompatParcelizer());
        }
    }
}
