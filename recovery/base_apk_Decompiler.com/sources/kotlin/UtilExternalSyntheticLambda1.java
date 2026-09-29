package kotlin;

import android.view.View;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class UtilExternalSyntheticLambda1 implements View.OnClickListener {
    public static int AudioAttributesCompatParcelizer;
    public static int IconCompatParcelizer;
    private /* synthetic */ transformFutureAsync RemoteActionCompatParcelizer;

    public /* synthetic */ UtilExternalSyntheticLambda1(transformFutureAsync transformfutureasync) {
        this.RemoteActionCompatParcelizer = transformfutureasync;
    }

    public static int AudioAttributesCompatParcelizer() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 7262331;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int iNextInt = new Random().nextInt();
        IconCompatParcelizer = iNextInt;
        return iNextInt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        transformFutureAsync.onFastForward(this.RemoteActionCompatParcelizer);
    }
}
