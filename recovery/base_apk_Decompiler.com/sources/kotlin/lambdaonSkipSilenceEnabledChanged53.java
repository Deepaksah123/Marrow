package kotlin;

import com.facebook.AccessToken;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014"}, d2 = {"Lo/lambdaonSkipSilenceEnabledChanged53;", "Ljava/io/Serializable;", "Lcom/facebook/AccessToken;", "p0", "<init>", "(Lcom/facebook/AccessToken;)V", "", "p1", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "writeReplace", "()Ljava/lang/Object;", "read", "Ljava/lang/String;", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write", "IconCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public final class lambdaonSkipSilenceEnabledChanged53 implements Serializable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String write;
    private final String read;

    public lambdaonSkipSilenceEnabledChanged53(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str2;
        this.read = DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(str) ? null : str;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public lambdaonSkipSilenceEnabledChanged53(AccessToken accessToken) {
        toMagicModuleMetaRepoModel.write(accessToken, "");
        String ratingCompat = accessToken.getRatingCompat();
        String strWrite = lambdaonMediaMetadataChanged48.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        this(ratingCompat, strWrite);
    }

    public final int hashCode() {
        String str = this.read;
        return this.write.hashCode() ^ (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof lambdaonSkipSilenceEnabledChanged53)) {
            return false;
        }
        lambdaonSkipSilenceEnabledChanged53 lambdaonskipsilenceenabledchanged53 = (lambdaonSkipSilenceEnabledChanged53) p0;
        return DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer(lambdaonskipsilenceenabledchanged53.read, this.read) && DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer(lambdaonskipsilenceenabledchanged53.write, this.write);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lo/lambdaonSkipSilenceEnabledChanged53$write;", "Ljava/io/Serializable;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "readResolve", "()Ljava/lang/Object;", "write", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 4, 0})
    public static final class write implements Serializable {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String IconCompatParcelizer;
        private final String write;

        public write(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str2, "");
            this.write = str;
            this.IconCompatParcelizer = str2;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new lambdaonSkipSilenceEnabledChanged53(this.write, this.IconCompatParcelizer);
        }
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new write(this.read, this.write);
    }
}
