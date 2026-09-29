package kotlin;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.TrackSampleTable;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackFragment {
    private static final String[] AudioAttributesCompatParcelizer = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    private static DateFormat read = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    private final long AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final Date IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final long RemoteActionCompatParcelizer;
    private final String write;

    private TrackFragment(String str, String str2, String str3, Date date, long j, long j2) {
        this.write = str;
        this.MediaBrowserCompatCustomActionResultReceiver = str2;
        this.AudioAttributesImplApi26Parcelizer = str3;
        this.IconCompatParcelizer = date;
        this.AudioAttributesImplApi21Parcelizer = j;
        this.RemoteActionCompatParcelizer = j2;
    }

    static TrackFragment write(Map<String, String> map) throws fillEncryptionData {
        String str;
        IconCompatParcelizer(map);
        try {
            Date date = read.parse(map.get("experimentStartTime"));
            long j = Long.parseLong(map.get("triggerTimeoutMillis"));
            long j2 = Long.parseLong(map.get("timeToLiveMillis"));
            String str2 = map.get("experimentId");
            String str3 = map.get("variantId");
            if (map.containsKey("triggerEvent")) {
                str = map.get("triggerEvent");
            } else {
                str = "";
            }
            return new TrackFragment(str2, str3, str, date, j, j2);
        } catch (NumberFormatException e) {
            throw new fillEncryptionData("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new fillEncryptionData("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    final String AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    private long IconCompatParcelizer() {
        return this.IconCompatParcelizer.getTime();
    }

    private static void IconCompatParcelizer(Map<String, String> map) throws fillEncryptionData {
        ArrayList arrayList = new ArrayList();
        for (String str : AudioAttributesCompatParcelizer) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new fillEncryptionData(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    final TrackSampleTable.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str) {
        TrackSampleTable.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new TrackSampleTable.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer = str;
        remoteActionCompatParcelizer.write = IconCompatParcelizer();
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer = this.write;
        remoteActionCompatParcelizer.MediaBrowserCompatMediaItem = this.MediaBrowserCompatCustomActionResultReceiver;
        remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = TextUtils.isEmpty(this.AudioAttributesImplApi26Parcelizer) ? null : this.AudioAttributesImplApi26Parcelizer;
        remoteActionCompatParcelizer.MediaMetadataCompat = this.AudioAttributesImplApi21Parcelizer;
        remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer;
        return remoteActionCompatParcelizer;
    }

    static TrackFragment write(TrackSampleTable.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        String str;
        if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == null) {
            str = "";
        } else {
            str = remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        }
        return new TrackFragment(remoteActionCompatParcelizer.RemoteActionCompatParcelizer, String.valueOf(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem), str, new Date(remoteActionCompatParcelizer.write), remoteActionCompatParcelizer.MediaMetadataCompat, remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver);
    }
}
