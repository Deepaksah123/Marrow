package kotlin;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
final class lambdaonMediaPreparationFailed5comgoogleandroidexoplayer2offlineDownloadHelper extends isBeforeFirst<Date> {
    static final isAfterLast AudioAttributesCompatParcelizer = new isAfterLast() { // from class: o.lambdaonMediaPreparationFailed5comgoogleandroidexoplayer2offlineDownloadHelper.1
        @Override // kotlin.isAfterLast
        public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == Date.class) {
                return new lambdaonMediaPreparationFailed5comgoogleandroidexoplayer2offlineDownloadHelper((byte) 0);
            }
            return null;
        }
    };
    private final DateFormat RemoteActionCompatParcelizer;

    /* synthetic */ lambdaonMediaPreparationFailed5comgoogleandroidexoplayer2offlineDownloadHelper(byte b) {
        this();
    }

    private lambdaonMediaPreparationFailed5comgoogleandroidexoplayer2offlineDownloadHelper() {
        this.RemoteActionCompatParcelizer = new SimpleDateFormat("MMM d, yyyy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isBeforeFirst
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public Date AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        java.util.Date date;
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
            return null;
        }
        String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        try {
            synchronized (this) {
                date = this.RemoteActionCompatParcelizer.parse(strMediaBrowserCompatSearchResultReceiver);
            }
            return new Date(date.getTime());
        } catch (ParseException e) {
            StringBuilder sb = new StringBuilder("Failed parsing '");
            sb.append(strMediaBrowserCompatSearchResultReceiver);
            sb.append("' as SQL Date; at path ");
            sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
            throw new getPercentDownloaded(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isBeforeFirst
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void read(DownloadHelper2 downloadHelper2, Date date) throws IOException {
        String str;
        if (date == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        synchronized (this) {
            str = this.RemoteActionCompatParcelizer.format((java.util.Date) date);
        }
        downloadHelper2.AudioAttributesCompatParcelizer(str);
    }
}
