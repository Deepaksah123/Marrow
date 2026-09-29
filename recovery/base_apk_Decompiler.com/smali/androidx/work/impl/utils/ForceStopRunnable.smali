###### Class androidx.work.impl.utils.ForceStopRunnable (androidx.work.impl.utils.ForceStopRunnable)
.class public final Landroidx/work/impl/utils/ForceStopRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;
    }
.end annotation


# static fields
.field private static final read:J


# instance fields
.field private final AudioAttributesCompatParcelizer:Lo/forceDisableMediaCodecAsynchronousQueueing;

.field private IconCompatParcelizer:I

.field private final RemoteActionCompatParcelizer:Landroid/content/Context;

.field private final write:Lo/hasPrevious;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 78
    const-string v0, "ForceStopRunnable"

    invoke-static {v0}, Lo/n;->write(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xe42

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Landroidx/work/impl/utils/ForceStopRunnable;->read:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/hasPrevious;)V
    .registers 3

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/impl/utils/ForceStopRunnable;->RemoteActionCompatParcelizer:Landroid/content/Context;

    .line 97
    iput-object p2, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    .line 98
    invoke-virtual {p2}, Lo/hasPrevious;->write()Lo/forceDisableMediaCodecAsynchronousQueueing;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/impl/utils/ForceStopRunnable;->AudioAttributesCompatParcelizer:Lo/forceDisableMediaCodecAsynchronousQueueing;

    const/4 p1, 0x0

    .line 99
    iput p1, p0, Landroidx/work/impl/utils/ForceStopRunnable;->IconCompatParcelizer:I

    return-void
.end method

.method private AudioAttributesCompatParcelizer()Z
    .registers 1

    .line 326
    iget-object p0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    invoke-virtual {p0}, Lo/hasPrevious;->write()Lo/forceDisableMediaCodecAsynchronousQueueing;

    move-result-object p0

    invoke-virtual {p0}, Lo/forceDisableMediaCodecAsynchronousQueueing;->read()Z

    move-result p0

    return p0
.end method

.method static IconCompatParcelizer(Landroid/content/Context;)V
    .registers 7

    .line 385
    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 388
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_11

    const/high16 v1, 0xa000000

    goto :goto_13

    :cond_11
    const/high16 v1, 0x8000000

    .line 391
    :goto_13
    invoke-static {p0, v1}, Landroidx/work/impl/utils/ForceStopRunnable;->read(Landroid/content/Context;I)Landroid/app/PendingIntent;

    move-result-object p0

    .line 394
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-wide v3, Landroidx/work/impl/utils/ForceStopRunnable;->read:J

    if-eqz v0, :cond_24

    const/4 v5, 0x0

    add-long/2addr v1, v3

    .line 396
    invoke-virtual {v0, v5, v1, v2, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    :cond_24
    return-void
.end method

.method private IconCompatParcelizer()Z
    .registers 3

    .line 337
    iget-object v0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    invoke-virtual {v0}, Lo/hasPrevious;->AudioAttributesCompatParcelizer()Lo/b;

    move-result-object v0

    .line 342
    invoke-virtual {v0}, Lo/b;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 343
    invoke-static {}, Lo/n;->write()Lo/n;

    const/4 p0, 0x1

    return p0

    .line 346
    :cond_15
    iget-object p0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->RemoteActionCompatParcelizer:Landroid/content/Context;

    invoke-static {p0, v0}, Lo/createRenderers;->AudioAttributesCompatParcelizer(Landroid/content/Context;Lo/b;)Z

    move-result p0

    .line 347
    invoke-static {}, Lo/n;->write()Lo/n;

    return p0
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 4

    .line 253
    invoke-direct {p0}, Landroidx/work/impl/utils/ForceStopRunnable;->write()Z

    move-result v0

    .line 254
    invoke-direct {p0}, Landroidx/work/impl/utils/ForceStopRunnable;->AudioAttributesCompatParcelizer()Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 255
    invoke-static {}, Lo/n;->write()Lo/n;

    .line 256
    iget-object v0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    invoke-virtual {v0}, Lo/hasPrevious;->MediaBrowserCompatSearchResultReceiver()V

    .line 258
    iget-object p0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    invoke-virtual {p0}, Lo/hasPrevious;->write()Lo/forceDisableMediaCodecAsynchronousQueueing;

    move-result-object p0

    invoke-virtual {p0}, Lo/forceDisableMediaCodecAsynchronousQueueing;->AudioAttributesCompatParcelizer()V

    return-void

    .line 259
    :cond_1c
    invoke-direct {p0}, Landroidx/work/impl/utils/ForceStopRunnable;->read()Z

    move-result v1

    if-eqz v1, :cond_3e

    .line 260
    invoke-static {}, Lo/n;->write()Lo/n;

    .line 261
    iget-object v0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    invoke-virtual {v0}, Lo/hasPrevious;->MediaBrowserCompatSearchResultReceiver()V

    .line 263
    iget-object v0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->AudioAttributesCompatParcelizer:Lo/forceDisableMediaCodecAsynchronousQueueing;

    iget-object p0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    .line 264
    invoke-virtual {p0}, Lo/hasPrevious;->AudioAttributesCompatParcelizer()Lo/b;

    move-result-object p0

    invoke-virtual {p0}, Lo/b;->RemoteActionCompatParcelizer()Lo/setInstallerPackageName;

    move-result-object p0

    invoke-interface {p0}, Lo/setInstallerPackageName;->read()J

    move-result-wide v1

    .line 263
    invoke-virtual {v0, v1, v2}, Lo/forceDisableMediaCodecAsynchronousQueueing;->IconCompatParcelizer(J)V

    return-void

    :cond_3e
    if-eqz v0, :cond_58

    .line 266
    invoke-static {}, Lo/n;->write()Lo/n;

    .line 267
    iget-object v0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    .line 268
    invoke-virtual {v0}, Lo/hasPrevious;->AudioAttributesCompatParcelizer()Lo/b;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    .line 269
    invoke-virtual {v1}, Lo/hasPrevious;->AudioAttributesImplApi26Parcelizer()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    iget-object p0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    .line 270
    invoke-virtual {p0}, Lo/hasPrevious;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object p0

    .line 267
    invoke-static {v0, v1, p0}, Lo/setAudioFocusState;->write(Lo/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_58
    return-void
.end method

.method private static RemoteActionCompatParcelizer(J)V
    .registers 2

    .line 358
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method

.method private static read(Landroid/content/Context;I)Landroid/app/PendingIntent;
    .registers 4

    .line 369
    invoke-static {p0}, Landroidx/work/impl/utils/ForceStopRunnable;->write(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    .line 370
    invoke-static {p0, v1, v0, p1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method private read()Z
    .registers 9

    const/4 v0, 0x1

    .line 203
    :try_start_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_a

    const/high16 v1, 0x22000000

    goto :goto_c

    :cond_a
    const/high16 v1, 0x20000000

    .line 206
    :goto_c
    iget-object v2, p0, Landroidx/work/impl/utils/ForceStopRunnable;->RemoteActionCompatParcelizer:Landroid/content/Context;

    invoke-static {v2, v1}, Landroidx/work/impl/utils/ForceStopRunnable;->read(Landroid/content/Context;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 207
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    const/4 v4, 0x0

    if-lt v2, v3, :cond_5c

    if-eqz v1, :cond_1e

    .line 210
    invoke-virtual {v1}, Landroid/app/PendingIntent;->cancel()V

    .line 212
    :cond_1e
    iget-object v1, p0, Landroidx/work/impl/utils/ForceStopRunnable;->RemoteActionCompatParcelizer:Landroid/content/Context;

    .line 213
    const-string v2, "activity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager;

    const/4 v2, 0x0

    .line 215
    invoke-virtual {v1, v2, v4, v4}, Landroid/app/ActivityManager;->getHistoricalProcessExitReasons(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_64

    .line 221
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_64

    .line 222
    iget-object p0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->AudioAttributesCompatParcelizer:Lo/forceDisableMediaCodecAsynchronousQueueing;

    invoke-virtual {p0}, Lo/forceDisableMediaCodecAsynchronousQueueing;->write()J

    move-result-wide v2

    move p0, v4

    .line 223
    :goto_3c
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-ge p0, v5, :cond_64

    .line 224
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/ApplicationExitInfo;

    .line 225
    invoke-virtual {v5}, Landroid/app/ApplicationExitInfo;->getReason()I

    move-result v6

    const/16 v7, 0xa

    if-ne v6, v7, :cond_59

    .line 226
    invoke-virtual {v5}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v5

    cmp-long v5, v5, v2

    if-ltz v5, :cond_59

    return v0

    :cond_59
    add-int/lit8 p0, p0, 0x1

    goto :goto_3c

    :cond_5c
    if-nez v1, :cond_64

    .line 232
    iget-object p0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->RemoteActionCompatParcelizer:Landroid/content/Context;

    invoke-static {p0}, Landroidx/work/impl/utils/ForceStopRunnable;->IconCompatParcelizer(Landroid/content/Context;)V
    :try_end_63
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_63} :catch_65
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_63} :catch_65

    return v0

    :cond_64
    return v4

    .line 243
    :catch_65
    invoke-static {}, Lo/n;->write()Lo/n;

    return v0
.end method

.method private static write(Landroid/content/Context;)Landroid/content/Intent;
    .registers 4

    .line 378
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 379
    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 380
    const-string p0, "ACTION_FORCE_STOP_RESCHEDULE"

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method private write()Z
    .registers 11

    .line 288
    iget-object v0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->RemoteActionCompatParcelizer:Landroid/content/Context;

    iget-object v1, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    .line 289
    invoke-virtual {v1}, Lo/hasPrevious;->AudioAttributesImplApi26Parcelizer()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    .line 288
    invoke-static {v0, v1}, Lo/seekToNextWindow;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;)Z

    move-result v0

    .line 291
    iget-object p0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    invoke-virtual {p0}, Lo/hasPrevious;->AudioAttributesImplApi26Parcelizer()Landroidx/work/impl/WorkDatabase;

    move-result-object p0

    .line 292
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->onMediaButtonEvent()Lo/CVolumeFlags;

    move-result-object v1

    .line 293
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->onPlayFromMediaId()Lo/CStreamType;

    move-result-object v2

    .line 294
    invoke-virtual {p0}, Lo/ValueClassSerializerStaticJsonValue;->read()V

    .line 297
    :try_start_1d
    invoke-interface {v1}, Lo/CVolumeFlags;->IconCompatParcelizer()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2d

    .line 298
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2d

    move v6, v4

    goto :goto_2e

    :cond_2d
    move v6, v5

    :goto_2e
    if-eqz v6, :cond_56

    .line 307
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_34
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_56

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo/CVideoChangeFrameRateStrategy;

    .line 308
    sget-object v8, Lo/getChildPeriodUidFromConcatenatedUid$write;->AudioAttributesCompatParcelizer:Lo/getChildPeriodUidFromConcatenatedUid$write;

    iget-object v9, v7, Lo/CVideoChangeFrameRateStrategy;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    invoke-interface {v1, v8, v9}, Lo/CVolumeFlags;->RemoteActionCompatParcelizer(Lo/getChildPeriodUidFromConcatenatedUid$write;Ljava/lang/String;)I

    .line 309
    iget-object v8, v7, Lo/CVideoChangeFrameRateStrategy;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    const/16 v9, -0x200

    invoke-interface {v1, v8, v9}, Lo/CVolumeFlags;->AudioAttributesCompatParcelizer(Ljava/lang/String;I)V

    .line 310
    iget-object v7, v7, Lo/CVideoChangeFrameRateStrategy;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    const-wide/16 v8, -0x1

    invoke-interface {v1, v7, v8, v9}, Lo/CVolumeFlags;->AudioAttributesCompatParcelizer(Ljava/lang/String;J)I

    goto :goto_34

    .line 313
    :cond_56
    invoke-interface {v2}, Lo/CStreamType;->read()V

    .line 314
    invoke-virtual {p0}, Lo/ValueClassSerializerStaticJsonValue;->onCustomAction()V
    :try_end_5c
    .catchall {:try_start_1d .. :try_end_5c} :catchall_65

    .line 316
    invoke-virtual {p0}, Lo/ValueClassSerializerStaticJsonValue;->AudioAttributesImplApi21Parcelizer()V

    if-nez v6, :cond_64

    if-nez v0, :cond_64

    return v5

    :cond_64
    return v4

    :catchall_65
    move-exception v0

    invoke-virtual {p0}, Lo/ValueClassSerializerStaticJsonValue;->AudioAttributesImplApi21Parcelizer()V

    .line 317
    throw v0
.end method


# virtual methods
.method public final run()V
    .registers 5

    .line 105
    :try_start_0
    invoke-direct {p0}, Landroidx/work/impl/utils/ForceStopRunnable;->IconCompatParcelizer()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_0 .. :try_end_4} :catchall_74

    if-nez v0, :cond_7

    goto :goto_6d

    .line 115
    :cond_7
    :goto_7
    :try_start_7
    iget-object v0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->RemoteActionCompatParcelizer:Landroid/content/Context;

    invoke-static {v0}, Lo/seekToDefaultPositionInternal;->AudioAttributesCompatParcelizer(Landroid/content/Context;)V
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_c} :catch_53
    .catchall {:try_start_7 .. :try_end_c} :catchall_74

    .line 134
    :try_start_c
    invoke-static {}, Lo/n;->write()Lo/n;
    :try_end_f
    .catchall {:try_start_c .. :try_end_f} :catchall_74

    .line 136
    :try_start_f
    invoke-direct {p0}, Landroidx/work/impl/utils/ForceStopRunnable;->RemoteActionCompatParcelizer()V
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteAccessPermException; {:try_start_f .. :try_end_12} :catch_13
    .catch Landroid/database/sqlite/SQLiteCantOpenDatabaseException; {:try_start_f .. :try_end_12} :catch_13
    .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_f .. :try_end_12} :catch_13
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_f .. :try_end_12} :catch_13
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_f .. :try_end_12} :catch_13
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_f .. :try_end_12} :catch_13
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_f .. :try_end_12} :catch_13
    .catch Landroid/database/sqlite/SQLiteTableLockedException; {:try_start_f .. :try_end_12} :catch_13
    .catchall {:try_start_f .. :try_end_12} :catchall_74

    goto :goto_6d

    :catch_13
    move-exception v0

    .line 146
    :try_start_14
    iget v1, p0, Landroidx/work/impl/utils/ForceStopRunnable;->IconCompatParcelizer:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroidx/work/impl/utils/ForceStopRunnable;->IconCompatParcelizer:I

    const/4 v2, 0x3

    if-lt v1, v2, :cond_46

    .line 154
    iget-object v1, p0, Landroidx/work/impl/utils/ForceStopRunnable;->RemoteActionCompatParcelizer:Landroid/content/Context;

    invoke-static {v1}, Lo/_findExplicitStringFactoryMethod;->read(Landroid/content/Context;)Z

    move-result v1
    :try_end_23
    .catchall {:try_start_14 .. :try_end_23} :catchall_74

    if-eqz v1, :cond_28

    .line 155
    const-string v1, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store."

    goto :goto_2a

    .line 158
    :cond_28
    const-string v1, "WorkManager can\'t be accessed from direct boot, because credential encrypted storage isn\'t accessible.\nDon\'t access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"

    .line 164
    :goto_2a
    :try_start_2a
    invoke-static {}, Lo/n;->write()Lo/n;

    .line 165
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 167
    iget-object v0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    .line 168
    invoke-virtual {v0}, Lo/hasPrevious;->AudioAttributesCompatParcelizer()Lo/b;

    move-result-object v0

    invoke-virtual {v0}, Lo/b;->write()Lo/wrapAsJsonMappingException;

    move-result-object v0

    if-eqz v0, :cond_45

    .line 170
    invoke-static {}, Lo/n;->write()Lo/n;

    .line 173
    invoke-interface {v0, v2}, Lo/wrapAsJsonMappingException;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)V

    goto :goto_6d

    .line 176
    :cond_45
    throw v2

    .line 180
    :cond_46
    invoke-static {}, Lo/n;->write()Lo/n;

    .line 183
    iget v0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->IconCompatParcelizer:I

    int-to-long v0, v0

    const-wide/16 v2, 0x12c

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Landroidx/work/impl/utils/ForceStopRunnable;->RemoteActionCompatParcelizer(J)V

    goto :goto_7

    :catch_53
    move-exception v0

    .line 119
    invoke-static {}, Lo/n;->write()Lo/n;

    .line 120
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unexpected SQLite exception during migrations"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    iget-object v0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    .line 123
    invoke-virtual {v0}, Lo/hasPrevious;->AudioAttributesCompatParcelizer()Lo/b;

    move-result-object v0

    invoke-virtual {v0}, Lo/b;->write()Lo/wrapAsJsonMappingException;

    move-result-object v0

    if-eqz v0, :cond_73

    .line 125
    invoke-interface {v0, v1}, Lo/wrapAsJsonMappingException;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)V
    :try_end_6d
    .catchall {:try_start_2a .. :try_end_6d} :catchall_74

    .line 188
    :goto_6d
    iget-object p0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    invoke-virtual {p0}, Lo/hasPrevious;->AudioAttributesImplApi21Parcelizer()V

    return-void

    .line 128
    :cond_73
    :try_start_73
    throw v1
    :try_end_74
    .catchall {:try_start_73 .. :try_end_74} :catchall_74

    :catchall_74
    move-exception v0

    .line 188
    iget-object p0, p0, Landroidx/work/impl/utils/ForceStopRunnable;->write:Lo/hasPrevious;

    invoke-virtual {p0}, Lo/hasPrevious;->AudioAttributesImplApi21Parcelizer()V

    .line 189
    throw v0
.end method

###### Class androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver (androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver)
.class public Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/utils/ForceStopRunnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BroadcastReceiver"
.end annotation


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 408
    const-string v0, "ForceStopRunnable$Rcvr"

    invoke-static {v0}, Lo/n;->write(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 407
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 3

    if-eqz p2, :cond_14

    .line 415
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p0

    .line 416
    const-string p2, "ACTION_FORCE_STOP_RESCHEDULE"

    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_14

    .line 417
    invoke-static {}, Lo/n;->write()Lo/n;

    .line 420
    invoke-static {p1}, Landroidx/work/impl/utils/ForceStopRunnable;->IconCompatParcelizer(Landroid/content/Context;)V

    :cond_14
    return-void
.end method
