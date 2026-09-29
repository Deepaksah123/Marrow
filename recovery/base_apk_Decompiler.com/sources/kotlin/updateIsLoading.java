package kotlin;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class updateIsLoading implements moveMediaSources {
    @Override // kotlin.moveMediaSources
    public final waitUninterruptibly RemoteActionCompatParcelizer(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) getAvcProfileAndLevel.read(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new updatePlaybackSpeedSettingsForNewPeriod(httpURLConnection);
    }
}
