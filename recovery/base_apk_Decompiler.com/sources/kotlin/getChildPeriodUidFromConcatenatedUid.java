package kotlin;

import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\u0018\u0000 %2\u00020\u0001:\u0003\"*%B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010%\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b+\u0010)R\u0011\u0010-\u001a\u00020\f8G¢\u0006\u0006\n\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\f8\u0006¢\u0006\u0006\n\u0004\b\"\u0010.R\u0011\u0010+\u001a\u00020\u000f8\u0006¢\u0006\u0006\n\u0004\b,\u00100R\u0011\u00102\u001a\u00020\u00118\u0006¢\u0006\u0006\n\u0004\b*\u00101R\u0013\u0010(\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\u0006\n\u0004\b2\u00103R\u0011\u00104\u001a\u00020\u00118\u0006¢\u0006\u0006\n\u0004\b/\u00101R\u0011\u00105\u001a\u00020\f8G¢\u0006\u0006\n\u0004\b4\u0010."}, d2 = {"Lo/getChildPeriodUidFromConcatenatedUid;", "", "Ljava/util/UUID;", "p0", "Lo/getChildPeriodUidFromConcatenatedUid$write;", "p1", "", "", "p2", "Lo/e1;", "p3", "p4", "", "p5", "p6", "Lo/e;", "p7", "", "p8", "Lo/getChildPeriodUidFromConcatenatedUid$read;", "p9", "p10", "p11", "<init>", "(Ljava/util/UUID;Lo/getChildPeriodUidFromConcatenatedUid$write;Ljava/util/Set;Lo/e1;Lo/e1;IILo/e;JLo/getChildPeriodUidFromConcatenatedUid$read;JI)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/util/UUID;", "write", "MediaBrowserCompatSearchResultReceiver", "Lo/getChildPeriodUidFromConcatenatedUid$write;", "RemoteActionCompatParcelizer", "MediaMetadataCompat", "Ljava/util/Set;", "AudioAttributesImplApi26Parcelizer", "Lo/e1;", "read", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "I", "MediaBrowserCompatCustomActionResultReceiver", "Lo/e;", "J", "AudioAttributesImplBaseParcelizer", "Lo/getChildPeriodUidFromConcatenatedUid$read;", "MediaDescriptionCompat", "RatingCompat"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getChildPeriodUidFromConcatenatedUid {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final e MediaBrowserCompatItemReceiver;
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final e1 read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final read AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final UUID write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final long MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final e1 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final write RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final int RatingCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final Set<String> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    public getChildPeriodUidFromConcatenatedUid(UUID uuid, write writeVar, Set<String> set, e1 e1Var, e1 e1Var2, int i, int i2, e eVar, long j, read readVar, long j2, int i3) {
        toMagicModuleMetaRepoModel.write(uuid, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(set, "");
        toMagicModuleMetaRepoModel.write(e1Var, "");
        toMagicModuleMetaRepoModel.write(e1Var2, "");
        toMagicModuleMetaRepoModel.write(eVar, "");
        this.write = uuid;
        this.RemoteActionCompatParcelizer = writeVar;
        this.IconCompatParcelizer = set;
        this.read = e1Var;
        this.AudioAttributesCompatParcelizer = e1Var2;
        this.AudioAttributesImplApi21Parcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.MediaBrowserCompatItemReceiver = eVar;
        this.AudioAttributesImplBaseParcelizer = j;
        this.AudioAttributesImplApi26Parcelizer = readVar;
        this.MediaDescriptionCompat = j2;
        this.RatingCompat = i3;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), p0.getClass())) {
            return false;
        }
        getChildPeriodUidFromConcatenatedUid getchildperioduidfromconcatenateduid = (getChildPeriodUidFromConcatenatedUid) p0;
        if (this.AudioAttributesImplApi21Parcelizer == getchildperioduidfromconcatenateduid.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == getchildperioduidfromconcatenateduid.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getchildperioduidfromconcatenateduid.write) && this.RemoteActionCompatParcelizer == getchildperioduidfromconcatenateduid.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, getchildperioduidfromconcatenateduid.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, getchildperioduidfromconcatenateduid.MediaBrowserCompatItemReceiver) && this.AudioAttributesImplBaseParcelizer == getchildperioduidfromconcatenateduid.AudioAttributesImplBaseParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, getchildperioduidfromconcatenateduid.AudioAttributesImplApi26Parcelizer) && this.MediaDescriptionCompat == getchildperioduidfromconcatenateduid.MediaDescriptionCompat && this.RatingCompat == getchildperioduidfromconcatenateduid.RatingCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getchildperioduidfromconcatenateduid.IconCompatParcelizer)) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getchildperioduidfromconcatenateduid.AudioAttributesCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.read.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        int iHashCode5 = this.AudioAttributesCompatParcelizer.hashCode();
        int i = this.AudioAttributesImplApi21Parcelizer;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode6 = this.MediaBrowserCompatItemReceiver.hashCode();
        int iHashCode7 = Long.hashCode(this.AudioAttributesImplBaseParcelizer);
        read readVar = this.AudioAttributesImplApi26Parcelizer;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + i) * 31) + i2) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (readVar != null ? readVar.hashCode() : 0)) * 31) + Long.hashCode(this.MediaDescriptionCompat)) * 31) + Integer.hashCode(this.RatingCompat);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfo{id='");
        sb.append(this.write);
        sb.append("', state=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", outputData=");
        sb.append(this.read);
        sb.append(", tags=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", progress=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", runAttemptCount=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", generation=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", constraints=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", initialDelayMillis=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", periodicityInfo=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", nextScheduleTimeMillis=");
        sb.append(this.MediaDescriptionCompat);
        sb.append("}, stopReason=");
        sb.append(this.RatingCompat);
        return sb.toString();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lo/getChildPeriodUidFromConcatenatedUid$write;", "", "<init>", "(Ljava/lang/String;I)V", "", "AudioAttributesCompatParcelizer", "()Z", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "read", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class write {
        private static final /* synthetic */ write[] AudioAttributesImplApi26Parcelizer;
        public static final write AudioAttributesCompatParcelizer = new write("ENQUEUED", 0);
        public static final write RemoteActionCompatParcelizer = new write("RUNNING", 1);
        public static final write AudioAttributesImplBaseParcelizer = new write("SUCCEEDED", 2);
        public static final write read = new write("FAILED", 3);
        public static final write write = new write("BLOCKED", 4);
        public static final write IconCompatParcelizer = new write("CANCELLED", 5);

        private write(String str, int i) {
        }

        static {
            write[] writeVarArr = read();
            AudioAttributesImplApi26Parcelizer = writeVarArr;
            getMagicModuleTimeline.IconCompatParcelizer(writeVarArr);
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this == AudioAttributesImplBaseParcelizer || this == read || this == IconCompatParcelizer;
        }

        private static final /* synthetic */ write[] read() {
            return new write[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer, read, write, IconCompatParcelizer};
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) AudioAttributesImplApi26Parcelizer.clone();
        }
    }

    public static final class read {
        private final long read;
        private final long write;

        public read(long j, long j2) {
            this.read = j;
            this.write = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), obj.getClass())) {
                return false;
            }
            read readVar = (read) obj;
            return readVar.read == this.read && readVar.write == this.write;
        }

        public final int hashCode() {
            return (Long.hashCode(this.read) * 31) + Long.hashCode(this.write);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb.append(this.read);
            sb.append(", flexIntervalMillis=");
            sb.append(this.write);
            sb.append('}');
            return sb.toString();
        }
    }
}
