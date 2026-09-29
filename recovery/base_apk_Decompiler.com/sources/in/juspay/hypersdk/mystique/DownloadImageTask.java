package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import in.juspay.hypersdk.core.DuiCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
    private static int downloadCount;
    private final BaseAdapter adapter;
    private final BitmapCache bitmapCache;
    private final WeakReference<Context> contextWeakReference;
    private final DuiCallback duiCallback;
    private String imageUrl;
    boolean isTriggerNotify;
    private final Integer palceHolder;

    public DownloadImageTask(BaseAdapter baseAdapter, Integer num, Context context, BitmapCache bitmapCache, DuiCallback duiCallback, ImageView imageView) {
        this.adapter = baseAdapter;
        this.palceHolder = num;
        this.contextWeakReference = new WeakReference<>(context);
        this.bitmapCache = bitmapCache;
        this.duiCallback = duiCallback;
        int i = downloadCount;
        if (i == 0) {
            this.isTriggerNotify = true;
        } else {
            this.isTriggerNotify = false;
        }
        downloadCount = (i + 1) % 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Bitmap getImage(java.lang.String r4) throws java.lang.Throwable {
        /*
            r3 = this;
            in.juspay.hypersdk.mystique.BitmapCache r0 = r3.bitmapCache
            android.graphics.Bitmap r0 = r0.get(r4)
            r1 = 0
            if (r0 != 0) goto L6a
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.net.URLConnection r4 = r0.openConnection()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.Object r4 = kotlin.getAvcProfileAndLevel.read(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.net.URLConnection r4 = (java.net.URLConnection) r4     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r0 = 1
            r4.setDoInput(r0)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4e
            r4.connect()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4e
            java.io.InputStream r0 = r4.getInputStream()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4e
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4e
            r4.disconnect()
            return r3
        L2d:
            r3 = move-exception
            goto L64
        L2f:
            r4 = r1
        L30:
            java.lang.ref.WeakReference<android.content.Context> r0 = r3.contextWeakReference     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            if (r0 == 0) goto L5e
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.lang.Integer r2 = r3.palceHolder     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeResource(r0, r2)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            if (r4 == 0) goto L4d
            r4.disconnect()
        L4d:
            return r3
        L4e:
            r3 = move-exception
            r1 = r4
            goto L64
        L51:
            in.juspay.hypersdk.core.DuiCallback r3 = r3.duiCallback     // Catch: java.lang.Throwable -> L4e
            in.juspay.hypersdk.core.DuiLogger r3 = r3.getLogger()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = "IMG_ERR"
            java.lang.String r2 = "Not able to apply placeholder"
            r3.e(r0, r2)     // Catch: java.lang.Throwable -> L4e
        L5e:
            if (r4 == 0) goto L6a
            r4.disconnect()
            goto L6a
        L64:
            if (r1 == 0) goto L69
            r1.disconnect()
        L69:
            throw r3
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.mystique.DownloadImageTask.getImage(java.lang.String):android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Bitmap doInBackground(String... strArr) {
        String str = strArr[0];
        this.imageUrl = str;
        return getImage(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        if (bitmap != null) {
            this.bitmapCache.put(this.imageUrl, bitmap);
            BaseAdapter baseAdapter = this.adapter;
            if (baseAdapter == null) {
                this.duiCallback.getLogger().e("IMG_ERR", "Fetching image from url failed. Null adapter passed");
            } else if (this.isTriggerNotify) {
                baseAdapter.notifyDataSetChanged();
            }
        }
    }
}
