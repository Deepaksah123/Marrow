package kotlin;

import java.util.List;
import kotlin.CVideoChangeFrameRateStrategy;
import kotlin.getChildPeriodUidFromConcatenatedUid;

/* JADX INFO: loaded from: classes2.dex */
public interface CVolumeFlags {
    int AudioAttributesCompatParcelizer(String str, long j);

    List<CVideoChangeFrameRateStrategy> AudioAttributesCompatParcelizer();

    List<CVideoChangeFrameRateStrategy> AudioAttributesCompatParcelizer(long j);

    CVideoChangeFrameRateStrategy AudioAttributesCompatParcelizer(String str);

    void AudioAttributesCompatParcelizer(String str, int i);

    void AudioAttributesCompatParcelizer(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy);

    int AudioAttributesImplApi21Parcelizer(String str);

    NewNumberOtpResendRequest<Boolean> AudioAttributesImplApi21Parcelizer();

    List<CVideoChangeFrameRateStrategy> AudioAttributesImplApi26Parcelizer();

    List<CVideoChangeFrameRateStrategy.write> AudioAttributesImplApi26Parcelizer(String str);

    int AudioAttributesImplBaseParcelizer(String str);

    List<CVideoChangeFrameRateStrategy> IconCompatParcelizer();

    List<e1> IconCompatParcelizer(String str);

    void IconCompatParcelizer(String str, int i);

    int MediaBrowserCompatCustomActionResultReceiver(String str);

    int MediaBrowserCompatItemReceiver();

    void MediaBrowserCompatItemReceiver(String str);

    int RemoteActionCompatParcelizer(getChildPeriodUidFromConcatenatedUid.write writeVar, String str);

    List<String> RemoteActionCompatParcelizer();

    List<CVideoChangeFrameRateStrategy> RemoteActionCompatParcelizer(int i);

    getChildPeriodUidFromConcatenatedUid.write RemoteActionCompatParcelizer(String str);

    void RemoteActionCompatParcelizer(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy);

    int read();

    List<String> read(String str);

    void read(String str, long j);

    void read(String str, e1 e1Var);

    List<CVideoChangeFrameRateStrategy> write();

    void write(String str);
}
