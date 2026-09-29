package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lo/_checkIfCreatorPropertyBased;", "", "Lo/deserializeFromBoolean;", "p0", "<init>", "(Lo/deserializeFromBoolean;)V", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "write", "Lo/deserializeFromBoolean;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _checkIfCreatorPropertyBased {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final deserializeFromBoolean RemoteActionCompatParcelizer;

    public _checkIfCreatorPropertyBased(deserializeFromBoolean deserializefromboolean) {
        this.RemoteActionCompatParcelizer = deserializefromboolean;
    }

    public final int hashCode() {
        deserializeFromBoolean deserializefromboolean = this.RemoteActionCompatParcelizer;
        int iHashCode = deserializefromboolean.getWrite().hashCode();
        int iOnPlayFromSearch = deserializefromboolean.getRead().onPlayFromSearch();
        int iHashCode2 = deserializefromboolean.MediaBrowserCompatCustomActionResultReceiver().hashCode();
        int iconCompatParcelizer = deserializefromboolean.getIconCompatParcelizer();
        int iHashCode3 = Boolean.hashCode(deserializefromboolean.getRemoteActionCompatParcelizer());
        int iRemoteActionCompatParcelizer = paramName.RemoteActionCompatParcelizer(deserializefromboolean.getMediaBrowserCompatCustomActionResultReceiver());
        int iHashCode4 = deserializefromboolean.getAudioAttributesImplBaseParcelizer().hashCode();
        return (((((((((((((((((iHashCode * 31) + iOnPlayFromSearch) * 31) + iHashCode2) * 31) + iconCompatParcelizer) * 31) + iHashCode3) * 31) + iRemoteActionCompatParcelizer) * 31) + iHashCode4) * 31) + deserializefromboolean.getMediaBrowserCompatItemReceiver().hashCode()) * 31) + deserializefromboolean.getAudioAttributesImplApi21Parcelizer().hashCode()) * 31) + PropertyValueAny.MediaDescriptionCompat(deserializefromboolean.getAudioAttributesImplApi26Parcelizer());
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _checkIfCreatorPropertyBased)) {
            return false;
        }
        deserializeFromBoolean deserializefromboolean = this.RemoteActionCompatParcelizer;
        _checkIfCreatorPropertyBased _checkifcreatorpropertybased = (_checkIfCreatorPropertyBased) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(deserializefromboolean.getWrite(), _checkifcreatorpropertybased.RemoteActionCompatParcelizer.getWrite()) && deserializefromboolean.getRead().read(_checkifcreatorpropertybased.RemoteActionCompatParcelizer.getRead()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(deserializefromboolean.MediaBrowserCompatCustomActionResultReceiver(), _checkifcreatorpropertybased.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) && deserializefromboolean.getIconCompatParcelizer() == _checkifcreatorpropertybased.RemoteActionCompatParcelizer.getIconCompatParcelizer() && deserializefromboolean.getRemoteActionCompatParcelizer() == _checkifcreatorpropertybased.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer() && paramName.write(deserializefromboolean.getMediaBrowserCompatCustomActionResultReceiver(), _checkifcreatorpropertybased.RemoteActionCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(deserializefromboolean.getAudioAttributesImplBaseParcelizer(), _checkifcreatorpropertybased.RemoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer()) && deserializefromboolean.getMediaBrowserCompatItemReceiver() == _checkifcreatorpropertybased.RemoteActionCompatParcelizer.getMediaBrowserCompatItemReceiver() && deserializefromboolean.getAudioAttributesImplApi21Parcelizer() == _checkifcreatorpropertybased.RemoteActionCompatParcelizer.getAudioAttributesImplApi21Parcelizer() && PropertyValueAny.write(deserializefromboolean.getAudioAttributesImplApi26Parcelizer(), _checkifcreatorpropertybased.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer());
    }
}
