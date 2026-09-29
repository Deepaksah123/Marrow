###### Class com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver (com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver)
.class public Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"

# interfaces
.implements Lo/setContentPositionMs;


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private IconCompatParcelizer:J

.field private RemoteActionCompatParcelizer:Landroid/os/CountDownTimer;

.field private read:Landroid/content/BroadcastReceiver$PendingResult;

.field private write:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 29
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 33
    const-string v0, ""

    iput-object v0, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-void
.end method

.method private read(Ljava/lang/String;)V
    .registers 6

    .line 66
    :try_start_0
    invoke-static {}, Lo/RendererWakeupListener;->RatingCompat()V

    .line 68
    iget-object p1, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_14

    .line 70
    iget-object p1, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-static {p1}, Lo/PlayerTimelineChangeReason;->RemoteActionCompatParcelizer(Ljava/lang/String;)Lo/setContentPositionMs;

    .line 73
    :cond_14
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    .line 74
    iget-object p1, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->read:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz p1, :cond_41

    iget-boolean p1, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->write:Z

    if-nez p1, :cond_41

    .line 76
    invoke-static {}, Lo/RendererWakeupListener;->RatingCompat()V

    .line 78
    iget-object p1, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->read:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 p1, 0x1

    .line 79
    iput-boolean p1, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->write:Z

    .line 82
    iget-object p1, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->RemoteActionCompatParcelizer:Landroid/os/CountDownTimer;

    if-eqz p1, :cond_32

    .line 83
    invoke-virtual {p1}, Landroid/os/CountDownTimer;->cancel()V

    .line 86
    :cond_32
    invoke-static {}, Lo/RendererWakeupListener;->RatingCompat()V

    .line 87
    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v2, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->IconCompatParcelizer:J

    sub-long/2addr v0, v2

    .line 88
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 87
    invoke-static {}, Lo/RendererWakeupListener;->RatingCompat()V

    return-void

    .line 91
    :cond_41
    invoke-static {}, Lo/RendererWakeupListener;->RatingCompat()V
    :try_end_44
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_44} :catch_45

    return-void

    :catch_45
    move-exception p0

    .line 95
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method static synthetic write(Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;Ljava/lang/String;)V
    .registers 2

    .line 29
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->read(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 2

    .line 52
    invoke-static {}, Lo/RendererWakeupListener;->RatingCompat()V

    .line 55
    const-string v0, "push impression sent successfully by core"

    invoke-direct {p0, v0}, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->read(Ljava/lang/String;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 7

    .line 103
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->IconCompatParcelizer:J

    .line 105
    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    if-eqz p1, :cond_86

    if-eqz p2, :cond_86

    .line 110
    new-instance v0, Lcom/google/firebase/messaging/RemoteMessage;

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/google/firebase/messaging/RemoteMessage;-><init>(Landroid/os/Bundle;)V

    .line 111
    new-instance p2, Lo/getNextAdIndexToPlay;

    invoke-direct {p2}, Lo/getNextAdIndexToPlay;-><init>()V

    invoke-static {v0}, Lo/getNextAdIndexToPlay;->write(Lcom/google/firebase/messaging/RemoteMessage;)Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_86

    .line 117
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->write()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2c

    .line 118
    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    return-void

    .line 125
    :cond_2c
    const-string v1, "ctrmt"

    const-string v2, "4500"

    invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    .line 128
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v3

    iput-object v3, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->read:Landroid/content/BroadcastReceiver$PendingResult;

    .line 130
    invoke-static {p2}, Lo/PlayerTimelineChangeReason;->write(Landroid/os/Bundle;)Lo/getAdDurationUs;

    move-result-object v3

    .line 132
    iget-boolean v3, v3, Lo/getAdDurationUs;->IconCompatParcelizer:Z

    if-eqz v3, :cond_7e

    .line 134
    invoke-static {v0}, Lo/RendererCapabilitiesListener;->RemoteActionCompatParcelizer(Lcom/google/firebase/messaging/RemoteMessage;)Z

    move-result v0

    if-eqz v0, :cond_75

    .line 137
    invoke-static {p2}, Lo/getAdState;->RemoteActionCompatParcelizer(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    .line 138
    invoke-static {p2}, Lo/getAdState;->read(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v3

    .line 136
    invoke-static {v0, v3}, Lo/getAdState;->RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 140
    invoke-static {v0, p0}, Lo/PlayerTimelineChangeReason;->IconCompatParcelizer(Ljava/lang/String;Lo/setContentPositionMs;)V

    .line 142
    new-instance v0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver$1;

    invoke-direct {v0, p0, v1, v2}, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver$1;-><init>(Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;J)V

    iput-object v0, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->RemoteActionCompatParcelizer:Landroid/os/CountDownTimer;

    .line 154
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 156
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/getPositionInWindowMs;

    invoke-direct {v1, p0, p1, p2}, Lo/getPositionInWindowMs;-><init>(Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 173
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    .line 176
    :cond_75
    invoke-static {}, Lo/RendererWakeupListener;->RatingCompat()V

    .line 177
    const-string p1, "isRenderFallback is false"

    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->read(Ljava/lang/String;)V

    return-void

    .line 180
    :cond_7e
    invoke-static {}, Lo/RendererWakeupListener;->RatingCompat()V

    .line 181
    const-string p1, "push is not from CleverTap."

    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->read(Ljava/lang/String;)V

    :cond_86
    return-void
.end method

.method public final synthetic read(Landroid/content/Context;Landroid/os/Bundle;)V
    .registers 6

    .line 159
    const-string v0, "flush from receiver is done!"

    :try_start_2
    invoke-static {p2}, Lo/getAdState;->RemoteActionCompatParcelizer(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p2

    .line 158
    invoke-static {p1, p2}, Lo/PlayerTimelineChangeReason;->write(Landroid/content/Context;Ljava/lang/String;)Lo/PlayerTimelineChangeReason;

    move-result-object p2

    if-eqz p2, :cond_13

    .line 163
    const-string v1, "CTRM#flushQueueSync"

    const-string v2, "PI_R"

    invoke-static {p2, v1, v2, p1}, Lo/PlayerPlaybackSuppressionReason;->write(Lo/PlayerTimelineChangeReason;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_13} :catch_19
    .catchall {:try_start_2 .. :try_end_13} :catchall_17

    .line 170
    :cond_13
    invoke-direct {p0, v0}, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->read(Ljava/lang/String;)V

    return-void

    :catchall_17
    move-exception p1

    goto :goto_24

    :catch_19
    move-exception p1

    .line 167
    :try_start_1a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 168
    invoke-static {}, Lo/RendererWakeupListener;->MediaBrowserCompatMediaItem()V
    :try_end_20
    .catchall {:try_start_1a .. :try_end_20} :catchall_17

    .line 170
    invoke-direct {p0, v0}, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->read(Ljava/lang/String;)V

    return-void

    :goto_24
    invoke-direct {p0, v0}, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->read(Ljava/lang/String;)V

    .line 171
    throw p1
.end method

###### Class com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver.AnonymousClass1 (com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver$1)
.class final Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver$1;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic write:Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;


# direct methods
.method constructor <init>(Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;J)V
    .registers 6

    .line 142
    iput-object p1, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver$1;->write:Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;

    const-wide/16 v0, 0x3e8

    invoke-direct {p0, p2, p3, v0, v1}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public final onFinish()V
    .registers 2

    .line 145
    iget-object p0, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver$1;->write:Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;

    const-string v0, "receiver life time is expired"

    invoke-static {p0, v0}, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->write(Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;Ljava/lang/String;)V

    return-void
.end method

.method public final onTick(J)V
    .registers 3

    return-void
.end method

###### Class kotlin.getPositionInWindowMs (o.getPositionInWindowMs)
.class public final synthetic Lo/getPositionInWindowMs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic AudioAttributesCompatParcelizer:Landroid/content/Context;

.field private synthetic IconCompatParcelizer:Landroid/os/Bundle;

.field private synthetic write:Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;


# direct methods
.method public synthetic constructor <init>(Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;Landroid/content/Context;Landroid/os/Bundle;)V
    .registers 4

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getPositionInWindowMs;->write:Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;

    iput-object p2, p0, Lo/getPositionInWindowMs;->AudioAttributesCompatParcelizer:Landroid/content/Context;

    iput-object p3, p0, Lo/getPositionInWindowMs;->IconCompatParcelizer:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 0
    iget-object v0, p0, Lo/getPositionInWindowMs;->write:Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;

    iget-object v1, p0, Lo/getPositionInWindowMs;->AudioAttributesCompatParcelizer:Landroid/content/Context;

    iget-object p0, p0, Lo/getPositionInWindowMs;->IconCompatParcelizer:Landroid/os/Bundle;

    invoke-virtual {v0, v1, p0}, Lcom/clevertap/android/sdk/pushnotification/fcm/CTFirebaseMessagingReceiver;->read(Landroid/content/Context;Landroid/os/Bundle;)V

    return-void
.end method
