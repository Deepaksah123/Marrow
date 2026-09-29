package kotlin;

import kotlin.MediaType;

/* JADX INFO: loaded from: classes4.dex */
public final class onPaymentError extends ActivityAdapterModule {
    private final LessonCompletedDialog AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final long write;

    public onPaymentError(String str, long j, LessonCompletedDialog lessonCompletedDialog) {
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        this.IconCompatParcelizer = str;
        this.write = j;
        this.AudioAttributesCompatParcelizer = lessonCompletedDialog;
    }

    @Override // kotlin.ActivityAdapterModule
    public final long read() {
        return this.write;
    }

    @Override // kotlin.ActivityAdapterModule
    public final MediaType write() {
        String str = this.IconCompatParcelizer;
        if (str == null) {
            return null;
        }
        MediaType.write writeVar = MediaType.write;
        return MediaType.write.AudioAttributesCompatParcelizer(str);
    }

    @Override // kotlin.ActivityAdapterModule
    public final LessonCompletedDialog AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
