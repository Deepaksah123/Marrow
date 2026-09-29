package kotlin;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.marrow.TrainingApplication;
import com.marrow.data.models.user.LoggedUser;
import in.juspay.hyper.constants.LogSubCategory;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/updateButton;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Ljava/lang/String;", "Lorg/json/JSONObject;", "write", "(Landroid/content/Context;)Lorg/json/JSONObject;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class updateButton {
    public static final updateButton INSTANCE = new updateButton();

    private updateButton() {
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(Context p0) {
        String simCountryIso;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (updateRepeatModeButton.write(p0)) {
            Object systemService = p0.getSystemService("phone");
            toMagicModuleMetaRepoModel.read(systemService, "");
            simCountryIso = ((TelephonyManager) systemService).getSimCountryIso();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(simCountryIso, "");
        } else {
            simCountryIso = "";
        }
        if (simCountryIso.length() != 0) {
            return simCountryIso;
        }
        String country = p0.getResources().getConfiguration().getLocales().get(0).getCountry();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(country, "");
        return country;
    }

    @getMagicModuleMeta
    public static final JSONObject write(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        TrainingApplication trainingApplicationIconCompatParcelizer = TrainingApplication.IconCompatParcelizer(p0);
        LoggedUser loggedUser = trainingApplicationIconCompatParcelizer.getLoggedUser();
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" - ");
        sb.append(str2);
        String string = sb.toString();
        String str3 = Build.VERSION.RELEASE;
        boolean z = loggedUser != null;
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.write(jSONObject, LogSubCategory.Context.DEVICE, string);
        isDvbProfileDeclared.write(jSONObject, "appVersion", "12.0.0");
        isDvbProfileDeclared.write(jSONObject, "appVersionCode", "496");
        isDvbProfileDeclared.write(jSONObject, "os", str3);
        isDvbProfileDeclared.write(jSONObject, "isLogged", String.valueOf(z));
        if (loggedUser != null) {
            String id = loggedUser.getInfo().getId();
            toMagicModuleMetaRepoModel.write(trainingApplicationIconCompatParcelizer);
            String strWrite = DefaultTrackNameProvider.AudioAttributesCompatParcelizer(trainingApplicationIconCompatParcelizer).write();
            isDvbProfileDeclared.write(jSONObject, "userId", id);
            isDvbProfileDeclared.write(jSONObject, "plan", strWrite);
        }
        return jSONObject;
    }
}
