package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface SearchTextResponseBody<T> extends Cloneable {
    ThemeKtExternalSyntheticLambda0 AudioAttributesCompatParcelizer();

    void IconCompatParcelizer(SubjectLSModel<T> subjectLSModel);

    boolean IconCompatParcelizer();

    void RemoteActionCompatParcelizer();

    getTopicStat<T> read() throws IOException;

    SearchTextResponseBody<T> write();
}
