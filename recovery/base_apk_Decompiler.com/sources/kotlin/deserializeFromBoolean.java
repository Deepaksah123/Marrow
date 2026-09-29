package kotlin;

import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;
import kotlin.deserializeAndSet;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001f\u0018\u00002\u00020\u0001Bo\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bBe\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010(\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R&\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00103\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b1\u0010 R\u001a\u00107\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b-\u00106R\u001a\u0010/\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\b4\u0010 R\u001a\u0010&\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u00108\u001a\u0004\b,\u00109R\u001a\u0010-\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010:\u001a\u0004\b7\u0010;R\u001a\u0010)\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b3\u0010=R\u001a\u00104\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010>\u001a\u0004\b(\u0010?R\u0018\u0010$\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010@"}, d2 = {"Lo/deserializeFromBoolean;", "", "Lo/AbstractDeserializer;", "p0", "Lo/deserializeWithObjectId;", "p1", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p2", "", "p3", "", "p4", "Lo/paramName;", "p5", "Lo/bufferMapProperty;", "p6", "Lo/tryToResolveUnresolved;", "p7", "Lo/deserializeAndSet$RemoteActionCompatParcelizer;", "p8", "Lo/_reportMissingSetter$write;", "p9", "Lo/PropertyValueAny;", "p10", "<init>", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Ljava/util/List;IZILo/bufferMapProperty;Lo/tryToResolveUnresolved;Lo/deserializeAndSet$RemoteActionCompatParcelizer;Lo/_reportMissingSetter$write;J)V", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Ljava/util/List;IZILo/bufferMapProperty;Lo/tryToResolveUnresolved;Lo/_reportMissingSetter$write;JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "MediaMetadataCompat", "Lo/AbstractDeserializer;", "AudioAttributesImplBaseParcelizer", "()Lo/AbstractDeserializer;", "write", "AudioAttributesImplApi21Parcelizer", "Lo/deserializeWithObjectId;", "()Lo/deserializeWithObjectId;", "read", "MediaBrowserCompatItemReceiver", "Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/util/List;", "AudioAttributesCompatParcelizer", "I", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Z", "()Z", "RemoteActionCompatParcelizer", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "Lo/_reportMissingSetter$write;", "()Lo/_reportMissingSetter$write;", "J", "()J", "Lo/deserializeAndSet$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class deserializeFromBoolean {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final deserializeWithObjectId read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private deserializeAndSet.RemoteActionCompatParcelizer MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final AbstractDeserializer write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _reportMissingSetter.write AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final bufferMapProperty AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final tryToResolveUnresolved MediaBrowserCompatItemReceiver;

    private deserializeFromBoolean(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, int i, boolean z, int i2, bufferMapProperty buffermapproperty, tryToResolveUnresolved trytoresolveunresolved, deserializeAndSet.RemoteActionCompatParcelizer remoteActionCompatParcelizer, _reportMissingSetter.write writeVar, long j) {
        this.write = abstractDeserializer;
        this.read = deserializewithobjectid;
        this.AudioAttributesCompatParcelizer = list;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = z;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.AudioAttributesImplBaseParcelizer = buffermapproperty;
        this.MediaBrowserCompatItemReceiver = trytoresolveunresolved;
        this.AudioAttributesImplApi21Parcelizer = writeVar;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.MediaMetadataCompat = remoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final AbstractDeserializer getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final deserializeWithObjectId getRead() {
        return this.read;
    }

    public final List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final bufferMapProperty getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final tryToResolveUnresolved getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final _reportMissingSetter.write getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private deserializeFromBoolean(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, int i, boolean z, int i2, bufferMapProperty buffermapproperty, tryToResolveUnresolved trytoresolveunresolved, _reportMissingSetter.write writeVar, long j) {
        this(abstractDeserializer, deserializewithobjectid, list, i, z, i2, buffermapproperty, trytoresolveunresolved, (deserializeAndSet.RemoteActionCompatParcelizer) null, writeVar, j);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof deserializeFromBoolean)) {
            return false;
        }
        deserializeFromBoolean deserializefromboolean = (deserializeFromBoolean) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, deserializefromboolean.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, deserializefromboolean.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, deserializefromboolean.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == deserializefromboolean.IconCompatParcelizer && this.RemoteActionCompatParcelizer == deserializefromboolean.RemoteActionCompatParcelizer && paramName.write(this.MediaBrowserCompatCustomActionResultReceiver, deserializefromboolean.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, deserializefromboolean.AudioAttributesImplBaseParcelizer) && this.MediaBrowserCompatItemReceiver == deserializefromboolean.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, deserializefromboolean.AudioAttributesImplApi21Parcelizer) && PropertyValueAny.write(this.AudioAttributesImplApi26Parcelizer, deserializefromboolean.AudioAttributesImplApi26Parcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.AudioAttributesCompatParcelizer.hashCode();
        int i = this.IconCompatParcelizer;
        int iHashCode4 = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iRemoteActionCompatParcelizer = paramName.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode5 = this.AudioAttributesImplBaseParcelizer.hashCode();
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + iHashCode4) * 31) + iRemoteActionCompatParcelizer) * 31) + iHashCode5) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + PropertyValueAny.MediaDescriptionCompat(this.AudioAttributesImplApi26Parcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.write);
        sb.append(", style=");
        sb.append(this.read);
        sb.append(", placeholders=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", maxLines=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", softWrap=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", overflow=");
        sb.append((Object) paramName.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver));
        sb.append(", density=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", layoutDirection=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", fontFamilyResolver=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", constraints=");
        sb.append((Object) PropertyValueAny.MediaBrowserCompatMediaItem(this.AudioAttributesImplApi26Parcelizer));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ deserializeFromBoolean(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, List list, int i, boolean z, int i2, bufferMapProperty buffermapproperty, tryToResolveUnresolved trytoresolveunresolved, _reportMissingSetter.write writeVar, long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, deserializewithobjectid, list, i, z, i2, buffermapproperty, trytoresolveunresolved, writeVar, j);
    }
}
