package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class isBypassPossible {
    private static isBypassPossible RemoteActionCompatParcelizer;
    private volatile SharedPreferences IconCompatParcelizer;
    private final ExecutorService read;

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    private isBypassPossible(ExecutorService executorService) {
        this.read = executorService;
    }

    public static isBypassPossible AudioAttributesCompatParcelizer() {
        isBypassPossible isbypasspossible;
        synchronized (isBypassPossible.class) {
            if (RemoteActionCompatParcelizer == null) {
                RemoteActionCompatParcelizer = new isBypassPossible(Executors.newSingleThreadExecutor());
            }
            isbypasspossible = RemoteActionCompatParcelizer;
        }
        return isbypasspossible;
    }

    public final void IconCompatParcelizer(final Context context) {
        synchronized (this) {
            if (this.IconCompatParcelizer == null && context != null) {
                this.read.execute(new Runnable() { // from class: o.getPlaybackSpeed
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.read(context);
                    }
                });
            }
        }
    }

    final /* synthetic */ void read(Context context) {
        if (this.IconCompatParcelizer != null || context == null) {
            return;
        }
        this.IconCompatParcelizer = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    public final MediaCodecUtilDecoderQueryException<Boolean> IconCompatParcelizer(String str) {
        if (str == null) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        if (this.IconCompatParcelizer == null) {
            IconCompatParcelizer(IconCompatParcelizer());
            if (this.IconCompatParcelizer == null) {
                return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
            }
        }
        if (!this.IconCompatParcelizer.contains(str)) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        try {
            return MediaCodecUtilDecoderQueryException.write(Boolean.valueOf(this.IconCompatParcelizer.getBoolean(str, false)));
        } catch (ClassCastException e) {
            new Object[]{str, e.getMessage()};
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
    }

    public final boolean IconCompatParcelizer(String str, boolean z) {
        if (str == null) {
            return false;
        }
        if (this.IconCompatParcelizer == null) {
            IconCompatParcelizer(IconCompatParcelizer());
            if (this.IconCompatParcelizer == null) {
                return false;
            }
        }
        this.IconCompatParcelizer.edit().putBoolean(str, z).apply();
        return true;
    }

    public final MediaCodecUtilDecoderQueryException<String> read(String str) {
        if (str == null) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        if (this.IconCompatParcelizer == null) {
            IconCompatParcelizer(IconCompatParcelizer());
            if (this.IconCompatParcelizer == null) {
                return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
            }
        }
        if (!this.IconCompatParcelizer.contains(str)) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        try {
            return MediaCodecUtilDecoderQueryException.write(this.IconCompatParcelizer.getString(str, ""));
        } catch (ClassCastException e) {
            new Object[]{str, e.getMessage()};
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
    }

    public final boolean IconCompatParcelizer(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (this.IconCompatParcelizer == null) {
            IconCompatParcelizer(IconCompatParcelizer());
            if (this.IconCompatParcelizer == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.IconCompatParcelizer.edit().remove(str).apply();
            return true;
        }
        this.IconCompatParcelizer.edit().putString(str, str2).apply();
        return true;
    }

    public final MediaCodecUtilDecoderQueryException<Double> write(String str) {
        if (str == null) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        if (this.IconCompatParcelizer == null) {
            IconCompatParcelizer(IconCompatParcelizer());
            if (this.IconCompatParcelizer == null) {
                return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
            }
        }
        if (!this.IconCompatParcelizer.contains(str)) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        try {
            try {
                return MediaCodecUtilDecoderQueryException.write(Double.valueOf(Double.longBitsToDouble(this.IconCompatParcelizer.getLong(str, 0L))));
            } catch (ClassCastException e) {
                new Object[]{str, e.getMessage()};
                return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
            }
        } catch (ClassCastException unused) {
            return MediaCodecUtilDecoderQueryException.write(Double.valueOf(Float.valueOf(this.IconCompatParcelizer.getFloat(str, BitmapDescriptorFactory.HUE_RED)).doubleValue()));
        }
    }

    public final boolean IconCompatParcelizer(String str, double d) {
        if (str == null) {
            return false;
        }
        if (this.IconCompatParcelizer == null) {
            IconCompatParcelizer(IconCompatParcelizer());
            if (this.IconCompatParcelizer == null) {
                return false;
            }
        }
        this.IconCompatParcelizer.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
        return true;
    }

    public final MediaCodecUtilDecoderQueryException<Long> RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        if (this.IconCompatParcelizer == null) {
            IconCompatParcelizer(IconCompatParcelizer());
            if (this.IconCompatParcelizer == null) {
                return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
            }
        }
        if (!this.IconCompatParcelizer.contains(str)) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        try {
            return MediaCodecUtilDecoderQueryException.write(Long.valueOf(this.IconCompatParcelizer.getLong(str, 0L)));
        } catch (ClassCastException e) {
            new Object[]{str, e.getMessage()};
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
    }

    public final boolean IconCompatParcelizer(String str, long j) {
        if (str == null) {
            return false;
        }
        if (this.IconCompatParcelizer == null) {
            IconCompatParcelizer(IconCompatParcelizer());
            if (this.IconCompatParcelizer == null) {
                return false;
            }
        }
        this.IconCompatParcelizer.edit().putLong(str, j).apply();
        return true;
    }

    private static Context IconCompatParcelizer() {
        try {
            FirebaseApp.write();
            return FirebaseApp.write().AudioAttributesCompatParcelizer();
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
