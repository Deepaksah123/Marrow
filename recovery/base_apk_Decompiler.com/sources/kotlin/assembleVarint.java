package kotlin;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
class assembleVarint extends writeSubtitleSampleData {
    private getCurrentTrack AudioAttributesCompatParcelizer;
    final TaskCompletionSource IconCompatParcelizer;
    private /* synthetic */ readUint RemoteActionCompatParcelizer;

    assembleVarint(readUint readuint, getCurrentTrack getcurrenttrack, TaskCompletionSource taskCompletionSource) {
        this.RemoteActionCompatParcelizer = readuint;
        this.AudioAttributesCompatParcelizer = getcurrenttrack;
        this.IconCompatParcelizer = taskCompletionSource;
    }

    @Override // kotlin.writeToOutput
    public void RemoteActionCompatParcelizer(Bundle bundle) throws RemoteException {
        assertOutputInitialized assertoutputinitialized = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        if (assertoutputinitialized != null) {
            assertoutputinitialized.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        }
        this.AudioAttributesCompatParcelizer.read("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
