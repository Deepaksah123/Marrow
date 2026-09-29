package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class onDownloadsPausedChanged extends DownloadManagerTask<onWaitingForRequirementsChanged, onWaitingForRequirementsChanged> {
    @Override // kotlin.DownloadManagerTask
    final /* synthetic */ onWaitingForRequirementsChanged AudioAttributesCompatParcelizer(Object obj) {
        return read(obj);
    }

    @Override // kotlin.DownloadManagerTask
    final /* synthetic */ int IconCompatParcelizer(onWaitingForRequirementsChanged onwaitingforrequirementschanged) {
        return RemoteActionCompatParcelizer2(onwaitingforrequirementschanged);
    }

    @Override // kotlin.DownloadManagerTask
    final /* synthetic */ onWaitingForRequirementsChanged IconCompatParcelizer(onWaitingForRequirementsChanged onwaitingforrequirementschanged, onWaitingForRequirementsChanged onwaitingforrequirementschanged2) {
        return read(onwaitingforrequirementschanged, onwaitingforrequirementschanged2);
    }

    @Override // kotlin.DownloadManagerTask
    final /* synthetic */ void IconCompatParcelizer(onWaitingForRequirementsChanged onwaitingforrequirementschanged, getRetryDelayMillis getretrydelaymillis) throws IOException {
        write(onwaitingforrequirementschanged, getretrydelaymillis);
    }

    @Override // kotlin.DownloadManagerTask
    final /* synthetic */ int RemoteActionCompatParcelizer(onWaitingForRequirementsChanged onwaitingforrequirementschanged) {
        return write(onwaitingforrequirementschanged);
    }

    @Override // kotlin.DownloadManagerTask
    final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(Object obj, onWaitingForRequirementsChanged onwaitingforrequirementschanged) {
        RemoteActionCompatParcelizer2(obj, onwaitingforrequirementschanged);
    }

    @Override // kotlin.DownloadManagerTask
    final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(onWaitingForRequirementsChanged onwaitingforrequirementschanged, getRetryDelayMillis getretrydelaymillis) throws IOException {
        RemoteActionCompatParcelizer2(onwaitingforrequirementschanged, getretrydelaymillis);
    }

    onDownloadsPausedChanged() {
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method */
    private static void RemoteActionCompatParcelizer2(Object obj, onWaitingForRequirementsChanged onwaitingforrequirementschanged) {
        ((updateWaitingForRequirements) obj).unknownFields = onwaitingforrequirementschanged;
    }

    private static onWaitingForRequirementsChanged read(Object obj) {
        return ((updateWaitingForRequirements) obj).unknownFields;
    }

    @Override // kotlin.DownloadManagerTask
    final void write(Object obj) {
        read(obj).AudioAttributesCompatParcelizer();
    }

    private static void write(onWaitingForRequirementsChanged onwaitingforrequirementschanged, getRetryDelayMillis getretrydelaymillis) throws IOException {
        onwaitingforrequirementschanged.RemoteActionCompatParcelizer(getretrydelaymillis);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method */
    private static void RemoteActionCompatParcelizer2(onWaitingForRequirementsChanged onwaitingforrequirementschanged, getRetryDelayMillis getretrydelaymillis) throws IOException {
        onwaitingforrequirementschanged.AudioAttributesCompatParcelizer(getretrydelaymillis);
    }

    private static onWaitingForRequirementsChanged read(onWaitingForRequirementsChanged onwaitingforrequirementschanged, onWaitingForRequirementsChanged onwaitingforrequirementschanged2) {
        if (onWaitingForRequirementsChanged.IconCompatParcelizer().equals(onwaitingforrequirementschanged2)) {
            return onwaitingforrequirementschanged;
        }
        if (onWaitingForRequirementsChanged.IconCompatParcelizer().equals(onwaitingforrequirementschanged)) {
            return onWaitingForRequirementsChanged.write(onwaitingforrequirementschanged, onwaitingforrequirementschanged2);
        }
        return onwaitingforrequirementschanged.RemoteActionCompatParcelizer(onwaitingforrequirementschanged2);
    }

    private static int write(onWaitingForRequirementsChanged onwaitingforrequirementschanged) {
        return onwaitingforrequirementschanged.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method */
    private static int RemoteActionCompatParcelizer2(onWaitingForRequirementsChanged onwaitingforrequirementschanged) {
        return onwaitingforrequirementschanged.read();
    }
}
