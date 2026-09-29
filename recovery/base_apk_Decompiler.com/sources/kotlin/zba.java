package kotlin;

import com.marrow2.ui.custom_module.done.CustomModuleScoreViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zba implements getAnswerMap {
    public static int AudioAttributesCompatParcelizer;
    public static int write;
    private /* synthetic */ String IconCompatParcelizer;
    private /* synthetic */ CustomModuleScoreViewModel read;

    public /* synthetic */ zba(CustomModuleScoreViewModel customModuleScoreViewModel, String str) {
        this.read = customModuleScoreViewModel;
        this.IconCompatParcelizer = str;
    }

    public static int RemoteActionCompatParcelizer() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 9841346;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        write = iMaxMemory;
        return iMaxMemory;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return CustomModuleScoreViewModel.read(this.read, this.IconCompatParcelizer, (String) obj);
    }
}
