package kotlin;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class processStreamInput extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ ToFloatPcmAudioProcessor AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public processStreamInput(ToFloatPcmAudioProcessor toFloatPcmAudioProcessor) {
        super(0);
        this.AudioAttributesCompatParcelizer = toFloatPcmAudioProcessor;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        ToFloatPcmAudioProcessor toFloatPcmAudioProcessor = this.AudioAttributesCompatParcelizer;
        Uri uri = Uri.parse(describeContents.IconCompatParcelizer);
        String[] strArr = {"android_id"};
        try {
            ContentResolver contentResolver = toFloatPcmAudioProcessor.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(contentResolver);
            Cursor cursorQuery = contentResolver.query(uri, null, null, strArr, null);
            if (cursorQuery != null) {
                if (!cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 2) {
                    cursorQuery.close();
                } else {
                    try {
                        String hexString = Long.toHexString(Long.parseLong(cursorQuery.getString(1)));
                        cursorQuery.close();
                        return hexString;
                    } catch (NumberFormatException unused) {
                        cursorQuery.close();
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }
}
