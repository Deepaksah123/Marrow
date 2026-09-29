package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface toDownloadInfo extends Cloneable {

    /* JADX INFO: loaded from: classes4.dex */
    public interface AudioAttributesCompatParcelizer {
        toDownloadInfo IconCompatParcelizer(ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0);
    }

    ThemeKtExternalSyntheticLambda0 AudioAttributesCompatParcelizer();

    void IconCompatParcelizer(MarrowVideoDownloadException marrowVideoDownloadException);

    boolean IconCompatParcelizer();

    void RemoteActionCompatParcelizer();

    C0156TypeKt write() throws IOException;
}
