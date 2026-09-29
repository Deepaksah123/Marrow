package kotlin;

import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
public final class setUserStartedTimestampMs {
    public static final <T> Object write(Object obj) {
        Throwable thIconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer(obj);
        return thIconCompatParcelizer == null ? obj : new setUserSubmittedTimestampMs(thIconCompatParcelizer);
    }

    public static final <T> Object write(Object obj, setStateRank<?> setstaterank) {
        Throwable thIconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer(obj);
        if (thIconCompatParcelizer == null) {
            return obj;
        }
        if (getCollegeId.RemoteActionCompatParcelizer()) {
            setStateRank<?> setstaterank2 = setstaterank;
            if (setstaterank2 instanceof getNextQuery) {
                thIconCompatParcelizer = accessgetVideoConfigurationC0cp.read(thIconCompatParcelizer, (getNextQuery) setstaterank2);
            }
        }
        return new setUserSubmittedTimestampMs(thIconCompatParcelizer);
    }

    public static final <T> Object read(Object obj, SampleVideos<? super T> sampleVideos) {
        if (obj instanceof setUserSubmittedTimestampMs) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            Throwable th = ((setUserSubmittedTimestampMs) obj).RemoteActionCompatParcelizer;
            if (getCollegeId.RemoteActionCompatParcelizer() && (sampleVideos instanceof getNextQuery)) {
                th = accessgetVideoConfigurationC0cp.read(th, (getNextQuery) sampleVideos);
            }
            return C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
        return C0177getRfBanners.read(obj);
    }
}
