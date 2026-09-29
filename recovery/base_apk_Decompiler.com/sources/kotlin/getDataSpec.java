package kotlin;

import com.marrow.data.models.video.ThemeState;
import com.marrow.data.models.video.cache.VideoCacheInfo;

/* JADX INFO: loaded from: classes.dex */
public interface getDataSpec {
    int AudioAttributesCompatParcelizer();

    VideoCacheInfo AudioAttributesCompatParcelizer(String str);

    VideoCacheInfo AudioAttributesCompatParcelizer(String str, String str2, int i, String str3, ThemeState themeState, int i2);

    void IconCompatParcelizer();

    void IconCompatParcelizer(String str);

    void IconCompatParcelizer(String str, int i);

    void RemoteActionCompatParcelizer(String str);

    void RemoteActionCompatParcelizer(String str, float f);

    void RemoteActionCompatParcelizer$36360dc2(String str, String str2, Enum r3);

    VideoCacheInfo read();

    void read(String str);

    VideoCacheInfo write(String str);
}
