package kotlin;

import android.app.Application;
import android.content.Context;
import com.marrow.R;
import com.marrow.data.models.ResponseError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class createMediaPlaylistVariantUrl implements endsWithLivePostrollPlaceHolder {
    private final Context read;

    @setSdkPayload
    public createMediaPlaylistVariantUrl(Application application) {
        toMagicModuleMetaRepoModel.write(application, "");
        this.read = application;
    }

    @Override // kotlin.endsWithLivePostrollPlaceHolder
    public final String write(int i) {
        String string = this.read.getResources().getString(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @Override // kotlin.endsWithLivePostrollPlaceHolder
    public final int read() {
        return _isNaN.getColor(this.read, R.color.blue_grey);
    }

    @Override // kotlin.endsWithLivePostrollPlaceHolder
    public final String read(int i, Object... objArr) {
        toMagicModuleMetaRepoModel.write(objArr, "");
        String string = this.read.getResources().getString(i, Arrays.copyOf(objArr, objArr.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @Override // kotlin.endsWithLivePostrollPlaceHolder
    public final String AudioAttributesCompatParcelizer(int i, int i2, Object... objArr) {
        toMagicModuleMetaRepoModel.write(objArr, "");
        String quantityString = this.read.getResources().getQuantityString(R.plurals.plural_bookmark_count, i2, Arrays.copyOf(objArr, objArr.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(quantityString, "");
        return quantityString;
    }

    @Override // kotlin.endsWithLivePostrollPlaceHolder
    public final ResponseError write() {
        return ResponseError.INSTANCE.customError(write(R.string.error_text_general));
    }
}
