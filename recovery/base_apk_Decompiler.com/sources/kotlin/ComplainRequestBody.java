package kotlin;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class ComplainRequestBody {
    private final getCreatedOnDateMs<Boolean> AudioAttributesCompatParcelizer;
    private final Application IconCompatParcelizer;
    private final getAnswerMap<Exception, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public ComplainRequestBody(Application application, getAnswerMap<? super Exception, getShowPopup> getanswermap, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(application, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.IconCompatParcelizer = application;
        this.RemoteActionCompatParcelizer = getanswermap;
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.invoke().booleanValue();
    }

    public final String read(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (str2 == null) {
            this.RemoteActionCompatParcelizer.invoke(new IllegalArgumentException("NAT null"));
            return null;
        }
        if (!this.AudioAttributesCompatParcelizer.invoke().booleanValue()) {
            return null;
        }
        try {
            getOptionIndex getoptionindex = getOptionIndex.INSTANCE;
            Context applicationContext = this.IconCompatParcelizer.getApplicationContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext, "");
            return getoptionindex.write(applicationContext, str, str2);
        } catch (Exception e) {
            this.RemoteActionCompatParcelizer.invoke(e);
            return null;
        }
    }
}
