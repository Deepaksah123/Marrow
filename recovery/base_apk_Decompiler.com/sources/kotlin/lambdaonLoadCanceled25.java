package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import kotlin.Metadata;
import kotlin.lambdaonPlaybackParametersChanged44;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0016B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\rR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u00178CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001a"}, d2 = {"Lo/lambdaonLoadCanceled25;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "p0", "Lo/lambdaonLoadCanceled25$read;", "p1", "(Landroid/content/SharedPreferences;Lo/lambdaonLoadCanceled25$read;)V", "", "IconCompatParcelizer", "", "AudioAttributesImplBaseParcelizer", "()Z", "Lcom/facebook/AccessToken;", "write", "()Lcom/facebook/AccessToken;", "(Lcom/facebook/AccessToken;)V", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Landroid/content/SharedPreferences;", "read", "Lo/lambdaonPlaybackParametersChanged44;", "()Lo/lambdaonPlaybackParametersChanged44;", "Lo/lambdaonLoadCanceled25$read;", "Lo/lambdaonPlaybackParametersChanged44;", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {1, 4, 0})
public final class lambdaonLoadCanceled25 {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private lambdaonPlaybackParametersChanged44 MediaBrowserCompatCustomActionResultReceiver;
    private final read RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final SharedPreferences read;

    private lambdaonLoadCanceled25(SharedPreferences sharedPreferences, read readVar) {
        toMagicModuleMetaRepoModel.write(sharedPreferences, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        this.read = sharedPreferences;
        this.RemoteActionCompatParcelizer = readVar;
    }

    private final lambdaonPlaybackParametersChanged44 read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
                synchronized (this) {
                    if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
                        this.MediaBrowserCompatCustomActionResultReceiver = read.write();
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            }
            lambdaonPlaybackParametersChanged44 lambdaonplaybackparameterschanged44 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (lambdaonplaybackparameterschanged44 != null) {
                return lambdaonplaybackparameterschanged44;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public lambdaonLoadCanceled25() {
        SharedPreferences sharedPreferences = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sharedPreferences, "");
        this(sharedPreferences, new read());
    }

    public final AccessToken write() {
        if (AudioAttributesImplBaseParcelizer()) {
            return RemoteActionCompatParcelizer();
        }
        if (!MediaBrowserCompatItemReceiver()) {
            return null;
        }
        AccessToken accessTokenAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (accessTokenAudioAttributesCompatParcelizer == null) {
            return accessTokenAudioAttributesCompatParcelizer;
        }
        write(accessTokenAudioAttributesCompatParcelizer);
        read().read();
        return accessTokenAudioAttributesCompatParcelizer;
    }

    public final void write(AccessToken p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            this.read.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", p0.MediaBrowserCompatSearchResultReceiver().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public final void IconCompatParcelizer() {
        this.read.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (MediaBrowserCompatItemReceiver()) {
            read().read();
        }
    }

    private final boolean AudioAttributesImplBaseParcelizer() {
        return this.read.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private final AccessToken RemoteActionCompatParcelizer() {
        String string = this.read.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            AccessToken.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = AccessToken.RemoteActionCompatParcelizer;
            return AccessToken.AudioAttributesCompatParcelizer.write(jSONObject);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static boolean MediaBrowserCompatItemReceiver() {
        return lambdaonMediaMetadataChanged48.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    private final AccessToken AudioAttributesCompatParcelizer() {
        Bundle bundleWrite = read().write();
        if (bundleWrite == null) {
            return null;
        }
        lambdaonPlaybackParametersChanged44.Companion companion = lambdaonPlaybackParametersChanged44.INSTANCE;
        if (lambdaonPlaybackParametersChanged44.Companion.AudioAttributesImplApi26Parcelizer(bundleWrite)) {
            return AccessToken.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(bundleWrite);
        }
        return null;
    }

    public static final class read {
        public static lambdaonPlaybackParametersChanged44 write() {
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
            return new lambdaonPlaybackParametersChanged44(contextAudioAttributesCompatParcelizer, null, 2, null);
        }
    }
}
