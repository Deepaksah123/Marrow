package kotlin;

import android.content.SharedPreferences;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015"}, d2 = {"Lo/lambdaupdateStateAndInformListeners58;", "T", "", "Landroid/content/SharedPreferences;", "p0", "p1", "Ljava/lang/Class;", "p2", "Lkotlin/Function1;", "", "p3", "<init>", "(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;Ljava/lang/Class;Lo/getAnswerMap;)V", "", "RemoteActionCompatParcelizer", "()V", "Landroid/content/SharedPreferences;", "AudioAttributesCompatParcelizer", "read", "IconCompatParcelizer", "Ljava/lang/Class;", "Lo/getAnswerMap;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaupdateStateAndInformListeners58<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final SharedPreferences read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Class<T> AudioAttributesCompatParcelizer;
    private final SharedPreferences RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<T, Boolean> write;

    /* JADX WARN: Multi-variable type inference failed */
    public lambdaupdateStateAndInformListeners58(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, Class<T> cls, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(sharedPreferences, "");
        toMagicModuleMetaRepoModel.write(sharedPreferences2, "");
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.RemoteActionCompatParcelizer = sharedPreferences;
        this.read = sharedPreferences2;
        this.AudioAttributesCompatParcelizer = cls;
        this.write = getanswermap;
    }

    public final void RemoteActionCompatParcelizer() {
        Map<String, ?> all = this.RemoteActionCompatParcelizer.getAll();
        SharedPreferences.Editor editorEdit = this.read.edit();
        toMagicModuleMetaRepoModel.write(all);
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (this.AudioAttributesCompatParcelizer.isInstance(value) && this.write.invoke((T) value).booleanValue()) {
                Class<T> cls = this.AudioAttributesCompatParcelizer;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls, Boolean.class)) {
                    toMagicModuleMetaRepoModel.read(value, "");
                    editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls, Integer.class)) {
                    toMagicModuleMetaRepoModel.read(value, "");
                    editorEdit.putInt(key, ((Integer) value).intValue());
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls, Long.class)) {
                    toMagicModuleMetaRepoModel.read(value, "");
                    editorEdit.putLong(key, ((Long) value).longValue());
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls, Float.class)) {
                    toMagicModuleMetaRepoModel.read(value, "");
                    editorEdit.putFloat(key, ((Float) value).floatValue());
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls, String.class)) {
                    toMagicModuleMetaRepoModel.read(value, "");
                    editorEdit.putString(key, (String) value);
                } else {
                    if (value instanceof Boolean) {
                        editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        editorEdit.putInt(key, ((Number) value).intValue());
                    } else if (value instanceof Long) {
                        editorEdit.putLong(key, ((Number) value).longValue());
                    } else if (value instanceof Float) {
                        editorEdit.putFloat(key, ((Number) value).floatValue());
                    } else if (value instanceof String) {
                        editorEdit.putString(key, (String) value);
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            }
        }
        RendererCapabilitiesFormatSupport.write(editorEdit);
        this.RemoteActionCompatParcelizer.edit().clear().apply();
    }
}
