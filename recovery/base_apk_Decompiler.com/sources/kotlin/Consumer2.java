package kotlin;

import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B»\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010&H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00100R\"\u00104\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\"\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00102\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00105\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00106R\u0014\u00109\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\"\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R*\u0010:\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00103R\u0016\u0010=\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u00107\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010?R\u0016\u0010+\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010@"}, d2 = {"Lo/Consumer2;", "Lo/writerFor;", "Lo/onWindowLayoutChanged;", "Lo/AbstractDeserializer;", "p0", "Lo/deserializeWithObjectId;", "p1", "Lo/_reportMissingSetter$write;", "p2", "Lkotlin/Function1;", "Lo/deserializeFromNumber;", "", "p3", "Lo/paramName;", "p4", "", "p5", "", "p6", "p7", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p8", "Lo/WritableTypeIdInclusion;", "p9", "Lo/JFunction2;", "p10", "Lo/MinimalPrettyPrinter;", "p11", "Lo/setTrackNameProvider;", "p12", "<init>", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Lo/_reportMissingSetter$write;Lo/getAnswerMap;IZIILjava/util/List;Lo/getAnswerMap;Lo/JFunction2;Lo/MinimalPrettyPrinter;Lo/setTrackNameProvider;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "RemoteActionCompatParcelizer", "()Lo/onWindowLayoutChanged;", "read", "(Lo/onWindowLayoutChanged;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "MediaBrowserCompatMediaItem", "Lo/AbstractDeserializer;", "write", "MediaBrowserCompatSearchResultReceiver", "Lo/deserializeWithObjectId;", "Lo/_reportMissingSetter$write;", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "Lo/getAnswerMap;", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "I", "MediaDescriptionCompat", "Z", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "Ljava/util/List;", "MediaBrowserCompatItemReceiver", "MediaMetadataCompat", "Lo/JFunction2;", "Lo/MinimalPrettyPrinter;", "Lo/setTrackNameProvider;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Consumer2 extends writerFor<onWindowLayoutChanged> {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<deserializeFromNumber, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getAnswerMap<List<WritableTypeIdInclusion>, getShowPopup> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final AbstractDeserializer write;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final deserializeWithObjectId read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final boolean AudioAttributesImplBaseParcelizer;
    private final JFunction2 MediaMetadataCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setTrackNameProvider MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final _reportMissingSetter.write AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final MinimalPrettyPrinter MediaDescriptionCompat;

    /* JADX WARN: Multi-variable type inference failed */
    private Consumer2(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, getAnswerMap<? super deserializeFromNumber, getShowPopup> getanswermap, int i, boolean z, int i2, int i3, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, getAnswerMap<? super List<WritableTypeIdInclusion>, getShowPopup> getanswermap2, JFunction2 jFunction2, MinimalPrettyPrinter minimalPrettyPrinter, setTrackNameProvider settracknameprovider) {
        this.write = abstractDeserializer;
        this.read = deserializewithobjectid;
        this.AudioAttributesCompatParcelizer = writeVar;
        this.IconCompatParcelizer = getanswermap;
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesImplBaseParcelizer = z;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = i3;
        this.MediaBrowserCompatItemReceiver = list;
        this.AudioAttributesImplApi26Parcelizer = getanswermap2;
        this.MediaMetadataCompat = jFunction2;
        this.MediaDescriptionCompat = minimalPrettyPrinter;
        this.MediaBrowserCompatMediaItem = settracknameprovider;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final onWindowLayoutChanged IconCompatParcelizer() {
        return new onWindowLayoutChanged(this.write, this.read, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, null, 8192, null);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(onWindowLayoutChanged p0) {
        p0.AudioAttributesCompatParcelizer(this.write, this.read, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Consumer2)) {
            return false;
        }
        Consumer2 consumer2 = (Consumer2) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, consumer2.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, consumer2.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, consumer2.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, consumer2.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, consumer2.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, consumer2.MediaBrowserCompatMediaItem) && this.IconCompatParcelizer == consumer2.IconCompatParcelizer && paramName.write(this.RemoteActionCompatParcelizer, consumer2.RemoteActionCompatParcelizer) && this.AudioAttributesImplBaseParcelizer == consumer2.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi21Parcelizer == consumer2.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == consumer2.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi26Parcelizer == consumer2.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, consumer2.MediaMetadataCompat);
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.AudioAttributesCompatParcelizer.hashCode();
        getAnswerMap<deserializeFromNumber, getShowPopup> getanswermap = this.IconCompatParcelizer;
        int iHashCode4 = getanswermap != null ? getanswermap.hashCode() : 0;
        int iRemoteActionCompatParcelizer = paramName.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        int iHashCode5 = Boolean.hashCode(this.AudioAttributesImplBaseParcelizer);
        int i = this.AudioAttributesImplApi21Parcelizer;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list = this.MediaBrowserCompatItemReceiver;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        getAnswerMap<List<WritableTypeIdInclusion>, getShowPopup> getanswermap2 = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode7 = getanswermap2 != null ? getanswermap2.hashCode() : 0;
        JFunction2 jFunction2 = this.MediaMetadataCompat;
        int iHashCode8 = jFunction2 != null ? jFunction2.hashCode() : 0;
        setTrackNameProvider settracknameprovider = this.MediaBrowserCompatMediaItem;
        int iHashCode9 = settracknameprovider != null ? settracknameprovider.hashCode() : 0;
        MinimalPrettyPrinter minimalPrettyPrinter = this.MediaDescriptionCompat;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iRemoteActionCompatParcelizer) * 31) + iHashCode5) * 31) + i) * 31) + i2) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (minimalPrettyPrinter != null ? minimalPrettyPrinter.hashCode() : 0);
    }

    public /* synthetic */ Consumer2(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, getAnswerMap getanswermap, int i, boolean z, int i2, int i3, List list, getAnswerMap getanswermap2, JFunction2 jFunction2, MinimalPrettyPrinter minimalPrettyPrinter, setTrackNameProvider settracknameprovider, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, deserializewithobjectid, writeVar, getanswermap, i, z, i2, i3, list, getanswermap2, jFunction2, minimalPrettyPrinter, settracknameprovider);
    }
}
