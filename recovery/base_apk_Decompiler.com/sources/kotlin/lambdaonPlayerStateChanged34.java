package kotlin;

import android.content.SharedPreferences;
import com.facebook.Profile;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\n\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r"}, d2 = {"Lo/lambdaonPlayerStateChanged34;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "Lcom/facebook/Profile;", "write", "()Lcom/facebook/Profile;", "p0", "read", "(Lcom/facebook/Profile;)V", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;"}, k = 1, mv = {1, 4, 0})
public final class lambdaonPlayerStateChanged34 {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final SharedPreferences read;

    public lambdaonPlayerStateChanged34() {
        SharedPreferences sharedPreferences = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sharedPreferences, "");
        this.read = sharedPreferences;
    }

    public final Profile write() {
        String string = this.read.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void read(Profile p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        JSONObject jSONObjectAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
        if (jSONObjectAudioAttributesCompatParcelizer != null) {
            this.read.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObjectAudioAttributesCompatParcelizer.toString()).apply();
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.read.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
}
