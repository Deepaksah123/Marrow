package com.clevertap.android.sdk.pushnotification.fcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import com.google.firebase.messaging.RemoteMessage;
import java.util.concurrent.TimeUnit;
import kotlin.PlayerPlaybackSuppressionReason;
import kotlin.PlayerTimelineChangeReason;
import kotlin.RendererCapabilitiesListener;
import kotlin.RendererWakeupListener;
import kotlin.getAdState;
import kotlin.getNextAdIndexToPlay;
import kotlin.setContentPositionMs;

/* JADX INFO: loaded from: classes4.dex */
public class CTFirebaseMessagingReceiver extends BroadcastReceiver implements setContentPositionMs {
    private String AudioAttributesCompatParcelizer = "";
    private long IconCompatParcelizer;
    private CountDownTimer RemoteActionCompatParcelizer;
    private BroadcastReceiver.PendingResult read;
    private boolean write;

    @Override // kotlin.setContentPositionMs
    public final void AudioAttributesCompatParcelizer() {
        RendererWakeupListener.RatingCompat();
        read("push impression sent successfully by core");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(String str) {
        try {
            RendererWakeupListener.RatingCompat();
            if (!this.AudioAttributesCompatParcelizer.trim().isEmpty()) {
                PlayerTimelineChangeReason.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
            long jNanoTime = System.nanoTime();
            if (this.read != null && !this.write) {
                RendererWakeupListener.RatingCompat();
                this.read.finish();
                this.write = true;
                CountDownTimer countDownTimer = this.RemoteActionCompatParcelizer;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                RendererWakeupListener.RatingCompat();
                TimeUnit.NANOSECONDS.toSeconds(jNanoTime - this.IconCompatParcelizer);
                RendererWakeupListener.RatingCompat();
                return;
            }
            RendererWakeupListener.RatingCompat();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        this.IconCompatParcelizer = System.nanoTime();
        RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
        if (context == null || intent == null) {
            return;
        }
        RemoteMessage remoteMessage = new RemoteMessage(intent.getExtras());
        new getNextAdIndexToPlay();
        final Bundle bundleWrite = getNextAdIndexToPlay.write(remoteMessage);
        if (bundleWrite != null) {
            if (remoteMessage.write() != 2) {
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
                return;
            }
            long j = Long.parseLong(bundleWrite.getString("ctrmt", "4500"));
            this.read = goAsync();
            if (PlayerTimelineChangeReason.write(bundleWrite).IconCompatParcelizer) {
                if (RendererCapabilitiesListener.RemoteActionCompatParcelizer(remoteMessage)) {
                    String strRemoteActionCompatParcelizer = getAdState.RemoteActionCompatParcelizer(getAdState.RemoteActionCompatParcelizer(bundleWrite), getAdState.read(bundleWrite));
                    this.AudioAttributesCompatParcelizer = strRemoteActionCompatParcelizer;
                    PlayerTimelineChangeReason.IconCompatParcelizer(strRemoteActionCompatParcelizer, this);
                    CountDownTimer countDownTimer = new CountDownTimer(j) { // from class: com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver.1
                        @Override // android.os.CountDownTimer
                        public final void onTick(long j2) {
                        }

                        @Override // android.os.CountDownTimer
                        public final void onFinish() {
                            CTFirebaseMessagingReceiver.this.read("receiver life time is expired");
                        }
                    };
                    this.RemoteActionCompatParcelizer = countDownTimer;
                    countDownTimer.start();
                    new Thread(new Runnable() { // from class: o.getPositionInWindowMs
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.write.read(context, bundleWrite);
                        }
                    }).start();
                    return;
                }
                RendererWakeupListener.RatingCompat();
                read("isRenderFallback is false");
                return;
            }
            RendererWakeupListener.RatingCompat();
            read("push is not from CleverTap.");
        }
    }

    public final /* synthetic */ void read(Context context, Bundle bundle) {
        try {
            PlayerTimelineChangeReason playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.write(context, getAdState.RemoteActionCompatParcelizer(bundle));
            if (playerTimelineChangeReasonWrite != null) {
                PlayerPlaybackSuppressionReason.write(playerTimelineChangeReasonWrite, "CTRM#flushQueueSync", "PI_R", context);
            }
        } catch (Exception e) {
            e.printStackTrace();
            RendererWakeupListener.MediaBrowserCompatMediaItem();
        } finally {
            read("flush from receiver is done!");
        }
    }
}
