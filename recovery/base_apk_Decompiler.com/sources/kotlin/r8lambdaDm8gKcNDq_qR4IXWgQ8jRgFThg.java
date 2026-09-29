package kotlin;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import kotlin.DownloadRequest;
import kotlin.getDownloadsPaused;
import kotlin.onRequirementsStateChanged;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaDm8gKcNDq_qR4IXWgQ8jRgFThg<T> implements setNotMetRequirements<T> {
    private final DownloadManagerExternalSyntheticLambda0 AudioAttributesCompatParcelizer;
    private final notifyWaitingForRequirementsChanged<?> IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final DownloadManagerTask<?, ?> write;

    private r8lambdaDm8gKcNDq_qR4IXWgQ8jRgFThg(DownloadManagerTask<?, ?> downloadManagerTask, notifyWaitingForRequirementsChanged<?> notifywaitingforrequirementschanged, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) {
        this.write = downloadManagerTask;
        this.RemoteActionCompatParcelizer = notifywaitingforrequirementschanged.read(downloadManagerExternalSyntheticLambda0);
        this.IconCompatParcelizer = notifywaitingforrequirementschanged;
        this.AudioAttributesCompatParcelizer = downloadManagerExternalSyntheticLambda0;
    }

    static <T> r8lambdaDm8gKcNDq_qR4IXWgQ8jRgFThg<T> AudioAttributesCompatParcelizer(DownloadManagerTask<?, ?> downloadManagerTask, notifyWaitingForRequirementsChanged<?> notifywaitingforrequirementschanged, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) {
        return new r8lambdaDm8gKcNDq_qR4IXWgQ8jRgFThg<>(downloadManagerTask, notifywaitingforrequirementschanged, downloadManagerExternalSyntheticLambda0);
    }

    @Override // kotlin.setNotMetRequirements
    public final T read() {
        DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0 = this.AudioAttributesCompatParcelizer;
        if (downloadManagerExternalSyntheticLambda0 instanceof updateWaitingForRequirements) {
            return (T) ((updateWaitingForRequirements) downloadManagerExternalSyntheticLambda0).onSetShuffleMode();
        }
        return (T) downloadManagerExternalSyntheticLambda0.onSetPlaybackSpeed().RatingCompat();
    }

    @Override // kotlin.setNotMetRequirements
    public final boolean RemoteActionCompatParcelizer(T t, T t2) {
        if (!this.write.AudioAttributesCompatParcelizer(t).equals(this.write.AudioAttributesCompatParcelizer(t2))) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(t).equals(this.IconCompatParcelizer.AudioAttributesCompatParcelizer(t2));
        }
        return true;
    }

    @Override // kotlin.setNotMetRequirements
    public final int IconCompatParcelizer(T t) {
        int iHashCode = this.write.AudioAttributesCompatParcelizer(t).hashCode();
        return this.RemoteActionCompatParcelizer ? (iHashCode * 53) + this.IconCompatParcelizer.AudioAttributesCompatParcelizer(t).hashCode() : iHashCode;
    }

    @Override // kotlin.setNotMetRequirements
    public final void AudioAttributesCompatParcelizer(T t, T t2) {
        DownloadManagerListener.AudioAttributesCompatParcelizer(this.write, t, t2);
        if (this.RemoteActionCompatParcelizer) {
            DownloadManagerListener.IconCompatParcelizer(this.IconCompatParcelizer, t, t2);
        }
    }

    @Override // kotlin.setNotMetRequirements
    public final void AudioAttributesCompatParcelizer(T t, getRetryDelayMillis getretrydelaymillis) throws IOException {
        Iterator itAudioAttributesImplApi26Parcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(t).AudioAttributesImplApi26Parcelizer();
        while (itAudioAttributesImplApi26Parcelizer.hasNext()) {
            Map.Entry entry = (Map.Entry) itAudioAttributesImplApi26Parcelizer.next();
            onRequirementsStateChanged.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (onRequirementsStateChanged.RemoteActionCompatParcelizer) entry.getKey();
            if (remoteActionCompatParcelizer.write() != DownloadRequest.IconCompatParcelizer.MESSAGE || remoteActionCompatParcelizer.RemoteActionCompatParcelizer() || remoteActionCompatParcelizer.read()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof getDownloadsPaused.write) {
                getretrydelaymillis.write(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), ((getDownloadsPaused.write) entry).read().AudioAttributesCompatParcelizer());
            } else {
                getretrydelaymillis.write(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), entry.getValue());
            }
        }
        IconCompatParcelizer(this.write, t, getretrydelaymillis);
    }

    private static <UT, UB> void IconCompatParcelizer(DownloadManagerTask<UT, UB> downloadManagerTask, T t, getRetryDelayMillis getretrydelaymillis) throws IOException {
        downloadManagerTask.RemoteActionCompatParcelizer(downloadManagerTask.AudioAttributesCompatParcelizer(t), getretrydelaymillis);
    }

    @Override // kotlin.setNotMetRequirements
    public final void RemoteActionCompatParcelizer(T t) {
        this.write.write(t);
        this.IconCompatParcelizer.write(t);
    }

    @Override // kotlin.setNotMetRequirements
    public final boolean write(T t) {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(t).AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.setNotMetRequirements
    public final int AudioAttributesCompatParcelizer(T t) {
        int i = read(this.write, t);
        return this.RemoteActionCompatParcelizer ? i + this.IconCompatParcelizer.AudioAttributesCompatParcelizer(t).read() : i;
    }

    private static <UT, UB> int read(DownloadManagerTask<UT, UB> downloadManagerTask, T t) {
        return downloadManagerTask.IconCompatParcelizer(downloadManagerTask.AudioAttributesCompatParcelizer(t));
    }
}
