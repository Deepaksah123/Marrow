package kotlin;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
final class lambdaonMediaPrepared4comgoogleandroidexoplayer2offlineDownloadHelper extends isBeforeFirst<Time> {
    static final isAfterLast AudioAttributesCompatParcelizer = new isAfterLast() { // from class: o.lambdaonMediaPrepared4comgoogleandroidexoplayer2offlineDownloadHelper.1
        @Override // kotlin.isAfterLast
        public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == Time.class) {
                return new lambdaonMediaPrepared4comgoogleandroidexoplayer2offlineDownloadHelper((byte) 0);
            }
            return null;
        }
    };
    private final DateFormat IconCompatParcelizer;

    /* synthetic */ lambdaonMediaPrepared4comgoogleandroidexoplayer2offlineDownloadHelper(byte b) {
        this();
    }

    private lambdaonMediaPrepared4comgoogleandroidexoplayer2offlineDownloadHelper() {
        this.IconCompatParcelizer = new SimpleDateFormat("hh:mm:ss a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isBeforeFirst
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public Time AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        Time time;
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
            return null;
        }
        String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        try {
            synchronized (this) {
                time = new Time(this.IconCompatParcelizer.parse(strMediaBrowserCompatSearchResultReceiver).getTime());
            }
            return time;
        } catch (ParseException e) {
            StringBuilder sb = new StringBuilder("Failed parsing '");
            sb.append(strMediaBrowserCompatSearchResultReceiver);
            sb.append("' as SQL Time; at path ");
            sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
            throw new getPercentDownloaded(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isBeforeFirst
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void read(DownloadHelper2 downloadHelper2, Time time) throws IOException {
        String str;
        if (time == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        synchronized (this) {
            str = this.IconCompatParcelizer.format((Date) time);
        }
        downloadHelper2.AudioAttributesCompatParcelizer(str);
    }
}
