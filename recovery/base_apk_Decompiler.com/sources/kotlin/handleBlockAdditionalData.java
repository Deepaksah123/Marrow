package kotlin;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class handleBlockAdditionalData extends handleBlockAddIDExtraData {
    private /* synthetic */ assertOutputInitialized AudioAttributesCompatParcelizer;
    private /* synthetic */ handleBlockAddIDExtraData read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    handleBlockAdditionalData(assertOutputInitialized assertoutputinitialized, TaskCompletionSource taskCompletionSource, handleBlockAddIDExtraData handleblockaddidextradata) {
        super(taskCompletionSource);
        this.AudioAttributesCompatParcelizer = assertoutputinitialized;
        this.read = handleblockaddidextradata;
    }

    @Override // kotlin.handleBlockAddIDExtraData
    public final void read() {
        assertOutputInitialized.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read);
    }
}
