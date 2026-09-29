package kotlin;

import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin.WorkDatabase;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010(H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00102R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00106\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010=\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00107R\"\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R*\u0010<\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105R\u0016\u0010-\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010@\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010BR\u0016\u0010>\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010CR\"\u00100\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00105"}, d2 = {"Lo/WorkerParameters;", "Lo/writerFor;", "Lo/WorkDatabase;", "Lo/AbstractDeserializer;", "p0", "Lo/deserializeWithObjectId;", "p1", "Lo/_reportMissingSetter$write;", "p2", "Lkotlin/Function1;", "Lo/deserializeFromNumber;", "", "p3", "Lo/paramName;", "p4", "", "p5", "", "p6", "p7", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p8", "Lo/WritableTypeIdInclusion;", "p9", "Lo/JFunction2;", "p10", "Lo/MinimalPrettyPrinter;", "p11", "Lo/setTrackNameProvider;", "p12", "Lo/WorkDatabase$RemoteActionCompatParcelizer;", "p13", "<init>", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Lo/_reportMissingSetter$write;Lo/getAnswerMap;IZIILjava/util/List;Lo/getAnswerMap;Lo/JFunction2;Lo/MinimalPrettyPrinter;Lo/setTrackNameProvider;Lo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "()Lo/WorkDatabase;", "AudioAttributesCompatParcelizer", "(Lo/WorkDatabase;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "MediaMetadataCompat", "Lo/AbstractDeserializer;", "IconCompatParcelizer", "RatingCompat", "Lo/deserializeWithObjectId;", "Lo/_reportMissingSetter$write;", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "Lo/getAnswerMap;", "AudioAttributesImplApi26Parcelizer", "I", "read", "MediaDescriptionCompat", "Z", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatMediaItem", "Ljava/util/List;", "MediaBrowserCompatSearchResultReceiver", "Lo/JFunction2;", "Lo/MinimalPrettyPrinter;", "Lo/setTrackNameProvider;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkerParameters extends writerFor<WorkDatabase> {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getAnswerMap<List<WritableTypeIdInclusion>, getShowPopup> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<deserializeFromNumber, getShowPopup> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final MinimalPrettyPrinter MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getAnswerMap<WorkDatabase.RemoteActionCompatParcelizer, getShowPopup> RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final JFunction2 MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final AbstractDeserializer IconCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final deserializeWithObjectId write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setTrackNameProvider MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _reportMissingSetter.write RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private WorkerParameters(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, getAnswerMap<? super deserializeFromNumber, getShowPopup> getanswermap, int i, boolean z, int i2, int i3, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, getAnswerMap<? super List<WritableTypeIdInclusion>, getShowPopup> getanswermap2, JFunction2 jFunction2, MinimalPrettyPrinter minimalPrettyPrinter, setTrackNameProvider settracknameprovider, getAnswerMap<? super WorkDatabase.RemoteActionCompatParcelizer, getShowPopup> getanswermap3) {
        this.IconCompatParcelizer = abstractDeserializer;
        this.write = deserializewithobjectid;
        this.RemoteActionCompatParcelizer = writeVar;
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.read = i;
        this.AudioAttributesImplApi26Parcelizer = z;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.MediaBrowserCompatItemReceiver = i3;
        this.AudioAttributesImplBaseParcelizer = list;
        this.MediaBrowserCompatCustomActionResultReceiver = getanswermap2;
        this.MediaMetadataCompat = jFunction2;
        this.MediaBrowserCompatSearchResultReceiver = minimalPrettyPrinter;
        this.MediaBrowserCompatMediaItem = settracknameprovider;
        this.RatingCompat = getanswermap3;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final WorkDatabase IconCompatParcelizer() {
        return new WorkDatabase(this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver, this.MediaBrowserCompatMediaItem, this.RatingCompat, null);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(WorkDatabase p0) {
        p0.RemoteActionCompatParcelizer(p0.write(this.MediaBrowserCompatSearchResultReceiver, this.write), p0.IconCompatParcelizer(this.IconCompatParcelizer), p0.AudioAttributesCompatParcelizer(this.write, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, this.read, this.MediaBrowserCompatMediaItem), p0.read(this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaMetadataCompat, this.RatingCompat));
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof WorkerParameters)) {
            return false;
        }
        WorkerParameters workerParameters = (WorkerParameters) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, workerParameters.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, workerParameters.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, workerParameters.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, workerParameters.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, workerParameters.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == workerParameters.AudioAttributesCompatParcelizer && this.RatingCompat == workerParameters.RatingCompat && paramName.write(this.read, workerParameters.read) && this.AudioAttributesImplApi26Parcelizer == workerParameters.AudioAttributesImplApi26Parcelizer && this.AudioAttributesImplApi21Parcelizer == workerParameters.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatItemReceiver == workerParameters.MediaBrowserCompatItemReceiver && this.MediaBrowserCompatCustomActionResultReceiver == workerParameters.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, workerParameters.MediaMetadataCompat);
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        getAnswerMap<deserializeFromNumber, getShowPopup> getanswermap = this.AudioAttributesCompatParcelizer;
        int iHashCode4 = getanswermap != null ? getanswermap.hashCode() : 0;
        int iRemoteActionCompatParcelizer = paramName.RemoteActionCompatParcelizer(this.read);
        int iHashCode5 = Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int i = this.AudioAttributesImplApi21Parcelizer;
        int i2 = this.MediaBrowserCompatItemReceiver;
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list = this.AudioAttributesImplBaseParcelizer;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        getAnswerMap<List<WritableTypeIdInclusion>, getShowPopup> getanswermap2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode7 = getanswermap2 != null ? getanswermap2.hashCode() : 0;
        JFunction2 jFunction2 = this.MediaMetadataCompat;
        int iHashCode8 = jFunction2 != null ? jFunction2.hashCode() : 0;
        MinimalPrettyPrinter minimalPrettyPrinter = this.MediaBrowserCompatSearchResultReceiver;
        int iHashCode9 = minimalPrettyPrinter != null ? minimalPrettyPrinter.hashCode() : 0;
        getAnswerMap<WorkDatabase.RemoteActionCompatParcelizer, getShowPopup> getanswermap3 = this.RatingCompat;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iRemoteActionCompatParcelizer) * 31) + iHashCode5) * 31) + i) * 31) + i2) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (getanswermap3 != null ? getanswermap3.hashCode() : 0);
    }

    public /* synthetic */ WorkerParameters(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, getAnswerMap getanswermap, int i, boolean z, int i2, int i3, List list, getAnswerMap getanswermap2, JFunction2 jFunction2, MinimalPrettyPrinter minimalPrettyPrinter, setTrackNameProvider settracknameprovider, getAnswerMap getanswermap3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, deserializewithobjectid, writeVar, getanswermap, i, z, i2, i3, list, getanswermap2, jFunction2, minimalPrettyPrinter, settracknameprovider, getanswermap3);
    }
}
