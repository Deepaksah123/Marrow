package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/marrow2/domain/test/model/GTAnalyticsV2UCModel;", "", "testProgressData", "", "Lcom/marrow2/domain/test/model/TestProgressV2UCModel;", "subjectStat", "Lcom/marrow2/domain/test/model/SubjectStatV2UCModel;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getTestProgressData", "()Ljava/util/List;", "getSubjectStat", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class createHandlerForCurrentOrMainLooper {
    private final List<fromUtf8Bytes> RemoteActionCompatParcelizer;
    private final List<getBytesFromHexString> write;

    public createHandlerForCurrentOrMainLooper(List<getBytesFromHexString> list, List<fromUtf8Bytes> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.write = list;
        this.RemoteActionCompatParcelizer = list2;
    }

    public /* synthetic */ createHandlerForCurrentOrMainLooper(List list, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2);
    }

    public final List<getBytesFromHexString> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final List<fromUtf8Bytes> read() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public createHandlerForCurrentOrMainLooper() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static createHandlerForCurrentOrMainLooper write(List<getBytesFromHexString> list, List<fromUtf8Bytes> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        return new createHandlerForCurrentOrMainLooper(list, list2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof createHandlerForCurrentOrMainLooper)) {
            return false;
        }
        createHandlerForCurrentOrMainLooper createhandlerforcurrentormainlooper = (createHandlerForCurrentOrMainLooper) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, createhandlerforcurrentormainlooper.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, createhandlerforcurrentormainlooper.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        List<getBytesFromHexString> list = this.write;
        List<fromUtf8Bytes> list2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("GTAnalyticsV2UCModel(testProgressData=");
        sb.append(list);
        sb.append(", subjectStat=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
