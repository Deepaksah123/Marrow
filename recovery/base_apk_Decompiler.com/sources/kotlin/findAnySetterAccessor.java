package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0011\u0010\r\u001a\u00020\u001d8\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u000e"}, d2 = {"Lo/findAnySetterAccessor;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/assignParameter;", "AudioAttributesImplApi21Parcelizer", "F", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "Lo/hasParameter;", "write", "J", "Lo/createInstance;", "I", "read", "Lo/switchToNext;", "AudioAttributesCompatParcelizer", "Lo/Instantiatable;", "Lo/Instantiatable;", "MediaBrowserCompatItemReceiver", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findAnySetterAccessor {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Instantiatable MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;
    private final long write;

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof findAnySetterAccessor)) {
            return false;
        }
        findAnySetterAccessor findanysetteraccessor = (findAnySetterAccessor) p0;
        return assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, findanysetteraccessor.IconCompatParcelizer) && assignParameter.IconCompatParcelizer(this.RemoteActionCompatParcelizer, findanysetteraccessor.RemoteActionCompatParcelizer) && hasParameter.write(this.write, findanysetteraccessor.write) && this.AudioAttributesImplApi21Parcelizer == findanysetteraccessor.AudioAttributesImplApi21Parcelizer && createInstance.IconCompatParcelizer(this.read, findanysetteraccessor.read) && switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, findanysetteraccessor.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, findanysetteraccessor.MediaBrowserCompatItemReceiver);
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        int iAudioAttributesCompatParcelizer2 = assignParameter.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        int iIconCompatParcelizer = hasParameter.IconCompatParcelizer(this.write);
        int iHashCode = Float.hashCode(this.AudioAttributesImplApi21Parcelizer);
        int iIconCompatParcelizer2 = createInstance.IconCompatParcelizer(this.read);
        int iMediaBrowserCompatItemReceiver = switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
        Instantiatable instantiatable = this.MediaBrowserCompatItemReceiver;
        return (((((((((((iAudioAttributesCompatParcelizer * 31) + iAudioAttributesCompatParcelizer2) * 31) + iIconCompatParcelizer) * 31) + iHashCode) * 31) + iIconCompatParcelizer2) * 31) + iMediaBrowserCompatItemReceiver) * 31) + (instantiatable != null ? instantiatable.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(radius=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.IconCompatParcelizer));
        sb.append(", spread=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer));
        sb.append(", offset=");
        sb.append((Object) hasParameter.AudioAttributesImplBaseParcelizer(this.write));
        sb.append(", alpha=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", blendMode=");
        sb.append((Object) createInstance.read(this.read));
        sb.append(", color=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer));
        sb.append(", brush=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(')');
        return sb.toString();
    }
}
