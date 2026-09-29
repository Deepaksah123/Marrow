package kotlin;

import android.content.Context;
import android.text.Html;
import android.widget.RemoteViews;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
public class MediaSourceListMediaSourceAndListener {
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda4 RemoteActionCompatParcelizer;
    private RemoteViews read;
    private Context write;

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[MediaSourceListForwardingEventListenerExternalSyntheticLambda1.values().length];
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda1.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda1.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public MediaSourceListMediaSourceAndListener(Context context, int i, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        this.write = context;
        this.RemoteActionCompatParcelizer = mediaSourceListForwardingEventListenerExternalSyntheticLambda4;
        this.read = new RemoteViews(this.write.getPackageName(), i);
    }

    public final Context RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final MediaSourceListForwardingEventListenerExternalSyntheticLambda4 write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final RemoteViews read() {
        return this.read;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer() {
        /*
            r5 = this;
            android.widget.RemoteViews r0 = r5.read
            int r1 = o.onUpstreamDiscarded.AudioAttributesCompatParcelizer.app_name
            android.content.Context r2 = r5.write
            java.lang.String r2 = kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda10.write(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setTextViewText(r1, r2)
            android.widget.RemoteViews r0 = r5.read
            int r1 = o.onUpstreamDiscarded.AudioAttributesCompatParcelizer.timestamp
            android.content.Context r2 = r5.write
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(r2, r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setTextViewText(r1, r2)
            o.MediaSourceListForwardingEventListenerExternalSyntheticLambda4 r0 = r5.RemoteActionCompatParcelizer
            java.lang.String r0 = r0.getPlaybackStateCompat()
            if (r0 == 0) goto L50
            o.MediaSourceListForwardingEventListenerExternalSyntheticLambda4 r0 = r5.RemoteActionCompatParcelizer
            java.lang.String r0 = r0.getPlaybackStateCompat()
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L50
            android.widget.RemoteViews r0 = r5.read
            int r1 = o.onUpstreamDiscarded.AudioAttributesCompatParcelizer.subtitle
            o.MediaSourceListForwardingEventListenerExternalSyntheticLambda4 r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r2 = r2.getPlaybackStateCompat()
            r3 = 0
            android.text.Spanned r2 = android.text.Html.fromHtml(r2, r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setTextViewText(r1, r2)
            goto L60
        L50:
            android.widget.RemoteViews r0 = r5.read
            int r1 = o.onUpstreamDiscarded.AudioAttributesCompatParcelizer.subtitle
            r2 = 8
            r0.setViewVisibility(r1, r2)
            android.widget.RemoteViews r0 = r5.read
            int r1 = o.onUpstreamDiscarded.AudioAttributesCompatParcelizer.sep_subtitle
            r0.setViewVisibility(r1, r2)
        L60:
            int r0 = o.onUpstreamDiscarded.AudioAttributesCompatParcelizer.app_name
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = o.onUpstreamDiscarded.AudioAttributesCompatParcelizer.timestamp
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = o.onUpstreamDiscarded.AudioAttributesCompatParcelizer.subtitle
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r1, r2}
            java.util.List r0 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L80:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            o.MediaSourceListForwardingEventListenerExternalSyntheticLambda4 r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r2 = r2.getOnSetRating()
            r5.RemoteActionCompatParcelizer(r2, r1)
            goto L80
        L9a:
            r5.AudioAttributesImplApi26Parcelizer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaSourceListMediaSourceAndListener.IconCompatParcelizer():void");
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        try {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onUpstreamDiscarded.read.pt_dot_sep);
            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.write(this.write, this.RemoteActionCompatParcelizer.getOnPlay(), this.RemoteActionCompatParcelizer.getOnSetRating(), "#A6A6A6");
        } catch (NullPointerException unused) {
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
        }
    }

    public final void write(String str) {
        if (onLoadStarted.read(str)) {
            this.read.setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.title, Html.fromHtml(str, 0));
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        if (onLoadStarted.read(str)) {
            this.read.setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg, Html.fromHtml(str, 0));
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer.getOnSetPlaybackSpeed() != null) {
            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(onUpstreamDiscarded.AudioAttributesCompatParcelizer.small_icon, this.RemoteActionCompatParcelizer.getOnSetPlaybackSpeed(), this.read);
        } else {
            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.read(onUpstreamDiscarded.AudioAttributesCompatParcelizer.small_icon, this.RemoteActionCompatParcelizer.getOnPause(), this.read);
        }
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        if (onLoadStarted.read(str)) {
            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.write(onUpstreamDiscarded.AudioAttributesCompatParcelizer.large_icon, str, this.read, this.write);
        } else {
            this.read.setViewVisibility(onUpstreamDiscarded.AudioAttributesCompatParcelizer.large_icon, 8);
        }
    }

    public final void read(String str, int i) {
        Integer num;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null || (num = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.read(str)) == null) {
                return;
            }
            this.read.setInt(i, "setBackgroundColor", num.intValue());
        }
    }

    public final void RemoteActionCompatParcelizer(String str, int i) {
        Integer num;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null || (num = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.read(str)) == null) {
                return;
            }
            this.read.setTextColor(i, num.intValue());
        }
    }

    public final void AudioAttributesCompatParcelizer(String str, MediaSourceListForwardingEventListenerExternalSyntheticLambda1 mediaSourceListForwardingEventListenerExternalSyntheticLambda1, String str2) {
        int i;
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda1, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        if (onLoadStarted.read(str)) {
            int i2 = read.IconCompatParcelizer[mediaSourceListForwardingEventListenerExternalSyntheticLambda1.ordinal()];
            if (i2 == 1) {
                i = onUpstreamDiscarded.AudioAttributesCompatParcelizer.big_image_fitCenter;
            } else {
                if (i2 != 2) {
                    throw new RenewEligibleCreator();
                }
                i = onUpstreamDiscarded.AudioAttributesCompatParcelizer.big_image;
            }
            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.IconCompatParcelizer(i, str, this.read, this.write, str2);
            if (MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer()) {
                return;
            }
            this.read.setViewVisibility(i, 0);
        }
    }
}
