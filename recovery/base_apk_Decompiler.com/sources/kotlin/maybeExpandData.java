package kotlin;

import com.marrow.data.models.video.ThemeState;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface maybeExpandData {
    void AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(float f);

    void AudioAttributesCompatParcelizer(long j);

    void AudioAttributesCompatParcelizer(long j, boolean z);

    void AudioAttributesCompatParcelizer(String str, HashMap<String, String> map);

    void AudioAttributesCompatParcelizer(boolean z);

    void AudioAttributesImplBaseParcelizer();

    String IconCompatParcelizer();

    void IconCompatParcelizer(int i, long j);

    void IconCompatParcelizer(long j);

    void IconCompatParcelizer(String str);

    void IconCompatParcelizer(Throwable th, Map<String, String> map);

    void MediaBrowserCompatCustomActionResultReceiver();

    void RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(long j);

    void RemoteActionCompatParcelizer(long j, boolean z);

    void RemoteActionCompatParcelizer(ThemeState themeState);

    void RemoteActionCompatParcelizer(String str);

    void RemoteActionCompatParcelizer(getChunkStartTimeUs getchunkstarttimeus, Throwable th, Map<String, String> map);

    long read();

    void read(int i);

    void read(long j);

    void read(long j, int i, long j2, boolean z);

    void write();

    void write(String str);

    void write(String str, String str2, String str3, int i);

    void write$5bdc8345(String str, String str2, cloneAndClear cloneandclear, int i, int i2, Enum r6);
}
