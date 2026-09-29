###### Class com.bumptech.glide.Glide (com.bumptech.glide.Glide)
.class public Lcom/bumptech/glide/Glide;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/Glide$AudioAttributesCompatParcelizer;
    }
.end annotation


# static fields
.field private static volatile IconCompatParcelizer:Lcom/bumptech/glide/Glide;

.field private static volatile RemoteActionCompatParcelizer:Z


# instance fields
.field private final AudioAttributesCompatParcelizer:Lo/access3900;

.field private final AudioAttributesImplApi21Parcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo/ForwardingPlayer;",
            ">;"
        }
    .end annotation
.end field

.field private final AudioAttributesImplApi26Parcelizer:Lo/setDrmSessionForClearPeriods;

.field private final AudioAttributesImplBaseParcelizer:Lo/setRotationDegrees;

.field private final MediaBrowserCompatCustomActionResultReceiver:Lo/getKeySetId;

.field private final MediaBrowserCompatItemReceiver:Lcom/bumptech/glide/Glide$AudioAttributesCompatParcelizer;

.field private MediaBrowserCompatMediaItem:Lo/setSampleMimeType;

.field private final MediaDescriptionCompat:Lo/canKeepMediaPeriodHolder;

.field private final read:Lo/setSubtitleConfigurations;

.field private final write:Lo/getRendererOffset;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/setDrmSessionForClearPeriods;Lo/getKeySetId;Lo/access3900;Lo/setSubtitleConfigurations;Lo/canKeepMediaPeriodHolder;Lo/getRendererOffset;ILcom/bumptech/glide/Glide$AudioAttributesCompatParcelizer;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lo/getFirstMediaPeriodInfo;Lo/setPeakBitrate;)V
    .registers 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lo/setDrmSessionForClearPeriods;",
            "Lo/getKeySetId;",
            "Lo/access3900;",
            "Lo/setSubtitleConfigurations;",
            "Lo/canKeepMediaPeriodHolder;",
            "Lo/getRendererOffset;",
            "I",
            "Lcom/bumptech/glide/Glide$AudioAttributesCompatParcelizer;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lo/setTileCountHorizontal<",
            "**>;>;",
            "Ljava/util/List<",
            "Lo/getUpdatedMediaPeriodInfo<",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/List<",
            "Lo/getFirstMediaPeriodInfoOfNextPeriod;",
            ">;",
            "Lo/getFirstMediaPeriodInfo;",
            "Lo/setPeakBitrate;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 326
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    .line 78
    sget-object v1, Lo/setSampleMimeType;->AudioAttributesCompatParcelizer:Lo/setSampleMimeType;

    iput-object v1, v0, Lcom/bumptech/glide/Glide;->MediaBrowserCompatMediaItem:Lo/setSampleMimeType;

    move-object/from16 v1, p2

    .line 327
    iput-object v1, v0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi26Parcelizer:Lo/setDrmSessionForClearPeriods;

    move-object/from16 v2, p4

    .line 328
    iput-object v2, v0, Lcom/bumptech/glide/Glide;->AudioAttributesCompatParcelizer:Lo/access3900;

    move-object/from16 v4, p5

    .line 329
    iput-object v4, v0, Lcom/bumptech/glide/Glide;->read:Lo/setSubtitleConfigurations;

    move-object/from16 v2, p3

    .line 330
    iput-object v2, v0, Lcom/bumptech/glide/Glide;->MediaBrowserCompatCustomActionResultReceiver:Lo/getKeySetId;

    move-object/from16 v2, p6

    .line 331
    iput-object v2, v0, Lcom/bumptech/glide/Glide;->MediaDescriptionCompat:Lo/canKeepMediaPeriodHolder;

    move-object/from16 v2, p7

    .line 332
    iput-object v2, v0, Lcom/bumptech/glide/Glide;->write:Lo/getRendererOffset;

    move-object/from16 v7, p9

    .line 333
    iput-object v7, v0, Lcom/bumptech/glide/Glide;->MediaBrowserCompatItemReceiver:Lcom/bumptech/glide/Glide$AudioAttributesCompatParcelizer;

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    .line 339
    invoke-static {p0, v2, v3}, Lo/setStereoMode;->IconCompatParcelizer(Lcom/bumptech/glide/Glide;Ljava/util/List;Lo/getFirstMediaPeriodInfo;)Lo/removeMediaSourcesInternal$RemoteActionCompatParcelizer;

    move-result-object v5

    .line 342
    new-instance v6, Lo/MediaSourceList;

    invoke-direct {v6}, Lo/MediaSourceList;-><init>()V

    .line 343
    new-instance v13, Lo/setRotationDegrees;

    move-object v2, v13

    move-object v3, p1

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p2

    move-object/from16 v11, p14

    move/from16 v12, p8

    invoke-direct/range {v2 .. v12}, Lo/setRotationDegrees;-><init>(Landroid/content/Context;Lo/setSubtitleConfigurations;Lo/removeMediaSourcesInternal$RemoteActionCompatParcelizer;Lo/MediaSourceList;Lcom/bumptech/glide/Glide$AudioAttributesCompatParcelizer;Ljava/util/Map;Ljava/util/List;Lo/setDrmSessionForClearPeriods;Lo/setPeakBitrate;I)V

    iput-object v13, v0, Lcom/bumptech/glide/Glide;->AudioAttributesImplBaseParcelizer:Lo/setRotationDegrees;

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/content/Context;)Lo/canKeepMediaPeriodHolder;
    .registers 2

    .line 517
    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    invoke-static {p0, v0}, Lo/moveMediaSource;->IconCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 518
    invoke-static {p0}, Lcom/bumptech/glide/Glide;->read(Landroid/content/Context;)Lcom/bumptech/glide/Glide;

    move-result-object p0

    invoke-direct {p0}, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer()Lo/canKeepMediaPeriodHolder;

    move-result-object p0

    return-object p0
.end method

.method private AudioAttributesImplApi21Parcelizer()Lo/canKeepMediaPeriodHolder;
    .registers 1

    .line 485
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->MediaDescriptionCompat:Lo/canKeepMediaPeriodHolder;

    return-object p0
.end method

.method private static IconCompatParcelizer(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .registers 3

    .line 218
    new-instance v0, Lo/setPixelWidthHeightRatio;

    invoke-direct {v0}, Lo/setPixelWidthHeightRatio;-><init>()V

    invoke-static {p0, v0, p1}, Lcom/bumptech/glide/Glide;->IconCompatParcelizer(Landroid/content/Context;Lo/setPixelWidthHeightRatio;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/content/Context;Lo/setPixelWidthHeightRatio;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .registers 10

    .line 227
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 228
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-eqz p2, :cond_10

    .line 229
    invoke-virtual {p2}, Lo/getFirstMediaPeriodInfo;->RemoteActionCompatParcelizer()Z

    move-result v1

    if-eqz v1, :cond_19

    .line 230
    :cond_10
    new-instance v0, Lo/getMinStartPositionAfterAdGroupUs;

    invoke-direct {v0, p0}, Lo/getMinStartPositionAfterAdGroupUs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lo/getMinStartPositionAfterAdGroupUs;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object v0

    :cond_19
    const/4 v1, 0x3

    .line 233
    const-string v2, "Glide"

    if-eqz p2, :cond_53

    .line 234
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->IconCompatParcelizer()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_53

    .line 235
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->IconCompatParcelizer()Ljava/util/Set;

    move-result-object v3

    .line 236
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 237
    :cond_30
    :goto_30
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_53

    .line 238
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/getFirstMediaPeriodInfoOfNextPeriod;

    .line 239
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_30

    .line 242
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_4f

    .line 243
    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 245
    :cond_4f
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_30

    .line 249
    :cond_53
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_71

    .line 250
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_71

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/getFirstMediaPeriodInfoOfNextPeriod;

    .line 251
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_5d

    :cond_71
    if-eqz p2, :cond_78

    .line 257
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->AudioAttributesCompatParcelizer()Lo/canKeepMediaPeriodHolder$write;

    move-result-object v1

    goto :goto_79

    :cond_78
    const/4 v1, 0x0

    .line 259
    :goto_79
    invoke-virtual {p1, v1}, Lo/setPixelWidthHeightRatio;->RemoteActionCompatParcelizer(Lo/canKeepMediaPeriodHolder$write;)V

    .line 260
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_80
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/getFirstMediaPeriodInfoOfNextPeriod;

    goto :goto_80

    .line 266
    :cond_8d
    invoke-virtual {p1, p0, v0, p2}, Lo/setPixelWidthHeightRatio;->RemoteActionCompatParcelizer(Landroid/content/Context;Ljava/util/List;Lo/getFirstMediaPeriodInfo;)Lcom/bumptech/glide/Glide;

    move-result-object p1

    .line 267
    invoke-virtual {p0, p1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 268
    sput-object p1, Lcom/bumptech/glide/Glide;->IconCompatParcelizer:Lcom/bumptech/glide/Glide;

    return-void
.end method

.method private static IconCompatParcelizer(Ljava/lang/Exception;)V
    .registers 3

    .line 304
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()V
    .registers 2

    .line 442
    invoke-static {}, Lo/moveMediaSourceRange;->write()V

    .line 444
    iget-object v0, p0, Lcom/bumptech/glide/Glide;->MediaBrowserCompatCustomActionResultReceiver:Lo/getKeySetId;

    invoke-interface {v0}, Lo/getKeySetId;->write()V

    .line 445
    iget-object v0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesCompatParcelizer:Lo/access3900;

    invoke-interface {v0}, Lo/access3900;->IconCompatParcelizer()V

    .line 446
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->read:Lo/setSubtitleConfigurations;

    invoke-interface {p0}, Lo/setSubtitleConfigurations;->write()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/content/Context;)Lcom/bumptech/glide/GeneratedAppGlideModule;
    .registers 5

    .line 278
    :try_start_0
    const-string v0, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    .line 279
    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Landroid/content/Context;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 280
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_20
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_20} :catch_34
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_20} :catch_30
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_20} :catch_2b
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_20} :catch_26
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_20} :catch_21

    return-object p0

    :catch_21
    move-exception p0

    .line 298
    invoke-static {p0}, Lcom/bumptech/glide/Glide;->IconCompatParcelizer(Ljava/lang/Exception;)V

    goto :goto_34

    :catch_26
    move-exception p0

    .line 296
    invoke-static {p0}, Lcom/bumptech/glide/Glide;->IconCompatParcelizer(Ljava/lang/Exception;)V

    goto :goto_34

    :catch_2b
    move-exception p0

    .line 294
    invoke-static {p0}, Lcom/bumptech/glide/Glide;->IconCompatParcelizer(Ljava/lang/Exception;)V

    goto :goto_34

    :catch_30
    move-exception p0

    .line 292
    invoke-static {p0}, Lcom/bumptech/glide/Glide;->IconCompatParcelizer(Ljava/lang/Exception;)V

    :catch_34
    :goto_34
    const/4 p0, 0x0

    return-object p0
.end method

.method public static read(Landroid/content/Context;)Lcom/bumptech/glide/Glide;
    .registers 4

    .line 130
    sget-object v0, Lcom/bumptech/glide/Glide;->IconCompatParcelizer:Lcom/bumptech/glide/Glide;

    if-nez v0, :cond_1b

    .line 132
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->RemoteActionCompatParcelizer(Landroid/content/Context;)Lcom/bumptech/glide/GeneratedAppGlideModule;

    move-result-object v0

    .line 133
    const-class v1, Lcom/bumptech/glide/Glide;

    monitor-enter v1

    .line 134
    :try_start_f
    sget-object v2, Lcom/bumptech/glide/Glide;->IconCompatParcelizer:Lcom/bumptech/glide/Glide;

    if-nez v2, :cond_16

    .line 135
    invoke-static {p0, v0}, Lcom/bumptech/glide/Glide;->write(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    :try_end_16
    .catchall {:try_start_f .. :try_end_16} :catchall_18

    .line 137
    :cond_16
    monitor-exit v1

    goto :goto_1b

    :catchall_18
    move-exception p0

    monitor-exit v1

    throw p0

    .line 140
    :cond_1b
    :goto_1b
    sget-object p0, Lcom/bumptech/glide/Glide;->IconCompatParcelizer:Lcom/bumptech/glide/Glide;

    return-object p0
.end method

.method public static write(Landroid/content/Context;)Lo/ForwardingPlayer;
    .registers 2

    .line 545
    invoke-static {p0}, Lcom/bumptech/glide/Glide;->AudioAttributesCompatParcelizer(Landroid/content/Context;)Lo/canKeepMediaPeriodHolder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/canKeepMediaPeriodHolder;->RemoteActionCompatParcelizer(Landroid/content/Context;)Lo/ForwardingPlayer;

    move-result-object p0

    return-object p0
.end method

.method public static write(Landroid/view/View;)Lo/ForwardingPlayer;
    .registers 2

    .line 634
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->AudioAttributesCompatParcelizer(Landroid/content/Context;)Lo/canKeepMediaPeriodHolder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/canKeepMediaPeriodHolder;->RemoteActionCompatParcelizer(Landroid/view/View;)Lo/ForwardingPlayer;

    move-result-object p0

    return-object p0
.end method

.method private write(I)V
    .registers 5

    .line 456
    invoke-static {}, Lo/moveMediaSourceRange;->write()V

    .line 459
    iget-object v0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    monitor-enter v0

    .line 460
    :try_start_6
    iget-object v1, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/ForwardingPlayer;

    .line 461
    invoke-virtual {v2, p1}, Lo/ForwardingPlayer;->onTrimMemory(I)V
    :try_end_1b
    .catchall {:try_start_6 .. :try_end_1b} :catchall_2d

    goto :goto_c

    .line 463
    :cond_1c
    monitor-exit v0

    .line 465
    iget-object v0, p0, Lcom/bumptech/glide/Glide;->MediaBrowserCompatCustomActionResultReceiver:Lo/getKeySetId;

    invoke-interface {v0, p1}, Lo/getKeySetId;->RemoteActionCompatParcelizer(I)V

    .line 466
    iget-object v0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesCompatParcelizer:Lo/access3900;

    invoke-interface {v0, p1}, Lo/access3900;->read(I)V

    .line 467
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->read:Lo/setSubtitleConfigurations;

    invoke-interface {p0, p1}, Lo/setSubtitleConfigurations;->write(I)V

    return-void

    :catchall_2d
    move-exception p0

    .line 463
    monitor-exit v0

    throw p0
.end method

.method private static write(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .registers 3

    .line 149
    sget-boolean v0, Lcom/bumptech/glide/Glide;->RemoteActionCompatParcelizer:Z

    if-nez v0, :cond_12

    const/4 v0, 0x1

    .line 153
    sput-boolean v0, Lcom/bumptech/glide/Glide;->RemoteActionCompatParcelizer:Z

    const/4 v0, 0x0

    .line 155
    :try_start_8
    invoke-static {p0, p1}, Lcom/bumptech/glide/Glide;->IconCompatParcelizer(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    :try_end_b
    .catchall {:try_start_8 .. :try_end_b} :catchall_e

    .line 157
    sput-boolean v0, Lcom/bumptech/glide/Glide;->RemoteActionCompatParcelizer:Z

    return-void

    :catchall_e
    move-exception p0

    sput-boolean v0, Lcom/bumptech/glide/Glide;->RemoteActionCompatParcelizer:Z

    .line 158
    throw p0

    .line 150
    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Glide has been called recursively, this is probably an internal library error!"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Landroid/content/Context;
    .registers 1

    .line 390
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplBaseParcelizer:Lo/setRotationDegrees;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(Lo/MediaSourceInfoHolder;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/MediaSourceInfoHolder<",
            "*>;)Z"
        }
    .end annotation

    .line 643
    iget-object v0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    monitor-enter v0

    .line 644
    :try_start_3
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ForwardingPlayer;

    .line 645
    invoke-virtual {v1, p1}, Lo/ForwardingPlayer;->RemoteActionCompatParcelizer(Lo/MediaSourceInfoHolder;)Z

    move-result v1
    :try_end_19
    .catchall {:try_start_3 .. :try_end_19} :catchall_21

    if-eqz v1, :cond_9

    .line 646
    monitor-exit v0

    const/4 p0, 0x1

    return p0

    .line 649
    :cond_1e
    monitor-exit v0

    const/4 p0, 0x0

    return p0

    :catchall_21
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Lo/setSelectionFlags;
    .registers 1

    .line 639
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplBaseParcelizer:Lo/setRotationDegrees;

    invoke-virtual {p0}, Lo/setRotationDegrees;->AudioAttributesImplApi26Parcelizer()Lo/setSelectionFlags;

    move-result-object p0

    return-object p0
.end method

.method public final IconCompatParcelizer()Lo/setRotationDegrees;
    .registers 1

    .line 399
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplBaseParcelizer:Lo/setRotationDegrees;

    return-object p0
.end method

.method public final IconCompatParcelizer(Lo/ForwardingPlayer;)V
    .registers 4

    .line 655
    iget-object v0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    monitor-enter v0

    .line 656
    :try_start_3
    iget-object v1, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    .line 659
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_10
    .catchall {:try_start_3 .. :try_end_10} :catchall_1a

    .line 660
    monitor-exit v0

    return-void

    .line 657
    :cond_12
    :try_start_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Cannot register already registered manager"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1a
    .catchall {:try_start_12 .. :try_end_1a} :catchall_1a

    :catchall_1a
    move-exception p0

    .line 660
    monitor-exit v0

    throw p0
.end method

.method public final RemoteActionCompatParcelizer()Lo/getRendererOffset;
    .registers 1

    .line 394
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->write:Lo/getRendererOffset;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Lo/ForwardingPlayer;)V
    .registers 4

    .line 664
    iget-object v0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    monitor-enter v0

    .line 665
    :try_start_3
    iget-object v1, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 668
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_10
    .catchall {:try_start_3 .. :try_end_10} :catchall_1a

    .line 669
    monitor-exit v0

    return-void

    .line 666
    :cond_12
    :try_start_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Cannot unregister not yet registered manager"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1a
    .catchall {:try_start_12 .. :try_end_1a} :catchall_1a

    :catchall_1a
    move-exception p0

    .line 669
    monitor-exit v0

    throw p0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 2

    return-void
.end method

.method public onLowMemory()V
    .registers 1

    .line 684
    invoke-direct {p0}, Lcom/bumptech/glide/Glide;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method public onTrimMemory(I)V
    .registers 2

    .line 674
    invoke-direct {p0, p1}, Lcom/bumptech/glide/Glide;->write(I)V

    return-void
.end method

.method public final read()Lo/access3900;
    .registers 1

    .line 377
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->AudioAttributesCompatParcelizer:Lo/access3900;

    return-object p0
.end method

.method public final write()Lo/setSubtitleConfigurations;
    .registers 1

    .line 382
    iget-object p0, p0, Lcom/bumptech/glide/Glide;->read:Lo/setSubtitleConfigurations;

    return-object p0
.end method

###### Class com.bumptech.glide.Glide.AudioAttributesCompatParcelizer (com.bumptech.glide.Glide$AudioAttributesCompatParcelizer)
.class public interface abstract Lcom/bumptech/glide/Glide$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/Glide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesCompatParcelizer"
.end annotation


# virtual methods
.method public abstract RemoteActionCompatParcelizer()Lo/getPlayingPeriod;
.end method
