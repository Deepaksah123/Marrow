package kotlin;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
final class DownloadHelperExternalSyntheticLambda1 extends isBeforeFirst<Timestamp> {
    static final isAfterLast AudioAttributesCompatParcelizer = new isAfterLast() { // from class: o.DownloadHelperExternalSyntheticLambda1.3
        @Override // kotlin.isAfterLast
        public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == Timestamp.class) {
                return new DownloadHelperExternalSyntheticLambda1(setdownloadingstatestoqueued.read(Date.class), (byte) 0);
            }
            return null;
        }
    };
    private final isBeforeFirst<Date> read;

    /* synthetic */ DownloadHelperExternalSyntheticLambda1(isBeforeFirst isbeforefirst, byte b) {
        this(isbeforefirst);
    }

    private DownloadHelperExternalSyntheticLambda1(isBeforeFirst<Date> isbeforefirst) {
        this.read = isbeforefirst;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isBeforeFirst
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Timestamp AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        Date dateAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        if (dateAudioAttributesCompatParcelizer != null) {
            return new Timestamp(dateAudioAttributesCompatParcelizer.getTime());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isBeforeFirst
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void read(DownloadHelper2 downloadHelper2, Timestamp timestamp) throws IOException {
        this.read.read(downloadHelper2, timestamp);
    }
}
