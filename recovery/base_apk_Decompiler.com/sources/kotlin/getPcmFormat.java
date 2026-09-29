package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\r"}, d2 = {"Lo/getPcmFormat;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getPcmFormat {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    public getPcmFormat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = str;
    }

    public /* synthetic */ getPcmFormat(String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getPcmFormat() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof getPcmFormat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) ((getPcmFormat) p0).RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("getPcmFormat(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
