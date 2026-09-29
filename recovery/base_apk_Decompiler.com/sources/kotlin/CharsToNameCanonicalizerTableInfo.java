package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/CharsToNameCanonicalizerTableInfo;", "", "Lo/_checkNeedForRehash;", "p0", "Lo/WritableTypeIdInclusion;", "p1", "", "RemoteActionCompatParcelizer", "(Lo/_checkNeedForRehash;Lo/WritableTypeIdInclusion;)Z", "", "IconCompatParcelizer", "()V", "(I)Z", "read", "()Lo/WritableTypeIdInclusion;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CharsToNameCanonicalizerTableInfo {
    void IconCompatParcelizer();

    boolean IconCompatParcelizer(int p0);

    boolean RemoteActionCompatParcelizer(_checkNeedForRehash p0, WritableTypeIdInclusion p1);

    WritableTypeIdInclusion read();

    default void write() {
    }
}
