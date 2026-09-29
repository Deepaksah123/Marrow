package kotlin;

import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzgk implements getCreatedOnDateMs {
    public static int IconCompatParcelizer;
    public static int read;
    private /* synthetic */ Context AudioAttributesCompatParcelizer;
    private /* synthetic */ DataSourceBitmapLoaderExternalSyntheticLambda0 RemoteActionCompatParcelizer;

    public /* synthetic */ zzgk(Context context, DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0) {
        this.AudioAttributesCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = dataSourceBitmapLoaderExternalSyntheticLambda0;
    }

    public static int RemoteActionCompatParcelizer() {
        int i = read;
        int i2 = i % 6763303;
        read = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        IconCompatParcelizer = startElapsedRealtime;
        return startElapsedRealtime;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return zzH.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer);
    }
}
