package kotlin;

import kotlin.Metadata;
import kotlin._resolveInnerClassValuedProperty;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_resolveInnerClassValuedProperty;", "", "Lo/WritableTypeIdInclusion;", "p0", "p1", "", "IconCompatParcelizer", "(Lo/WritableTypeIdInclusion;Lo/WritableTypeIdInclusion;)Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _resolveInnerClassValuedProperty {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.read;

    boolean IconCompatParcelizer(WritableTypeIdInclusion p0, WritableTypeIdInclusion p1);

    /* JADX INFO: renamed from: o._resolveInnerClassValuedProperty$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\b"}, d2 = {"Lo/_resolveInnerClassValuedProperty$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/_resolveInnerClassValuedProperty;", "write", "Lo/_resolveInnerClassValuedProperty;", "IconCompatParcelizer", "()Lo/_resolveInnerClassValuedProperty;", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion read = new Companion();

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private static final _resolveInnerClassValuedProperty RemoteActionCompatParcelizer = new _resolveInnerClassValuedProperty() { // from class: o._resolveManagedReferenceProperty
            @Override // kotlin._resolveInnerClassValuedProperty
            public final boolean IconCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, WritableTypeIdInclusion writableTypeIdInclusion2) {
                return _resolveInnerClassValuedProperty.Companion.IconCompatParcelizer(writableTypeIdInclusion, writableTypeIdInclusion2);
            }
        };
        private static final _resolveInnerClassValuedProperty IconCompatParcelizer = new _resolveInnerClassValuedProperty() { // from class: o._resolveMergeAndNullSettings
            @Override // kotlin._resolveInnerClassValuedProperty
            public final boolean IconCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, WritableTypeIdInclusion writableTypeIdInclusion2) {
                return _resolveInnerClassValuedProperty.Companion.write(writableTypeIdInclusion, writableTypeIdInclusion2);
            }
        };

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private static final _resolveInnerClassValuedProperty read = new _resolveInnerClassValuedProperty() { // from class: o.deserializeFromDouble
            @Override // kotlin._resolveInnerClassValuedProperty
            public final boolean IconCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, WritableTypeIdInclusion writableTypeIdInclusion2) {
                return _resolveInnerClassValuedProperty.Companion.AudioAttributesImplApi26Parcelizer(writableTypeIdInclusion, writableTypeIdInclusion2);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean IconCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, WritableTypeIdInclusion writableTypeIdInclusion2) {
            return writableTypeIdInclusion.IconCompatParcelizer(writableTypeIdInclusion2);
        }

        public final _resolveInnerClassValuedProperty IconCompatParcelizer() {
            return RemoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean write(WritableTypeIdInclusion writableTypeIdInclusion, WritableTypeIdInclusion writableTypeIdInclusion2) {
            return !writableTypeIdInclusion2.MediaBrowserCompatCustomActionResultReceiver() && writableTypeIdInclusion.getAudioAttributesCompatParcelizer() >= writableTypeIdInclusion2.getAudioAttributesCompatParcelizer() && writableTypeIdInclusion.getWrite() <= writableTypeIdInclusion2.getWrite() && writableTypeIdInclusion.getRemoteActionCompatParcelizer() >= writableTypeIdInclusion2.getRemoteActionCompatParcelizer() && writableTypeIdInclusion.getIconCompatParcelizer() <= writableTypeIdInclusion2.getIconCompatParcelizer();
        }

        public final _resolveInnerClassValuedProperty write() {
            return read;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean AudioAttributesImplApi26Parcelizer(WritableTypeIdInclusion writableTypeIdInclusion, WritableTypeIdInclusion writableTypeIdInclusion2) {
            return writableTypeIdInclusion2.AudioAttributesCompatParcelizer(writableTypeIdInclusion.read());
        }
    }
}
