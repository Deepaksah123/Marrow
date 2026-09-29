package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0016\u0010\u0017Jo\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010 R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010 R\u001a\u0010\u0018\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b\u0016\u0010*R\u001c\u0010.\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b$\u0010-R\u001c\u00101\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b'\u00100R\u001c\u00104\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0018\u00103R\u001a\u0010(\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b.\u0010 R\u001a\u0010+\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b1\u0010 R\u001c\u0010$\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b+\u00106"}, d2 = {"Lo/_findCustomCollectionLikeDeserializer;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "Lo/assignIndexes;", "p0", "Lo/withCaseInsensitivity;", "p1", "Lo/ReadableObjectIdReferring;", "p2", "Lo/withProperty;", "p3", "Lo/_findCustomTreeNodeDeserializer;", "p4", "Lo/find;", "p5", "Lo/findSize;", "p6", "Lo/_findWithAlias;", "p7", "Lo/findOnlyParamWithoutInjection;", "p8", "<init>", "(IIJLo/withProperty;Lo/_findCustomTreeNodeDeserializer;Lo/find;IILo/findOnlyParamWithoutInjection;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "IconCompatParcelizer", "(Lo/_findCustomCollectionLikeDeserializer;)Lo/_findCustomCollectionLikeDeserializer;", "read", "(IIJLo/withProperty;Lo/_findCustomTreeNodeDeserializer;Lo/find;IILo/findOnlyParamWithoutInjection;)Lo/_findCustomCollectionLikeDeserializer;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "I", "MediaBrowserCompatItemReceiver", "write", "AudioAttributesImplApi26Parcelizer", "J", "()J", "MediaBrowserCompatCustomActionResultReceiver", "Lo/withProperty;", "()Lo/withProperty;", "AudioAttributesCompatParcelizer", "Lo/_findCustomTreeNodeDeserializer;", "()Lo/_findCustomTreeNodeDeserializer;", "RemoteActionCompatParcelizer", "Lo/find;", "()Lo/find;", "AudioAttributesImplApi21Parcelizer", "Lo/findOnlyParamWithoutInjection;", "()Lo/findOnlyParamWithoutInjection;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _findCustomCollectionLikeDeserializer implements AbstractDeserializer.RemoteActionCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final findOnlyParamWithoutInjection AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final withProperty AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final find AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _findCustomTreeNodeDeserializer RemoteActionCompatParcelizer;

    private _findCustomCollectionLikeDeserializer(int i, int i2, long j, withProperty withproperty, _findCustomTreeNodeDeserializer _findcustomtreenodedeserializer, find findVar, int i3, int i4, findOnlyParamWithoutInjection findonlyparamwithoutinjection) {
        this.write = i;
        this.IconCompatParcelizer = i2;
        this.read = j;
        this.AudioAttributesCompatParcelizer = withproperty;
        this.RemoteActionCompatParcelizer = _findcustomtreenodedeserializer;
        this.AudioAttributesImplApi21Parcelizer = findVar;
        this.AudioAttributesImplApi26Parcelizer = i3;
        this.MediaBrowserCompatCustomActionResultReceiver = i4;
        this.AudioAttributesImplBaseParcelizer = findonlyparamwithoutinjection;
        if (ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j, ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer()) || ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j) >= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        StringBuilder sb = new StringBuilder("lineHeight can't be negative (");
        sb.append(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j));
        sb.append(')');
        withStackTrace.AudioAttributesCompatParcelizer(sb.toString());
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final withProperty getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final _findCustomTreeNodeDeserializer getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final find getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final findOnlyParamWithoutInjection getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final _findCustomCollectionLikeDeserializer IconCompatParcelizer(_findCustomCollectionLikeDeserializer p0) {
        return p0 == null ? this : _findCustomEnumDeserializer.read(this, p0.write, p0.IconCompatParcelizer, p0.read, p0.AudioAttributesCompatParcelizer, p0.RemoteActionCompatParcelizer, p0.AudioAttributesImplApi21Parcelizer, p0.AudioAttributesImplApi26Parcelizer, p0.MediaBrowserCompatCustomActionResultReceiver, p0.AudioAttributesImplBaseParcelizer);
    }

    public final _findCustomCollectionLikeDeserializer read(int p0, int p1, long p2, withProperty p3, _findCustomTreeNodeDeserializer p4, find p5, int p6, int p7, findOnlyParamWithoutInjection p8) {
        return new _findCustomCollectionLikeDeserializer(p0, p1, p2, p3, p4, p5, p6, p7, p8, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _findCustomCollectionLikeDeserializer)) {
            return false;
        }
        _findCustomCollectionLikeDeserializer _findcustomcollectionlikedeserializer = (_findCustomCollectionLikeDeserializer) p0;
        return assignIndexes.read(this.write, _findcustomcollectionlikedeserializer.write) && withCaseInsensitivity.read(this.IconCompatParcelizer, _findcustomcollectionlikedeserializer.IconCompatParcelizer) && ReadableObjectIdReferring.AudioAttributesCompatParcelizer(this.read, _findcustomcollectionlikedeserializer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, _findcustomcollectionlikedeserializer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, _findcustomcollectionlikedeserializer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, _findcustomcollectionlikedeserializer.AudioAttributesImplApi21Parcelizer) && findSize.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, _findcustomcollectionlikedeserializer.AudioAttributesImplApi26Parcelizer) && _findWithAlias.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, _findcustomcollectionlikedeserializer.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, _findcustomcollectionlikedeserializer.AudioAttributesImplBaseParcelizer);
    }

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = assignIndexes.RemoteActionCompatParcelizer(this.write);
        int iRemoteActionCompatParcelizer2 = withCaseInsensitivity.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        int iMediaBrowserCompatItemReceiver = ReadableObjectIdReferring.MediaBrowserCompatItemReceiver(this.read);
        withProperty withproperty = this.AudioAttributesCompatParcelizer;
        int iHashCode = withproperty != null ? withproperty.hashCode() : 0;
        _findCustomTreeNodeDeserializer _findcustomtreenodedeserializer = this.RemoteActionCompatParcelizer;
        int iHashCode2 = _findcustomtreenodedeserializer != null ? _findcustomtreenodedeserializer.hashCode() : 0;
        find findVar = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode3 = findVar != null ? findVar.hashCode() : 0;
        int iAudioAttributesImplApi21Parcelizer = findSize.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi26Parcelizer);
        int iRemoteActionCompatParcelizer3 = _findWithAlias.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        findOnlyParamWithoutInjection findonlyparamwithoutinjection = this.AudioAttributesImplBaseParcelizer;
        return (((((((((((((((iRemoteActionCompatParcelizer * 31) + iRemoteActionCompatParcelizer2) * 31) + iMediaBrowserCompatItemReceiver) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iAudioAttributesImplApi21Parcelizer) * 31) + iRemoteActionCompatParcelizer3) * 31) + (findonlyparamwithoutinjection != null ? findonlyparamwithoutinjection.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphStyle(textAlign=");
        sb.append((Object) assignIndexes.AudioAttributesCompatParcelizer(this.write));
        sb.append(", textDirection=");
        sb.append((Object) withCaseInsensitivity.IconCompatParcelizer(this.IconCompatParcelizer));
        sb.append(", lineHeight=");
        sb.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(this.read));
        sb.append(", textIndent=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", platformStyle=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", lineHeightStyle=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", lineBreak=");
        sb.append((Object) findSize.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi26Parcelizer));
        sb.append(", hyphens=");
        sb.append((Object) _findWithAlias.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver));
        sb.append(", textMotion=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ _findCustomCollectionLikeDeserializer(int i, int i2, long j, withProperty withproperty, _findCustomTreeNodeDeserializer _findcustomtreenodedeserializer, find findVar, int i3, int i4, findOnlyParamWithoutInjection findonlyparamwithoutinjection, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, i2, j, withproperty, _findcustomtreenodedeserializer, findVar, i3, i4, findonlyparamwithoutinjection);
    }
}
