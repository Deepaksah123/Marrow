package kotlin;

import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u0019\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u0019\u0010 R\u0017\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010*\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b\u0019\u0010+R\u001a\u00101\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001a\u0010.\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b2\u0010+R\u001a\u0010'\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00103\u001a\u0004\b,\u00104R\u001a\u00102\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b1\u00106R&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u00107\u001a\u0004\b-\u00108R\u0018\u0010-\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b,\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b1\u0010;R\u0014\u0010>\u001a\u0002098CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010=R\u0011\u0010?\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001d\u0010+"}, d2 = {"Lo/WebViewSubtitleOutput;", "", "Lo/AbstractDeserializer;", "p0", "Lo/deserializeWithObjectId;", "p1", "", "p2", "p3", "", "p4", "Lo/paramName;", "p5", "Lo/bufferMapProperty;", "p6", "Lo/_reportMissingSetter$write;", "p7", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p8", "<init>", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;IIZILo/bufferMapProperty;Lo/_reportMissingSetter$write;Ljava/util/List;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/tryToResolveUnresolved;", "", "read", "(Lo/tryToResolveUnresolved;)V", "Lo/PropertyValueAny;", "Lo/_checkImplicitlyNamedConstructors;", "IconCompatParcelizer", "(JLo/tryToResolveUnresolved;)Lo/_checkImplicitlyNamedConstructors;", "Lo/deserializeFromNumber;", "(JLo/tryToResolveUnresolved;Lo/deserializeFromNumber;)Lo/deserializeFromNumber;", "RatingCompat", "Lo/AbstractDeserializer;", "AudioAttributesImplApi21Parcelizer", "()Lo/AbstractDeserializer;", "MediaMetadataCompat", "Lo/deserializeWithObjectId;", "AudioAttributesImplApi26Parcelizer", "()Lo/deserializeWithObjectId;", "I", "write", "()I", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "Z", "()Z", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "Lo/_reportMissingSetter$write;", "()Lo/_reportMissingSetter$write;", "Ljava/util/List;", "()Ljava/util/List;", "Lo/_findParamName;", "Lo/_findParamName;", "Lo/tryToResolveUnresolved;", "MediaBrowserCompatMediaItem", "()Lo/_findParamName;", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebViewSubtitleOutput {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public tryToResolveUnresolved MediaBrowserCompatMediaItem;
    private final List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final bufferMapProperty AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final deserializeWithObjectId read;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final AbstractDeserializer IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public _findParamName MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _reportMissingSetter.write MediaBrowserCompatItemReceiver;

    private WebViewSubtitleOutput(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, int i, int i2, boolean z, int i3, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list) {
        this.IconCompatParcelizer = abstractDeserializer;
        this.read = deserializewithobjectid;
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        this.AudioAttributesCompatParcelizer = z;
        this.AudioAttributesImplBaseParcelizer = i3;
        this.AudioAttributesImplApi26Parcelizer = buffermapproperty;
        this.MediaBrowserCompatItemReceiver = writeVar;
        this.AudioAttributesImplApi21Parcelizer = list;
        if (i <= 0) {
            getRootStableInsets.RemoteActionCompatParcelizer("no maxLines");
        }
        if (i2 <= 0) {
            getRootStableInsets.RemoteActionCompatParcelizer("no minLines");
        }
        if (i2 <= i) {
            return;
        }
        getRootStableInsets.RemoteActionCompatParcelizer("minLines greater than maxLines");
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final AbstractDeserializer getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final deserializeWithObjectId getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public /* synthetic */ WebViewSubtitleOutput(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, int i, int i2, boolean z, int i3, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar, List list, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, deserializewithobjectid, (i4 & 4) != 0 ? Integer.MAX_VALUE : i, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? paramName.INSTANCE.RemoteActionCompatParcelizer() : i3, buffermapproperty, writeVar, (i4 & 256) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, null);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final bufferMapProperty getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final _reportMissingSetter.write getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private final _findParamName RatingCompat() {
        _findParamName _findparamname = this.MediaBrowserCompatCustomActionResultReceiver;
        if (_findparamname != null) {
            return _findparamname;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int IconCompatParcelizer() {
        return MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(RatingCompat().write());
    }

    public final void read(tryToResolveUnresolved p0) {
        _findParamName _findparamname = this.MediaBrowserCompatCustomActionResultReceiver;
        if (_findparamname == null || p0 != this.MediaBrowserCompatMediaItem || _findparamname.AudioAttributesCompatParcelizer()) {
            this.MediaBrowserCompatMediaItem = p0;
            _findparamname = new _findParamName(this.IconCompatParcelizer, injectValues.IconCompatParcelizer(this.read, p0), this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = _findparamname;
    }

    private final _checkImplicitlyNamedConstructors IconCompatParcelizer(long p0, tryToResolveUnresolved p1) {
        read(p1);
        int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(p0);
        int iAudioAttributesImplBaseParcelizer = ((this.AudioAttributesCompatParcelizer || paramName.write(this.AudioAttributesImplBaseParcelizer, paramName.INSTANCE.read())) && PropertyValueAny.RemoteActionCompatParcelizer(p0)) ? PropertyValueAny.AudioAttributesImplBaseParcelizer(p0) : Integer.MAX_VALUE;
        int i = (this.AudioAttributesCompatParcelizer || !paramName.write(this.AudioAttributesImplBaseParcelizer, paramName.INSTANCE.read())) ? this.RemoteActionCompatParcelizer : 1;
        if (iMediaBrowserCompatItemReceiver != iAudioAttributesImplBaseParcelizer) {
            iAudioAttributesImplBaseParcelizer = getQues.write(IconCompatParcelizer(), iMediaBrowserCompatItemReceiver, iAudioAttributesImplBaseParcelizer);
        }
        return new _checkImplicitlyNamedConstructors(RatingCompat(), PropertyValueAny.INSTANCE.IconCompatParcelizer(0, iAudioAttributesImplBaseParcelizer, 0, PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0)), i, this.AudioAttributesImplBaseParcelizer, null);
    }

    public final deserializeFromNumber read(long p0, tryToResolveUnresolved p1, deserializeFromNumber p2) {
        int i;
        int i2;
        if (p2 != null) {
            i2 = 0;
            if (findRelativeAdapterPositionIn.IconCompatParcelizer(p2, this.IconCompatParcelizer, this.read, this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, p1, this.MediaBrowserCompatItemReceiver, p0)) {
                long j = -1;
                return p2.read(new deserializeFromBoolean(p2.getIconCompatParcelizer().getWrite(), this.read, p2.getIconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver(), p2.getIconCompatParcelizer().getIconCompatParcelizer(), p2.getIconCompatParcelizer().getRemoteActionCompatParcelizer(), p2.getIconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver(), p2.getIconCompatParcelizer().getAudioAttributesImplBaseParcelizer(), p2.getIconCompatParcelizer().getMediaBrowserCompatItemReceiver(), p2.getIconCompatParcelizer().getAudioAttributesImplApi21Parcelizer(), p0, (MagicModuleRepositoryImplExternalSyntheticLambda0) null), PropertyValueBuffer.write(p0, getKey.read((((long) MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(p2.getWrite().getAudioAttributesImplApi21Parcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(p2.getWrite().getIconCompatParcelizer())) << 32))));
            }
            i = -1;
        } else {
            i = -1;
            i2 = 0;
        }
        _checkImplicitlyNamedConstructors _checkimplicitlynamedconstructorsIconCompatParcelizer = IconCompatParcelizer(p0, p1);
        long j2 = i;
        return new deserializeFromNumber(new deserializeFromBoolean(this.IconCompatParcelizer, this.read, this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, p1, this.MediaBrowserCompatItemReceiver, p0, (MagicModuleRepositoryImplExternalSyntheticLambda0) null), _checkimplicitlynamedconstructorsIconCompatParcelizer, PropertyValueBuffer.write(p0, getKey.read((((long) MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(_checkimplicitlynamedconstructorsIconCompatParcelizer.getAudioAttributesImplApi21Parcelizer())) & ((((long) i2) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(_checkimplicitlynamedconstructorsIconCompatParcelizer.getIconCompatParcelizer())) << 32))), null);
    }

    public /* synthetic */ WebViewSubtitleOutput(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, int i, int i2, boolean z, int i3, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar, List list, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, deserializewithobjectid, i, i2, z, i3, buffermapproperty, writeVar, list);
    }
}
