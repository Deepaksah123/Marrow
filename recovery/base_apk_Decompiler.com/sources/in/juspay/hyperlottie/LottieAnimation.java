package in.juspay.hyperlottie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.core.FileProviderInterface;
import in.juspay.hyper.core.JsCallback;
import java.util.WeakHashMap;
import kotlin.ExoPlayerImplExternalSyntheticLambda19;
import kotlin.ExoPlayerImplExternalSyntheticLambda21;
import kotlin.ExoPlayerImplExternalSyntheticLambda6;
import kotlin.Metadata;
import kotlin.onAudioEnabled;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lin/juspay/hyperlottie/LottieAnimation;", "", "Landroid/content/Context;", "p0", "Lin/juspay/hyper/core/JsCallback;", "p1", "Lin/juspay/hyper/core/FileProviderInterface;", "p2", "<init>", "(Landroid/content/Context;Lin/juspay/hyper/core/JsCallback;Lin/juspay/hyper/core/FileProviderInterface;)V", "Lorg/json/JSONArray;", "", "applyAnimation", "(Ljava/lang/Object;Lorg/json/JSONArray;)V", LogCategory.CONTEXT, "Landroid/content/Context;", "dynamicUI", "Lin/juspay/hyper/core/JsCallback;", "fileProviderInterface", "Lin/juspay/hyper/core/FileProviderInterface;", "Ljava/util/WeakHashMap;", "", "jsonStringCache", "Ljava/util/WeakHashMap;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LottieAnimation {
    private static final String ALPHA = "lottieAlpha";
    private static final String LOTTIE_URL = "lottieUrl";
    private static final String MAX_FRAME = "maxFrame";
    private static final String MAX_PROGRESS = "maxProgress";
    private static final String MIN_FRAME = "minFrame";
    private static final String MIN_PROGRESS = "minProgress";
    private static final String REPEAT_COUNT = "repeatCount";
    private static final String REPEAT_MODE = "repeatMode";
    private static final String SAFE_MODE = "safeMode";
    private static final String SPEED = "speed";
    private static final String START_LOTTIE = "startLottie";
    private final Context context;
    private final JsCallback dynamicUI;
    private final FileProviderInterface fileProviderInterface;
    private final WeakHashMap<String, String> jsonStringCache;

    public LottieAnimation(Context context, JsCallback jsCallback, FileProviderInterface fileProviderInterface) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(jsCallback, "");
        toMagicModuleMetaRepoModel.write(fileProviderInterface, "");
        this.context = context;
        this.dynamicUI = jsCallback;
        this.fileProviderInterface = fileProviderInterface;
        this.jsonStringCache = new WeakHashMap<>();
    }

    public final void applyAnimation(final Object p0, JSONArray p1) {
        String str;
        final ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6;
        int iOptInt;
        int iOptInt2;
        int iOptInt3;
        String str2;
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0 instanceof View) {
            try {
                if (p1.length() == 0) {
                    if (((View) p0).getBackground() instanceof ExoPlayerImplExternalSyntheticLambda6) {
                        ((View) p0).setBackground(null);
                        return;
                    }
                    return;
                }
                if (p1.length() > 1) {
                    this.dynamicUI.addJsToWebView("console.log(\"LottieAnimations Array is > 1\");");
                }
                JSONObject jSONObject = p1.getJSONObject(p1.length() - 1);
                if (jSONObject != null) {
                    final boolean zOptBoolean = jSONObject.optBoolean(START_LOTTIE, true);
                    if (jSONObject.has(LOTTIE_URL)) {
                        String string = jSONObject.getString(LOTTIE_URL);
                        if (this.jsonStringCache.containsKey(string)) {
                            str2 = this.jsonStringCache.get(string);
                            str = ALPHA;
                        } else {
                            FileProviderInterface fileProviderInterface = this.fileProviderInterface;
                            str = ALPHA;
                            Context context = this.context;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            String fromFile = fileProviderInterface.readFromFile(context, string);
                            String str3 = fromFile;
                            if (str3 == null || str3.length() == 0) {
                                return;
                            }
                            this.jsonStringCache.put(string, fromFile);
                            str2 = fromFile;
                        }
                        exoPlayerImplExternalSyntheticLambda6 = new ExoPlayerImplExternalSyntheticLambda6();
                        ExoPlayerImplExternalSyntheticLambda21.write(str2, string).write(new onAudioEnabled() { // from class: in.juspay.hyperlottie.LottieAnimation$$ExternalSyntheticLambda0
                            @Override // kotlin.onAudioEnabled
                            public final void onResult(Object obj) {
                                LottieAnimation.applyAnimation$lambda$0(exoPlayerImplExternalSyntheticLambda6, p0, zOptBoolean, (ExoPlayerImplExternalSyntheticLambda19) obj);
                            }
                        });
                    } else {
                        str = ALPHA;
                        if (!(((View) p0).getBackground() instanceof ExoPlayerImplExternalSyntheticLambda6)) {
                            return;
                        }
                        Drawable background = ((View) p0).getBackground();
                        toMagicModuleMetaRepoModel.read(background, "");
                        exoPlayerImplExternalSyntheticLambda6 = (ExoPlayerImplExternalSyntheticLambda6) background;
                    }
                    if (jSONObject.has(REPEAT_MODE)) {
                        exoPlayerImplExternalSyntheticLambda6.AudioAttributesImplBaseParcelizer(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "reverse", (Object) jSONObject.optString(REPEAT_MODE, "")) ? 2 : 1);
                    }
                    if (jSONObject.has(REPEAT_COUNT)) {
                        int iOptInt4 = jSONObject.optInt(REPEAT_COUNT, 0);
                        if (iOptInt4 < 0) {
                            exoPlayerImplExternalSyntheticLambda6.AudioAttributesImplApi26Parcelizer(-1);
                        } else {
                            exoPlayerImplExternalSyntheticLambda6.AudioAttributesImplApi26Parcelizer(iOptInt4);
                        }
                    }
                    if (jSONObject.has(SPEED)) {
                        exoPlayerImplExternalSyntheticLambda6.MediaBrowserCompatCustomActionResultReceiver((float) jSONObject.optDouble(SPEED, 1.0d));
                    }
                    if (jSONObject.has(MIN_FRAME) && (iOptInt3 = jSONObject.optInt(MIN_FRAME, 0)) >= 0) {
                        exoPlayerImplExternalSyntheticLambda6.IconCompatParcelizer(iOptInt3);
                    }
                    if (jSONObject.has(MAX_FRAME) && (iOptInt2 = jSONObject.optInt(MAX_FRAME, 0)) >= 0) {
                        exoPlayerImplExternalSyntheticLambda6.RemoteActionCompatParcelizer(iOptInt2);
                    }
                    if (jSONObject.has(MIN_PROGRESS)) {
                        float fOptDouble = (float) jSONObject.optDouble(MIN_PROGRESS, 0.0d);
                        if (BitmapDescriptorFactory.HUE_RED <= fOptDouble && fOptDouble <= 1.0f) {
                            exoPlayerImplExternalSyntheticLambda6.RemoteActionCompatParcelizer(fOptDouble);
                        }
                    }
                    if (jSONObject.has(MAX_PROGRESS)) {
                        float fOptDouble2 = (float) jSONObject.optDouble(MAX_PROGRESS, 0.0d);
                        if (BitmapDescriptorFactory.HUE_RED <= fOptDouble2 && fOptDouble2 <= 1.0f) {
                            exoPlayerImplExternalSyntheticLambda6.read(fOptDouble2);
                        }
                    }
                    if (jSONObject.has(SAFE_MODE)) {
                        exoPlayerImplExternalSyntheticLambda6.AudioAttributesImplBaseParcelizer(jSONObject.optBoolean(SAFE_MODE, false));
                    }
                    String str4 = str;
                    if (jSONObject.has(str4) && (iOptInt = jSONObject.optInt(str4, 255)) >= 0 && iOptInt < 256) {
                        exoPlayerImplExternalSyntheticLambda6.setAlpha(iOptInt);
                    }
                    if (zOptBoolean) {
                        exoPlayerImplExternalSyntheticLambda6.start();
                    } else {
                        exoPlayerImplExternalSyntheticLambda6.stop();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyAnimation$lambda$0(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, Object obj, boolean z, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        toMagicModuleMetaRepoModel.write(exoPlayerImplExternalSyntheticLambda6, "");
        exoPlayerImplExternalSyntheticLambda6.write(exoPlayerImplExternalSyntheticLambda19);
        ((View) obj).setBackground(exoPlayerImplExternalSyntheticLambda6);
        if (z) {
            exoPlayerImplExternalSyntheticLambda6.start();
        } else {
            exoPlayerImplExternalSyntheticLambda6.stop();
        }
    }
}
