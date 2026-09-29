package kotlin;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.requestPlayPauseAccessibilityFocus;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\rJ/\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00060\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ3\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00060\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0016J-\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00060\u000e2\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12;", "", "<init>", "()V", "", "p0", "", "read", "(Ljava/lang/String;)Ljava/util/Map;", "", "p1", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/util/Map;", "()Ljava/util/Map;", "Lo/getSubscriptionExpiresOn;", "write", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "Lo/requestPlayPauseAccessibilityFocus$RemoteActionCompatParcelizer;", "", "p2", "IconCompatParcelizer", "(Lo/requestPlayPauseAccessibilityFocus$RemoteActionCompatParcelizer;Ljava/lang/String;)Ljava/util/Map;", "(Ljava/lang/String;ILjava/lang/String;)Lo/getSubscriptionExpiresOn;", "write$4bcdf592", "(Ljava/lang/Object;)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12 {
    public static final StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12 INSTANCE = new StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12();

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-405204607);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 17730 - Color.alpha(0), 13 - TextUtils.getOffsetAfter("", 0), -1718561516, false, "values", new Class[0]);
                }
                int[] iArr = new int[((Object[]) ((Method) objRemoteActionCompatParcelizer).invoke(null, null)).length];
                try {
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-734896599);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 17730 - (ViewConfiguration.getFadingEdgeLength() >> 16), 13 - (KeyEvent.getMaxKeyCode() >> 16), -1434740036, false, "RemoteActionCompatParcelizer", null);
                    }
                    iArr[((Enum) ((Field) objRemoteActionCompatParcelizer2).get(null)).ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-317187063);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getTrimmedLength(""), (-16759486) - Color.rgb(0, 0, 0), 13 - (ViewConfiguration.getTapTimeout() >> 16), -1823352676, false, "write", null);
                    }
                    iArr[((Enum) ((Field) objRemoteActionCompatParcelizer3).get(null)).ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-212393722);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getTouchSlop() >> 8) + 17730, View.combineMeasuredStates(0, 0) + 13, -1927354989, false, "IconCompatParcelizer", null);
                    }
                    iArr[((Enum) ((Field) objRemoteActionCompatParcelizer4).get(null)).ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                IconCompatParcelizer = iArr;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12() {
    }

    @getMagicModuleMeta
    public static final Map<String, Object> read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("category", p0);
        return map;
    }

    @getMagicModuleMeta
    public static final Map<String, Object> RemoteActionCompatParcelizer(String p0, Integer p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("category", p0);
        map.put("reason", Integer.valueOf(p1 != null ? p1.intValue() : -1));
        return map;
    }

    @getMagicModuleMeta
    public static final Map<String, Object> RemoteActionCompatParcelizer() {
        return new HashMap();
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return setAction.write("security_suspicious_activity", VideoTimelineResponseBody.read(setAction.write("category", p0)));
    }

    @getMagicModuleMeta
    public static final Map<String, Object> RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("category", "casting");
        map.put("when", p0);
        return map;
    }

    @getMagicModuleMeta
    public static final Map<String, Object> IconCompatParcelizer(requestPlayPauseAccessibilityFocus.RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("player_type", Boolean.TRUE), setAction.write("player_type_new1", Boolean.valueOf(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer())), setAction.write("player_type_wl", Boolean.valueOf(remoteActionCompatParcelizer.RemoteActionCompatParcelizer())), setAction.write("player_type_new2", Boolean.valueOf(remoteActionCompatParcelizer.IconCompatParcelizer())), setAction.write("player_type_old", Boolean.valueOf(remoteActionCompatParcelizer.read())), setAction.write("lesson_id", str));
    }

    public static Pair<String, Map<String, Object>> write(String p0, int p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new Pair<>("image_download_failed", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("image_url", p0), setAction.write("error_code", Integer.valueOf(p1)), setAction.write(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, p2)));
    }

    public static Pair<String, Map<String, Object>> write$4bcdf592(Object p0) throws Throwable {
        String str;
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1209084401);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), 24221 - Color.red(0), 24 - (ViewConfiguration.getTouchSlop() >> 8), -911797606, false, "RemoteActionCompatParcelizer", new Class[0]);
            }
            int i = read.IconCompatParcelizer[((Enum) ((Method) objRemoteActionCompatParcelizer).invoke(p0, null)).ordinal()];
            if (i == 1) {
                str = "N";
            } else if (i == 2) {
                str = "SB";
            } else {
                if (i != 3) {
                    throw new RenewEligibleCreator();
                }
                str = "DE";
            }
            Pair[] pairArr = new Pair[3];
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(234643136);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 24222 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 24, 1941281365, false, "read", new Class[0]);
            }
            pairArr[0] = setAction.write("dl", IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) ((Method) objRemoteActionCompatParcelizer2).invoke(p0, null), ",", null, null, 0, null, new getAnswerMap() { // from class: o.StyledPlayerControlViewLayoutManagerExternalSyntheticLambda2
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12.write$4b0273aa((Enum) obj);
                }
            }, 30));
            pairArr[1] = setAction.write("et", str);
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-753609808);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.green(0) + 24221, 24 - (ViewConfiguration.getScrollBarSize() >> 8), -1386408155, false, "AudioAttributesCompatParcelizer", new Class[0]);
            }
            pairArr[2] = setAction.write("se", Integer.valueOf(((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(p0, null)).intValue()));
            return new Pair<>("rpd", VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairArr));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence write$4b0273aa(Enum r9) throws Throwable {
        toMagicModuleMetaRepoModel.write(r9, "");
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(157908140);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (14694 - TextUtils.indexOf("", "", 0)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 17743, 6 - View.MeasureSpec.getSize(0), 1998633017, false, "write", new Class[0]);
            }
            return (CharSequence) ((Method) objRemoteActionCompatParcelizer).invoke(r9, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
