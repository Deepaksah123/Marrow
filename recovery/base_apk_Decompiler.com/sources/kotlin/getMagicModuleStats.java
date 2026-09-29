package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B!\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/getMagicModuleStats;", "Lo/getTotalMcq;", "Lo/MagicModuleMetaRepoModel;", "", "Lo/getUserTimezone;", "", "p0", "Lo/SampleVideos;", "p1", "<init>", "(ILo/SampleVideos;)V", "(I)V", "", "toString", "()Ljava/lang/String;", "arity", "I", "getArity", "()I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getMagicModuleStats extends getTotalMcq implements MagicModuleMetaRepoModel<Object>, getUserTimezone {
    private final int arity;

    public getMagicModuleStats(int i, SampleVideos<Object> sampleVideos) {
        super(sampleVideos);
        this.arity = i;
    }

    @Override // kotlin.MagicModuleMetaRepoModel
    public int getArity() {
        return this.arity;
    }

    public getMagicModuleStats(int i) {
        this(i, null);
    }

    @Override // kotlin.getMonthName
    public String toString() {
        if (getCompletion() == null) {
            String strRemoteActionCompatParcelizer = toMagicModuleMetaDataUcModel.RemoteActionCompatParcelizer(this);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
            return strRemoteActionCompatParcelizer;
        }
        return super.toString();
    }
}
