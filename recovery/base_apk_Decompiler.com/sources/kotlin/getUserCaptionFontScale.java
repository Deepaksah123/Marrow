package kotlin;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class getUserCaptionFontScale implements SubtitleViewOutput {
    private final Application RemoteActionCompatParcelizer;

    @setSdkPayload
    public getUserCaptionFontScale(Application application) {
        toMagicModuleMetaRepoModel.write(application, "");
        this.RemoteActionCompatParcelizer = application;
    }

    @Override // kotlin.SubtitleViewOutput
    public final void RemoteActionCompatParcelizer(String str, String str2, getAnswerMap<? super String, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        dispatchTouchEvent.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, str, str2, null, new RemoteActionCompatParcelizer(getanswermap));
    }

    public static final class RemoteActionCompatParcelizer extends HlsPlaylist<String> {
        private /* synthetic */ getAnswerMap<String, getShowPopup> RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(getAnswerMap<? super String, getShowPopup> getanswermap) {
            this.RemoteActionCompatParcelizer = getanswermap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.HlsPlaylist
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public void IconCompatParcelizer(String str) {
            getAnswerMap<String, getShowPopup> getanswermap = this.RemoteActionCompatParcelizer;
            if (str == null) {
                str = "";
            }
            getanswermap.invoke(str);
        }
    }
}
