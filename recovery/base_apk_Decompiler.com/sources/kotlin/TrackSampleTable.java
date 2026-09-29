package kotlin;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface TrackSampleTable {

    /* JADX INFO: loaded from: classes5.dex */
    public interface AudioAttributesCompatParcelizer {
    }

    /* JADX INFO: loaded from: classes5.dex */
    public interface IconCompatParcelizer {
        void RemoteActionCompatParcelizer(int i, Bundle bundle);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class RemoteActionCompatParcelizer {
        public boolean AudioAttributesCompatParcelizer;
        public String AudioAttributesImplApi21Parcelizer;
        public Bundle AudioAttributesImplApi26Parcelizer;
        public String AudioAttributesImplBaseParcelizer;
        public Bundle IconCompatParcelizer;
        public String MediaBrowserCompatCustomActionResultReceiver;
        public long MediaBrowserCompatItemReceiver;
        public Object MediaBrowserCompatMediaItem;
        public Bundle MediaBrowserCompatSearchResultReceiver;
        public String MediaDescriptionCompat;
        public long MediaMetadataCompat;
        public long RatingCompat;
        public String RemoteActionCompatParcelizer;
        public String read;
        public long write;
    }

    int AudioAttributesCompatParcelizer(String str);

    List<RemoteActionCompatParcelizer> IconCompatParcelizer(String str, String str2);

    void IconCompatParcelizer(String str);

    void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    Map<String, Object> RemoteActionCompatParcelizer(boolean z);

    void RemoteActionCompatParcelizer(String str, String str2, Bundle bundle);

    AudioAttributesCompatParcelizer write(String str, IconCompatParcelizer iconCompatParcelizer);

    void write(String str, String str2, Object obj);
}
