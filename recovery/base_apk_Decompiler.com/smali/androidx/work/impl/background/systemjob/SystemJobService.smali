###### Class androidx.work.impl.background.systemjob.SystemJobService (androidx.work.impl.background.systemjob.SystemJobService)
.class public Landroidx/work/impl/background/systemjob/SystemJobService;
.super Landroid/app/job/JobService;
.source "SourceFile"

# interfaces
.implements Lo/AudioBecomingNoisyManagerAudioBecomingNoisyReceiver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/impl/background/systemjob/SystemJobService$RemoteActionCompatParcelizer;,
        Landroidx/work/impl/background/systemjob/SystemJobService$write;,
        Landroidx/work/impl/background/systemjob/SystemJobService$read;
    }
.end annotation


# instance fields
.field private IconCompatParcelizer:Lo/getCurrentWindowIndex;

.field private final RemoteActionCompatParcelizer:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lo/CProjection;",
            "Landroid/app/job/JobParameters;",
            ">;"
        }
    .end annotation
.end field

.field private final read:Lo/setAudioAttributes;

.field private write:Lo/hasPrevious;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 76
    const-string v0, "SystemJobService"

    invoke-static {v0}, Lo/n;->write(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 75
    invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V

    .line 78
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->RemoteActionCompatParcelizer:Ljava/util/Map;

    .line 79
    invoke-static {}, Lo/setAudioAttributes;->IconCompatParcelizer()Lo/setAudioAttributes;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->read:Lo/setAudioAttributes;

    return-void
.end method

.method private static IconCompatParcelizer(Ljava/lang/String;)V
    .registers 4

    .line 305
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_f

    return-void

    .line 306
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot invoke "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " on a background thread"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/app/job/JobParameters;)Lo/CProjection;
    .registers 4

    .line 228
    const-string v0, "EXTRA_WORK_SPEC_ID"

    :try_start_2
    invoke-virtual {p0}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p0

    if-eqz p0, :cond_1e

    .line 229
    invoke-virtual {p0, v0}, Landroid/os/PersistableBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1e

    .line 230
    invoke-virtual {p0, v0}, Landroid/os/PersistableBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 231
    new-instance v1, Lo/CProjection;

    const-string v2, "EXTRA_WORK_SPEC_GENERATION"

    invoke-virtual {p0, v2}, Landroid/os/PersistableBundle;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-direct {v1, v0, p0}, Lo/CProjection;-><init>(Ljava/lang/String;I)V
    :try_end_1d
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_1d} :catch_1e

    return-object v1

    :catch_1e
    :cond_1e
    const/4 p0, 0x0

    return-object p0
.end method

.method static read(I)I
    .registers 1

    packed-switch p0, :pswitch_data_6

    const/16 p0, -0x200

    :pswitch_5
    return p0

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/CProjection;Z)V
    .registers 5

    .line 214
    const-string v0, "onExecuted"

    invoke-static {v0}, Landroidx/work/impl/background/systemjob/SystemJobService;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 215
    invoke-static {}, Lo/n;->write()Lo/n;

    invoke-virtual {p1}, Lo/CProjection;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    .line 216
    iget-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->RemoteActionCompatParcelizer:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobParameters;

    .line 217
    iget-object v1, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->read:Lo/setAudioAttributes;

    invoke-interface {v1, p1}, Lo/setAudioAttributes;->RemoteActionCompatParcelizer(Lo/CProjection;)Lo/lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener;

    if-eqz v0, :cond_1d

    .line 219
    invoke-virtual {p0, v0, p2}, Landroidx/work/impl/background/systemjob/SystemJobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    :cond_1d
    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .registers 2

    .line 308
    invoke-super {p0, p1}, Landroid/app/job/JobService;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public onCreate()V
    .registers 4

    .line 84
    invoke-super {p0}, Landroid/app/job/JobService;->onCreate()V

    .line 86
    :try_start_3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/hasPrevious;->read(Landroid/content/Context;)Lo/hasPrevious;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->write:Lo/hasPrevious;

    .line 87
    invoke-virtual {v0}, Lo/hasPrevious;->IconCompatParcelizer()Lo/handlePlatformAudioFocusChange;

    move-result-object v0

    .line 88
    new-instance v1, Lo/hasPreviousMediaItem;

    iget-object v2, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->write:Lo/hasPrevious;

    .line 89
    invoke-virtual {v2}, Lo/hasPrevious;->MediaBrowserCompatCustomActionResultReceiver()Lo/setEnableDecoderFallback;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lo/hasPreviousMediaItem;-><init>(Lo/handlePlatformAudioFocusChange;Lo/setEnableDecoderFallback;)V

    iput-object v1, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->IconCompatParcelizer:Lo/getCurrentWindowIndex;

    .line 90
    invoke-virtual {v0, p0}, Lo/handlePlatformAudioFocusChange;->IconCompatParcelizer(Lo/AudioBecomingNoisyManagerAudioBecomingNoisyReceiver;)V
    :try_end_21
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_21} :catch_22

    return-void

    :catch_22
    move-exception v0

    .line 101
    const-class v1, Landroid/app/Application;

    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_37

    .line 108
    invoke-static {}, Lo/n;->write()Lo/n;

    return-void

    .line 105
    :cond_37
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate()."

    invoke-direct {p0, v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method public onDestroy()V
    .registers 2

    .line 117
    invoke-super {p0}, Landroid/app/job/JobService;->onDestroy()V

    .line 118
    iget-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->write:Lo/hasPrevious;

    if-eqz v0, :cond_e

    .line 119
    invoke-virtual {v0}, Lo/hasPrevious;->IconCompatParcelizer()Lo/handlePlatformAudioFocusChange;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/handlePlatformAudioFocusChange;->read(Lo/AudioBecomingNoisyManagerAudioBecomingNoisyReceiver;)V

    :cond_e
    return-void
.end method

.method public onStartJob(Landroid/app/job/JobParameters;)Z
    .registers 6

    .line 125
    const-string v0, "onStartJob"

    invoke-static {v0}, Landroidx/work/impl/background/systemjob/SystemJobService;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->write:Lo/hasPrevious;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_12

    .line 127
    invoke-static {}, Lo/n;->write()Lo/n;

    .line 128
    invoke-virtual {p0, p1, v1}, Landroidx/work/impl/background/systemjob/SystemJobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    return v2

    .line 132
    :cond_12
    invoke-static {p1}, Landroidx/work/impl/background/systemjob/SystemJobService;->RemoteActionCompatParcelizer(Landroid/app/job/JobParameters;)Lo/CProjection;

    move-result-object v0

    if-nez v0, :cond_1c

    .line 134
    invoke-static {}, Lo/n;->write()Lo/n;

    return v2

    .line 138
    :cond_1c
    iget-object v3, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->RemoteActionCompatParcelizer:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2b

    .line 141
    invoke-static {}, Lo/n;->write()Lo/n;

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return v2

    .line 150
    :cond_2b
    invoke-static {}, Lo/n;->write()Lo/n;

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    iget-object v2, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->RemoteActionCompatParcelizer:Ljava/util/Map;

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    new-instance v2, Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;

    invoke-direct {v2}, Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;-><init>()V

    .line 156
    invoke-static {p1}, Landroidx/work/impl/background/systemjob/SystemJobService$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/app/job/JobParameters;)[Landroid/net/Uri;

    move-result-object v3

    if-eqz v3, :cond_4b

    .line 158
    invoke-static {p1}, Landroidx/work/impl/background/systemjob/SystemJobService$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/app/job/JobParameters;)[Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v2, Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/List;

    .line 160
    :cond_4b
    invoke-static {p1}, Landroidx/work/impl/background/systemjob/SystemJobService$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/app/job/JobParameters;)[Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5b

    .line 162
    invoke-static {p1}, Landroidx/work/impl/background/systemjob/SystemJobService$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/app/job/JobParameters;)[Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v2, Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/util/List;

    .line 165
    :cond_5b
    invoke-static {p1}, Landroidx/work/impl/background/systemjob/SystemJobService$write;->IconCompatParcelizer(Landroid/app/job/JobParameters;)Landroid/net/Network;

    move-result-object p1

    iput-object p1, v2, Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;->write:Landroid/net/Network;

    .line 176
    iget-object p1, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->IconCompatParcelizer:Lo/getCurrentWindowIndex;

    iget-object p0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->read:Lo/setAudioAttributes;

    invoke-interface {p0, v0}, Lo/setAudioAttributes;->IconCompatParcelizer(Lo/CProjection;)Lo/lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener;

    move-result-object p0

    invoke-interface {p1, p0, v2}, Lo/getCurrentWindowIndex;->AudioAttributesCompatParcelizer(Lo/lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener;Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;)V

    return v1
.end method

.method public onStopJob(Landroid/app/job/JobParameters;)Z
    .registers 7

    .line 182
    const-string v0, "onStopJob"

    invoke-static {v0}, Landroidx/work/impl/background/systemjob/SystemJobService;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->write:Lo/hasPrevious;

    const/4 v1, 0x1

    if-nez v0, :cond_e

    .line 184
    invoke-static {}, Lo/n;->write()Lo/n;

    return v1

    .line 188
    :cond_e
    invoke-static {p1}, Landroidx/work/impl/background/systemjob/SystemJobService;->RemoteActionCompatParcelizer(Landroid/app/job/JobParameters;)Lo/CProjection;

    move-result-object v0

    if-nez v0, :cond_19

    .line 190
    invoke-static {}, Lo/n;->write()Lo/n;

    const/4 p0, 0x0

    return p0

    .line 194
    :cond_19
    invoke-static {}, Lo/n;->write()Lo/n;

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 196
    iget-object v2, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->RemoteActionCompatParcelizer:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    iget-object v2, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->read:Lo/setAudioAttributes;

    invoke-interface {v2, v0}, Lo/setAudioAttributes;->RemoteActionCompatParcelizer(Lo/CProjection;)Lo/lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener;

    move-result-object v2

    if-eqz v2, :cond_3e

    .line 200
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-lt v3, v4, :cond_37

    .line 201
    invoke-static {p1}, Landroidx/work/impl/background/systemjob/SystemJobService$read;->RemoteActionCompatParcelizer(Landroid/app/job/JobParameters;)I

    move-result p1

    goto :goto_39

    :cond_37
    const/16 p1, -0x200

    .line 206
    :goto_39
    iget-object v3, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->IconCompatParcelizer:Lo/getCurrentWindowIndex;

    invoke-interface {v3, v2, p1}, Lo/getCurrentWindowIndex;->RemoteActionCompatParcelizer(Lo/lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener;I)V

    .line 208
    :cond_3e
    iget-object p0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->write:Lo/hasPrevious;

    invoke-virtual {p0}, Lo/hasPrevious;->IconCompatParcelizer()Lo/handlePlatformAudioFocusChange;

    move-result-object p0

    invoke-virtual {v0}, Lo/CProjection;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo/handlePlatformAudioFocusChange;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Z

    move-result p0

    xor-int/2addr p0, v1

    return p0
.end method

###### Class androidx.work.impl.background.systemjob.SystemJobService.RemoteActionCompatParcelizer (androidx.work.impl.background.systemjob.SystemJobService$RemoteActionCompatParcelizer)
.class Landroidx/work/impl/background/systemjob/SystemJobService$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/background/systemjob/SystemJobService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/app/job/JobParameters;)[Landroid/net/Uri;
    .registers 1

    .line 246
    invoke-virtual {p0}, Landroid/app/job/JobParameters;->getTriggeredContentUris()[Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method static RemoteActionCompatParcelizer(Landroid/app/job/JobParameters;)[Ljava/lang/String;
    .registers 1

    .line 250
    invoke-virtual {p0}, Landroid/app/job/JobParameters;->getTriggeredContentAuthorities()[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.work.impl.background.systemjob.SystemJobService.read (androidx.work.impl.background.systemjob.SystemJobService$read)
.class Landroidx/work/impl/background/systemjob/SystemJobService$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/background/systemjob/SystemJobService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# direct methods
.method static RemoteActionCompatParcelizer(Landroid/app/job/JobParameters;)I
    .registers 1

    .line 272
    invoke-virtual {p0}, Landroid/app/job/JobParameters;->getStopReason()I

    move-result p0

    invoke-static {p0}, Landroidx/work/impl/background/systemjob/SystemJobService;->read(I)I

    move-result p0

    return p0
.end method

###### Class androidx.work.impl.background.systemjob.SystemJobService.write (androidx.work.impl.background.systemjob.SystemJobService$write)
.class Landroidx/work/impl/background/systemjob/SystemJobService$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/background/systemjob/SystemJobService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# direct methods
.method static IconCompatParcelizer(Landroid/app/job/JobParameters;)Landroid/net/Network;
    .registers 1

    .line 261
    invoke-virtual {p0}, Landroid/app/job/JobParameters;->getNetwork()Landroid/net/Network;

    move-result-object p0

    return-object p0
.end method
