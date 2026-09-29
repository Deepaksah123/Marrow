###### Class android.support.v4.media.session.MediaSessionCompat (android.support.v4.media.session.MediaSessionCompat)
.class public Landroid/support/v4/media/session/MediaSessionCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;,
        Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;,
        Landroid/support/v4/media/session/MediaSessionCompat$write;,
        Landroid/support/v4/media/session/MediaSessionCompat$read;,
        Landroid/support/v4/media/session/MediaSessionCompat$IconCompatParcelizer;,
        Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesImplBaseParcelizer;,
        Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatItemReceiver;,
        Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;,
        Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesImplApi26Parcelizer;,
        Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver;,
        Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;,
        Landroid/support/v4/media/session/MediaSessionCompat$Token;
    }
.end annotation


# static fields
.field static IconCompatParcelizer:I


# instance fields
.field private final AudioAttributesCompatParcelizer:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatItemReceiver;",
            ">;"
        }
    .end annotation
.end field

.field private final RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaControllerCompat;

.field private final read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .registers 4

    const/4 v0, 0x0

    .line 447
    invoke-direct {p0, p1, p2, v0, v0}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;)V
    .registers 11

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 473
    invoke-direct/range {v0 .. v5}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Bundle;)V
    .registers 13

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 509
    invoke-direct/range {v0 .. v6}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Bundle;Lo/getApplicationInfo;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Bundle;Lo/getApplicationInfo;)V
    .registers 9

    .line 517
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    if-eqz p1, :cond_84

    .line 521
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7c

    if-nez p3, :cond_18

    .line 526
    invoke-static {p1}, Lo/expectMapFormat;->IconCompatParcelizer(Landroid/content/Context;)Landroid/content/ComponentName;

    move-result-object p3

    :cond_18
    if-eqz p3, :cond_35

    if-nez p4, :cond_35

    .line 534
    new-instance p4, Landroid/content/Intent;

    const-string v0, "android.intent.action.MEDIA_BUTTON"

    invoke-direct {p4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 536
    invoke-virtual {p4, p3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 539
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1f

    const/4 v1, 0x0

    if-lt p3, v0, :cond_30

    const/high16 p3, 0x2000000

    goto :goto_31

    :cond_30
    move p3, v1

    .line 537
    :goto_31
    invoke-static {p1, v1, p4, p3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p4

    .line 544
    :cond_35
    new-instance p3, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesImplBaseParcelizer;

    invoke-direct {p3, p1, p2, p6, p5}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesImplBaseParcelizer;-><init>(Landroid/content/Context;Ljava/lang/String;Lo/getApplicationInfo;Landroid/os/Bundle;)V

    iput-object p3, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    .line 553
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    if-eqz p2, :cond_47

    .line 554
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    goto :goto_4b

    :cond_47
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    :goto_4b
    new-instance p5, Landroid/os/Handler;

    invoke-direct {p5, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 555
    new-instance p2, Landroid/support/v4/media/session/MediaSessionCompat$4;

    invoke-direct {p2, p0}, Landroid/support/v4/media/session/MediaSessionCompat$4;-><init>(Landroid/support/v4/media/session/MediaSessionCompat;)V

    invoke-virtual {p0, p2, p5}, Landroid/support/v4/media/session/MediaSessionCompat;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;Landroid/os/Handler;)V

    .line 556
    invoke-interface {p3, p4}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/app/PendingIntent;)V

    .line 567
    new-instance p2, Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-direct {p2, p1, p0}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat;)V

    iput-object p2, p0, Landroid/support/v4/media/session/MediaSessionCompat;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 569
    sget p0, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer:I

    if-nez p0, :cond_7b

    .line 571
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    const/4 p1, 0x1

    const/high16 p2, 0x43a00000    # 320.0f

    .line 570
    invoke-static {p1, p2, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p0, p1

    float-to-int p0, p0

    sput p0, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer:I

    :cond_7b
    return-void

    .line 522
    :cond_7c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "tag must not be null or empty"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 519
    :cond_84
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "context must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static AudioAttributesCompatParcelizer(Landroid/os/Bundle;)Landroid/os/Bundle;
    .registers 2

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return-object v0

    .line 1056
    :cond_4
    invoke-static {p0}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1058
    :try_start_7
    invoke-virtual {p0}, Landroid/os/Bundle;->isEmpty()Z
    :try_end_a
    .catch Landroid/os/BadParcelableException; {:try_start_7 .. :try_end_a} :catch_b

    return-object p0

    :catch_b
    return-object v0
.end method

.method public static IconCompatParcelizer(Landroid/os/Bundle;)V
    .registers 2

    if-eqz p0, :cond_b

    .line 1040
    const-class v0, Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_b
    return-void
.end method

.method static write(Landroid/support/v4/media/session/PlaybackStateCompat;Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/session/PlaybackStateCompat;
    .registers 16

    if-eqz p0, :cond_73

    .line 1070
    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatItemReceiver()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_d

    goto :goto_73

    .line 1074
    :cond_d
    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_22

    .line 1075
    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_22

    .line 1076
    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_73

    .line 1077
    :cond_22
    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesCompatParcelizer()J

    move-result-wide v0

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-lez v6, :cond_73

    .line 1079
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    .line 1080
    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->RemoteActionCompatParcelizer()F

    move-result v6

    sub-long v0, v12, v0

    long-to-float v0, v0

    mul-float/2addr v6, v0

    float-to-long v0, v6

    .line 1081
    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatItemReceiver()J

    move-result-wide v6

    add-long/2addr v0, v6

    if-eqz p1, :cond_4c

    .line 1083
    const-string v6, "android.media.metadata.DURATION"

    invoke-virtual {p1, v6}, Landroid/support/v4/media/MediaMetadataCompat;->RemoteActionCompatParcelizer(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4c

    .line 1085
    invoke-virtual {p1, v6}, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer(Ljava/lang/String;)J

    move-result-wide v2

    :cond_4c
    cmp-long p1, v2, v4

    if-ltz p1, :cond_57

    cmp-long p1, v0, v2

    if-gtz p1, :cond_55

    goto :goto_57

    :cond_55
    move-wide v9, v2

    goto :goto_5e

    :cond_57
    :goto_57
    cmp-long p1, v0, v4

    if-gez p1, :cond_5d

    move-wide v9, v4

    goto :goto_5e

    :cond_5d
    move-wide v9, v0

    .line 1093
    :goto_5e
    new-instance v7, Landroid/support/v4/media/session/PlaybackStateCompat$read;

    invoke-direct {v7, p0}, Landroid/support/v4/media/session/PlaybackStateCompat$read;-><init>(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 1094
    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer()I

    move-result v8

    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->RemoteActionCompatParcelizer()F

    move-result v11

    invoke-virtual/range {v7 .. v13}, Landroid/support/v4/media/session/PlaybackStateCompat$read;->write(IJFJ)Landroid/support/v4/media/session/PlaybackStateCompat$read;

    move-result-object p0

    .line 1095
    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat$read;->IconCompatParcelizer()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p0

    :cond_73
    :goto_73
    return-object p0
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(I)V
    .registers 2

    .line 896
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->write(I)V

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Ljava/util/List;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_45

    .line 816
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 817
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_45

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    if-eqz v2, :cond_3d

    .line 821
    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->RemoteActionCompatParcelizer()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_31

    .line 822
    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->RemoteActionCompatParcelizer()J

    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v4, "id of each queue item should be unique"

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 825
    :cond_31
    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->RemoteActionCompatParcelizer()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 819
    :cond_3d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "queue shouldn\'t have null items"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 828
    :cond_45
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/util/List;)V

    return-void
.end method

.method public IconCompatParcelizer(I)V
    .registers 2

    .line 881
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer(I)V

    return-void
.end method

.method public IconCompatParcelizer(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 2

    .line 799
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/support/v4/media/MediaMetadataCompat;)V

    return-void
.end method

.method public IconCompatParcelizer(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .registers 2

    .line 787
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->write(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    return-void
.end method

.method public RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .registers 1

    .line 768
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    invoke-interface {p0}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->read()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p0

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;Landroid/os/Handler;)V
    .registers 3

    if-nez p1, :cond_9

    .line 608
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    const/4 p1, 0x0

    invoke-interface {p0, p1, p1}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;Landroid/os/Handler;)V

    return-void

    .line 610
    :cond_9
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    if-nez p2, :cond_12

    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    :cond_12
    invoke-interface {p0, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;Landroid/os/Handler;)V

    return-void
.end method

.method public RemoteActionCompatParcelizer(Z)V
    .registers 3

    .line 714
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Z)V

    .line 715
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatItemReceiver;

    .line 716
    invoke-interface {p1}, Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatItemReceiver;->read()V

    goto :goto_b

    :cond_1b
    return-void
.end method

.method public read()V
    .registers 1

    .line 750
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    invoke-interface {p0}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer()V

    return-void
.end method

.method public read(I)V
    .registers 2

    .line 661
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->read:Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(I)V

    return-void
.end method

.method public write()Landroid/support/v4/media/session/MediaControllerCompat;
    .registers 1

    .line 778
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaControllerCompat;

    return-object p0
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.AnonymousClass4 (android.support.v4.media.session.MediaSessionCompat$4)
.class Landroid/support/v4/media/session/MediaSessionCompat$4;
.super Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Bundle;Lo/getApplicationInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroid/support/v4/media/session/MediaSessionCompat;


# direct methods
.method constructor <init>(Landroid/support/v4/media/session/MediaSessionCompat;)V
    .registers 2

    .line 555
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$4;->write:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;-><init>()V

    return-void
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer (android.support.v4.media.session.MediaSessionCompat$AudioAttributesCompatParcelizer)
.class public abstract Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;,
        Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;
    }
.end annotation


# instance fields
.field final mCallbackFwk:Landroid/media/session/MediaSession$Callback;

.field mCallbackHandler:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;

.field final mLock:Ljava/lang/Object;

.field private mMediaPlayPausePendingOnHandler:Z

.field mSessionImpl:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1109
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mLock:Ljava/lang/Object;

    .line 1121
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;

    invoke-direct {v0, p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;-><init>(Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;)V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mCallbackFwk:Landroid/media/session/MediaSession$Callback;

    .line 1125
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mSessionImpl:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method handleMediaPlayPauseIfPendingOnHandler(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;Landroid/os/Handler;)V
    .registers 11

    .line 1223
    iget-boolean v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mMediaPlayPausePendingOnHandler:Z

    if-eqz v0, :cond_46

    const/4 v0, 0x0

    .line 1226
    iput-boolean v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mMediaPlayPausePendingOnHandler:Z

    const/4 v1, 0x1

    .line 1227
    invoke-virtual {p2, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1229
    invoke-interface {p1}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p1

    const-wide/16 v2, 0x0

    if-nez p1, :cond_15

    move-wide v4, v2

    goto :goto_19

    .line 1230
    :cond_15
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->IconCompatParcelizer()J

    move-result-wide v4

    :goto_19
    if-eqz p1, :cond_24

    .line 1232
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer()I

    move-result p1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_24

    move p1, v1

    goto :goto_25

    :cond_24
    move p1, v0

    :goto_25
    const-wide/16 v6, 0x204

    and-long/2addr v6, v4

    cmp-long p2, v6, v2

    if-eqz p2, :cond_2e

    move p2, v1

    goto :goto_2f

    :cond_2e
    move p2, v0

    :goto_2f
    const-wide/16 v6, 0x202

    and-long/2addr v4, v6

    cmp-long v2, v4, v2

    if-eqz v2, :cond_37

    move v0, v1

    :cond_37
    if-eqz p1, :cond_3f

    if-eqz v0, :cond_3f

    .line 1238
    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPause()V

    return-void

    :cond_3f
    if-nez p1, :cond_46

    if-eqz p2, :cond_46

    .line 1240
    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPlay()V

    :cond_46
    return-void
.end method

.method public onAddQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .registers 2

    return-void
.end method

.method public onAddQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;I)V
    .registers 3

    return-void
.end method

.method public onCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .registers 4

    return-void
.end method

.method public onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public onFastForward()V
    .registers 1

    return-void
.end method

.method public onMediaButtonEvent(Landroid/content/Intent;)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public onPause()V
    .registers 1

    return-void
.end method

.method public onPlay()V
    .registers 1

    return-void
.end method

.method public onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public onPrepare()V
    .registers 1

    return-void
.end method

.method public onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public onRemoveQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .registers 2

    return-void
.end method

.method public onRemoveQueueItemAt(I)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onRewind()V
    .registers 1

    return-void
.end method

.method public onSeekTo(J)V
    .registers 3

    return-void
.end method

.method public onSetCaptioningEnabled(Z)V
    .registers 2

    return-void
.end method

.method public onSetPlaybackSpeed(F)V
    .registers 2

    return-void
.end method

.method public onSetRating(Landroid/support/v4/media/RatingCompat;)V
    .registers 2

    return-void
.end method

.method public onSetRating(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public onSetRepeatMode(I)V
    .registers 2

    return-void
.end method

.method public onSetShuffleMode(I)V
    .registers 2

    return-void
.end method

.method public onSkipToNext()V
    .registers 1

    return-void
.end method

.method public onSkipToPrevious()V
    .registers 1

    return-void
.end method

.method public onSkipToQueueItem(J)V
    .registers 3

    return-void
.end method

.method public onStop()V
    .registers 1

    return-void
.end method

.method setSessionImpl(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;Landroid/os/Handler;)V
    .registers 6

    .line 1129
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1130
    :try_start_3
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mSessionImpl:Ljava/lang/ref/WeakReference;

    .line 1131
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mCallbackHandler:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;

    const/4 v2, 0x0

    if-eqz v1, :cond_12

    .line 1132
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_12
    if-eqz p1, :cond_20

    if-nez p2, :cond_17

    goto :goto_20

    .line 1135
    :cond_17
    new-instance v2, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;

    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v2, p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;-><init>(Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;Landroid/os/Looper;)V

    :cond_20
    :goto_20
    iput-object v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mCallbackHandler:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;
    :try_end_22
    .catchall {:try_start_3 .. :try_end_22} :catchall_24

    .line 1136
    monitor-exit v0

    return-void

    :catchall_24
    move-exception p0

    monitor-exit v0

    throw p0
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer.IconCompatParcelizer (android.support.v4.media.session.MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer)
.class Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;
.super Landroid/media/session/MediaSession$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;


# direct methods
.method constructor <init>(Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;)V
    .registers 2

    .line 1521
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-direct {p0}, Landroid/media/session/MediaSession$Callback;-><init>()V

    return-void
.end method

.method private RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;
    .registers 3

    .line 1882
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    iget-object v0, v0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1883
    :try_start_5
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    iget-object v1, v1, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mSessionImpl:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/session/MediaSessionCompat$write;
    :try_end_f
    .catchall {:try_start_5 .. :try_end_f} :catchall_1d

    .line 1884
    monitor-exit v0

    if-eqz v1, :cond_1b

    .line 1886
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$write;->write()Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    move-result-object v0

    if-ne p0, v0, :cond_1b

    return-object v1

    :cond_1b
    const/4 p0, 0x0

    return-object p0

    :catchall_1d
    move-exception p0

    .line 1884
    monitor-exit v0

    throw p0
.end method

.method private RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V
    .registers 2

    return-void
.end method

.method private write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V
    .registers 2

    const/4 p0, 0x0

    .line 1874
    invoke-interface {p1, p0}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->write(Lo/JsonFormatVisitorWithSerializerProvider$IconCompatParcelizer;)V

    return-void
.end method


# virtual methods
.method public onCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .registers 9

    .line 1527
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1531
    :cond_7
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1532
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1534
    :try_start_d
    const-string v1, "android.support.v4.media.session.command.GET_EXTRA_BINDER"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3e

    .line 1535
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 1536
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat$write;->read()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p2

    .line 1537
    invoke-virtual {p2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer()Lo/AudioAttributesImplBaseParcelizer;

    move-result-object v1

    if-nez v1, :cond_26

    goto :goto_2a

    .line 1539
    :cond_26
    invoke-interface {v1}, Lo/AudioAttributesImplBaseParcelizer;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    .line 1538
    :goto_2a
    const-string v1, "android.support.v4.media.session.EXTRA_BINDER"

    invoke-static {p1, v1, v2}, Lo/_checkFromStringCoercion;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V

    .line 1541
    invoke-virtual {p2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->read()Lo/getApplicationInfo;

    move-result-object p2

    .line 1540
    const-string v1, "android.support.v4.media.session.SESSION_TOKEN2"

    invoke-static {p1, v1, p2}, Lo/getActivityLogo;->write(Landroid/os/Bundle;Ljava/lang/String;Lo/getApplicationInfo;)V

    const/4 p2, 0x0

    .line 1542
    invoke-virtual {p3, p2, p1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    goto/16 :goto_b7

    .line 1543
    :cond_3e
    const-string v1, "android.support.v4.media.session.command.ADD_QUEUE_ITEM"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_44
    .catch Landroid/os/BadParcelableException; {:try_start_d .. :try_end_44} :catch_b7

    const-string v3, "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"

    if-eqz v1, :cond_54

    .line 1544
    :try_start_48
    iget-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    .line 1545
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 1544
    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onAddQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V

    goto :goto_b7

    .line 1547
    :cond_54
    const-string v1, "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_5a
    .catch Landroid/os/BadParcelableException; {:try_start_48 .. :try_end_5a} :catch_b7

    const-string v4, "android.support.v4.media.session.command.ARGUMENT_INDEX"

    if-eqz v1, :cond_6e

    .line 1548
    :try_start_5e
    iget-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    .line 1549
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 1551
    invoke-virtual {p2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p2

    .line 1548
    invoke-virtual {p1, p3, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onAddQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    goto :goto_b7

    .line 1552
    :cond_6e
    const-string v1, "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_82

    .line 1553
    iget-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    .line 1554
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 1553
    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onRemoveQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V

    goto :goto_b7

    .line 1556
    :cond_82
    const-string v1, "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b2

    .line 1557
    iget-object p1, v0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatItemReceiver:Ljava/util/List;

    if-eqz p1, :cond_b7

    const/4 p1, -0x1

    .line 1559
    invoke-virtual {p2, v4, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-ltz p1, :cond_a6

    .line 1560
    iget-object p2, v0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatItemReceiver:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_a6

    .line 1561
    iget-object p2, v0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatItemReceiver:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    :cond_a6
    if-eqz v2, :cond_b7

    .line 1563
    iget-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->write()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onRemoveQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V

    goto :goto_b7

    .line 1567
    :cond_b2
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2, p3}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    :try_end_b7
    .catch Landroid/os/BadParcelableException; {:try_start_5e .. :try_end_b7} :catch_b7

    .line 1574
    :catch_b7
    :cond_b7
    :goto_b7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 7

    .line 1738
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1742
    :cond_7
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1743
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1746
    :try_start_d
    const-string v1, "android.support.v4.media.session.action.PLAY_FROM_URI"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_13
    .catch Landroid/os/BadParcelableException; {:try_start_d .. :try_end_13} :catch_104

    const-string v2, "android.support.v4.media.session.action.ARGUMENT_URI"

    const-string v3, "android.support.v4.media.session.action.ARGUMENT_EXTRAS"

    if-eqz v1, :cond_2d

    .line 1747
    :try_start_19
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    .line 1748
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    .line 1749
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1750
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    goto/16 :goto_104

    .line 1751
    :cond_2d
    const-string v1, "android.support.v4.media.session.action.PREPARE"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3c

    .line 1752
    iget-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPrepare()V

    goto/16 :goto_104

    .line 1753
    :cond_3c
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_58

    .line 1754
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1755
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    .line 1756
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1757
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    goto/16 :goto_104

    .line 1758
    :cond_58
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_SEARCH"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_74

    .line 1759
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_QUERY"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1760
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    .line 1761
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1762
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    goto/16 :goto_104

    .line 1763
    :cond_74
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_URI"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_90

    .line 1764
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    .line 1765
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    .line 1766
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1767
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    goto/16 :goto_104

    .line 1768
    :cond_90
    const-string v1, "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a4

    .line 1769
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    .line 1770
    iget-object p2, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {p2, p1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onSetCaptioningEnabled(Z)V

    goto :goto_104

    .line 1771
    :cond_a4
    const-string v1, "android.support.v4.media.session.action.SET_REPEAT_MODE"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b8

    .line 1772
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 1773
    iget-object p2, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {p2, p1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onSetRepeatMode(I)V

    goto :goto_104

    .line 1774
    :cond_b8
    const-string v1, "android.support.v4.media.session.action.SET_SHUFFLE_MODE"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_cc

    .line 1775
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 1776
    iget-object p2, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {p2, p1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onSetShuffleMode(I)V

    goto :goto_104

    .line 1777
    :cond_cc
    const-string v1, "android.support.v4.media.session.action.SET_RATING"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e9

    .line 1778
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_RATING"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/RatingCompat;

    .line 1779
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    .line 1780
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1781
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onSetRating(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V

    goto :goto_104

    .line 1782
    :cond_e9
    const-string v1, "android.support.v4.media.session.action.SET_PLAYBACK_SPEED"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_ff

    .line 1783
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED"

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p2, p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p1

    .line 1784
    iget-object p2, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {p2, p1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onSetPlaybackSpeed(F)V

    goto :goto_104

    .line 1786
    :cond_ff
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_104
    .catch Landroid/os/BadParcelableException; {:try_start_19 .. :try_end_104} :catch_104

    .line 1792
    :catch_104
    :goto_104
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onFastForward()V
    .registers 3

    .line 1683
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1687
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1688
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onFastForward()V

    .line 1689
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onMediaButtonEvent(Landroid/content/Intent;)Z
    .registers 5

    .line 1579
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    .line 1583
    :cond_8
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1584
    iget-object v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v2, p1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onMediaButtonEvent(Landroid/content/Intent;)Z

    move-result v2

    .line 1585
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    if-nez v2, :cond_1d

    .line 1586
    invoke-super {p0, p1}, Landroid/media/session/MediaSession$Callback;->onMediaButtonEvent(Landroid/content/Intent;)Z

    move-result p0

    if-nez p0, :cond_1d

    return v1

    :cond_1d
    const/4 p0, 0x1

    return p0
.end method

.method public onPause()V
    .registers 3

    .line 1650
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1654
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1655
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPause()V

    .line 1656
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onPlay()V
    .registers 3

    .line 1591
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1595
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1596
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPlay()V

    .line 1597
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 5

    .line 1602
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1606
    :cond_7
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1607
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1608
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1609
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 5

    .line 1614
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1618
    :cond_7
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1619
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1620
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1621
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 5

    .line 1627
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1631
    :cond_7
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1632
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1633
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 1634
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onPrepare()V
    .registers 3

    .line 1798
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1802
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1803
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPrepare()V

    .line 1804
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 5

    .line 1810
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1814
    :cond_7
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1815
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1816
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1817
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 5

    .line 1823
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1827
    :cond_7
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1828
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1829
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1830
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 5

    .line 1836
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1840
    :cond_7
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1841
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1842
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 1843
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onRewind()V
    .registers 3

    .line 1694
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1698
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1699
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onRewind()V

    .line 1700
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onSeekTo(J)V
    .registers 5

    .line 1716
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1720
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1721
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onSeekTo(J)V

    .line 1722
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onSetPlaybackSpeed(F)V
    .registers 4

    .line 1849
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1853
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1854
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onSetPlaybackSpeed(F)V

    .line 1855
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onSetRating(Landroid/media/Rating;)V
    .registers 4

    .line 1727
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1731
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1732
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-static {p1}, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/support/v4/media/RatingCompat;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onSetRating(Landroid/support/v4/media/RatingCompat;)V

    .line 1733
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onSkipToNext()V
    .registers 3

    .line 1661
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1665
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1666
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onSkipToNext()V

    .line 1667
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onSkipToPrevious()V
    .registers 3

    .line 1672
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1676
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1677
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onSkipToPrevious()V

    .line 1678
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onSkipToQueueItem(J)V
    .registers 5

    .line 1639
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1643
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1644
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onSkipToQueueItem(J)V

    .line 1645
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method public onStop()V
    .registers 3

    .line 1705
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$write;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 1709
    :cond_7
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    .line 1710
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->onStop()V

    .line 1711
    invoke-direct {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$IconCompatParcelizer;->write(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer.write (android.support.v4.media.session.MediaSessionCompat$AudioAttributesCompatParcelizer$write)
.class Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "write"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;


# direct methods
.method constructor <init>(Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;Landroid/os/Looper;)V
    .registers 3

    .line 1491
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    .line 1492
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .registers 6

    .line 1497
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_39

    .line 1502
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    iget-object v0, v0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1503
    :try_start_a
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    iget-object v1, v1, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mSessionImpl:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;

    .line 1504
    iget-object v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    iget-object v2, v2, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mCallbackHandler:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;
    :try_end_18
    .catchall {:try_start_a .. :try_end_18} :catchall_36

    .line 1505
    monitor-exit v0

    if-eqz v1, :cond_39

    .line 1506
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    .line 1507
    invoke-interface {v1}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->write()Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    move-result-object v3

    if-ne v0, v3, :cond_39

    if-eqz v2, :cond_39

    .line 1511
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lo/JsonFormatVisitorWithSerializerProvider$IconCompatParcelizer;

    .line 1512
    invoke-interface {v1, p1}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->write(Lo/JsonFormatVisitorWithSerializerProvider$IconCompatParcelizer;)V

    .line 1513
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer$write;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {p0, v1, v2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;Landroid/os/Handler;)V

    const/4 p0, 0x0

    .line 1514
    invoke-interface {v1, p0}, Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;->write(Lo/JsonFormatVisitorWithSerializerProvider$IconCompatParcelizer;)V

    return-void

    :catchall_36
    move-exception p0

    .line 1505
    monitor-exit v0

    throw p0

    :cond_39
    return-void
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.AudioAttributesImplApi26Parcelizer (android.support.v4.media.session.MediaSessionCompat$AudioAttributesImplApi26Parcelizer)
.class public interface abstract Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesImplApi26Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesImplApi26Parcelizer"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer(II)V
.end method

.method public abstract IconCompatParcelizer(II)V
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.AudioAttributesImplBaseParcelizer (android.support.v4.media.session.MediaSessionCompat$AudioAttributesImplBaseParcelizer)
.class Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesImplBaseParcelizer;
.super Landroid/support/v4/media/session/MediaSessionCompat$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesImplBaseParcelizer"
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lo/getApplicationInfo;Landroid/os/Bundle;)V
    .registers 5

    .line 4656
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v4/media/session/MediaSessionCompat$IconCompatParcelizer;-><init>(Landroid/content/Context;Ljava/lang/String;Lo/getApplicationInfo;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public read(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/media/session/MediaSession;
    .registers 4

    .line 4666
    new-instance p0, Landroid/media/session/MediaSession;

    invoke-direct {p0, p1, p2, p3}, Landroid/media/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object p0
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.IconCompatParcelizer (android.support.v4.media.session.MediaSessionCompat$IconCompatParcelizer)
.class Landroid/support/v4/media/session/MediaSessionCompat$IconCompatParcelizer;
.super Landroid/support/v4/media/session/MediaSessionCompat$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lo/getApplicationInfo;Landroid/os/Bundle;)V
    .registers 5

    .line 4631
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v4/media/session/MediaSessionCompat$read;-><init>(Landroid/content/Context;Ljava/lang/String;Lo/getApplicationInfo;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public write(Lo/JsonFormatVisitorWithSerializerProvider$IconCompatParcelizer;)V
    .registers 2

    return-void
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.MediaBrowserCompatCustomActionResultReceiver (android.support.v4.media.session.MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver)
.class final Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesImplApi26Parcelizer;


# virtual methods
.method public final IconCompatParcelizer(II)V
    .registers 4

    const/16 v0, 0x3ea

    .line 4701
    invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(II)V
    .registers 4

    const/16 v0, 0x3e9

    .line 4697
    invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .registers 4

    .line 4685
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 4686
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x3e9

    if-eq v0, v1, :cond_18

    const/16 v1, 0x3ea

    if-eq v0, v1, :cond_e

    return-void

    .line 4691
    :cond_e
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesImplApi26Parcelizer;

    iget v0, p1, Landroid/os/Message;->arg1:I

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-interface {p0, v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer(II)V

    return-void

    .line 4688
    :cond_18
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesImplApi26Parcelizer;

    iget v0, p1, Landroid/os/Message;->arg1:I

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-interface {p0, v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer(II)V

    return-void
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.MediaBrowserCompatItemReceiver (android.support.v4.media.session.MediaSessionCompat$MediaBrowserCompatItemReceiver)
.class public interface abstract Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatItemReceiver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MediaBrowserCompatItemReceiver"
.end annotation


# virtual methods
.method public abstract read()V
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.QueueItem (android.support.v4.media.session.MediaSessionCompat$QueueItem)
.class public final Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "QueueItem"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$write;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final IconCompatParcelizer:J

.field private RemoteActionCompatParcelizer:Landroid/media/session/MediaSession$QueueItem;

.field private final write:Landroid/support/v4/media/MediaDescriptionCompat;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 2266
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$2;

    invoke-direct {v0}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$2;-><init>()V

    sput-object v0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/media/session/MediaSession$QueueItem;Landroid/support/v4/media/MediaDescriptionCompat;J)V
    .registers 7

    .line 2161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1a

    const-wide/16 v0, -0x1

    cmp-long v0, p3, v0

    if-eqz v0, :cond_12

    .line 2168
    iput-object p2, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->write:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 2169
    iput-wide p3, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->IconCompatParcelizer:J

    .line 2170
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->RemoteActionCompatParcelizer:Landroid/media/session/MediaSession$QueueItem;

    return-void

    .line 2166
    :cond_12
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Id cannot be QueueItem.UNKNOWN_ID"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 2163
    :cond_1a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Description cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    .line 2173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2174
    sget-object v0, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/MediaDescriptionCompat;

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->write:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 2175
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->IconCompatParcelizer:J

    return-void
.end method

.method public constructor <init>(Landroid/support/v4/media/MediaDescriptionCompat;J)V
    .registers 5

    const/4 v0, 0x0

    .line 2155
    invoke-direct {p0, v0, p1, p2, p3}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/media/session/MediaSession$QueueItem;Landroid/support/v4/media/MediaDescriptionCompat;J)V

    return-void
.end method

.method public static IconCompatParcelizer(Ljava/util/List;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_22

    .line 2259
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2260
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 2261
    invoke-static {v1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->read(Ljava/lang/Object;)Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_21
    return-object v0

    :cond_22
    const/4 p0, 0x0

    return-object p0
.end method

.method public static read(Ljava/lang/Object;)Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;
    .registers 5

    if-eqz p0, :cond_16

    .line 2237
    check-cast p0, Landroid/media/session/MediaSession$QueueItem;

    .line 2238
    invoke-static {p0}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$write;->IconCompatParcelizer(Landroid/media/session/MediaSession$QueueItem;)Landroid/media/MediaDescription;

    move-result-object v0

    .line 2239
    invoke-static {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v0

    .line 2241
    invoke-static {p0}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$write;->read(Landroid/media/session/MediaSession$QueueItem;)J

    move-result-wide v1

    .line 2242
    new-instance v3, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    invoke-direct {v3, p0, v0, v1, v2}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/media/session/MediaSession$QueueItem;Landroid/support/v4/media/MediaDescriptionCompat;J)V

    return-object v3

    :cond_16
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/lang/Object;
    .registers 4

    .line 2214
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->RemoteActionCompatParcelizer:Landroid/media/session/MediaSession$QueueItem;

    if-nez v0, :cond_14

    .line 2217
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->write:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 2218
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/MediaDescription;

    iget-wide v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->IconCompatParcelizer:J

    .line 2217
    invoke-static {v0, v1, v2}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$write;->read(Landroid/media/MediaDescription;J)Landroid/media/session/MediaSession$QueueItem;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->RemoteActionCompatParcelizer:Landroid/media/session/MediaSession$QueueItem;

    :cond_14
    return-object v0
.end method

.method public final RemoteActionCompatParcelizer()J
    .registers 3

    .line 2189
    iget-wide v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->IconCompatParcelizer:J

    return-wide v0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 4

    .line 2282
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediaSession.QueueItem {Description="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->write:Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", Id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->IconCompatParcelizer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " }"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write()Landroid/support/v4/media/MediaDescriptionCompat;
    .registers 1

    .line 2182
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->write:Landroid/support/v4/media/MediaDescriptionCompat;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 2194
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->write:Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/MediaDescriptionCompat;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2195
    iget-wide v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->IconCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.QueueItem.AnonymousClass2 (android.support.v4.media.session.MediaSessionCompat$QueueItem$2)
.class Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 2267
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 2267
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$2;->read(Landroid/os/Parcel;)Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    move-result-object p0

    return-object p0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 2267
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$2;->write(I)[Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    move-result-object p0

    return-object p0
.end method

.method public read(Landroid/os/Parcel;)Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;
    .registers 2

    .line 2271
    new-instance p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    invoke-direct {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/os/Parcel;)V

    return-object p0
.end method

.method public write(I)[Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;
    .registers 2

    .line 2276
    new-array p0, p1, [Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    return-object p0
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.QueueItem.write (android.support.v4.media.session.MediaSessionCompat$QueueItem$write)
.class Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# direct methods
.method static IconCompatParcelizer(Landroid/media/session/MediaSession$QueueItem;)Landroid/media/MediaDescription;
    .registers 1

    .line 2298
    invoke-virtual {p0}, Landroid/media/session/MediaSession$QueueItem;->getDescription()Landroid/media/MediaDescription;

    move-result-object p0

    return-object p0
.end method

.method static read(Landroid/media/session/MediaSession$QueueItem;)J
    .registers 3

    .line 2303
    invoke-virtual {p0}, Landroid/media/session/MediaSession$QueueItem;->getQueueId()J

    move-result-wide v0

    return-wide v0
.end method

.method static read(Landroid/media/MediaDescription;J)Landroid/media/session/MediaSession$QueueItem;
    .registers 4

    .line 2293
    new-instance v0, Landroid/media/session/MediaSession$QueueItem;

    invoke-direct {v0, p0, p1, p2}, Landroid/media/session/MediaSession$QueueItem;-><init>(Landroid/media/MediaDescription;J)V

    return-object v0
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer (android.support.v4.media.session.MediaSessionCompat$RemoteActionCompatParcelizer)
.class interface abstract Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "RemoteActionCompatParcelizer"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;Landroid/os/Handler;)V
.end method

.method public abstract AudioAttributesCompatParcelizer(Z)V
.end method

.method public abstract IconCompatParcelizer()V
.end method

.method public abstract IconCompatParcelizer(I)V
.end method

.method public abstract IconCompatParcelizer(Landroid/app/PendingIntent;)V
.end method

.method public abstract IconCompatParcelizer(Landroid/support/v4/media/MediaMetadataCompat;)V
.end method

.method public abstract RemoteActionCompatParcelizer()Landroid/support/v4/media/session/PlaybackStateCompat;
.end method

.method public abstract RemoteActionCompatParcelizer(I)V
.end method

.method public abstract RemoteActionCompatParcelizer(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract read()Landroid/support/v4/media/session/MediaSessionCompat$Token;
.end method

.method public abstract write()Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;
.end method

.method public abstract write(I)V
.end method

.method public abstract write(Landroid/support/v4/media/session/PlaybackStateCompat;)V
.end method

.method public abstract write(Lo/JsonFormatVisitorWithSerializerProvider$IconCompatParcelizer;)V
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper (android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper)
.class public final Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ResultReceiverWrapper"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field read:Landroid/os/ResultReceiver;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 2326
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper$5;

    invoke-direct {v0}, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper$5;-><init>()V

    sput-object v0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 2321
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2322
    sget-object v0, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/ResultReceiver;

    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;->read:Landroid/os/ResultReceiver;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 2345
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;->read:Landroid/os/ResultReceiver;

    invoke-virtual {p0, p1, p2}, Landroid/os/ResultReceiver;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.AnonymousClass5 (android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$5)
.class Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 2326
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;
    .registers 2

    .line 2329
    new-instance p0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;

    invoke-direct {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;-><init>(Landroid/os/Parcel;)V

    return-object p0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 2326
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper$5;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;

    move-result-object p0

    return-object p0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 2326
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper$5;->write(I)[Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;

    move-result-object p0

    return-object p0
.end method

.method public write(I)[Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;
    .registers 2

    .line 2334
    new-array p0, p1, [Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;

    return-object p0
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.Token (android.support.v4.media.session.MediaSessionCompat$Token)
.class public final Landroid/support/v4/media/session/MediaSessionCompat$Token;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Token"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/session/MediaSessionCompat$Token;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final IconCompatParcelizer:Ljava/lang/Object;

.field private RemoteActionCompatParcelizer:Lo/AudioAttributesImplBaseParcelizer;

.field private read:Lo/getApplicationInfo;

.field private final write:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 2110
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$Token$1;

    invoke-direct {v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token$1;-><init>()V

    sput-object v0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;)V
    .registers 3

    const/4 v0, 0x0

    .line 1930
    invoke-direct {p0, p1, v0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Lo/AudioAttributesImplBaseParcelizer;Lo/getApplicationInfo;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;Lo/AudioAttributesImplBaseParcelizer;)V
    .registers 4

    const/4 v0, 0x0

    .line 1934
    invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Lo/AudioAttributesImplBaseParcelizer;Lo/getApplicationInfo;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;Lo/AudioAttributesImplBaseParcelizer;Lo/getApplicationInfo;)V
    .registers 5

    .line 1937
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1921
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->IconCompatParcelizer:Ljava/lang/Object;

    .line 1938
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->write:Ljava/lang/Object;

    .line 1939
    iput-object p2, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->RemoteActionCompatParcelizer:Lo/AudioAttributesImplBaseParcelizer;

    .line 1940
    iput-object p3, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->read:Lo/getApplicationInfo;

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .registers 2

    const/4 v0, 0x0

    .line 1955
    invoke-static {p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Lo/AudioAttributesImplBaseParcelizer;)Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p0

    return-object p0
.end method

.method public static AudioAttributesCompatParcelizer(Ljava/lang/Object;Lo/AudioAttributesImplBaseParcelizer;)Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .registers 3

    if-eqz p0, :cond_14

    .line 1973
    instance-of v0, p0, Landroid/media/session/MediaSession$Token;

    if-eqz v0, :cond_c

    .line 1977
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Lo/AudioAttributesImplBaseParcelizer;)V

    return-object v0

    .line 1974
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "token is not a valid MediaSession.Token object"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_14
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lo/AudioAttributesImplBaseParcelizer;
    .registers 2

    .line 2040
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->IconCompatParcelizer:Ljava/lang/Object;

    monitor-enter v0

    .line 2041
    :try_start_3
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->RemoteActionCompatParcelizer:Lo/AudioAttributesImplBaseParcelizer;

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_3 .. :try_end_6} :catchall_7

    return-object p0

    :catchall_7
    move-exception p0

    .line 2042
    monitor-exit v0

    throw p0
.end method

.method public final IconCompatParcelizer(Lo/AudioAttributesImplBaseParcelizer;)V
    .registers 3

    .line 2049
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->IconCompatParcelizer:Ljava/lang/Object;

    monitor-enter v0

    .line 2050
    :try_start_3
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->RemoteActionCompatParcelizer:Lo/AudioAttributesImplBaseParcelizer;
    :try_end_5
    .catchall {:try_start_3 .. :try_end_5} :catchall_7

    .line 2051
    monitor-exit v0

    return-void

    :catchall_7
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    .line 2009
    :cond_4
    instance-of v1, p1, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    .line 2013
    :cond_a
    check-cast p1, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 2014
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->write:Ljava/lang/Object;

    if-nez p0, :cond_16

    .line 2015
    iget-object p0, p1, Landroid/support/v4/media/session/MediaSessionCompat$Token;->write:Ljava/lang/Object;

    if-nez p0, :cond_15

    return v0

    :cond_15
    return v2

    .line 2017
    :cond_16
    iget-object p1, p1, Landroid/support/v4/media/session/MediaSessionCompat$Token;->write:Ljava/lang/Object;

    if-nez p1, :cond_1b

    return v2

    .line 2020
    :cond_1b
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final hashCode()I
    .registers 1

    .line 1998
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->write:Ljava/lang/Object;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 2001
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public final read()Lo/getApplicationInfo;
    .registers 2

    .line 2058
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->IconCompatParcelizer:Ljava/lang/Object;

    monitor-enter v0

    .line 2059
    :try_start_3
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->read:Lo/getApplicationInfo;

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_3 .. :try_end_6} :catchall_7

    return-object p0

    :catchall_7
    move-exception p0

    .line 2060
    monitor-exit v0

    throw p0
.end method

.method public final write()Ljava/lang/Object;
    .registers 1

    .line 2033
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->write:Ljava/lang/Object;

    return-object p0
.end method

.method public final write(Lo/getApplicationInfo;)V
    .registers 3

    .line 2067
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->IconCompatParcelizer:Ljava/lang/Object;

    monitor-enter v0

    .line 2068
    :try_start_3
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->read:Lo/getApplicationInfo;
    :try_end_5
    .catchall {:try_start_3 .. :try_end_5} :catchall_7

    .line 2069
    monitor-exit v0

    return-void

    :catchall_7
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 1990
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->write:Ljava/lang/Object;

    check-cast p0, Landroid/os/Parcelable;

    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.Token.AnonymousClass1 (android.support.v4.media.session.MediaSessionCompat$Token$1)
.class Landroid/support/v4/media/session/MediaSessionCompat$Token$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat$Token;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroid/support/v4/media/session/MediaSessionCompat$Token;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 2111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(I)[Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .registers 2

    .line 2126
    new-array p0, p1, [Landroid/support/v4/media/session/MediaSessionCompat$Token;

    return-object p0
.end method

.method public IconCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .registers 2

    const/4 p0, 0x0

    .line 2117
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p0

    .line 2121
    new-instance p1, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-direct {p1, p0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 2111
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$Token$1;->IconCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p0

    return-object p0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 2111
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$Token$1;->AudioAttributesCompatParcelizer(I)[Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p0

    return-object p0
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.read (android.support.v4.media.session.MediaSessionCompat$read)
.class Landroid/support/v4/media/session/MediaSessionCompat$read;
.super Landroid/support/v4/media/session/MediaSessionCompat$write;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lo/getApplicationInfo;Landroid/os/Bundle;)V
    .registers 5

    .line 4614
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v4/media/session/MediaSessionCompat$write;-><init>(Landroid/content/Context;Ljava/lang/String;Lo/getApplicationInfo;Landroid/os/Bundle;)V

    return-void
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.write (android.support.v4.media.session.MediaSessionCompat$write)
.class Landroid/support/v4/media/session/MediaSessionCompat$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;
    }
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Z

.field AudioAttributesImplApi21Parcelizer:Landroid/support/v4/media/MediaMetadataCompat;

.field AudioAttributesImplApi26Parcelizer:Landroid/support/v4/media/session/PlaybackStateCompat;

.field AudioAttributesImplBaseParcelizer:I

.field IconCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

.field final MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

.field MediaBrowserCompatItemReceiver:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation
.end field

.field MediaBrowserCompatMediaItem:Landroid/os/Bundle;

.field MediaBrowserCompatSearchResultReceiver:I

.field MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field MediaDescriptionCompat:Lo/JsonFormatVisitorWithSerializerProvider$IconCompatParcelizer;

.field MediaMetadataCompat:Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver;

.field final RatingCompat:Landroid/media/session/MediaSession;

.field RemoteActionCompatParcelizer:Z

.field final handleMediaPlayPauseIfPendingOnHandler:Landroid/support/v4/media/session/MediaSessionCompat$Token;

.field final read:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList<",
            "Lo/RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field final write:Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lo/getApplicationInfo;Landroid/os/Bundle;)V
    .registers 6

    .line 3943
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3920
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3923
    iput-boolean v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RemoteActionCompatParcelizer:Z

    .line 3924
    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    .line 3944
    invoke-virtual {p0, p1, p2, p4}, Landroid/support/v4/media/session/MediaSessionCompat$write;->read(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/media/session/MediaSession;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RatingCompat:Landroid/media/session/MediaSession;

    .line 3945
    new-instance p2, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;

    invoke-direct {p2, p0}, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;-><init>(Landroid/support/v4/media/session/MediaSessionCompat$write;)V

    iput-object p2, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->write:Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;

    .line 3946
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {p1}, Landroid/media/session/MediaSession;->getSessionToken()Landroid/media/session/MediaSession$Token;

    move-result-object p1

    invoke-direct {v0, p1, p2, p3}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Lo/AudioAttributesImplBaseParcelizer;Lo/getApplicationInfo;)V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->handleMediaPlayPauseIfPendingOnHandler:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 3947
    iput-object p4, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatMediaItem:Landroid/os/Bundle;

    const/4 p1, 0x3

    .line 3949
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$write;->RemoteActionCompatParcelizer(I)V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;Landroid/os/Handler;)V
    .registers 6

    .line 3971
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    monitor-enter v0

    .line 3972
    :try_start_3
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    .line 3973
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RatingCompat:Landroid/media/session/MediaSession;

    if-nez p1, :cond_b

    const/4 v2, 0x0

    goto :goto_d

    :cond_b
    iget-object v2, p1, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->mCallbackFwk:Landroid/media/session/MediaSession$Callback;

    :goto_d
    invoke-virtual {v1, v2, p2}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;Landroid/os/Handler;)V

    if-eqz p1, :cond_15

    .line 3975
    invoke-virtual {p1, p0, p2}, Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;->setSessionImpl(Landroid/support/v4/media/session/MediaSessionCompat$RemoteActionCompatParcelizer;Landroid/os/Handler;)V
    :try_end_15
    .catchall {:try_start_3 .. :try_end_15} :catchall_17

    .line 3977
    :cond_15
    monitor-exit v0

    return-void

    :catchall_17
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public AudioAttributesCompatParcelizer(Z)V
    .registers 2

    .line 4019
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RatingCompat:Landroid/media/session/MediaSession;

    invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setActive(Z)V

    return-void
.end method

.method public IconCompatParcelizer()V
    .registers 3

    const/4 v0, 0x1

    .line 4047
    iput-boolean v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RemoteActionCompatParcelizer:Z

    .line 4048
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->kill()V

    .line 4064
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RatingCompat:Landroid/media/session/MediaSession;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;)V

    .line 4065
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->write:Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;->onPrepareFromSearch()V

    .line 4066
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RatingCompat:Landroid/media/session/MediaSession;

    invoke-virtual {p0}, Landroid/media/session/MediaSession;->release()V

    return-void
.end method

.method public IconCompatParcelizer(I)V
    .registers 5

    .line 4158
    iget v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatSearchResultReceiver:I

    if-eq v0, p1, :cond_2b

    .line 4159
    iput p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatSearchResultReceiver:I

    .line 4160
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    monitor-enter v0

    .line 4161
    :try_start_9
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_11
    if-ltz v1, :cond_21

    .line 4163
    iget-object v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {v2, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v2

    check-cast v2, Lo/RemoteActionCompatParcelizer;
    :try_end_1b
    .catchall {:try_start_9 .. :try_end_1b} :catchall_28

    .line 4165
    :try_start_1b
    invoke-interface {v2, p1}, Lo/RemoteActionCompatParcelizer;->read(I)V
    :try_end_1e
    .catch Landroid/os/RemoteException; {:try_start_1b .. :try_end_1e} :catch_1e
    .catchall {:try_start_1b .. :try_end_1e} :catchall_28

    :catch_1e
    add-int/lit8 v1, v1, -0x1

    goto :goto_11

    .line 4169
    :cond_21
    :try_start_21
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {p0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_26
    .catchall {:try_start_21 .. :try_end_26} :catchall_28

    .line 4170
    monitor-exit v0

    return-void

    :catchall_28
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_2b
    return-void
.end method

.method public IconCompatParcelizer(Landroid/app/PendingIntent;)V
    .registers 2

    .line 4111
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RatingCompat:Landroid/media/session/MediaSession;

    invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setMediaButtonReceiver(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public IconCompatParcelizer(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 2

    .line 4099
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->AudioAttributesImplApi21Parcelizer:Landroid/support/v4/media/MediaMetadataCompat;

    .line 4100
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RatingCompat:Landroid/media/session/MediaSession;

    if-nez p1, :cond_8

    const/4 p1, 0x0

    goto :goto_e

    .line 4101
    :cond_8
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/MediaMetadata;

    .line 4100
    :goto_e
    invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setMetadata(Landroid/media/MediaMetadata;)V

    return-void
.end method

.method public RemoteActionCompatParcelizer()Landroid/support/v4/media/session/PlaybackStateCompat;
    .registers 1

    .line 4094
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->AudioAttributesImplApi26Parcelizer:Landroid/support/v4/media/session/PlaybackStateCompat;

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(I)V
    .registers 2

    .line 4000
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RatingCompat:Landroid/media/session/MediaSession;

    or-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setFlags(I)V

    return-void
.end method

.method public RemoteActionCompatParcelizer(Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)V"
        }
    .end annotation

    .line 4116
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatItemReceiver:Ljava/util/List;

    if-nez p1, :cond_b

    .line 4118
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RatingCompat:Landroid/media/session/MediaSession;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setQueue(Ljava/util/List;)V

    return-void

    .line 4121
    :cond_b
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 4122
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_18
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 4123
    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->AudioAttributesCompatParcelizer()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/session/MediaSession$QueueItem;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_18

    .line 4125
    :cond_2e
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RatingCompat:Landroid/media/session/MediaSession;

    invoke-virtual {p0, v0}, Landroid/media/session/MediaSession;->setQueue(Ljava/util/List;)V

    return-void
.end method

.method public read(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/media/session/MediaSession;
    .registers 4

    .line 3966
    new-instance p0, Landroid/media/session/MediaSession;

    invoke-direct {p0, p1, p2}, Landroid/media/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object p0
.end method

.method public read()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .registers 1

    .line 4071
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->handleMediaPlayPauseIfPendingOnHandler:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    return-object p0
.end method

.method public write()Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;
    .registers 2

    .line 4241
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    monitor-enter v0

    .line 4242
    :try_start_3
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaSessionCompat$AudioAttributesCompatParcelizer;

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_3 .. :try_end_6} :catchall_7

    return-object p0

    :catchall_7
    move-exception p0

    .line 4243
    monitor-exit v0

    throw p0
.end method

.method public write(I)V
    .registers 5

    .line 4176
    iget v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    if-eq v0, p1, :cond_2b

    .line 4177
    iput p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 4178
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    monitor-enter v0

    .line 4179
    :try_start_9
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_11
    if-ltz v1, :cond_21

    .line 4181
    iget-object v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {v2, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v2

    check-cast v2, Lo/RemoteActionCompatParcelizer;
    :try_end_1b
    .catchall {:try_start_9 .. :try_end_1b} :catchall_28

    .line 4183
    :try_start_1b
    invoke-interface {v2, p1}, Lo/RemoteActionCompatParcelizer;->write(I)V
    :try_end_1e
    .catch Landroid/os/RemoteException; {:try_start_1b .. :try_end_1e} :catch_1e
    .catchall {:try_start_1b .. :try_end_1e} :catchall_28

    :catch_1e
    add-int/lit8 v1, v1, -0x1

    goto :goto_11

    .line 4187
    :cond_21
    :try_start_21
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {p0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_26
    .catchall {:try_start_21 .. :try_end_26} :catchall_28

    .line 4188
    monitor-exit v0

    return-void

    :catchall_28
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_2b
    return-void
.end method

.method public write(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .registers 5

    .line 4076
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->AudioAttributesImplApi26Parcelizer:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 4077
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    monitor-enter v0

    .line 4078
    :try_start_5
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_d
    if-ltz v1, :cond_1d

    .line 4080
    iget-object v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {v2, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v2

    check-cast v2, Lo/RemoteActionCompatParcelizer;
    :try_end_17
    .catchall {:try_start_5 .. :try_end_17} :catchall_33

    .line 4082
    :try_start_17
    invoke-interface {v2, p1}, Lo/RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    :try_end_1a
    .catch Landroid/os/RemoteException; {:try_start_17 .. :try_end_1a} :catch_1a
    .catchall {:try_start_17 .. :try_end_1a} :catchall_33

    :catch_1a
    add-int/lit8 v1, v1, -0x1

    goto :goto_d

    .line 4086
    :cond_1d
    :try_start_1d
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_22
    .catchall {:try_start_1d .. :try_end_22} :catchall_33

    .line 4087
    monitor-exit v0

    .line 4088
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->RatingCompat:Landroid/media/session/MediaSession;

    if-nez p1, :cond_29

    const/4 p1, 0x0

    goto :goto_2f

    .line 4089
    :cond_29
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->read()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/session/PlaybackState;

    .line 4088
    :goto_2f
    invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setPlaybackState(Landroid/media/session/PlaybackState;)V

    return-void

    :catchall_33
    move-exception p0

    .line 4087
    monitor-exit v0

    throw p0
.end method

.method public write(Lo/JsonFormatVisitorWithSerializerProvider$IconCompatParcelizer;)V
    .registers 3

    .line 4211
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    monitor-enter v0

    .line 4212
    :try_start_3
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaDescriptionCompat:Lo/JsonFormatVisitorWithSerializerProvider$IconCompatParcelizer;
    :try_end_5
    .catchall {:try_start_3 .. :try_end_5} :catchall_7

    .line 4213
    monitor-exit v0

    return-void

    :catchall_7
    move-exception p0

    monitor-exit v0

    throw p0
.end method

###### Class android.support.v4.media.session.MediaSessionCompat.write.RemoteActionCompatParcelizer (android.support.v4.media.session.MediaSessionCompat$write$RemoteActionCompatParcelizer)
.class Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;
.super Lo/AudioAttributesImplBaseParcelizer$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat$write;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field private final write:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroid/support/v4/media/session/MediaSessionCompat$write;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/support/v4/media/session/MediaSessionCompat$write;)V
    .registers 3

    .line 4250
    invoke-direct {p0}, Lo/AudioAttributesImplBaseParcelizer$IconCompatParcelizer;-><init>()V

    .line 4251
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;->write:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()V
    .registers 1

    .line 4443
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public AudioAttributesCompatParcelizer(J)V
    .registers 3

    .line 4455
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public AudioAttributesCompatParcelizer(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 3

    .line 4383
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public AudioAttributesCompatParcelizer(Landroid/support/v4/media/MediaDescriptionCompat;I)V
    .registers 3

    .line 4537
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 4502
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public AudioAttributesCompatParcelizer(Lo/RemoteActionCompatParcelizer;)V
    .registers 5

    .line 4295
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;->write:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaSessionCompat$write;

    if-nez p0, :cond_b

    return-void

    .line 4299
    :cond_b
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 4301
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result p1

    .line 4302
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    .line 4303
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    monitor-enter v1

    .line 4304
    :try_start_1b
    iget-object v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaMetadataCompat:Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v2, :cond_24

    .line 4305
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaMetadataCompat:Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0, p1, v0}, Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer(II)V
    :try_end_24
    .catchall {:try_start_1b .. :try_end_24} :catchall_26

    .line 4308
    :cond_24
    monitor-exit v1

    return-void

    :catchall_26
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public AudioAttributesImplApi21Parcelizer()I
    .registers 1

    .line 4567
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;->write:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaSessionCompat$write;

    if-eqz p0, :cond_d

    .line 4569
    iget p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->AudioAttributesImplBaseParcelizer:I

    return p0

    :cond_d
    const/4 p0, 0x0

    return p0
.end method

.method public AudioAttributesImplApi26Parcelizer()Landroid/support/v4/media/session/PlaybackStateCompat;
    .registers 2

    .line 4513
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;->write:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaSessionCompat$write;

    if-eqz p0, :cond_13

    .line 4515
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->AudioAttributesImplApi26Parcelizer:Landroid/support/v4/media/session/PlaybackStateCompat;

    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->AudioAttributesImplApi21Parcelizer:Landroid/support/v4/media/MediaMetadataCompat;

    invoke-static {v0, p0}, Landroid/support/v4/media/session/MediaSessionCompat;->write(Landroid/support/v4/media/session/PlaybackStateCompat;Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p0

    return-object p0

    :cond_13
    const/4 p0, 0x0

    return-object p0
.end method

.method public AudioAttributesImplBaseParcelizer()Ljava/lang/String;
    .registers 1

    .line 4314
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public IconCompatParcelizer()Landroid/app/PendingIntent;
    .registers 1

    .line 4334
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public IconCompatParcelizer(I)V
    .registers 2

    .line 4485
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public IconCompatParcelizer(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 3

    .line 4407
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public IconCompatParcelizer(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .registers 2

    .line 4543
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public IconCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    .line 4401
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public IconCompatParcelizer(Lo/RemoteActionCompatParcelizer;)V
    .registers 6

    .line 4276
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;->write:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaSessionCompat$write;

    if-nez p0, :cond_b

    return-void

    .line 4280
    :cond_b
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v0

    .line 4281
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    .line 4282
    new-instance v2, Lo/JsonFormatVisitorWithSerializerProvider$IconCompatParcelizer;

    const-string v3, "android.media.session.MediaController"

    invoke-direct {v2, v3, v0, v1}, Lo/JsonFormatVisitorWithSerializerProvider$IconCompatParcelizer;-><init>(Ljava/lang/String;II)V

    .line 4284
    iget-object v3, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->read:Landroid/os/RemoteCallbackList;

    invoke-virtual {v3, p1, v2}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    .line 4285
    iget-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    monitor-enter p1

    .line 4286
    :try_start_22
    iget-object v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaMetadataCompat:Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v2, :cond_2b

    .line 4287
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaMetadataCompat:Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(II)V
    :try_end_2b
    .catchall {:try_start_22 .. :try_end_2b} :catchall_2d

    .line 4290
    :cond_2b
    monitor-exit p1

    return-void

    :catchall_2d
    move-exception p0

    monitor-exit p1

    throw p0
.end method

.method public IconCompatParcelizer(Z)V
    .registers 2

    return-void
.end method

.method public MediaBrowserCompatCustomActionResultReceiver()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation

    const/4 p0, 0x0

    return-object p0
.end method

.method public MediaBrowserCompatItemReceiver()Ljava/lang/CharSequence;
    .registers 1

    .line 4555
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public MediaBrowserCompatMediaItem()I
    .registers 1

    .line 4582
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;->write:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaSessionCompat$write;

    if-eqz p0, :cond_d

    .line 4584
    iget p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatSearchResultReceiver:I

    return p0

    :cond_d
    const/4 p0, -0x1

    return p0
.end method

.method public MediaBrowserCompatSearchResultReceiver()Landroid/support/v4/media/session/ParcelableVolumeInfo;
    .registers 1

    .line 4347
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V
    .registers 1

    .line 4431
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public MediaDescriptionCompat()Landroid/os/Bundle;
    .registers 2

    .line 4319
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;->write:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaSessionCompat$write;

    .line 4320
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatMediaItem:Landroid/os/Bundle;

    if-nez v0, :cond_e

    const/4 p0, 0x0

    return-object p0

    .line 4322
    :cond_e
    new-instance v0, Landroid/os/Bundle;

    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaBrowserCompatMediaItem:Landroid/os/Bundle;

    invoke-direct {v0, p0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public MediaMetadataCompat()Ljava/lang/String;
    .registers 1

    .line 4328
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public RatingCompat()I
    .registers 1

    .line 4596
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;->write:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaSessionCompat$write;

    if-eqz p0, :cond_d

    .line 4598
    iget p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    return p0

    :cond_d
    const/4 p0, -0x1

    return p0
.end method

.method public RemoteActionCompatParcelizer()Landroid/support/v4/media/MediaMetadataCompat;
    .registers 1

    .line 4508
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public RemoteActionCompatParcelizer(F)V
    .registers 2

    .line 4473
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public RemoteActionCompatParcelizer(I)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 4496
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public RemoteActionCompatParcelizer(IILjava/lang/String;)V
    .registers 4

    .line 4359
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public RemoteActionCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    .line 4371
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public handleMediaPlayPauseIfPendingOnHandler()V
    .registers 1

    .line 4419
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public onAddQueueItem()Z
    .registers 1

    .line 4605
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public onCommand()Z
    .registers 1

    .line 4575
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;->write:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaSessionCompat$write;

    if-eqz p0, :cond_10

    .line 4576
    iget-boolean p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write;->AudioAttributesCompatParcelizer:Z

    if-eqz p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public onCustomAction()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public onFastForward()V
    .registers 1

    .line 4449
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public onMediaButtonEvent()V
    .registers 1

    .line 4425
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public onPause()V
    .registers 1

    .line 4437
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public onPlay()V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 4365
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public onPlayFromMediaId()V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 4389
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public onPrepareFromSearch()V
    .registers 2

    .line 4259
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$write$RemoteActionCompatParcelizer;->write:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public read()J
    .registers 1

    .line 4341
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public read(IILjava/lang/String;)V
    .registers 4

    .line 4353
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public read(J)V
    .registers 3

    .line 4413
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public read(Landroid/support/v4/media/RatingCompat;)V
    .registers 2

    .line 4461
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public read(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    .line 4377
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public read(Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;)V
    .registers 4

    .line 4265
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public write()Landroid/os/Bundle;
    .registers 1

    .line 4561
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public write(I)V
    .registers 2

    .line 4549
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public write(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .registers 2

    .line 4531
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public write(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V
    .registers 3

    .line 4467
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public write(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    .line 4395
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public write(Z)V
    .registers 2

    .line 4479
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public write(Landroid/view/KeyEvent;)Z
    .registers 2

    .line 4271
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method
