package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0003H&¢\u0006\u0004\b\u000e\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0017\u0010\u0013\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u0010\u0010\u001fR\u0011\u0010\u000e\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010!R\u0011\u0010\u0010\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010#"}, d2 = {"Lo/setArguments;", "Lo/addMediaSource;", "Lo/setAllowReturnTransitionOverlap;", "Lo/PropertyValueAny;", "p0", "", "p1", "Lo/performStart;", "p2", "Lo/Mp4LocationData;", "p3", "<init>", "(JZLo/performStart;Lo/Mp4LocationData;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "write", "(IIIJ)Lo/setAllowReturnTransitionOverlap;", "read", "(IJ)Lo/setAllowReturnTransitionOverlap;", "", "IconCompatParcelizer", "(I)V", "", "", "Lo/_parser;", "p4", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Lo/setAllowReturnTransitionOverlap;", "RemoteActionCompatParcelizer", "Lo/performStart;", "Lo/Mp4LocationData;", "AudioAttributesCompatParcelizer", "J", "()J", "Lo/MdtaMetadataEntry;", "()Lo/MdtaMetadataEntry;", "Lo/setWindowTitle;", "()Lo/setWindowTitle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setArguments extends addMediaSource<setAllowReturnTransitionOverlap> {
    private final performStart RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Mp4LocationData AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    public abstract setAllowReturnTransitionOverlap write(int p0, Object p1, Object p2, List<? extends _parser> p3, long p4);

    private setArguments(long j, boolean z, performStart performstart, Mp4LocationData mp4LocationData) {
        this.RemoteActionCompatParcelizer = performstart;
        this.AudioAttributesCompatParcelizer = mp4LocationData;
        this.IconCompatParcelizer = PropertyValueBuffer.read$default(0, z ? PropertyValueAny.AudioAttributesImplBaseParcelizer(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : PropertyValueAny.AudioAttributesImplApi21Parcelizer(j), 5, null);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.addMediaSource
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public setAllowReturnTransitionOverlap RemoteActionCompatParcelizer(int p0, int p1, int p2, long p3) {
        return read(p0, p3);
    }

    public static /* synthetic */ setAllowReturnTransitionOverlap read$default(setArguments setarguments, int i, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i2 & 2) != 0) {
            j = setarguments.IconCompatParcelizer;
        }
        return setarguments.read(i, j);
    }

    public final setAllowReturnTransitionOverlap read(int p0, long p1) {
        return write(p0, this.RemoteActionCompatParcelizer.IconCompatParcelizer(p0), this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0), RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0, p1), p1);
    }

    public final void IconCompatParcelizer(int p0) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0);
    }

    public final MdtaMetadataEntry write() {
        return this.RemoteActionCompatParcelizer.write();
    }

    public final setWindowTitle IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public /* synthetic */ setArguments(long j, boolean z, performStart performstart, Mp4LocationData mp4LocationData, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, z, performstart, mp4LocationData);
    }
}
