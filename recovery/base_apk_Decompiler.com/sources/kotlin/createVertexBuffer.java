package kotlin;

import android.app.Application;
import com.marrow.R;
import com.marrow2.data.user.remote.model.ResetContentInfoResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class createVertexBuffer implements deleteFbo {
    private final Application IconCompatParcelizer;

    @setSdkPayload
    public createVertexBuffer(Application application) {
        toMagicModuleMetaRepoModel.write(application, "");
        this.IconCompatParcelizer = application;
    }

    @Override // kotlin.deleteFbo
    public final Object write() {
        return new ResetContentInfoResponse.ScreenCopy(new ResetContentInfoResponse.UiContentCopy(this.IconCompatParcelizer.getString(R.string.reset_bookmarks_subtitle), this.IconCompatParcelizer.getString(R.string.reset_bookmarks_only)), new ResetContentInfoResponse.UiContentCopy(this.IconCompatParcelizer.getString(R.string.reset_qbank_subtitle), this.IconCompatParcelizer.getString(R.string.reset_qbank_only)), new ResetContentInfoResponse.UiContentCopy(this.IconCompatParcelizer.getString(R.string.reset_qbank_bookmarks_subtitle), this.IconCompatParcelizer.getString(R.string.reset_qbank_bookmarks)), this.IconCompatParcelizer.getString(R.string.reset_screen_title));
    }
}
