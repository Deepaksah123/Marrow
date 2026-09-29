package kotlin;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdagetRendererCapabilities0 extends isBeforeFirst<Date> {
    public static final isAfterLast RemoteActionCompatParcelizer = new isAfterLast() { // from class: o.lambdagetRendererCapabilities0.5
        @Override // kotlin.isAfterLast
        public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == Date.class) {
                return new lambdagetRendererCapabilities0();
            }
            return null;
        }
    };
    private final List<DateFormat> IconCompatParcelizer;

    public lambdagetRendererCapabilities0() {
        ArrayList arrayList = new ArrayList();
        this.IconCompatParcelizer = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (createMediaSource.AudioAttributesCompatParcelizer()) {
            arrayList.add(isProgressive.RemoteActionCompatParcelizer());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isBeforeFirst
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Date AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
            return null;
        }
        return write(downloadHelperExternalSyntheticLambda4);
    }

    private Date write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        synchronized (this.IconCompatParcelizer) {
            Iterator<DateFormat> it = this.IconCompatParcelizer.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(strMediaBrowserCompatSearchResultReceiver);
                } catch (ParseException unused) {
                }
            }
            try {
                return lambdaprepare3comgoogleandroidexoplayer2offlineDownloadHelper.RemoteActionCompatParcelizer(strMediaBrowserCompatSearchResultReceiver, new ParsePosition(0));
            } catch (ParseException e) {
                StringBuilder sb = new StringBuilder("Failed parsing '");
                sb.append(strMediaBrowserCompatSearchResultReceiver);
                sb.append("' as Date; at path ");
                sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                throw new getPercentDownloaded(sb.toString(), e);
            }
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
        DateFormat dateFormat = this.IconCompatParcelizer.get(0);
        synchronized (this.IconCompatParcelizer) {
            str = dateFormat.format(date);
        }
        downloadHelper2.AudioAttributesCompatParcelizer(str);
    }
}
