package kotlin;

import android.content.Context;
import android.os.AsyncTask;
import in.juspay.hypersdk.ota.Constants;
import java.lang.ref.WeakReference;
import kotlin.isSpecialNorthAmericanChar;

/* JADX INFO: loaded from: classes.dex */
public final class getInternalPeriodUid extends AsyncTask<getShowPopup, getShowPopup, getShowPopup> {
    private final Runnable IconCompatParcelizer;
    private final WeakReference<Context> read;

    public getInternalPeriodUid(Context context, Runnable runnable) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(runnable, "");
        this.IconCompatParcelizer = runnable;
        this.read = new WeakReference<>(context);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ getShowPopup doInBackground(getShowPopup[] getshowpopupArr) {
        AudioAttributesCompatParcelizer(getshowpopupArr);
        return getShowPopup.INSTANCE;
    }

    private void AudioAttributesCompatParcelizer(getShowPopup... getshowpopupArr) {
        toMagicModuleMetaRepoModel.write(getshowpopupArr, "");
        this.IconCompatParcelizer.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(getShowPopup getshowpopup) {
        super.onPostExecute(getshowpopup);
        Context context = this.read.get();
        if (context != null) {
            getProvider getprovider = getProvider.getInstance(context);
            isSpecialNorthAmericanChar.Companion companion = isSpecialNorthAmericanChar.INSTANCE;
            getprovider.AudioAttributesCompatParcelizer(isSpecialNorthAmericanChar.Companion.RemoteActionCompatParcelizer(Constants.APP_DIR, "sync"));
        }
    }
}
