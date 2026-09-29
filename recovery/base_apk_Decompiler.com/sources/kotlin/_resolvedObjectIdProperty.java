package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\fR\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/_resolvedObjectIdProperty;", "", "", "p0", "<init>", "(I)V", "Lo/deserializeFromBoolean;", "Lo/deserializeFromNumber;", "read", "(Lo/deserializeFromBoolean;)Lo/deserializeFromNumber;", "p1", "", "(Lo/deserializeFromBoolean;Lo/deserializeFromNumber;)V", "Lo/ActionMenuViewLayoutParams;", "Lo/_checkIfCreatorPropertyBased;", "AudioAttributesCompatParcelizer", "Lo/ActionMenuViewLayoutParams;", "RemoteActionCompatParcelizer", "Lo/_checkIfCreatorPropertyBased;", "IconCompatParcelizer", "Lo/deserializeFromNumber;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _resolvedObjectIdProperty {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ActionMenuViewLayoutParams<_checkIfCreatorPropertyBased, deserializeFromNumber> read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private deserializeFromNumber AudioAttributesCompatParcelizer;
    private _checkIfCreatorPropertyBased RemoteActionCompatParcelizer;

    public _resolvedObjectIdProperty(int i) {
        this.read = i != 1 ? new ActionMenuViewLayoutParams<>(i) : null;
    }

    public /* synthetic */ _resolvedObjectIdProperty(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    public final deserializeFromNumber read(deserializeFromBoolean p0) {
        deserializeFromNumber deserializefromnumber;
        _checkIfCreatorPropertyBased _checkifcreatorpropertybased = new _checkIfCreatorPropertyBased(p0);
        ActionMenuViewLayoutParams<_checkIfCreatorPropertyBased, deserializeFromNumber> actionMenuViewLayoutParams = this.read;
        if (actionMenuViewLayoutParams != null) {
            deserializefromnumber = actionMenuViewLayoutParams.get(_checkifcreatorpropertybased);
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, _checkifcreatorpropertybased)) {
                return null;
            }
            deserializefromnumber = this.AudioAttributesCompatParcelizer;
        }
        if (deserializefromnumber == null || deserializefromnumber.getWrite().getRead().AudioAttributesCompatParcelizer()) {
            return null;
        }
        return deserializefromnumber;
    }

    public final void read(deserializeFromBoolean p0, deserializeFromNumber p1) {
        ActionMenuViewLayoutParams<_checkIfCreatorPropertyBased, deserializeFromNumber> actionMenuViewLayoutParams = this.read;
        if (actionMenuViewLayoutParams != null) {
            actionMenuViewLayoutParams.put(new _checkIfCreatorPropertyBased(p0), p1);
        } else {
            this.RemoteActionCompatParcelizer = new _checkIfCreatorPropertyBased(p0);
            this.AudioAttributesCompatParcelizer = p1;
        }
    }

    public _resolvedObjectIdProperty() {
        this(0, 1, null);
    }
}
