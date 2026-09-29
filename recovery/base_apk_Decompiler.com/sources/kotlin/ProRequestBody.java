package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.EventLogger;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ProRequestBody extends EventLogger {
    private int IconCompatParcelizer;

    public abstract void RemoteActionCompatParcelizer(Map<String, String> map, PlaybackException playbackException);

    public abstract void RemoteActionCompatParcelizer$6204f77f(Enum r1);

    public abstract void write(int i, String str, PlaybackException playbackException);

    public abstract void write(PlaybackException playbackException);

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        toMagicModuleMetaRepoModel.write(eventTime, "");
        super.onIsPlayingChanged(eventTime, z);
        if (z) {
            this.IconCompatParcelizer = 0;
        }
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) throws Throwable {
        toMagicModuleMetaRepoModel.write(eventTime, "");
        toMagicModuleMetaRepoModel.write(playbackException, "");
        this.IconCompatParcelizer++;
        PlaybackException playbackException2 = playbackException;
        try {
            Object[] objArr = {playbackException2};
            Object objAudioAttributesCompatParcelizer = SyncParam.AudioAttributesCompatParcelizer(175142446);
            if (objAudioAttributesCompatParcelizer == null) {
                objAudioAttributesCompatParcelizer = SyncParam.read(18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 1, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), -814975621, false, "read", new Class[]{Exception.class});
            }
            if (((Boolean) ((Method) objAudioAttributesCompatParcelizer).invoke(null, objArr)).booleanValue()) {
                Object[] objArr2 = {playbackException2, Integer.valueOf(this.IconCompatParcelizer)};
                Object objAudioAttributesCompatParcelizer2 = SyncParam.AudioAttributesCompatParcelizer(231158435);
                if (objAudioAttributesCompatParcelizer2 == null) {
                    objAudioAttributesCompatParcelizer2 = SyncParam.read(Drawable.resolveOpacity(0, 0) + 18, Process.myPid() >> 22, (char) (MotionEvent.axisFromString("") + 1), -925158922, false, "IconCompatParcelizer", new Class[]{Exception.class, Integer.TYPE});
                }
                RemoteActionCompatParcelizer((Map) ((Method) objAudioAttributesCompatParcelizer2).invoke(null, objArr2), playbackException);
                int i = this.IconCompatParcelizer;
                if (i <= 2) {
                    AudioAttributesCompatParcelizer(i, "handleResolution(ResolutionAction.RESET_PLAYER)");
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(668301142);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), Color.green(0) + 24556, 24 - TextUtils.indexOf("", "", 0, 0), 1503441859, false, "write", null);
                    }
                    RemoteActionCompatParcelizer$6204f77f((Enum) ((Field) objRemoteActionCompatParcelizer).get(null));
                    return;
                }
                AudioAttributesCompatParcelizer(i, "throwError(ErrorAction.ASK_USER_TO_RESTART_DEVICE, \"4101\", error)");
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1924872705);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (64534 - (Process.myTid() >> 22)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24526, TextUtils.getCapsMode("", 0, 0) + 29, -217251478, false, "AudioAttributesCompatParcelizer", null);
                }
                ((Field) objRemoteActionCompatParcelizer2).get(null);
                write(4101, "Playback Issue", playbackException);
                return;
            }
            Object[] objArr3 = {playbackException2};
            Object objAudioAttributesCompatParcelizer3 = SyncParam.AudioAttributesCompatParcelizer(-2139330238);
            if (objAudioAttributesCompatParcelizer3 == null) {
                objAudioAttributesCompatParcelizer3 = SyncParam.read(((Process.getThreadPriority(0) + 20) >> 6) + 18, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1, (char) (KeyEvent.getMaxKeyCode() >> 16), 1163946519, false, "IconCompatParcelizer", new Class[]{Exception.class});
            }
            if (((Boolean) ((Method) objAudioAttributesCompatParcelizer3).invoke(null, objArr3)).booleanValue()) {
                Object[] objArr4 = {playbackException2, Integer.valueOf(this.IconCompatParcelizer)};
                Object objAudioAttributesCompatParcelizer4 = SyncParam.AudioAttributesCompatParcelizer(231158435);
                if (objAudioAttributesCompatParcelizer4 == null) {
                    objAudioAttributesCompatParcelizer4 = SyncParam.read((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 18, ViewConfiguration.getDoubleTapTimeout() >> 16, (char) View.MeasureSpec.getMode(0), -925158922, false, "IconCompatParcelizer", new Class[]{Exception.class, Integer.TYPE});
                }
                RemoteActionCompatParcelizer((Map) ((Method) objAudioAttributesCompatParcelizer4).invoke(null, objArr4), playbackException);
                int i2 = this.IconCompatParcelizer;
                if (i2 <= 1) {
                    AudioAttributesCompatParcelizer(i2, "handleResolution(ResolutionAction.RESET_PLAYER)");
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(668301142);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getTouchSlop() >> 8) + 24556, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, 1503441859, false, "write", null);
                    }
                    RemoteActionCompatParcelizer$6204f77f((Enum) ((Field) objRemoteActionCompatParcelizer3).get(null));
                    return;
                }
                AudioAttributesCompatParcelizer(i2, "throwError(ErrorAction.ASK_USER_TO_RESTART_DEVICE, \"4102\", error)");
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-686017142);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (((Process.getThreadPriority(0) + 20) >> 6) + 64534), KeyEvent.getDeadChar(0, 0) + 24527, TextUtils.lastIndexOf("", '0', 0, 0) + 30, -1453985505, false, "RemoteActionCompatParcelizer", null);
                }
                ((Field) objRemoteActionCompatParcelizer4).get(null);
                write(4102, "Playback Issue", playbackException);
                return;
            }
            Object[] objArr5 = {playbackException2};
            Object objAudioAttributesCompatParcelizer5 = SyncParam.AudioAttributesCompatParcelizer(1169774143);
            if (objAudioAttributesCompatParcelizer5 == null) {
                objAudioAttributesCompatParcelizer5 = SyncParam.read(19 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), -2136648342, false, "RemoteActionCompatParcelizer", new Class[]{Exception.class});
            }
            if (((Boolean) ((Method) objAudioAttributesCompatParcelizer5).invoke(null, objArr5)).booleanValue()) {
                Object[] objArr6 = {playbackException2, Integer.valueOf(this.IconCompatParcelizer)};
                Object objAudioAttributesCompatParcelizer6 = SyncParam.AudioAttributesCompatParcelizer(231158435);
                if (objAudioAttributesCompatParcelizer6 == null) {
                    objAudioAttributesCompatParcelizer6 = SyncParam.read((ViewConfiguration.getLongPressTimeout() >> 16) + 18, (-1) - TextUtils.lastIndexOf("", '0', 0, 0), (char) KeyEvent.keyCodeFromString(""), -925158922, false, "IconCompatParcelizer", new Class[]{Exception.class, Integer.TYPE});
                }
                RemoteActionCompatParcelizer((Map) ((Method) objAudioAttributesCompatParcelizer6).invoke(null, objArr6), playbackException);
                int i3 = this.IconCompatParcelizer;
                if (i3 <= 1) {
                    AudioAttributesCompatParcelizer(i3, "handleResolution(ResolutionAction.RESET_PLAYER)");
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(668301142);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 24556 - Gravity.getAbsoluteGravity(0, 0), TextUtils.getOffsetAfter("", 0) + 24, 1503441859, false, "write", null);
                    }
                    RemoteActionCompatParcelizer$6204f77f((Enum) ((Field) objRemoteActionCompatParcelizer5).get(null));
                    return;
                }
                AudioAttributesCompatParcelizer(i3, "throwError(ErrorAction.ASK_USER_TO_RESTART_DEVICE, \"4103\", error)");
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-686017142);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (64534 - ExpandableListView.getPackedPositionType(0L)), 24527 - (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.getSize(0) + 29, -1453985505, false, "RemoteActionCompatParcelizer", null);
                }
                ((Field) objRemoteActionCompatParcelizer6).get(null);
                write(4103, "Playback Issue", playbackException);
                return;
            }
            Object[] objArr7 = {playbackException2};
            Object objAudioAttributesCompatParcelizer7 = SyncParam.AudioAttributesCompatParcelizer(-1933014146);
            if (objAudioAttributesCompatParcelizer7 == null) {
                objAudioAttributesCompatParcelizer7 = SyncParam.read(18 - KeyEvent.keyCodeFromString(""), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1, (char) KeyEvent.keyCodeFromString(""), 1238665259, false, "AudioAttributesCompatParcelizer", new Class[]{Exception.class});
            }
            if (((Boolean) ((Method) objAudioAttributesCompatParcelizer7).invoke(null, objArr7)).booleanValue()) {
                Object[] objArr8 = {playbackException2, Integer.valueOf(this.IconCompatParcelizer)};
                Object objAudioAttributesCompatParcelizer8 = SyncParam.AudioAttributesCompatParcelizer(231158435);
                if (objAudioAttributesCompatParcelizer8 == null) {
                    objAudioAttributesCompatParcelizer8 = SyncParam.read(ExpandableListView.getPackedPositionChild(0L) + 19, View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), -925158922, false, "IconCompatParcelizer", new Class[]{Exception.class, Integer.TYPE});
                }
                RemoteActionCompatParcelizer((Map) ((Method) objAudioAttributesCompatParcelizer8).invoke(null, objArr8), playbackException);
                if (this.IconCompatParcelizer <= 1) {
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(668301142);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        objRemoteActionCompatParcelizer7 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 24556 - (ViewConfiguration.getPressedStateDuration() >> 16), 23 - ((byte) KeyEvent.getModifierMetaStateMask()), 1503441859, false, "write", null);
                    }
                    RemoteActionCompatParcelizer$6204f77f((Enum) ((Field) objRemoteActionCompatParcelizer7).get(null));
                    return;
                }
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1924872705);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 64533), TextUtils.getTrimmedLength("") + 24527, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, -217251478, false, "AudioAttributesCompatParcelizer", null);
                }
                ((Field) objRemoteActionCompatParcelizer8).get(null);
                write(4201, "Playback Issue", playbackException);
                return;
            }
            Object[] objArr9 = {playbackException2};
            Object objAudioAttributesCompatParcelizer9 = SyncParam.AudioAttributesCompatParcelizer(-306938475);
            if (objAudioAttributesCompatParcelizer9 == null) {
                objAudioAttributesCompatParcelizer9 = SyncParam.read(TextUtils.getTrimmedLength("") + 18, View.resolveSize(0, 0), (char) Color.blue(0), 682131136, false, "write", new Class[]{Exception.class});
            }
            if (((Boolean) ((Method) objAudioAttributesCompatParcelizer9).invoke(null, objArr9)).booleanValue()) {
                Object[] objArr10 = {playbackException2, Integer.valueOf(this.IconCompatParcelizer)};
                Object objAudioAttributesCompatParcelizer10 = SyncParam.AudioAttributesCompatParcelizer(231158435);
                if (objAudioAttributesCompatParcelizer10 == null) {
                    objAudioAttributesCompatParcelizer10 = SyncParam.read((ViewConfiguration.getFadingEdgeLength() >> 16) + 18, ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), -925158922, false, "IconCompatParcelizer", new Class[]{Exception.class, Integer.TYPE});
                }
                RemoteActionCompatParcelizer((Map) ((Method) objAudioAttributesCompatParcelizer10).invoke(null, objArr10), playbackException);
                int i4 = this.IconCompatParcelizer;
                if (i4 <= 1) {
                    AudioAttributesCompatParcelizer(i4, "handleResolution(ResolutionAction.RESET_PLAYER)");
                    Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(668301142);
                    if (objRemoteActionCompatParcelizer9 == null) {
                        objRemoteActionCompatParcelizer9 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), (Process.myTid() >> 22) + 24556, TextUtils.getOffsetBefore("", 0) + 24, 1503441859, false, "write", null);
                    }
                    RemoteActionCompatParcelizer$6204f77f((Enum) ((Field) objRemoteActionCompatParcelizer9).get(null));
                    return;
                }
                AudioAttributesCompatParcelizer(i4, "throwError(ErrorAction.SHOW_USER_TO_USE_THE_APP_LATER, \"4501\", error)");
                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-1924872705);
                if (objRemoteActionCompatParcelizer10 == null) {
                    objRemoteActionCompatParcelizer10 = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 64534), TextUtils.indexOf((CharSequence) "", '0', 0) + 24528, 28 - ImageFormat.getBitsPerPixel(0), -217251478, false, "AudioAttributesCompatParcelizer", null);
                }
                ((Field) objRemoteActionCompatParcelizer10).get(null);
                write(4501, "Playback Issue", playbackException);
                return;
            }
            write(playbackException);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void AudioAttributesCompatParcelizer(int i, String str) {
        StringBuilder sb = new StringBuilder("count:");
        sb.append(i);
        sb.append(", ");
        sb.append(str);
        buildResolutionString.IconCompatParcelizer("ErrorHandler", sb.toString());
    }
}
