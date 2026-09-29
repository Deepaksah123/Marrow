package kotlin;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes4.dex */
public class expectBooleanFormat {

    public static class read extends _coercedTypeDesc.RatingCompat {
        PendingIntent AudioAttributesImplApi26Parcelizer;
        PendingIntent AudioAttributesImplBaseParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        CharSequence MediaBrowserCompatItemReceiver;
        MediaSessionCompat.Token MediaDescriptionCompat;
        int[] IconCompatParcelizer = null;
        boolean AudioAttributesImplApi21Parcelizer = false;

        @Override // o._coercedTypeDesc.RatingCompat
        public RemoteViews AudioAttributesCompatParcelizer(_coerceTextualNull _coercetextualnull) {
            return null;
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public RemoteViews IconCompatParcelizer(_coerceTextualNull _coercetextualnull) {
            return null;
        }

        public read RemoteActionCompatParcelizer(boolean z) {
            return this;
        }

        public read RemoteActionCompatParcelizer(int... iArr) {
            this.IconCompatParcelizer = iArr;
            return this;
        }

        public read read(MediaSessionCompat.Token token) {
            this.MediaDescriptionCompat = token;
            return this;
        }

        public read RemoteActionCompatParcelizer(PendingIntent pendingIntent) {
            this.AudioAttributesImplBaseParcelizer = pendingIntent;
            return this;
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public void read(_coerceTextualNull _coercetextualnull) {
            if (Build.VERSION.SDK_INT >= 34) {
                AudioAttributesCompatParcelizer.write(_coercetextualnull.AudioAttributesCompatParcelizer(), AudioAttributesCompatParcelizer.read(RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer.read(), this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, Boolean.valueOf(this.AudioAttributesImplApi21Parcelizer)), this.IconCompatParcelizer, this.MediaDescriptionCompat));
            } else {
                AudioAttributesCompatParcelizer.write(_coercetextualnull.AudioAttributesCompatParcelizer(), AudioAttributesCompatParcelizer.read(AudioAttributesCompatParcelizer.read(), this.IconCompatParcelizer, this.MediaDescriptionCompat));
            }
        }
    }

    static class AudioAttributesCompatParcelizer {
        static void write(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        static Notification.MediaStyle read() {
            return new Notification.MediaStyle();
        }

        static Notification.MediaStyle read(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
            if (iArr != null) {
                RemoteActionCompatParcelizer(mediaStyle, iArr);
            }
            if (token != null) {
                IconCompatParcelizer(mediaStyle, (MediaSession.Token) token.write());
            }
            return mediaStyle;
        }

        static void RemoteActionCompatParcelizer(Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }

        static void IconCompatParcelizer(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
            mediaStyle.setMediaSession(token);
        }
    }

    static class RemoteActionCompatParcelizer {
        static Notification.MediaStyle AudioAttributesCompatParcelizer(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i, PendingIntent pendingIntent, Boolean bool) {
            if (bool.booleanValue()) {
                mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
            }
            return mediaStyle;
        }
    }
}
